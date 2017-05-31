package E_Sequiencials;
import java.util.Scanner;

public class Exercici_8 {
	public static void main (String [] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		double Base = 1;
		double Altura = 1;
		double Resultat = 1;
		
		System.out.println("Introdueix la base");
		
		Base = Entrada.nextDouble();
		Entrada.nextLine();
		
		System.out.println("Introdueix la altura");
		
		Altura = Entrada.nextDouble();
		Entrada.nextLine();
		Entrada.close();
		
		Resultat = (Base * Altura) / 2;
		
		System.out.println("L'area del triangle és " + Resultat);
	}
}
