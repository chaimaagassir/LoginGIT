package eercice3;

public class Livre {
	private char ref;
	private char titre;
	private char listeAuteur;
	private int annee;
	private int maisonEdition;
	
	public String toString() {
		return ("ref: "+ref+" titre: "+titre +"liste des auteurs:"+listeAuteur+"Année"+annee +"Maison d'édition"+maisonEdition);
		}
	
	public string ref                       //Getter et Setter
    {
        get { return ref; }
        set { ref = value; }
    }
	
	public string titre                       //Getter et Setter
    {
        get { return titre; }
        set { titre = value; }
    }
	
	public string listeAuteur                       //Getter et Setter
    {
        get { return listeAuteur; }
        set { ref = value; }
    }
	
	public string annee                       //Getter et Setter
    {
        get { return annee; }
        set { annee = value; }
    }
	
	public string maisonEdition                       //Getter et Setter
    {
        get { return maisonEdition; }
        set { maisonEdition = value; }
    }
	//methode qui déterminer si le livre est écrit par un auteur donné en paramètre.
	public boolean chercherAuteur (char auteur ) {
		if(this.listeAuteur=auteur) {
			System.out.println("Le livre est écrit par cet auteur");
		}
		
		
	}
	
	//methode qui déterminer si le Livre traite un thème bien déterminé
		public boolean chercherTheme(String thème) {
			if ( titre.contains(thème)==true  ) return true ;
			else return false ;
			
	}


}
