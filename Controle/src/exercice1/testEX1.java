package exercice1;

public class testEX1 {
	
	public static void Main(char[] args{
		
		 int mat;
         String nom, prenom;
         DateTime dn, de;
         double salaire;

         Console.Out.Write("Matricule: ");
         mat = int.Parse(Console.In.ReadLine());
         Console.Out.Write("Nom: ");
         nom = Console.In.ReadLine();
         Console.Out.Write("Pr�nom: ");
         prenom = Console.In.ReadLine();
         Console.Out.Write("Date de naissance (jj/mm/aaaa): ");
         dn = DateTime.Parse(Console.In.ReadLine());
         Console.Out.Write("Date embauche (jj/mm/aaaa): ");
         de = DateTime.Parse(Console.In.ReadLine());
         Console.Out.Write("salaire: ");
         salaire = double.Parse(Console.In.ReadLine());

		
		Employ� nouveau =new Employ�(24336,'Maarouf','Ali',2021,1997,20455);
		nouveau.AfficherEmploy�();
		
		//Augmentation de salaire
		nouveau.AugmentationDuSalaire();
		nouveau.AfficherEmploy�();
		
		
		
		
		
		
	}

}
