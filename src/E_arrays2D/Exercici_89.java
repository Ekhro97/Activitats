//89.Donada una taula de dos dimensions de 10 x 10 de reals omplir la taula amb números i
//posteriorment calcular la suma de cada fila i la suma de cada columna mostrant els 20
//resultats per pantalla.

package E_arrays2D;

import java.util.Scanner;

public class Exercici_89 {
	private static int MIDA = 10;
	public static void main (String [] args) {
	
		Scanner Entrada = new Scanner(System.in);
		int taula[][] = new int[MIDA][MIDA];		
		
		int fil;
		int col;
		int sumaF = 0;
		int sumaC = 0;
		
		for (fil = 0; fil < MIDA; fil++) {
			for (col = 0; col < MIDA; col++) {
				
				System.out.print("Intorueix un nombre: ");
				taula[fil][col] = Entrada.nextInt();
			}
		}
		
		for (fil = 0; fil < MIDA; fil++) {
			for (col = 0; col < MIDA; col++) {
			
				sumaF = sumaF + taula[fil][col];
			}
			System.out.println("La suma de les files es: " + sumaF);
			sumaF = 0;
		}
		
		for (col = 0; col < MIDA; col++) {
			for (fil = 0; fil < MIDA; fil++) {
			
				sumaC = sumaC + taula[fil][col];
			}
			System.out.println("La suma de les columnes es: " + sumaC);
			sumaC = 0;
		}
		
		Entrada.close();
	}
}
