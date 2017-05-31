package E_Sequiencials;
import java.util.Scanner;

public class Exercici_4 {
	public static void main (String [] args) { 
		
		Scanner Entrada = new Scanner(System.in);
	
		double Import;
		double Resultat;
		double ConverEuro;
		
		System.out.println("Introdueixi el import en dolars: ");
		
		Import = Entrada.nextDouble();
		Entrada.nextLine();
		
		System.out.println("Introdueixi el preu del Euro: ");
		
		ConverEuro = Entrada.nextDouble();
		Entrada.nextLine();
		Entrada.close();
		
		Resultat = Import * ConverEuro;
		
		System.out.println("L'import en euros és de " + Resultat + " Euros");
		
	}
}