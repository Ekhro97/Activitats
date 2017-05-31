package E_Sequiencials;
import java.util.Scanner;

public class Exercici_15 {
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
		
		Resultat = Ajuda / 1;
		int Moneda1 = (int) Resultat;
		System.out.println("Seran " + Moneda1 + " monedes de 1 euro");
		Ajuda = Euros % 1;
		
		Resultat = Ajuda / 0.5;
		int Moneda05 = (int) Resultat;
		System.out.println("Seran " + Moneda05 + " monedes de 0,50 centims");
		Ajuda = Euros % 0.5;
		
		Resultat = Ajuda / 0.2;
		int Moneda02 = (int) Resultat;
		System.out.println("Seran " + Moneda02 + " monedes de 0,20 centims");
		Ajuda = Euros % 0.2;
		
		Resultat = Ajuda / 0.1;
		int Moneda01 = (int) Resultat;
		System.out.println("Seran " + Moneda01 + " monedes de 0,10 centims");
		Ajuda = Euros % 0.1;
		
		Resultat = Ajuda / 0.05;
		int Moneda005 = (int) Resultat;
		System.out.println("Seran " + Moneda005 + " monedes de 0,05 centims");
		Ajuda = Euros % 0.05;
		
		Resultat = Ajuda / 0.02;
		int Moneda002 = (int) Resultat;
		System.out.println("Seran " + Moneda002 + " monedes de 0,02 centims");
		Ajuda = Euros % 0.02;
		
		Resultat = Ajuda / 0.01;
		int Moneda001 = (int) Resultat;
		System.out.println("Seran " + Moneda001 + " monedes de 0,01 centims");
		Ajuda = Euros % 0.01;
	}
}