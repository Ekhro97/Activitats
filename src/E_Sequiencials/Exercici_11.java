package E_Sequiencials;

import java.util.Scanner;

public class Exercici_11 {
	public static void main (String [] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int VarA;
		int VarB;
		int VarC;
		int Save;
		
		System.out.println("Introdueix la primera variable");
		
		VarA = Entrada.nextInt();
		Entrada.nextLine();
		
		System.out.println("Introdueix la segona variable");
		
		VarB = Entrada.nextInt();
		Entrada.nextLine();
		
		System.out.println("Introdueix la tercera variable");
		
		VarC = Entrada.nextInt();
		Entrada.nextLine();
		Entrada.close();
		
		Save = VarB;
		VarB = VarA;
		VarA = VarC;
		VarC = Save;
		
		
		
		System.out.println("Variable A = " + VarA);
		System.out.println("Variable B = " + VarB);
		System.out.println("Variable C = " + VarC);
	}
}
