using System;
using System.Collections.Generic;
using Xamarin.Forms;
using System.Net;
using System.Net.Http;
using Newtonsoft.Json;
using ProyectoITXamarin.DataModel;
using ProyectoITXamarin.Data;
using DevExpress.XamarinForms.Core.Themes; 

namespace ProyectoITXamarin
{
    public partial class Inicio : ContentPage
    {
        public async void TraerDatos()
        {
            var request = new HttpRequestMessage();
            request.RequestUri = new Uri("https://api.jsonbin.io/b/606e153bceba857326707915");
            //hhttps://api.jsonbin.io/b/606e153bceba857326707915
            //hhttp://localhost:64777/Service1.svc/getClientesSQL
            request.Method = HttpMethod.Get;
            request.Headers.Add("Accpet", "application/json");
            var client = new HttpClient();
            HttpResponseMessage response = await client.SendAsync(request);
            if (response.StatusCode == HttpStatusCode.OK)
            {
                string content = await response.Content.ReadAsStringAsync();
                var resultado = JsonConvert.DeserializeObject<List<Cliente>>(content);
                grid.ItemsSource = resultado;
            }
        }
        public async void TraerDatos1()
        {
            var request = new HttpRequestMessage();
            request.RequestUri = new Uri("https://api.jsonbin.io/b/607336300ed6f819bea90cc8");
            request.Method = HttpMethod.Get;
            request.Headers.Add("Accpet", "application/json");
            var client = new HttpClient();
            HttpResponseMessage response = await client.SendAsync(request);
            if (response.StatusCode == HttpStatusCode.OK)
            {
                string content = await response.Content.ReadAsStringAsync();
                var resultado = JsonConvert.DeserializeObject<List<Factura>>(content);
                grid1.ItemsSource = resultado;
            }
        }
        public Inicio()
        {
            ThemeManager.ThemeName = Theme.Light;
            InitializeComponent();
            DevExpress.XamarinForms.Charts.Initializer.Init();
            DevExpress.XamarinForms.DataGrid.Initializer.Init();
            DevExpress.XamarinForms.Editors.Initializer.Init();
            DevExpress.XamarinForms.Navigation.Initializer.Init();
            DevExpress.XamarinForms.DataForm.Initializer.Init();
            dataForm.DataObject = new PersonalInfo();
            TraerDatos();
            TraerDatos1();
        }
        public bool ShowAutoFilterRow { get; set; }
    }
}
