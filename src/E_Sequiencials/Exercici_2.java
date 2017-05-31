package E_Sequiencials;
import java.util.Scanner;

public class Exercici_2 {
	public static void main (String [] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		double Num1 = 1;
		double Num2 = 1;
		double resultat = 1;
		
		
		System.out.println("Introduex el primer nombre per a la suma ");
		
		Num1 = Entrada.nextDouble();
		Entrada.nextLine();
		
		System.out.println("Introduex el segon nombre per a la suma");
		
		Num2 = Entrada.nextDouble();
		Entrada.nextLine();
		Entrada.close();
		
		resultat = Num1 + Num2;
		
		System.out.println(resultat);
		
		
	}
	
}
