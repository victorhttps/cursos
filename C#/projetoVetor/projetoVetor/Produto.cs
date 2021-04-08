using System;
using System.Collections.Generic;
using System.Text;

namespace projetoVetor
{
    class Produto
    {
        public String Nome { get; set; }
        public Double Preco { get; set; }

        public Produto(string nome, double preco)
        {
            Nome = nome;
            Preco = preco;
        }


    }
}
