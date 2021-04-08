using System;
using System.Collections.Generic;

namespace projetoListas
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
            Console.WriteLine("------------");

            List<String> list = new List<string>();

            list.Add("Maria");
            list.Add("Anna");
            
            list.Add("Jota");
            list.Add("Gustavo");
            list.Insert(2, "teste");
            list.Add("André");
            foreach(String nome in list)
                Console.WriteLine(nome);
            Console.WriteLine("-----------");
            Console.WriteLine("Count: " + list.Count);

            String s1 = list.Find(x => x[0] == 'A');
            Console.WriteLine("First A: " + s1);

            String s2 = list.FindLast(x => x[0] == 'A');
            Console.WriteLine("Last A: " + s2);

            int pos1 = list.FindIndex(x => x[0] == 'A');
            Console.WriteLine("First position A: " + pos1);

            int pos2= list.FindLastIndex(x => x[0] == 'A');
            Console.WriteLine("First position A: " + pos2);

            List<String> list2 = list.FindAll(x => x.Length == 5);
            foreach(String nome in list2)
                Console.WriteLine(nome);
            
            Console.WriteLine("------------");
            
            list.Remove("Jota");
            foreach (String nome in list)
                Console.WriteLine(nome);

            Console.WriteLine("------------");
            list.RemoveAll(x => x[0] == 'A');

            foreach (String nome in list)
                Console.WriteLine(nome);

            list.RemoveAt(1);
            Console.WriteLine("------------");

            foreach (String nome in list)
                Console.WriteLine(nome);

            list.RemoveRange(0, 1);
            Console.WriteLine("------------");

            foreach (String nome in list)
                Console.WriteLine(nome);

        }
    }
}
