using System;

namespace projetoRetangulo
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Projeto retangulo!");
            Console.WriteLine("Digite a largura e a altura do retângulo");
            double Largura = double.Parse(Console.ReadLine());
            double Altura = double.Parse(Console.ReadLine());
            Retangulo retangulo = new Retangulo(Largura, Altura);
            Console.WriteLine(retangulo.Area());
            Console.WriteLine(retangulo.Perimetro());
            Console.WriteLine(retangulo.Diagonal());
        }
    }
}
