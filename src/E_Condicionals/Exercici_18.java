package E_Condicionals;
import java.util.Scanner;

public class Exercici_18 {
	public static void main(String[] args) {

		Scanner Entrada = new Scanner(System.in);
		
		int valor1;
		int valor2;
		int valor3;
		int valor4;
		
		System.out.print("Introdueix el primer valor: ");
		valor1 = Entrada.nextInt();
		Entrada.nextLine();
		System.out.print("Introdueix el segon valor: ");
		valor2 = Entrada.nextInt();
		Entrada.nextLine();
		
		System.out.print("Introdueix el tercer valor: ");
		valor3 = Entrada.nextInt();
		Entrada.nextLine();
		System.out.print("Introdueix el quart valor: ");
		valor4 = Entrada.nextInt();
		Entrada.nextLine();
		Entrada.close();
		
		valor1 = valor1 + valor2;
		valor3 = valor3 + valor4;
		
		if (valor1 > valor3) {
			
			System.out.print("La primera suma es mes gran que la segona: " + valor1 + " > " + valor3);

			}
		if (valor1 < valor3) {
			
			System.out.print("La primera suma es mes petita que la segona: " + valor1 + " < " + valor3);
			
			}
		if (valor1 == valor3) {
			
			System.out.print("Les dues sumes son iguals: " + valor1 + " = " + valor3);
			
		}
	}
}
