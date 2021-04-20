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

namespace ProyectoITXamarin
{
    public class SelectionViewModel : ChartViewModelBase
    {
        readonly SalesByYearsData salesByYears;
        readonly Color[] palette = PaletteLoader.LoadPalette("#FF42A5F5", "#FFFF5252", "#FF4CAF50", "#FFFFAB40", "#FFBDBDBD");

        public IList<PieData> PieSeriesData => salesByYears.PieData;
        public IList<List<DateTimeData>> SeriesDataByYears => salesByYears.Data;
        public Color[] Palette => palette;

        public SelectionViewModel()
        {
            salesByYears = new SalesByYearsData();
        }
    }
    public class ViewModel
    {
        public List<Venta> Ventas { get; set; }
        readonly Color[] palette;
        public Color[] Palette => palette;

        public ViewModel()
        {
            List<Venta> Ventas = new List<Venta>();
            TraerDatosCharts();
            palette = PaletteLoader.LoadPalette("#25a966", "#F13D45", "#45B6F1", "#F7EC42", "#975ba5", "#f45a4e");
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
}