package E_Bucles;
import java.util.Scanner;

public class Exercici_37b {
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in); 
		
		double euros;
		int b500 = 0;
		int b200 = 0;
		int b100 = 0;
		int b50 = 0;
		int b20 = 0;
		int b10 = 0;
		int b5 = 0;
		int b2 = 0;
		int b1 = 0;
		int m50 = 0;
		int m20 = 0;
		int m10 = 0;
		int m5 = 0;
		int m1 = 0;
		
		System.out.print("Quina quantitat de nombres vols imprimir: ");
		euros = Entrada.nextDouble();
		Entrada.nextLine();
		Entrada.close();
		
			while (euros >= 500.0) {
				
				b500++;
				euros = euros - 500.0;
			}
			while (euros >= 200.0) {
				
				b200++;
				euros = euros - 200.0;
			}
			while (euros >= 100.0) {
				
				b100++;
				euros = euros - 100.0;
			}
			while (euros >= 50.0) {
				
				b50++;
				euros = euros - 50.0;
			}
			while (euros >= 20.0) {
				
				b20++;
				euros = euros - 20.0;
			}
			while (euros >= 10.0) {
				
				b10++;
				euros = euros - 10.0;
			}
			while (euros >= 5.0) {
				
				b5++;
				euros = euros - 5.0;
			}
			while (euros >= 2.0) {
				
				b2++;
				euros = euros - 2.0;
			}
			while (euros >= 1.0) {
				
				b1++;
				euros = euros - 1.0;
			}
			while (euros >= 0.5) {
				
				m50++;
				euros = euros - 0.5;
			}
			while (euros >= 0.20) {
				
				m20++;
				euros = euros - 0.2;
			}
			while (euros >= 0.1) {
				
				m10++;
				euros = euros - 0.1;
			}
			while (euros >= 0.05) {
				
				m5++;
				euros = euros - 0.05;
			}
			while (euros >= 0.01) {
				m1++;
				euros = euros - 0.01;
			}
			
		System.out.println("Hi ha " + b500 + " Bitllets de 500€");
		System.out.println("Hi ha " + b200 + " Bitllets de 200€");
		System.out.println("Hi ha " + b100 + " Bitllets de 100€");
		System.out.println("Hi ha " + b50 + " Bitllets de 50€");
		System.out.println("Hi ha " + b20 + " Bitllets de 20€");
		System.out.println("Hi ha " + b10 + " Bitllets de 10€");
		System.out.println("Hi ha " + b5 + " Bitllets de 5€");
		System.out.println("Hi ha " + b2 + " monedes de 2€");
		System.out.println("Hi ha " + b1 + " monedes de 1€");
		System.out.println("Hi ha " + m50 + " monedes de 50 cent");
		System.out.println("Hi ha " + m20 + " monedes de 20 cent");
		System.out.println("Hi ha " + m10 + " monedes de 10 cent");
		System.out.println("Hi ha " + m5 + " monedes de 5 cent");
		System.out.println("Hi ha " + m1 + " monedes de 1 cent");
	}
}
