using System;
using System.Collections.Generic;
using System.Text;
using Xamarin.Forms;
using System.Net;
using System.Net.Http;
using Newtonsoft.Json;
using DevExpress.XamarinForms.Charts;
using DemoCenter.Forms.ViewModels;
using DemoCenter.Forms.Data;
using DemoCenter.Forms;
using System.Windows.Input;
using System.ComponentModel;
using System.Runtime.CompilerServices;
using DemoCenter.Forms.Models;
using DemoCenter.Forms.ViewModels.Services;

namespace ProyectoITXamarin
{
    
    public class ViewModel : ChartViewModelBase
    {
        readonly SalesByYearsData salesByYears;
            readonly Color[] palette = PaletteLoader.LoadPalette("#FF42A5F5", "#FFFF5252", "#FF4CAF50", "#FFFFAB40", "#FFBDBDBD");

            public IList<PieData> PieSeriesData => salesByYears.PieData;
            public IList<List<DateTimeData>> SeriesDataByYears => salesByYears.Data;

        public List<Venta> Ventas { get; set; }
        public Color[] Palette => palette;

        public ViewModel()
        {
            List<Venta> Ventas = new List<Venta>();
            TraerDatosCharts();
            palette = PaletteLoader.LoadPalette("#25a966", "#F13D45", "#45B6F1", "#F7EC42", "#975ba5", "#f45a4e");
            salesByYears = new SalesByYearsData();
        }
        static class PaletteLoader
        {
            public static Color[] LoadPalette(params string[] values)
            {
                Color[] colors = new Color[values.Length];
                for (int i = 0; i < values.Length; i++)
                    colors[i] = Color.FromHex(values[i]);
                return colors;
            }
        }

        public async void TraerDatosCharts()
        {
            var request = new HttpRequestMessage();
            request.RequestUri = new Uri("https://api.jsonbin.io/b/6074fbffee971419c4d7d967");
            request.Method = HttpMethod.Get;
            request.Headers.Add("Accpet", "application/json");
            var client = new HttpClient();
            HttpResponseMessage response = await client.SendAsync(request);
            if (response.StatusCode == HttpStatusCode.OK)
            {
                string content = await response.Content.ReadAsStringAsync();
                var resultado = JsonConvert.DeserializeObject<List<Venta>>(content);
                //Ventas. = resultaxdoñ
                this.Ventas = resultado;
            }
        }
    }

    public class Venta
    {
        public string NameEmpresa { get; set; }
        public int Cantidad { get; set; }

        public Venta(int cantidad, string nameEmpresa)
        {
            this.NameEmpresa = nameEmpresa;
            this.Cantidad = cantidad;
        }
    }
    public class CustomColorizer : ICustomPointColorizer
    {
        Color ICustomPointColorizer.GetColor(ColoredPointInfo info)
        {
            
            return Color.FromHex("#9AE4F3");
        }
        public ILegendItemProvider GetLegendItemProvider()
        {
            return null;
        }
    }
        public class DelegateCommand : ICommand
        {
            private readonly Action _execute;
            private readonly Func<bool> _canExecute;

            public DelegateCommand(Action execute) : this(execute, null) { }

            public DelegateCommand(Action execute, Func<bool> canExecute)
            {
                _execute = execute;
                _canExecute = canExecute;
            }

            public bool CanExecute(object parameter)
            {
                if (_canExecute != null)
                    return _canExecute();
                return true;
            }

            public void Execute(object parameter)
            {
                _execute();
            }

            public void RaiseCanExecuteChanged()
            {
                var tmpHandle = CanExecuteChanged;
                if (tmpHandle != null)
                    tmpHandle(this, new EventArgs());
            }

            public event EventHandler CanExecuteChanged;
        }
        public class DelegateCommand<T> : ICommand
        {
            private readonly Action<T> _execute;
            private readonly Func<T, bool> _canExecute;

            public DelegateCommand(Action<T> execute) : this(execute, null) { }

            public DelegateCommand(Action<T> execute, Func<T, bool> canExecute)
            {
                _execute = execute;
                _canExecute = canExecute;
            }

            public bool CanExecute(object parameter)
            {
                if (_canExecute != null)
                    return _canExecute((T)parameter);

                return true;
            }

            public void Execute(object parameter)
            {
                _execute((T)parameter);
            }

            public void RaiseCanExecuteChanged()
            {
                var tmpHandle = CanExecuteChanged;
                if (tmpHandle != null)
                    tmpHandle(this, new EventArgs());
            }

            public event EventHandler CanExecuteChanged;
        }
        public abstract class NavigationViewModelBase : NotificationObject
        {
            public virtual string Title => System.String.Empty;
        }

        public abstract class ChartViewModelBase : NotificationObject
        {
            public virtual string Title => string.Empty;
        }
        public class NotificationObject : INotifyPropertyChanged
        {
            protected bool SetProperty<T>(ref T backingStore, T value, Action onChanged = null, [CallerMemberName] string propertyName = "")
            {
                if (EqualityComparer<T>.Default.Equals(backingStore, value))
                    return false;

                backingStore = value;
                onChanged?.Invoke();
                OnPropertyChanged(propertyName);
                return true;
            }

            protected bool SetProperty<T>(ref T backingStore, T value, Action<T, T> onChanged, [CallerMemberName] string propertyName = "")
            {
                if (EqualityComparer<T>.Default.Equals(backingStore, value))
                    return false;
                T oldValue = backingStore;
                backingStore = value;
                onChanged?.Invoke(oldValue, value);
                OnPropertyChanged(propertyName);
                return true;
            }

            #region INotifyPropertyChanged
            public event PropertyChangedEventHandler PropertyChanged;
            protected void OnPropertyChanged([CallerMemberName] string propertyName = "")
            {
                PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(propertyName));
            }
            #endregion
            public class ControlViewModel : BaseViewModel
            {
                IDemoData data;
                DemoItem selectedItem;
                public List<DemoItem> DemoItems
                {
                    get => data.DemoItems;
                }
                public DemoItem SelectedItem
                {
                    get { return selectedItem; }
                    set
                    {
                        selectedItem = value;
                        if (selectedItem == null)
                            return;
                        NavigationDemoCommand.Execute(selectedItem);
                    }
                }
                public ICommand NavigationDemoCommand { get; }

                public ControlViewModel(INavigationService navigationService, IDemoData data)
                {
                    this.data = data;
                    this.Title = data.Title;
                    NavigationDemoCommand = new DelegateCommand<DemoItem>((p) => navigationService.PushPage(p));
                }

            }
        }

        public class BaseViewModel : NotificationObject
        {
            bool isLightTheme = true;

            public string Title { get; set; }

            public ICommand ThemeCommand { get; }

        }
    }