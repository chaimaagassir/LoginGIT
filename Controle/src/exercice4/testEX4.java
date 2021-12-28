package exercice4;

public class testEX4 {
	
        static void Main(string[] args)
        {
            Batiment B = new Batiment("Ryad","Casabanca");
            Console.Out.WriteLine(B);
            Maison M1 = new Maison("Ryad","Casablanca", 2);
            Console.Out.WriteLine(M1);
            Maison M2 = new Maison();
            M2.adresse = "Fes";
            M2.NbPieces = 3;
            Console.Out.WriteLine(M2);
            Console.ReadKey();
        }
    
}
