package E_Bucles;
import java.util.Scanner;

public class Exercici_48 {
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int mida;
		int x;
		int y;
		
		System.out.print("Introdueix la mida del cub: ");
		mida = Entrada.nextInt();
		Entrada.nextLine();
		Entrada.close();
		 
		for(x = 1; x <= mida; x++) {
			
			for(y = 1; y <= mida; y++) {
	          
				System.out.print("*");
				}
			
			System.out.println();
			}
	}
}
