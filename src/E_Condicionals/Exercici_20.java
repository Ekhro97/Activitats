package E_Condicionals;
import java.util.Scanner;

public class Exercici_20 {
	public static void main (String [] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int valor1;
		int valor2;
		int valor3;
		int valor4;
		int MIN;
		
		System.out.print("Introdueix el primer valor: ");
		valor1 = Entrada.nextInt();
		Entrada.nextLine();
		System.out.print("Introdueix el segon valor: ");
		valor2 = Entrada.nextInt();
		Entrada.nextLine();
		System.out.print("Introdueix el segon valor: ");
		valor3 = Entrada.nextInt();
		Entrada.nextLine();
		System.out.print("Introdueix el tercer valor: ");
		valor4 = Entrada.nextInt();
		Entrada.nextLine();
		Entrada.close();
		
		if (valor1 < valor2 && valor1 < valor3 && valor1 < valor4) {
			
			MIN = valor1;
			System.out.println("Aquest es el valor mes gran: " + MIN);
		}
		if (valor2 < valor1 && valor2 < valor3 && valor2 < valor4) {
			
			MIN = valor2;
			System.out.println("Aquest es el valor mes gran: " + MIN);
		}
		
		if (valor3 < valor1 && valor3 < valor2 && valor3 < valor4) {
			
			MIN = valor3;
			System.out.println("Aquest es el valor mes gran: " + MIN);
		}
		if (valor4 < valor1 && valor4 < valor2 && valor4 < valor3) {
			
			MIN = valor4;
			System.out.println("Aquest es el valor mes gran: " + MIN);
		}
		
	}
}
