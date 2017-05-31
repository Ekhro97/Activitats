//81.Introduir un conjunt de números pel teclat i guardar-los en una taula finalitzant la seqüencia
//amb el 0. Després caldrà calcular la mitja i dir quants números son més grans que la mitja i
//quants son més petits.

package E_arrays;

import java.util.Scanner;

public class Exercici_81 {
	private static int LLARGADA = 100;
	public static void main (String [] args) {
		
		int [] taula = new int[LLARGADA];
        Scanner Entrada = new Scanner(System.in);
        
        int index;
        int valor;
        int mitja = 0;
        int grans = 0;
        int petits = 0;
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
			
			mitja = mitja + taula[index];
		}
		
		mitja = mitja / proximaLliure;
		
		for(index=0; index < proximaLliure; index++){
			
			if (taula[index] >= mitja) {
				
				grans++;
			}else if (taula[index] < mitja) {
				
				petits++;
			}
		}
		
		System.out.println("La mitja es: " + mitja);
		System.out.println("Hi han " + grans + " nombres mes grans que " + mitja);
		System.out.println("Hi han " + petits + " nombres mes grans que " + mitja);
		
		Entrada.close();
	}
}