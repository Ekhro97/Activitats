package E_Sequiencials;
import java.util.Scanner;

public class Exercici_13 {
	public static void main (String [] args) {
			
			Scanner Entrada = new Scanner(System.in);
		
			int Bitllets;
			int Resultat;
			
			System.out.print("Introdueixi la cantitat d'euros desitjada: ");
			Bitllets = Entrada.nextInt();
			Entrada.nextLine();
			Entrada.close();

			Resultat = Bitllets / 100;
			System.out.println(Bitllets + " Euros son " + Resultat + " bitllets de 100");
			
			Resultat = Bitllets / 50;
			System.out.println(Bitllets + " Euros son " + Resultat + " bitllets de 50");
			
			Resultat = Bitllets / 20;
			System.out.println(Bitllets + " Euros son " + Resultat + " bitllets de 20");
			
			Resultat = Bitllets / 10;
			System.out.println(Bitllets + " Euros son " + Resultat + " bitllets de 10");
			
			Resultat = Bitllets / 5;
			System.out.println(Bitllets + " Euros son " + Resultat + " bitllets de 5");
		
	}
}
