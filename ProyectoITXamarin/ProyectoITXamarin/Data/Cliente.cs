using System;
using System.Collections.Generic;
using System.Text;
using System.ComponentModel;

namespace ProyectoITXamarin.DataModel
{
    public class Cliente : ModelObject
    {
        string codigo;
        string name;
        string ruc;
        public Cliente()
        {
            this.codigo = "";
            this.name = "";
            this.ruc = "";
        }
        public Cliente(string codigo, string name, string ruc)
        {
            this.codigo = codigo;
            this.name = name;
            this.ruc = ruc;
        }
        public string Codigo
        {
            get { return codigo; }
            set { if (codigo != value)
                {
                    codigo = value;
                    RaisePropertyChanged("Codigo");
                } }
        }
        public string Name
        {
            get { return name; }
            set
            {
                if (name != value)
                {
                    name = value;
                    RaisePropertyChanged("Name");
                }
            }
        }
        public string Ruc
        {
            get { return ruc; }
            set
            {
                if (ruc != value)
                {
                    ruc = value;
                    RaisePropertyChanged("Ruc");
                }
            }
        }
    }
    public class ModelObject : INotifyPropertyChanged
    {
        public event PropertyChangedEventHandler PropertyChanged;

        protected void RaisePropertyChanged(string name)
        {
            if (PropertyChanged != null)
                PropertyChanged(this, new PropertyChangedEventArgs(name));
        }
    }
}