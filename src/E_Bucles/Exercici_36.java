package E_Bucles;
import java.util.Scanner;

public class Exercici_36 {
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int quant;
		int resultat;
		
		System.out.print("Quina quantitat de nombres vols imprimir: ");
		quant = Entrada.nextInt();
		Entrada.nextLine();
		Entrada.close();
		
		for(int i=1;i<=quant;i++) {
			
			resultat = i * 2;
			System.out.println(resultat);
		}
	}
}
