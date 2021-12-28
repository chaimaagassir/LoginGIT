package exercice4;

public class Batiment {
	
	private String nom;
	private String adresse;
	
	public Batiment()
    {
    }

    public Batiment(String nom,String adresse)
    {
    	this.nom = nom;
        this.adresse = adresse;
    }

    
    public string nom
    {
        get { return nom; }
        set { nom = value; }
    }

    public string adresse
    {
        get { return adresse; }
        set { adresse = value; }
    }
    
    
    //methode toString
    public  string ToString()
    {
    	return ("nom: "+nom+" adresse: "+adresse );
    }

}

//classe maison herite de batiment
class Maison extends Batiment
{
    private int NbPieces;

    public int NbPieces
    {
        get { return NbPieces; }
        set { NbPieces = value; }
    }

    public Maison() 
    {
    }

    public Maison(String nom,String adresse, int nb)
       
    {
    	super();
        NbPieces = nb;
    }

    public  string ToString()
    {
    	return ("Nombre de pièces: "+NbPieces );
    }
}

