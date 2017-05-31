package E_Bucles;
import java.util.Scanner;

public class Exercici_46 {
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int num;
		int nombres = -1;
		int i;
		
		System.out.print("Introdueix la quntitat de nombres a imprimir: ");
		num = Entrada.nextInt();
		Entrada.nextLine();
		Entrada.close();
		
		for (i=1;i<=num;i++) {
			
			nombres = nombres + 2;
			System.out.println(nombres);
		}
	}
}
