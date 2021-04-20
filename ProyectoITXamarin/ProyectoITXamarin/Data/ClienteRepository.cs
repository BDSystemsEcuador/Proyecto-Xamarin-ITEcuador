using System;
using System.Collections.Generic;
using System.Text;
using System.ComponentModel;
using ProyectoITXamarin.Data;

namespace ProyectoITXamarin.DataModel
{
    public class ClienteRepository
    {
        readonly BindingList<Cliente> clientes;
        public ClienteRepository()
        {
            this.clientes = new BindingList<Cliente>();
        }
        public BindingList<Cliente> Clientes
        {
            get { return clientes; }
        }
    }

    public class FacturaRepository
    {
        readonly BindingList<Factura> facturas;
        public FacturaRepository()
        {
            this.facturas = new BindingList<Factura>();
        }
        public BindingList<Factura> Facturas
        {
            get { return facturas; }
        }
    }

}
