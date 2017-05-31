package E_Condicionals;
import java.util.Scanner;

public class Exercici_24 {
	public static void main (String [] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		double val1;
		double val2;
		int opcio;
		double resultat;
		
		System.out.print("Que vol realitzar, introdueixi 1 per al perimetre o 2 per a l'area: ");
		opcio = Entrada.nextInt();
		Entrada.nextLine();
		
		if (opcio == 1) {
			
			System.out.print("Introdueix el primer valor: ");
			val1 = Entrada.nextDouble();
			Entrada.nextLine();
			
			System.out.print("Introdueix el primer valor: ");
			val2 = Entrada.nextDouble();
			Entrada.nextLine();
			Entrada.close();
			
			resultat = (2*val1) + (2*val2);
			
			System.out.print("El perimetre del rectangle es" + resultat);
		}else if (opcio ==2 ) {
			
			System.out.print("Introdueix el primer valor: ");
			val1 = Entrada.nextDouble();
			Entrada.nextLine();
			
			System.out.print("Introdueix el primer valor: ");
			val2 = Entrada.nextDouble();
			Entrada.nextLine();
			Entrada.close();
			
			resultat = val1*val2;
			
			System.out.print("El perimetre del rectangle es: " + resultat);
		}else {
			
			System.out.print("Error");
		}
	}
}
