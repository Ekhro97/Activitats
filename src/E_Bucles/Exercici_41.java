package E_Bucles;
import java.util.Scanner;

public class Exercici_41 {
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int num = 1;
		int voltes = -1;
		double resultat = 0;
		
		while (num != 0) {
			
			System.out.print("Introdueix un nombre per a fer la mitjana aritmetica: ");
			num = Entrada.nextInt();
			Entrada.nextLine();
			
			resultat = resultat + num;
			voltes++;
		}
		resultat = resultat / voltes;
		Entrada.close();
		System.out.println("La mitjana aritmetica es: " + resultat);
	}
}
