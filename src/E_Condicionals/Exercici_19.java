package E_Condicionals;
import java.util.Scanner;

public class Exercici_19 {
	public static void main(String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int valor1;
		int valor2;
		int valor3;
		int MIN;
		
		System.out.print("Introdueix el primer valor: ");
		valor1 = Entrada.nextInt();
		Entrada.nextLine();
		System.out.print("Introdueix el segon valor: ");
		valor2 = Entrada.nextInt();
		Entrada.nextLine();
		System.out.print("Introdueix el tercer valor: ");
		valor3 = Entrada.nextInt();
		Entrada.nextLine();
		Entrada.close();
		
		if (valor1 < valor2) {
			
			MIN = valor1;
		}
		else {
			
			MIN = valor2;
		}
		
		if (MIN < valor3) {
			
			System.out.println("Aquest es el valor mes petit: " + MIN);
		}
		else {
			
			MIN = valor3;
			System.out.println("Aquest es el valor mes petit: " + MIN);
		}
		
	}
}
