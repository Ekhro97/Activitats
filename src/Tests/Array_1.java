package Tests;
import java.util.Scanner;

public class Array_1 {
	private static int MIDA = 10;
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		int[] ordenada = new int[MIDA];
		
		int index1;
		int index2;
		int ajuda;
		
		for (index1 = 0; index1 < MIDA; index1++) {

			System.out.print("Introdueix un nombre: ");
			ordenada[index1] = Entrada.nextInt();
		}

		for (index1 = 0; index1 < MIDA; index1++) {
	        for (index2 = index1 + 1; index2 < MIDA; index2++) {
	        	
	            ajuda = 0;
	            if (ordenada[index1] > ordenada[index2]) {
	                ajuda = ordenada[index1];
	                ordenada[index1] = ordenada[index2];
	                ordenada[index2] = ajuda;
	            }
	        }
	    }
		

		for (index1 = 0; index1 < MIDA; index1++) {
			
			System.out.print(ordenada[index1] + " ");
		}
		
		Entrada.close();
	}
}
