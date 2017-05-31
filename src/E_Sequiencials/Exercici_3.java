package E_Sequiencials;
import java.util.Scanner;

public class Exercici_3 {
	private static final double DESCOMPTE20 = 0.2;
	public static void main (String [] args) { 
		
		Scanner Entrada = new Scanner(System.in);
		
		double Import = 1;
		double resultat = 1;
		
		System.out.println("Introdueixi el import a pagar");
		
		Import = Entrada.nextDouble();
		Entrada.nextLine();
		Entrada.close();
		
		resultat = Import - (Import * DESCOMPTE20);
		
		System.out.println("L'import amb 20% de descompte és " + resultat);
		
	}
	
}
