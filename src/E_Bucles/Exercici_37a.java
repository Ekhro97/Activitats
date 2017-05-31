package E_Bucles;
import java.util.Scanner;

public class Exercici_37a {
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in); 
		
		int euros;
		int b500 = 0;
		int b200 = 0;
		int b100 = 0;
		int b50 = 0;
		int b20 = 0;
		int b10 = 0;
		int b5 = 0;
		int b2 = 0;
		int b1 = 0;
		
		System.out.print("Quina quantitat de nombres vols imprimir: ");
		euros = Entrada.nextInt();
		Entrada.nextLine();
		Entrada.close();
		
			while (euros >= 500) {
				
				b500++;
				euros = euros - 500;
			}
			while (euros >= 200) {
				
				b200++;
				euros = euros - 200;
			}
			while (euros >= 100) {
				
				b100++;
				euros = euros - 100;
			}
			while (euros >= 50) {
				
				b50++;
				euros = euros - 50;
			}
			while (euros >= 20) {
				
				b20++;
				euros = euros - 20;
			}
			while (euros >= 10) {
				
				b10++;
				euros = euros - 10;
			}
			while (euros >= 5) {
				
				b5++;
				euros = euros - 5;
			}
			while (euros >= 2) {
				
				b2++;
				euros = euros - 2;
			}
			while (euros >= 1) {
				
				b1++;
				euros = euros - 1;
			}
		
		System.out.println("Hi ha " + b500 + " Bitllets de 500");
		System.out.println("Hi ha " + b200 + " Bitllets de 200");
		System.out.println("Hi ha " + b100 + " Bitllets de 100");
		System.out.println("Hi ha " + b50 + " Bitllets de 50");
		System.out.println("Hi ha " + b20 + " Bitllets de 20");
		System.out.println("Hi ha " + b10 + " Bitllets de 10");
		System.out.println("Hi ha " + b5 + " Bitllets de 5");
		System.out.println("Hi ha " + b2 + " monedes de 2");
		System.out.println("Hi ha " + b1 + " monedes de 1");
		
	}
}
