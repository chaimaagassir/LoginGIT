package exercice1;
import org.joda.time.DateTime;

public class Employ� {
	
	 private int matricule;
	    private String nom, pr�nom;
	    private DateTime datenaissance, dateembauche;
	    private double salaire;
	    
	    public double Salaire
	    {
	        get { return salaire; }
	        set { salaire = value; }
	    }
	    
	    public int  DateEmbauche
	    {
	        get { return dateembauche; }
	        set { dateembauche = value; }
	    }
	    
	    public int DateNaissance
	    {
	        get { return datenaissance; }
	        set { datenaissance = value; }
	    }
	    
	    public char Pr�nom
	    {
	        get { return pr�nom; }
	        set { pr�nom = value; }
	    }
	    
	    public char Nom
	    {
	        get { return nom; }
	        set { nom = value; }
	    }
	    
	    public int Matricule
	    {
	        get { return matricule; }
	        set { matricule = value; }
	    }
	    
         //constructeur avec parametre
	    public Employ�(int matricule = 0, String nom = "", String pr�nom = "",
	                    DateTime dateembauche , DateTime = new int())
	    {
	        this.matricule = matricule;
	        this.nom = nom;
	        this.pr�nom = pr�nom;
	        this.datenaissance = datenaissance;
	        this.dateembauche = dateembauche;
	        }
	    
	    
	    //constructeur sans parametres
	    public Employ�()
	    {
	        matricule = 0;
	        nom = "";
	        pr�nom = "";
	        datenaissance = new int(1,1,2021);
	        dateembauche = new int(1,1,2021);
	    }
	    
	    //methode returne l'age de l'employ�
	    public int Age()
	    {
	    	int age;
	    	 age = DateTime.Now.Year - datenaissance.Year;
	            if (datenaissance.AddYears(age) > DateTime.Now.Date)
	                age--;
	            return age;
	
	    }
	    
	    //methode retourne le nombre d�ann�es d�anciennet� de l�employ�
	    public int Anciennete()
	    {
	    	  int Anc;
	            Anc = DateTime.Now.Year - dateembauche.Year;
	            if (dateembauche.AddYears(Anc) > DateTime.Now.Date)
	                Anc--;
	            return Anc;

	    }
	    
	    //methode augmente le salaire de l'employ�
	    public void AugmentationDuSalaire()
	    {
	        //Si Anciennet� < 5 ans, alors on ajoute 2%. - Si Anciennet� < 10 ans, alors on ajoute 5%. - Sinon, on ajoute 10%.
	        if (Anciennete() < 5)
	        {
	            salaire += 0.02 * salaire;
	        }
	        else if (Anciennete() < 10)
	        {
	            salaire += 0.05 * salaire;
	        } else
	        {
	            salaire += 0.1 * salaire;
	        }
	    }
	    
	    //methode qui affiche les informations de l�employ� 
	    public void AfficherEmploy�()
	    {
	        Console.WriteLine("\t\tMatricule: " + matricule);
	        
	        //ToUpper est une methode produit une nouvelle cha�ne de caract�res dont l'ensemble des caract�res seront mis en majuscules.
	        //Subchar renvoie une nouvelle cha�ne qui est une sous-cha�ne de cette cha�ne.
	        //ToLower produit une nouvelle cha�ne de caract�res dont l'ensemble des caract�res seront mis en minuscules.
	        Console.WriteLine("\t\tNom Complet: " + nom.ToUpper() + " " + String.ToUpper(pr�nom[0]) + pr�nom.Subchar(1).ToLower());
	        Console.WriteLine("\t\tAge: " + Age());
	        Console.WriteLine("\t\tAnciennet�" + Anciennete());
	        Console.WriteLine("\t\tSalaire :" + salaire);
	    }

}

