package E_Condicionals;
import java.util.Scanner;

public class Exercici_23 {
	public static void main(String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		double resultat1;
		double resultat2;
		
		System.out.print("Introdueix el primer valor");
		a = Entrada.nextDouble();
		Entrada.nextLine();
		
		System.out.print("Introdueix el segon valor");
		b = Entrada.nextDouble();
		Entrada.nextLine();
		
		System.out.print("Introdueix el tercer valor");
		c = Entrada.nextDouble();
		Entrada.nextLine();
		Entrada.close();
		
		if (a==0 || b==0 || c==0) {
			
			System.out.println("Error, torna a introduir els valors");	
		}
		if (b < a && b < c) {
			
			System.out.println("Error, torna a introduir els valors");	
		}else {
			
			resultat1 = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
			resultat2 = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
			
			System.out.println("X1 es igual a " + resultat1);	
			System.out.println("X2 es igual a " + resultat2);	
		}
		
		
	}
} 
