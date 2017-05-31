package E_Bucles;
import java.util.Scanner;

public class Exercici_64 {
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int num = 1;
		int comp = 0;
		
		while (num != 0) {
			
			System.out.print("Introdueix un nombre: ");
			num = Entrada.nextInt();
			Entrada.nextLine();
			if (num < 0) {
				
				comp ++;
			}
		}
		
		Entrada.close();
		System.out.println("hi han " + comp + " nombres negatius");
	}
}
