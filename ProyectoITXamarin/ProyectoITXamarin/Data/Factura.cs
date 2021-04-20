using System;
using System.Collections.Generic;
using System.Text;
using System.ComponentModel;

namespace ProyectoITXamarin.Data
{
    public class Factura : ModelObject
    {
        int id;
        string nameEmpresa;
        string fecha;
        string name;
        public Factura()
        {
            this.id = 0;
            this.nameEmpresa = "";
            this.fecha = "";
            this.name = "";
        }
        public Factura(int id, string nameEmpresa, string fecha, string name)
        {
            this.id = id;
            this.nameEmpresa = nameEmpresa;
            this.fecha = fecha;
            this.name = name;
        }
        public int Id
        {
            get { return id; }
            set
            {
                if (id != value)
                {
                    id = value;
                    RaisePropertyChanged("Id");
                }
            }
        }
        public string NameEmpresa
        {
            get { return nameEmpresa; }
            set
            {
                if (nameEmpresa != value)
                {
                    nameEmpresa = value;
                    RaisePropertyChanged("NameEmpresa");
                }
            }
        }
        public string Fecha
        {
            get { return fecha; }
            set
            {
                if (fecha != value)
                {
                    fecha = value;
                    RaisePropertyChanged("Fecha");
                }
            }
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
    }
    public class ModelObject : INotifyPropertyChanged
    {
        public event PropertyChangedEventHandler PropertyChanged;
        protected void RaisePropertyChanged(string nameEmpresa)
        {
            if (PropertyChanged != null)
                PropertyChanged(this, new PropertyChangedEventArgs(nameEmpresa));
        }
    }
}
