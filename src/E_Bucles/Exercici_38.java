//Visualitzar el següent sèrie tants elements com l’usuari indiqui:
//1 = 1
//2 = 4
//3 = 9
//4 = 16
//. = .
//n = n^2

package E_Bucles;
import java.util.Scanner;

public class Exercici_38 {
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int quant;
		int resultat;
		
		System.out.print("Quina quantitat de nombres vols imprimir: ");
		quant = Entrada.nextInt();
		Entrada.nextLine();
		Entrada.close();
		
		for(int i=1;i<=quant;i++) {
			
			if (i==1) {
				
				resultat = 1;
			}else {
				
				resultat = i * i;
			}
			
			System.out.println(i + " --> "  + resultat);
		}
	}
}
