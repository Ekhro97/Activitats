package E_Bucles;
import java.util.Scanner;

public class Exercici_51 {
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int mida;
		int i;
		int j;
		
		System.out.print("Introdueix el nombre de files: ");
		mida = Entrada.nextInt();
		Entrada.nextLine();
		Entrada.close();
		 
		for (i = 0; i < mida; i++) {
			
			System.out.println();
			
			for (j = 0; j < mida-i-1; j++) {
				
				System.out.print(" ");
			}
			
			for (j = 0; j < 2*i+1 ; j++) {
			
				System.out.print("*");
			}
		}
	}
}
