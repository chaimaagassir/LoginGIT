package exercice5;

public class compte {
	
	        private int code;
	        private double solde;
	        private static int nb_comptes=0;

	        public int code
	        {
	            get { return code; }
	            set { code = value; }
	        }
	        
	        public int solde
	        {
	            get { return solde; }
	            set { solde = value; }
	        }
	        
	        
	        public Compte()
	        {
	            nb_comptes++;
	            code = nb_comptes;
	        }

	        public Compte(double solde)
	        {
	            nb_comptes++;
	            code = nb_comptes;
	            this.solde = solde;
	        }

	        public virtual void deposer(double somme)               //m�thode virtuelle qui peut �tre red�finie dans une classe d�riv�e
	        {
	            solde += somme;
	        }

	        public virtual void retirer(double sommme)             ////m�thode virtuelle qui peut �tre red�finie dans une classe d�riv�e
	        {
	            solde -= sommme;
	        }

	        public  string ToString()
	        {
	            return "Code: " + code + " Solde: " + solde;
	        }
	    }


class CompteEpargne extends Compte
{
    private double tauxinteret=5;


    public CompteEpargne()  { }                  //constructeur par d�faut

    public CompteEpargne(double solde) {
    	super();
    } //constructeur d'initialisation

    public void CalculInteret()                      //une nouvelle m�thode qui utilise une m�thode h�rit�e
    {
        deposer((solde * tauxinteret)/ 100);
    }

    
}

//class comptepayant
public class ComptePayant extends Compte {
	public ComptePayant(float s){
        super(s);
    }
    
    public void d�poser(float montant){
        
        super.d�poser(montant);
        super.retirer(20);
    }
    public void retirer(float montant){
      
        super.retirer(montant);
        super.retirer(20);
    }
    public String toString(){
        return super.toString();
    }
}
	

