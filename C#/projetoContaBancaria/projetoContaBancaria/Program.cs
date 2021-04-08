using System;

namespace projetoContaBancaria
{
    class Program
    {
        static void Main(string[] args)
        {
            Conta conta;
            Console.Write("Digite o nome do titular: ");
            String Nome = Console.ReadLine();
            Console.Write("Digite o numero da conta: ");
            int Codigo = int.Parse(Console.ReadLine());

            Console.WriteLine("");
            Console.WriteLine("Bem-vindo, " + Nome);
            Console.Write("Deseja fazer um depósito inicial? S/N: ");
            String resp = Console.ReadLine();

            if (resp[0] == 's')
            {
                Console.Write("Digite o valor do deposito: ");
                Double Saldo = Double.Parse(Console.ReadLine());
                 conta = new Conta(Nome, Saldo, Codigo);

            }
            else
            {
                 conta = new Conta(Nome, Codigo);

                }
            Console.WriteLine("");
            Console.WriteLine("Dados da Conta: ");
            Console.Write(conta);

            Console.WriteLine("");
            Console.Write("Digite o valor do deposito: R$ ");
            Double deposito = Double.Parse(Console.ReadLine());
            conta.deposito(deposito);

            Console.WriteLine("");
            Console.WriteLine("Dados da Conta: ");
            Console.Write(conta);

            Console.WriteLine("");
            Console.Write("Digite o valor do Saque: ");
            Double retirada = Double.Parse(Console.ReadLine());
            conta.retirada(retirada);

            Console.WriteLine("");
            Console.WriteLine("Dados da Conta: ");
            Console.Write(conta);


        }
    }
}
