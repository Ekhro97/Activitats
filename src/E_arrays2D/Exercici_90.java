//90.Donada una taula de dos dimensions de 10 x 10 de reals omplir la taula amb números i
//posteriorment buscar quin es el valor més gran i el més petit de cada fila, mostrant els 10
//valors per pantalla.

package E_arrays2D;

import java.util.Scanner;

public class Exercici_90 {
	private static int MIDA = 10;
	public static void main (String [] args) {
	
		Scanner Entrada = new Scanner(System.in);
		int taula[][] = new int[MIDA][MIDA];		
		
		int fil;
		int col;
		int gran = 0;
		int petit = 0;
		
		for (fil = 0; fil < MIDA; fil++) {
			for (col = 0; col < MIDA; col++) {
				
				System.out.print("Intorueix un nombre: ");
				taula[fil][col] = Entrada.nextInt();
			}
		}
		
		petit = taula[0][0];
		gran = taula[0][0];
		for (fil = 0; fil < MIDA; fil++) {
			for (col = 0; col < MIDA; col++) {
				
				if (taula[fil][col] < petit) {
					
					petit = taula[fil][col];
				}else if (taula[fil][col] > gran) {
					
					gran = taula[fil][col];
				}
			}
			
			System.out.println("El nombre en la fila mes gran es: " + gran);
			System.out.println("El nombre en la fila mes petit es: " + petit);
			System.out.println();

		}
		
		Entrada.close();
	}
}
