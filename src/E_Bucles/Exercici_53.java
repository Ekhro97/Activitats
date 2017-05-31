package E_Bucles;
import java.util.Scanner;

public class Exercici_53 {
	public static void main (String [] args) {
		
		Scanner Entrada = new Scanner(System.in);

		int N;
		int M;
		int div = 0;
		int ajuda;
		
		System.out.print("Introdueix el primer nombre: ");
		N = Entrada.nextInt();
		Entrada.nextLine();
		
		System.out.print("Introdueix el segon nombre: ");
		M = Entrada.nextInt();
		Entrada.nextLine();
		Entrada.close();
		
		ajuda = N - M;
		
		while (ajuda >= M) {
			
			ajuda = N - M;
			N = ajuda;
			div = div + 1;
			
		}
		System.out.print("El quocient es: " + div + " i el residu es: " + ajuda);

	}
}
