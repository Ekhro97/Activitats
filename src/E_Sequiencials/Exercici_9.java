package E_Sequiencials;
import java.util.Scanner;

public class Exercici_9 {
	private static final double PI = 3.14159265359;
	public static void main (String [] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		double RadiCercle = 1;
		double resultat = 1;
		
		System.out.println("Introdueix el radi del cercle");
		
		RadiCercle = Entrada.nextDouble();
		Entrada.nextLine();
		Entrada.close();
		
		resultat = PI * (RadiCercle * RadiCercle);
		System.out.println(String.format("L'area del cercle es %1$.3f", resultat));
	}
}