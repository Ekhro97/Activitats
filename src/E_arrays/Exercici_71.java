// 71.Donada una taula de n elements de enters, introduïts per l’usuari, fer un algoritme que ens digui
// la suma total dels elements de la taula
package E_arrays;
import java.util.Scanner;

public class Exercici_71 {
	private static int MIDA = 5;
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int resultat = 0;
		int index = 0;
		int[] suma = new int[MIDA];
		
		for(index = 0; index < MIDA; index++) {
			  
			System.out.print("Introdueix un nombre: ");
			suma[index]= Entrada.nextInt();
			Entrada.nextLine();
		}
		
		for (index=0; index < MIDA; index++) {
			
			resultat = resultat + suma[index];
		}
		System.out.println(resultat);
		Entrada.close();
	}
}
