using System;
using System.Collections.Generic;
using System.Text;

namespace projetoFuncionarios
{
    class Funcionario
    {
        public String Nome { get; set; }
        public int Id { get; set; }
        public double Salario { get; set; }

        
        public Funcionario(string nome, int id, double salario)
        {
            Nome = nome;
            Id = id;
            Salario = salario;
        }

        public void Aumentar( double porcentagem)
        {
             Salario += Salario * (porcentagem/100);
        }

        public override string ToString()
        {
            return "Id: " + Id + 
                   "\nNome: " + Nome +
                   "\nSalario: " + Salario.ToString("F2") +
                   "\n";
        }
    }
}
