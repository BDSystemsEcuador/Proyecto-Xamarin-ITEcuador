using System;
using System.Collections.Generic;
using System.Text;
using DemoCenter.Forms.Data;
using Xamarin.Forms;
using System.ComponentModel;
using System.Runtime.CompilerServices;
using System.Xml.Serialization;
using System.Globalization;
using System.IO;
using System.Linq;
using DevExpress.XamarinForms.Charts;
using Xamarin.Forms.PlatformConfiguration;
using System.Windows.Input;
using DemoCenter.Forms.Models;
using System.Threading.Tasks;
using DemoCenter.Forms.ViewModels.Services;
namespace DemoCenter.Forms.ViewModels.Services
{
    public interface INavigationService
    {
        Task<Page> PushPage(object viewModel);

        Task Push(object viewModel);
    }
}
namespace DemoCenter.Forms.Models
{
    public enum DemoItemStatus
    {
        None,
        New,
        Updated
    }
    public class DemoItem
    {
        string pageTitle = null;
        string icon = null;
        string controlsPageTitle = null;
        DemoItemStatus demoItemStatus = DemoItemStatus.None;
        bool showItemUnderline = true;

        Type module;
        List<DemoItem> demoItems;

        public string Icon
        {
            get => string.IsNullOrEmpty(this.icon) ? "default_icon" : this.icon;
            set
            {
                this.icon = value;
            }
        }
        public bool Header { get; set; }
        public string Title { get; set; }
        public string PageTitle
        {
            get => this.pageTitle ?? ControlsPageTitle;
            set { this.pageTitle = value; }
        }
        public string ControlsPageTitle
        {
            get => this.controlsPageTitle ?? Title;
            set { this.controlsPageTitle = value; }
        }
        public string Description { get; set; }

        public Type Module
        {
            get { return this.module; }
            set
            {
                this.module = value;
                if (value != null && value.GetInterface("IDemoData") != null)
                {
                    this.demoItems = ((IDemoData)Activator.CreateInstance(value)).DemoItems;
                }
            }
        }
        public List<DemoItem> DemoItems { get { return this.demoItems; } }

        public bool ShowItemUnderline { get { return this.showItemUnderline; } set { this.showItemUnderline = value; } }
        public DemoItemStatus DemoItemStatus { get { return this.demoItemStatus; } set { this.demoItemStatus = value; } }

        public bool ShowBadge { get { return this.demoItemStatus != DemoItemStatus.None; } }

        public string BadgeIcon
        {
            get
            {
                if (this.demoItemStatus == DemoItemStatus.Updated)
                {
                    return "badge_updated";
                }
                else if (this.demoItemStatus == DemoItemStatus.New)
                {
                    return "badge_new";
                }
                else return string.Empty;
            }
        }
    }

}

namespace DemoCenter.Forms
{
    public class BoolToStackOrientationConverter : IValueConverter
    {
        public object Convert(object value, Type targetType, object parameter, CultureInfo culture)
        {
            if (value is bool && targetType == typeof(StackOrientation))
            {
                if (parameter is string && ((string)parameter) == "inverse")
                    return (bool)value ? StackOrientation.Horizontal : StackOrientation.Vertical;
                else
                    return (bool)value ? StackOrientation.Vertical : StackOrientation.Horizontal;
            }
            return null;
        }
        public object ConvertBack(object value, Type targetType, object parameter, CultureInfo culture) => null;
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

}

namespace DemoCenter.Forms.ViewModels
{
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

namespace DemoCenter.Forms.Data
{
    [XmlRoot("DataSetsContainer")]
    public class DataSetsContainer<T>
    {
        [XmlArrayItem]
        public List<DataSetContainer<T>> DataSets { get; set; }
    }

    [XmlRoot("DataSetContainer")]
    public class DataSetContainer<T>
    {
        [XmlElement]
        public string Name { get; set; }
        [XmlArrayItem]
        public List<T> DataSet { get; set; }
    }

    [XmlRoot("NumericDataSets")]
    public class NumericDataSets : DataSetsContainer<NumericData> { }
    [XmlRoot("DateTimeDataSets")]
    public class DateTimeDataSets : DataSetsContainer<DateTimeData> { }
    [XmlRoot("QualitativeDataSets")]
    public class QualitativeDataSets : DataSetsContainer<QualitativeData> { }
    public class QualitativeData
    {
        public string Argument { get; set; }
        public double Value { get; set; }
        public QualitativeData() { }
        public QualitativeData(string argument, double value)
        {
            Argument = argument;
            Value = value;
        }
    }
    public class DateTimeData
    {
        public DateTime Argument { get; set; }
        public double Value { get; set; }
        public DateTimeData() { }
        public DateTimeData(DateTime argument, double value)
        {
            Argument = argument;
            Value = value;
        }
    }
    public class NumericData
    {
        public double Argument { get; private set; }
        public double Value { get; private set; }
        public NumericData(double argument, double value)
        {
            Argument = argument;
            Value = value;
        }
    }
    public class PieData
    {
        public string Label { get; }
        public double Value { get; }

        public PieData(string label, double value)
        {
            Label = label;
            Value = value;
        }
    }
    public class SalesByYearsData
    {
        static DateTime StartDate = new DateTime(DateTime.Now.Year, 1, 1).AddYears(-10);

        readonly IList<string> categories = new List<string> { "Asia", "Australia", "Europe", "N. America", "S. America" };
        readonly IList<IList<double>> values = new List<IList<double>> {
            new List<double> { 1.8532D, 1.9849D, 2.4372D, 2.5147D, 2.7514D, 2.8532D, 3.5849D, 4.2372D, 4.7685D, 5.2890D },
            new List<double> { 0.6988D, 0.8320D, 0.8711D, 0.9210D, 0.9651D, 1.2586D, 1.5744D, 1.7871D, 1.9576D, 2.2727D },
            new List<double> { 1.1210D, 1.1311D, 1.3025D, 1.3214D, 1.4284D, 1.9579D, 2.5664D, 3.0884D, 3.3579D, 3.7257D },
            new List<double> { 1.9855D, 2.1288D, 2.4855D, 2.7477D, 2.8825D, 2.9855D, 3.0788D, 3.4855D, 3.7477D, 4.1825D },
            new List<double> { 0.9127D, 0.9734D, 0.9927D, 1.1237D, 1.3172D, 1.3827D, 1.5734D, 1.6027D, 1.8237D, 2.1172D }
        };

        public IList<List<DateTimeData>> Data { get; private set; } = new List<List<DateTimeData>>();
        public IList<PieData> PieData { get; private set; } = new List<PieData>();

        public SalesByYearsData()
        {
            for (int j = 0; j < values.Count; j++)
            {
                List<DateTimeData> seriesData = new List<DateTimeData>();
                StartDate = new DateTime(DateTime.Now.Year, 1, 1).AddYears(-10);
                for (int i = 0; i < values[j].Count; i++)
                    seriesData.Add(new DateTimeData(StartDate.AddYears(i), values[j][i]));
                Data.Add(seriesData);
                PieData.Add(new PieData(categories[j], values[j].Sum()));
            }
        }
    }
    public interface IDemoData
    {
        List<DemoItem> DemoItems { get; }
        string Title { get; }
    }
}

namespace DemoCenter.Forms.Views
{
    public class SelectionConverter : IValueConverter
    {
        public object Convert(object value, Type targetType, object parameter, CultureInfo culture)
        {
            if (value == null)
                return true;
            DataSourceKey key = (DataSourceKey)value;
            PieData pie = (PieData)key.DataObject;
            return pie.Label.Equals(parameter);
        }
        public object ConvertBack(object value, Type targetType, object parameter, CultureInfo culture)
        {
            return null;
        }
    }
    public class ChartTitleConverter : IValueConverter
    {
        public object Convert(object value, Type targetType, object parameter, CultureInfo culture = null)
        {
            string prefix = String.Empty;
            if (value != null)
            {
                DataSourceKey key = (DataSourceKey)value;
                PieData pie = (PieData)key.DataObject;
                prefix = pie.Label;
            }
            return String.Format("{0} Sales by Years", prefix);
        }
        public object ConvertBack(object value, Type targetType, object parameter, CultureInfo culture)
        {
            return null;
        }
    }
}

namespace DemoCenter.Forms.Demo
{
    public class Panel : Layout<View>
    {
        public static readonly BindablePropertyKey IsLandscapePropertyKey = BindableProperty.CreateReadOnly("IsLandscape", typeof(bool), typeof(Panel), false);
        public static readonly BindableProperty IsLandscapeProperty = IsLandscapePropertyKey.BindableProperty;
        public bool IsLandscape => (bool)GetValue(IsLandscapeProperty);

        public Panel()
        {
            SizeChanged += (s, e) => UpdateOrientation(Width, Height);
            UpdateOrientation(Width, Height);
        }

        void UpdateOrientation(double width, double height)
        {
            SetValue(IsLandscapePropertyKey, width > height);
        }

        protected override void LayoutChildren(double x, double y, double width, double height)
        {
            UpdateOrientation(Width, Height);
            int visibleChildCount = 0;
            foreach (View child in Children)
                visibleChildCount += child.IsVisible ? 1 : 0;
            if (visibleChildCount > 0)
            {
                double itemSize = (IsLandscape ? width : height) / visibleChildCount;
                double offset = 0;
                foreach (View child in Children)
                    if (child.IsVisible)
                    {
                        if (IsLandscape)
                            LayoutChildIntoBoundingRegion(child, new Rectangle(x + offset, y, itemSize, height));
                        else
                            LayoutChildIntoBoundingRegion(child, new Rectangle(x, y + offset, width, itemSize));
                        offset += itemSize;
                    }
            }
        }
    }
    
}