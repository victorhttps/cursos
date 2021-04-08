using System;

namespace projetoVetor
{
    class Program
    {
        static void Main(string[] args)
        {
            /*  Console.Write("Digite o numero de pessoas: ");
              int n = int.Parse(Console.ReadLine());

              double[] vect = new double[n];

              for (int i = 0; i < n; i++)
              {
                  Console.Write("\ndigite a altura #" + i + ": ");
                vect[i]= double.Parse(Console.ReadLine());
              }

              double soma = 0;
              for (int i = 0; i < n; i++)
                  soma += vect[i];


              double media = soma / vect.Length;
              Console.WriteLine("\nmedia: " + media); */
            
            Console.Write("Digite a quantidade de produtos a ser adicionada: ");
            int n = int.Parse(Console.ReadLine());

            Produto[] vect = new Produto[n];

            for(int i = 0; i < n; i++)
            {
                Console.Write("\nDigite o nome do produto: ");
                String Nome = Console.ReadLine();
                Console.Write("\nDigite o preco do produto: ");
                Double Preco = Double.Parse(Console.ReadLine());
                vect[i] = new Produto(Nome, Preco);
            }

            Console.WriteLine("\nQTD de produtos: " + vect.Length);
            double soma = 0;

            for (int i = 0; i < n; i++)
                soma += vect[i].Preco;

            double media = soma / n;
            Console.WriteLine("\nmedia: " + media);
        }
    }
}
