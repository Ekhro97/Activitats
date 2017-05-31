//74.Realitzar un algoritme que ens permeti entra n nombres enters en una taula i a continuaci� que
//inverteixi la taula (el primer element passa a l��ltim introdu�t, el segon al pen�ltim,...). Una
//vegada invertida la taula mostrar-la per pantalla.

package E_arrays;
import java.util.Scanner;

public class Exercici_74 {
	private static int MIDA = 5;
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		int[] nombres = new int[MIDA];
		
		int index;
		int ajuda;
		
		//Omplir
		for (index = 0; index < MIDA; index++) {
			
			System.out.print("Introdueix un nombre: ");
			nombres[index] = Entrada.nextInt();
		}
		
		//Invertir
		for (index = 0; index < MIDA / 2; index++) {
	        ajuda = nombres[index];
	        nombres[index] = nombres[MIDA - 1 - index];
	        nombres[MIDA - 1 - index] = ajuda;
	    }
		
		//Mostra
		for (index = 0; index < MIDA; index++) {
			
	        System.out.println(nombres[index]);
		}
		Entrada.close();
	}
}