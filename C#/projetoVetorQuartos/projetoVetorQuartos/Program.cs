using System;

namespace projetoVetorQuartos
{
    class Program
    {
        static void Main(string[] args)
        {
            Hospede[] vect = new Hospede[10];

            Console.Write("Quantos quartos serão alugados? ");
            int qtd = int.Parse(Console.ReadLine());

            for (int i = 1; i <= qtd; i++)
            {
                Console.WriteLine("\nHospede #" + i);
                Console.Write("Nome: ");
                String Nome = Console.ReadLine();
                Console.Write("Email: ");
                String Email = Console.ReadLine();
                Console.Write("Digite o quarto: ");
                int Quarto = int.Parse(Console.ReadLine());

                vect[Quarto] = new Hospede(Nome, Email);

            }
            Console.WriteLine();
            Console.Write("Quartos ocupados: ");
            for (int i = 0; i < 10; i++)
            {
                if (vect[i] != null)
                {
                    Console.WriteLine();
                    Console.WriteLine("\nQuarto: "+ i + ":" + "\n"  + vect[i]);

                }
            } 
            foreach(Hospede hospede in vect)
            {
                Console.WriteLine(hospede);
            }
        }
    }
}
