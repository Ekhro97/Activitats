//72.Donada una taula de n elements enters, introduïts per l’usuari, fer un algoritme que ens indiqui
//quants d’aquests són negatius i quants no. El zero es considera neutre.

package E_arrays;
import java.util.Scanner;

public class Exercici_72 {
	private static int MIDA = 10;
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		int[] nombres = new int[MIDA];
		
		int index;
		int neg = 0;
		int pos = 0;
		int neutre = 0;
		
		for (index = 0; index < MIDA; index++) {
			
			System.out.print("Introdueix un nombre: ");
			nombres[index] = Entrada.nextInt();
		}
		
		for (index = 0; index < MIDA; index++) {
			
			if (nombres[index] < 0) {
				
				neg++;
			}else if (nombres[index] > 0) {
				
				pos++;
			}else {
				
				neutre++;
			}
			
		}
		System.out.println("Hi han " + pos + " nombres positius.");
		System.out.println("Hi han " + neg + " nombres negatius.");
		System.out.println("Hi han " + neutre + " nombres neutres.");
		Entrada.close();
	}
}
