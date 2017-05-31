package E_Condicionals;
import java.util.Scanner;

public class Exercici_17 {
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int valor1;
		
		System.out.print("Introdueix el valor desitgat:" );
		valor1 = Entrada.nextInt();
		Entrada.nextLine();
		Entrada.close();
		
		if (valor1 > 20) {
			
			valor1 = valor1 * valor1;
			System.out.println("El seu valor elevat a la 2 es: " + valor1);
		}
		else {
			
			valor1 = valor1 * valor1 * valor1;
			System.out.println("El seu valor elevat a la 3 es: " + valor1);
		}
	}
}
