package E_Sequiencials;
import java.util.Scanner;

public class Exercici_7 {
	public static void main (String [] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		double Var1;
		double Var2;
		double Save;
		
		System.out.println("Introdueix el primer valor");
		
		Var1 = Entrada.nextDouble();
		Entrada.nextLine();
		
		System.out.println("Introdueix el segon valor");
		
		Var2 = Entrada.nextDouble();
		Entrada.nextLine();
		Entrada.close();
		
		Save = Var1;
		Var1 = Var2;
		Var2 = Save;
		
		System.out.println("Primer Vlaor intercambiat = " + Var1);
		System.out.println("Segon Vlaor intercambiat = " + Var2);
	}
}
