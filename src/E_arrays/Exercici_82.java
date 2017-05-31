//82.Igual que el 81 però en lloc de dir quants caldrà mostrar tots els números dient si són més grans
//o més petits que la mitja

package E_arrays;

import java.util.Scanner;

public class Exercici_82 {
	private static int LLARGADA = 100;
	public static void main (String [] args) {
		
		int [] taula = new int[LLARGADA];
        Scanner Entrada = new Scanner(System.in);
        
        int index;
        int valor;
        int mitja = 0;
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
		System.out.println("La mitja es: " + mitja);
		
		for(index=0; index < proximaLliure; index++){
			
			if (taula[index] >= mitja) {
				
				System.out.println(taula[index] + " es mes gran o igual que la mitja");
			}else if (taula[index] < mitja) {
				
				System.out.println(taula[index] + " es mes petit que la mitja");			}
		}
		
		Entrada.close();
	}
}