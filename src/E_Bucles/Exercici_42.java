package E_Bucles;
import java.util.Scanner;

public class Exercici_42 {
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int num = -1;
		int gran = 0;
		
		while (num != 0) {
			
			System.out.print("Introdueix els nombres per a treure el mes gran: ");
			num = Entrada.nextInt();
			Entrada.nextLine();
			
			if (num > gran) {
				
				gran = num;
			}
		}
		
		Entrada.close();
		System.out.println("El nombre mes gran es: " + gran);
	}
}
