//73.Escriure un algoritme que permeti calcular el quadrat dels 100 primer números enters i a
//continuació els vagi guardant en una taula.

package E_arrays;

public class Exercici_73 {
	private static int MIDA = 100;
	public static void main (String[] args) {
		
		int index;
		int[] nombres = new int[MIDA];
		
		for (index = 0; index < MIDA; index++) {
			
			nombres[index] = index;
		}

		for (index = 0; index < MIDA; index++) {
			
			nombres[index] = (index+1) * (index+1);
			System.out.println(nombres[index]);
		}
	}
}
