using System;

namespace projetoEstoque
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Entre com os dados do produto: ");
            Console.Write("Nome: ");
            String Nome = Console.ReadLine();
            Console.Write("Preço: ");
            Double Preco = Double.Parse(Console.ReadLine());
            Console.Write("Quantidade em estoque: ");
            int Qtd = int.Parse(Console.ReadLine());
            Produto produto = new Produto(Nome, Preco, Qtd);
            
            Console.WriteLine(" ");
            Console.WriteLine("Dados do produto: " + produto);
            Console.WriteLine("");

            Console.Write("Digite a quandidade a ser adicionada ao estoque: ");
            Qtd = int.Parse(Console.ReadLine());
            produto.adicionarProduto(Qtd);
            
            Console.WriteLine(" ");
            Console.Write("Novos dados do produto: " + produto);
            Console.WriteLine(" ");
            
            Console.Write("Digite a quantidade a ser removida do estoque: ");
            Qtd = int.Parse(Console.ReadLine());
            produto.RemoverProduto(Qtd);
            
            Console.WriteLine(" ");
            Console.Write("Novos dados do produto: " + produto);

        }
    }
}
