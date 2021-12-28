package exercice1;
import org.joda.time.DateTime;

public class Employé {
	
	 private int matricule;
	    private String nom, prénom;
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
	    
	    public char Prénom
	    {
	        get { return prénom; }
	        set { prénom = value; }
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
	    public Employé(int matricule = 0, String nom = "", String prénom = "",
	                    DateTime dateembauche , DateTime = new int())
	    {
	        this.matricule = matricule;
	        this.nom = nom;
	        this.prénom = prénom;
	        this.datenaissance = datenaissance;
	        this.dateembauche = dateembauche;
	        }
	    
	    
	    //constructeur sans parametres
	    public Employé()
	    {
	        matricule = 0;
	        nom = "";
	        prénom = "";
	        datenaissance = new int(1,1,2021);
	        dateembauche = new int(1,1,2021);
	    }
	    
	    //methode returne l'age de l'employé
	    public int Age()
	    {
	    	int age;
	    	 age = DateTime.Now.Year - datenaissance.Year;
	            if (datenaissance.AddYears(age) > DateTime.Now.Date)
	                age--;
	            return age;
	
	    }
	    
	    //methode retourne le nombre d’années d’ancienneté de l’employé
	    public int Anciennete()
	    {
	    	  int Anc;
	            Anc = DateTime.Now.Year - dateembauche.Year;
	            if (dateembauche.AddYears(Anc) > DateTime.Now.Date)
	                Anc--;
	            return Anc;

	    }
	    
	    //methode augmente le salaire de l'employé
	    public void AugmentationDuSalaire()
	    {
	        //Si Ancienneté < 5 ans, alors on ajoute 2%. - Si Ancienneté < 10 ans, alors on ajoute 5%. - Sinon, on ajoute 10%.
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
	    
	    //methode qui affiche les informations de l’employé 
	    public void AfficherEmployé()
	    {
	        Console.WriteLine("\t\tMatricule: " + matricule);
	        
	        //ToUpper est une methode produit une nouvelle chaîne de caractères dont l'ensemble des caractères seront mis en majuscules.
	        //Subchar renvoie une nouvelle chaîne qui est une sous-chaîne de cette chaîne.
	        //ToLower produit une nouvelle chaîne de caractères dont l'ensemble des caractères seront mis en minuscules.
	        Console.WriteLine("\t\tNom Complet: " + nom.ToUpper() + " " + String.ToUpper(prénom[0]) + prénom.Subchar(1).ToLower());
	        Console.WriteLine("\t\tAge: " + Age());
	        Console.WriteLine("\t\tAncienneté" + Anciennete());
	        Console.WriteLine("\t\tSalaire :" + salaire);
	    }

}

