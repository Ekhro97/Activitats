package E_Sequiencials;

import java.util.Scanner;

public class Exercici_10 {
	private static final double CONVERPESETA = 166.386 ;
	public static void main (String [] args) { 
		
		Scanner Entrada = new Scanner(System.in);
	
		double Import = 1;
		double Resultat = 1;
		
		System.out.println("Introdueixi el import en euros ");
		
		Import = Entrada.nextDouble();
		Entrada.nextLine();
		Entrada.close();
		
		Resultat = Import * CONVERPESETA;
		
		System.out.println("L'import en pesetas és " + Resultat + " Pesetas");
	}
}
