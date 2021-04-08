using System;

namespace projetoTriangulos
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("digite as medidas do triangulo A: ");
            double a = double.Parse(Console.ReadLine());
            double b = double.Parse(Console.ReadLine());
            double c = double.Parse(Console.ReadLine());
            Triangulos trianguloA = new Triangulos(a, b, c);
            Console.WriteLine(trianguloA.perimetro().ToString("F2"));


        }
    }
}
