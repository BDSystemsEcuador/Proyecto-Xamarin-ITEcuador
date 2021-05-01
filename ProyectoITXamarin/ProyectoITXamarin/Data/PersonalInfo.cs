using System;
using System.Collections.Generic;
using System.Text;

namespace ProyectoITXamarin.Data
{
    public class PersonalInfo
    {
        public string Nombre { get; set; }
        public string Apellido { get; set; }
        public DateTime Fecha { get; set; }
        public virtual Cargos Cargo_IT { get; set; }
        public string Contraseña { get; set; }
        public string Email { get; set; }
        public string Telefono { get; set; }

        public PersonalInfo()
        {
            this.Fecha = new DateTime(DateTime.Now.Year, DateTime.Now.Month, DateTime.Now.Day);
        }
    }
    public enum Cargos { Administrador, Gerente, Empleado, Conserje }
}
