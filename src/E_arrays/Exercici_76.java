//76.Realitzar un algoritme que donada una taula de N elements, canviï cada element parell per
//l’element senar anterior. Si la taula té un nombre imparell d’elements l’últim no es canvia amb
//ningú,finalment mostrar per pantalla la taula modificada.

package E_arrays;
import java.util.Scanner;

public class Exercici_76 {
	public static int MIDA = 5;
	public static void main (String [] args) {
		
		int index;
		int ajuda;
		
		Scanner Entrada = new Scanner(System.in);
		int nombres [] = new int[MIDA];
		
		for (index = 0; index < MIDA; index++) {
			
			System.out.print("Introdueix un nombre: ");
			nombres[index] = Entrada.nextInt();
		}
		
		 for(index = 0; index < MIDA; index++) {
			 
			 if (index % 2 != 0) {
				 ajuda = nombres[index];
				 nombres[index] = nombres[index - 1];
				 nombres[index - 1 ] = ajuda;
			 }
		}
		 
		 for(index = 0; index < MIDA; index++) {
			 
			 System.out.println(nombres[index]);
		 }
		 
		 Entrada.close();
	}
}
