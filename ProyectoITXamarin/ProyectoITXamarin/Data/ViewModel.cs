using System;
using System.Collections.Generic;
using Xamarin.Forms;
using System.Net;
using System.Net.Http;
using Newtonsoft.Json;
using DevExpress.XamarinForms.Charts;
using DemoCenter.Forms.Data;
using ProyectoITXamarin.Data;

namespace ProyectoITXamarin
{
    public class ViewModel
    {
        readonly SalesByYearsData salesByYears;
        readonly Color[] palette = PaletteLoader.LoadPalette("#25a966", "#F13D45", "#45B6F1", "#F7EC42", "#975ba5", "#f45a4e");
        public IList<PieData> PieSeriesData => salesByYears.PieData;
        public IList<List<DateTimeData>> SeriesDataByYears => salesByYears.Data;
        public List<Venta> Ventas { get; set; }
        public Color[] Palette => palette;
        public ViewModel()
        {
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
                this.Ventas = resultado;
            }
        }
    }
    public class CustomColorizer : ICustomPointColorizer
    {
        Color ICustomPointColorizer.GetColor(ColoredPointInfo info)
        {
            //paleta de colores del selection
            return Color.FromHex("#9AE4F3");
        }
        public ILegendItemProvider GetLegendItemProvider()
        {
            return null;
        }
    }
}