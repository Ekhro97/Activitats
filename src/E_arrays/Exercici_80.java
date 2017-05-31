//80.Un nombre perfecte �s aquell que �s igual a la suma dels seus divisors excloent ell mateix.
//Realitzar un algoritme que permeti llegir una seq��ncia de nombres enters positius finalitzant
//amb la seq��ncia amb el 0. Despr�s dir de cada un d�aquests quins s�n perfectes i dels perfectes
//quin �s el m�s gran.

package E_arrays;

import java.util.Scanner;

public class Exercici_80 {
	private static final int LLARGADA = 100;
	public static void main (String [] args) {
		
        int [] taula = new int[LLARGADA];
        Scanner Entrada = new Scanner(System.in);
        
		int index;
		int indexDiv;
		int suma = 0;
		int gran = 0;
	 	int valor;
	 	int proximaLliure = 0;
        
		System.out.print("Introdueix un nombre, acaba la secuencia amb un 0: ");
        valor = Entrada.nextInt();
        
		while ((valor != 0) && (proximaLliure < LLARGADA)){
			
			  taula[proximaLliure]=valor;
			  proximaLliure++;
			  System.out.print("Introdueix un nombre, acaba la secuencia amb un 0: ");
			  valor = Entrada.nextInt();
		}
		
		for(index=0; index < proximaLliure; index++){
			
			suma = 0;
			for (indexDiv = 1; indexDiv < taula[index]; indexDiv++) {
				
				if ((taula[index] % indexDiv) == 0) {
					
					suma = suma + indexDiv;
					
					if (suma > gran) {
						
						gran = suma;
					}
					if (suma == taula[index]) {
						
						System.out.println("El " + taula[index] + " es perfecte");
					}
				}
			}
		}
		if (gran == 0) {
			
			System.out.println("No hi ha ningun nombre perfecte");
		}else {
			
			System.out.println("El nombre perfecte mes gran es " + gran);
		}
		Entrada.close();
	}
}
