package E_Condicionals;
import java.util.Scanner;

public class Exercici_16 {
	public static void main (String[] args) {
		
	Scanner Entrada = new Scanner(System.in);
	
	int valor1;
	int valor2;
	
	System.out.print("Introdueix el primer valor: ");
	valor1 = Entrada.nextInt();
	Entrada.nextLine();
	
	System.out.print("Introdueix el segon valor: ");
	valor2 = Entrada.nextInt();
	Entrada.nextLine();
	Entrada.close();
	
	if (valor1 > valor2) {
		
		System.out.print(valor1 + " es mes gran que " + valor2);

		}
	else {
		if (valor1 < valor2) {
			
			System.out.print(valor1 + " es mes petit que " + valor2);
			
			}
		else {
			
			if (valor1 == valor2) {
				
				System.out.print("Els dos valors son iguals, " + valor1 + " = " + valor2);
				
				}
			}
		}
	}
}
