package E_Bucles;
import java.util.Scanner;

public class Exercici_47 {
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int num;
		int resultat = 1;
		
		System.out.print("Introdueix el nombre a fer el factorial: ");
		
		for (num = Entrada.nextInt();num!=0;num--) {
			Entrada.nextLine();
			
			resultat = resultat * num;
		}
		Entrada.close();
		
		System.out.print(resultat);

	}
}
