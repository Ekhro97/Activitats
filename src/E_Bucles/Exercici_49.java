package E_Bucles;
import java.util.Scanner;

public class Exercici_49 {
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int mida;
		int x;
		int y;
		int num = 1;
		
		System.out.print("Introdueix el nombre de files: ");
		mida = Entrada.nextInt();
		Entrada.nextLine();
		Entrada.close();
		 
		for(x = 1; x <= mida; x++) {
			
			for (y = 1; y <= x; y++) { 
				System.out.print(num + " "); 
				num++;
				} 
			
			System.out.println(); 
			}
	}
}
