package E_Sequiencials;
import java.util.Scanner;

public class Exercici_12 {
	public static void main (String [] args) { 
		
		Scanner Entrada = new Scanner(System.in);
	
		double X = 1;
		double Resultat = 1;
		
		System.out.println("Introdueixi el valor X ");
		X = Entrada.nextDouble();
		Entrada.nextLine();
		Entrada.close();
		
		Resultat = (X*X*X) + (3*(X*X)) + (7*(X)) + 7;
		
				System.out.println("El resultat del polinomi és = " + Resultat);
	}
}
