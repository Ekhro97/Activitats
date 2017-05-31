//77.Tenim N temperatures guardades en una taula, Calcular la mitja i obtenir el número de
//temperatures més grans o iguals a la mitja

package E_arrays;
import java.util.Scanner;

public class Exercici_77 {
	private static int MIDA = 5;
	public static void main (String [] args) {
		
		Scanner Entrada = new Scanner(System.in);
		int nombres [] = new int[MIDA];
		
		int index;
		double mitja = 0;
		int grans = 0;
		int iguals = 0;
		
		for (index = 0; index < MIDA; index++) {
			
			System.out.print("Introdueix un nombre: ");
			nombres[index] = Entrada.nextInt();
		}
		
		// Mitja
		for (index = 0; index < MIDA; index++) {
			
			mitja = mitja + nombres[index];
		}
		
		mitja = mitja / MIDA;
		
		//Mes gran que mitja
		
		for(index = 0; index < MIDA; index++) {
			  
			if (nombres[index] > mitja) {
				
				grans++;
			}else if (nombres[index] == mitja) {
				
				iguals++;
			}
		 }
		
		System.out.println("La Mitja es: " + mitja);
		System.out.println("Hi han  " + grans + " nombres mes grans que " + mitja);
		System.out.println("Hi han  " + iguals + " nombres iguals que " + mitja);
		Entrada.close();

	}
}
