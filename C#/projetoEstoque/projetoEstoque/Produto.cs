using System;
using System.Collections.Generic;
using System.Text;

namespace projetoEstoque
{
    class Produto
    {
        private String _nome;
        public double Preco { get; private set; }
        private int _qtd;

        public Produto(String nome, double preco, int qtd)
        {
            this._nome = nome;
            this.Preco = preco;
            this._qtd = qtd;

        }
        public String Nome
        {
            get { return _nome; }
            set { value = _nome; }

        }

        public int Qtd
        {
            get { return _qtd; }
            set { value = _qtd; }

        }

        public double adicionarProduto(int qtd)
        {
             return this._qtd += qtd;

        }
        public double RemoverProduto(int qtd)
        {
            while (this._qtd < qtd)
            {
                Console.Write("Digite uma quantidade valida: ");
                qtd = int.Parse(Console.ReadLine());
                Console.WriteLine("");

            }

            return this._qtd -= qtd;
        }
        public double ValorTotal()

        {
            return Preco * _qtd;

        }

        public override string ToString()
        {
            return _nome + ", $" + Preco.ToString("F2") 
                   + ", " + "Quantidade em estoque: " + _qtd 
                   + ", Total:" + ValorTotal();

        }
    }
}
