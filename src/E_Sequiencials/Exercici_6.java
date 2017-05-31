package E_Sequiencials;
import java.util.Scanner;

public class Exercici_6 {
	
	private static final int DIES = 365;
	private static final int SEGONS = 31536000; 
	
	public static void main (String [] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int Anys;
		int RDies;
		int RSegons;
		
		System.out.println("Introdueix L'edat");
		
		Anys = Entrada.nextInt();
		Entrada.nextLine();
		Entrada.close();
		
		RSegons = Anys * SEGONS;
		RDies = Anys * DIES;
		
		System.out.println("L'edat en Dies és " + RDies);
		System.out.println("L'edat en Segons és " + RSegons);
		
	}
}
