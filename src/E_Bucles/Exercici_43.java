package E_Bucles;
import java.util.Scanner;

public class Exercici_43 {
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int num = 1;
		double voltes = 0;
		double resultat = 0;
		
		int gran;
		int petit;
		
		System.out.print("Introdueix un nombre: ");
		num = Entrada.nextInt();
		gran = num;
		petit = num;
		Entrada.nextLine();
		
		while (num != 0) {
			
			if (num > gran) {
				
				gran = num;
			}else if (num < petit) {
				
				petit = num;
			}
			resultat = resultat + num;
			voltes++;
			
			System.out.print("Introdueix un nombre: ");
			num = Entrada.nextInt();
			Entrada.nextLine();			
		}
		
		resultat = resultat / voltes;
		Entrada.close();
		System.out.println("La mitjana aritmetica es: " + resultat);
		System.out.println("El nombre mes gran es: " + gran);
		System.out.println("El nombre mes petit es: " + petit);
	}
}
