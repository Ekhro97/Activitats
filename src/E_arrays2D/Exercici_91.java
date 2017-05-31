//91.Fer un algoritme per transposar una matriu de 10x10.

package E_arrays2D;

import java.util.Scanner;

public class Exercici_91 {
	private static int MIDA = 10;
	public static void main (String [] args) {
	
		Scanner Entrada = new Scanner(System.in);
		int taula[][] = new int[MIDA][MIDA];		
		
		int fil;
		int col;
		int ajuda;
		
		for (fil = 0; fil < MIDA; fil++) {
			for (col = 0; col < MIDA; col++) {
				
				System.out.print("Intorueix un nombre: ");
				taula[fil][col] = Entrada.nextInt();
			}
		}
		
		for (fil = 0; fil < MIDA; fil++) {
			for (col = 0; col <= fil; col++) {
				
				ajuda = taula[fil][col];
				taula[fil][col] = taula[col][fil];
				taula[col][fil] = ajuda;
				
			}
		}
		
		for (fil = 0; fil < MIDA; fil++) {
			for (col = 0; col < MIDA; col++) {
				
				System.out.print(taula[fil][col] + " ");
			}
		}
		
		Entrada.close();
	}
}