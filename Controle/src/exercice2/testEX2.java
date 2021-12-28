package exercice2;

public class testEX2 {
	
	public static void Main(string[] args{
		Point B =new Point('B',2,6,4);
		B.affiche();
		B.translate(3, 2, 4);
		B.affiche();
		Point C = new Point('C',2,5,3);
		System.out.println("La distance entre B et C=" +B.distance(C));
		
	}

}
