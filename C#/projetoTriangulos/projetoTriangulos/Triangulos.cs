using System;
using System.Collections.Generic;
using System.Text;

namespace projetoTriangulos
{
    class Triangulos
    {
        public double a;
        public double b;
        public double c;
        public Triangulos(double a, double b, double c)
        {
            this.a = a;
            this.b = b;
            this.c = c;

        }
        public double perimetro()
        {
            double p = (a + b + c) / 2.0;
            double result = Math.Sqrt(p * (p - a) * (p - b) * (p - c));
            return result;
        }
    }
}
