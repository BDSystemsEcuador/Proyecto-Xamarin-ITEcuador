﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace ProyectoITXamarin
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class MainPage : ContentPage
    {
        
        public MainPage()
        {
            var image = new Image { Source = "Images/Component.png" };
            InitializeComponent();
        }
        async void OnButtonClicked(object sender, EventArgs args)
        {
            await this.Navigation.PushModalAsync(new Inicio());
        }
    }
}
