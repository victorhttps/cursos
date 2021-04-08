using System;
using System.Collections.Generic;
using System.Text;

namespace projetoRetangulo
{
    class Retangulo
    {
        public double Largura;
        public double Altura;

        public Retangulo(double Largura, double Altura)
        {
            this.Altura = Altura;
            this.Largura = Largura;

        }
        public double Area()
        {
            return Largura * Altura;

        }
        public double Perimetro()
        {
            return (Altura * 2)+(Largura * 2);

        }
        public double Diagonal()
        {
            double h = Math.Pow(Altura, 2) + Math.Pow(Largura, 2);
            return Math.Sqrt(h);

        }

    }
}
