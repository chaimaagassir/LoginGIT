package exercice5;

public class testEX5 {
		public static void main(String[] args) {
	        compte c1=new compte(20000);
	        CompteEpargne c2=new CompteEpargne(37000);
	        ComptePayant c3=new ComptePayant(10000);
	        
	       //d�poser pour chaque compte
	        
	        c1.d�poser(1000);
	        c2.d�poser(2000);
	        c3.d�poser(3000);
	       // retirer de chaque compte 
	        
	        c1.retirer(3000);
	        c2.retirer(2000);
	        
	       // calculer l'ineret du compteEpargne
	        
	        c2.calculInteret();
	       // affichage des soldes de chaque compte
	      
	        System.out.println(c1.toString());
	        
	        System.out.println(c2.toString());
	        
	        System.out.println(c3.toString());
	}
	
}
