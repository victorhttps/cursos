using System;
using System.Collections.Generic;

namespace projetoFuncionarios
{
    class Program
    {
        static void Main(string[] args)
        {

            Console.Write("Quantos funcionarios serão registrados? : ");
            int qtd = int.Parse(Console.ReadLine());

            List<Funcionario> list = new List<Funcionario>();

            for (int i = 1; i <= qtd; i++)
            {
                Console.WriteLine("Funcionario #" + i);
                Console.Write("Id: ");
                int Id = int.Parse(Console.ReadLine());
                Console.Write("Nome: ");
                string Nome = Console.ReadLine();
                Console.Write("Salario: ");
                double Salario = double.Parse(Console.ReadLine());
                list.Add(new Funcionario(Nome, Id, Salario));
                Console.WriteLine("");
            }

            Console.Write("Digite o ID do funcionario que tera o salario aumentado: ");
            int IdSrc = int.Parse(Console.ReadLine());

            Funcionario emp = list.Find(x=> x.Id == IdSrc);
            if(emp != null)
            {
                Console.Write("Escreva a porcentagem: ");
                double Porcentagem = double.Parse(Console.ReadLine());
                emp.Aumentar(Porcentagem);
            }
            else
            {
                Console.WriteLine("Esse Id Não existe");
            }

            Console.WriteLine();
            Console.WriteLine("Lista atualizada de funcionarios: ");
            foreach(Funcionario funcionario in list)
            {
                Console.WriteLine(funcionario);
            }
        }
    }
}
