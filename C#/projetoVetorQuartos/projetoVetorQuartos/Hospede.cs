using System;
using System.Collections.Generic;
using System.Text;

namespace projetoVetorQuartos
{
    class Hospede
    {
        public String Nome { get; set; }
        public String Email { get; set; }

        public Hospede(string nome, string email)
        {
            Nome = nome;
            Email = email;
        }

        public override string ToString()
        {
            return "Hospede: " + Nome + "\nEmail: " + Email;
        }
    }
}
