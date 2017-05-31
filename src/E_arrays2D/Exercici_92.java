//92.Fer un algoritme que sumi dues matrius i mostri el resultat per pantalla.

package E_arrays2D;

import java.util.Scanner;

public class Exercici_92 {
	private static int MIDA = 2;
	public static void main (String [] main) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int taula1[][] = new int[MIDA][MIDA];
		int taula2[][] = new int[MIDA][MIDA];
		int suma[][] = new int[MIDA][MIDA];
		
		int fil;
		int col;
		
		System.out.println("Primera taula");
		System.out.println();
		for (fil = 0; fil < MIDA; fil++) {
			for (col = 0; col < MIDA; col++) {
				
				System.out.print("Intorueix un nombre: ");
				taula1[fil][col] = Entrada.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Segona taula");
		System.out.println();
		for (fil = 0; fil < MIDA; fil++) {
			for (col = 0; col < MIDA; col++) {
				
				System.out.print("Intorueix un nombre: ");
				taula2[fil][col] = Entrada.nextInt();
			}
		}
		
		for (fil = 0; fil < MIDA; fil++) {
			for (col = 0; col < MIDA; col++) {
				
				suma[fil][col] = taula1[fil][col] + taula2[fil][col];
			}
		}
		
		for (fil = 0; fil < MIDA; fil++) {
			for (col = 0; col < MIDA; col++) {
				
				System.out.print(suma[fil][col] + " ");
			}
		}
		
		Entrada.close();
	}
}
