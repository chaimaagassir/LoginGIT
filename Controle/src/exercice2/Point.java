package exercice2;

public class Point {
	
	private char nom;
	private double x,y,z;
	
	public Point(char nom,double x, double y,double z)   //Le constructeur d'initialisation
    {
		this.nom=nom;
		this.x=x;
		this.y=y;
		this.z=z;
		 
    }
	
	//methode pour afficher les coordonnées d'un point
	public void affiche() {
		System.out.println("Le point" +this.nom +"a pour coordonnées" +x +"," +y +"," +z );
		
	}
	
	//methode pour effectuer une translation
	  public void translate(double dx, double dy,double dz) {
		    x = x + dx;
		    y = y + dy;
		    z = z + dz;
		  }
	  
	//methode pour calculer la distance entre deux points
	  public double distance (Point A) {
		  double d = this.x - A.x;
		  return Math.abs(d);
	  }
	  
}

 
