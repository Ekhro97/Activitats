package E_Sequiencials;
import java.util.Scanner;

public class Exercici_14 {
	public static void main (String [] args) {
		
		Scanner Entrada = new Scanner(System.in);
	
		double Euros;
		double Ajuda;
		double Resultat;
		
		System.out.print("Introdueixi la cantitat d'euros desitjada: ");
		Euros = Entrada.nextDouble();
		Entrada.nextLine();
		Entrada.close();

		Resultat = Euros / 100;
		int Bitllet100 = (int) Resultat;
		System.out.println("Seran " + Bitllet100 + " bitllets de 100");
		Ajuda = Euros % 100;
		
		Resultat = Ajuda / 50;
		int Bitllet50 = (int) Resultat;
		System.out.println("Seran " + Bitllet50 + " bitllets de 50");
		Ajuda = Euros % 50;
		
		Resultat = Ajuda / 20;
		int Bitllet20 = (int) Resultat;
		System.out.println("Seran " + Bitllet20 + " bitllets de 20");
		Ajuda = Euros % 20;
		
		Resultat = Ajuda / 10;
		int Bitllet10 = (int) Resultat;
		System.out.println("Seran " + Bitllet10 + " bitllets de 10");
		Ajuda = Euros % 10;
		
		Resultat = Ajuda / 5;
		int Bitllet5 = (int) Resultat;
		System.out.println("Seran " + Bitllet5 + " bitllets de 5");
		Ajuda = Euros % 5;
	}
}
