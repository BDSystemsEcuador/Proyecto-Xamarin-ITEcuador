using System;
using System.Collections.Generic;
using System.Text;

namespace ProyectoITXamarin.Data
{
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
}
