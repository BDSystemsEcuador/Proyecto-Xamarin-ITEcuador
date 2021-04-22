using System;
using System.Collections.Generic;
using DemoCenter.Forms.Data;
using Xamarin.Forms;
using System.Globalization;
using System.Linq;
using DevExpress.XamarinForms.Charts;
using System.Threading.Tasks;
namespace DemoCenter.Forms.ViewModels.Services
{
    public interface INavigationService
    {
        Task<Page> PushPage(object viewModel);

        Task Push(object viewModel);
    }
}
//sirve para recorrer la paleta de colores
namespace DemoCenter.Forms
{
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
namespace DemoCenter.Forms.Data
{
    //tipo de dato para tiempos 
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
        static DateTime StartDate = new DateTime(DateTime.Now.Year, 1, 1).AddYears(0);

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
                StartDate = new DateTime(DateTime.Now.Year, 1, 1).AddYears(0);
                for (int i = 0; i < values[j].Count; i++)
                    seriesData.Add(new DateTimeData(StartDate.AddYears(i), values[j][i]));
                Data.Add(seriesData);
                PieData.Add(new PieData(categories[j], values[j].Sum()));
            }
        }
    }
}
namespace DemoCenter.Forms.Views
{
    //metodo que pone el nombre a los elementos del chart, y convierte la seleccion a plano cartesiano
    public class SelectionConverter : IValueConverter
    {
        public object Convert(object value, Type targetType, object parameter, CultureInfo culture)
        {
            if (value == null)
                return true;
            DataSourceKey key = (DataSourceKey)value;
            PieData pie = (PieData)key.DataObject;
            return pie.Label.Equals(parameter);
            //es el elemento seleccionado
        }
        public object ConvertBack(object value, Type targetType, object parameter, CultureInfo culture)
        {
            return null;
        }
    }
}
namespace DemoCenter.Forms.Demo
{
    //orientacion dispositivo
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