package eercice3;

public class Livre {
	private char ref;
	private char titre;
	private char listeAuteur;
	private int annee;
	private int maisonEdition;
	
	public String toString() {
		return ("ref: "+ref+" titre: "+titre +"liste des auteurs:"+listeAuteur+"Ann�e"+annee +"Maison d'�dition"+maisonEdition);
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
	//methode qui d�terminer si le livre est �crit par un auteur donn� en param�tre.
	public boolean chercherAuteur (char auteur ) {
		if(this.listeAuteur=auteur) {
			System.out.println("Le livre est �crit par cet auteur");
		}
		
		
	}
	
	//methode qui d�terminer si le Livre traite un th�me bien d�termin�
		public boolean chercherTheme(String th�me) {
			if ( titre.contains(th�me)==true  ) return true ;
			else return false ;
			
	}


}
