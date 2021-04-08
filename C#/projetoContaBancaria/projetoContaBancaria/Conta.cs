using System;
using System.Collections.Generic;
using System.Text;

namespace projetoContaBancaria
{
    class Conta
    {
        public int Codigo { get; set; }
        public Double Saldo { get; set; }
        public String Nome { get; set; }

        public Conta(string nome, double saldo, int codigo)
        {
            Nome = nome;
            Saldo = saldo;
            Codigo = codigo;
        }

        public Conta(string nome, int codigo)
        {
            Nome = nome;
            Codigo = codigo;
        }

        public void deposito(double deposito)
        {
             Saldo += deposito;

        }

        public void retirada(double retirada)
        {
            Saldo -= retirada;

        }

        public override string ToString()
        {
            return "Titular: " + Nome + "\nNumero da conta: " + Codigo + "\nSaldo: " + "R$ " + Saldo;
        }
    }
}
