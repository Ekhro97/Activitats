package E_Sequiencials;
import java.util.Scanner;

public class Exercici_5 {
	public static void main (String [] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		double Import;
		double Descompte;
		double Resultat;
		
		System.out.println("Introdueix L'import");
		Import = Entrada.nextDouble();
		Entrada.nextLine();
		
		System.out.println("Introdueix el percentatje de descompte");
		Descompte = Entrada.nextDouble();
		Entrada.nextLine();
		Entrada.close();
		
		Resultat = Import - ((Import / 100) * Descompte);
		
		System.out.println("El Import a pagar és " + Resultat);
	}
}
