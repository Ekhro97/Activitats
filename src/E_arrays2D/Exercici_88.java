//88.Donada una taula de dos dimensions de 10 x 10 de reals omplir la taula amb números i
//posteriorment calcular la suma dels seus elements.

package E_arrays2D;

import java.util.Scanner;

public class Exercici_88 {
	private static int MIDA = 10;
	public static void main (String [] args) {
	
		Scanner Entrada = new Scanner(System.in);
		int taula[][] = new int[MIDA][MIDA];		
		
		int fil;
		int col;
		int suma = 0;
		
		for (fil = 0; fil < MIDA; fil++) {
			for (col = 0; col < MIDA; col++) {
				
				System.out.print("Intorueix un nombre: ");
				taula[fil][col] = Entrada.nextInt();
			}
		}
		
		for (fil = 0; fil < MIDA; fil++) {
			for (col = 0; col < MIDA; col++) {
			
				suma = suma + taula[fil][col];
			}
		}
		
		System.out.println("La suma dels nombres es: " + suma);
		Entrada.close();
	}
}
