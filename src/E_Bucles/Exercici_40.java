package E_Bucles;
import java.util.Scanner;

public class Exercici_40 {
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int num = 1;
		int resultat = 0;
		
		while (num != 0) {
			
			System.out.print("Introdueix un nombre per a sumar: ");
			num = Entrada.nextInt();
			Entrada.nextLine();
			resultat = resultat + num;
		}
		
		Entrada.close();
		System.out.println("La suma es " + resultat);
	}
}
