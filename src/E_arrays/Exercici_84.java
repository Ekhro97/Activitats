/*Introduir valors reals en una taula fins que entrin el valor 0. 
Posteriorment s'hauran de generar 2
taules en una posarem el valors positius i en l'altre els negatius. 
Posteriorment haurem de
mostrar cada una de les taules en ordre invers.*/

package E_arrays;

import java.util.Scanner;
public class Exercici_84 {
	private static final int LLARGADA = 100;
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);	
		
		int[]taula = new int [LLARGADA];
		int[]taulaPositiu = new int [LLARGADA];
		int[]taulaNegatiu = new int [LLARGADA];
		
		int proximaLliure=0;
		int proximaLliurePositiva=0;
		int proximaLliureNegativa=0;
		int i;
		int valor=1;
			
		System.out.println("Introdueix el seguent numero");
		valor = keyboard.nextInt();
		keyboard.nextLine();
		
		while((valor!=0) && (proximaLliure<LLARGADA)){
			taula[proximaLliure]=valor;
			proximaLliure++;

			System.out.println("Introdueix el seguent numero");
			valor = keyboard.nextInt();
			keyboard.nextLine();
		}
	
		for(i=0;i<proximaLliure;i++){
			if(taula[i]>0){
				taulaPositiu[proximaLliurePositiva]=taula[i];
				proximaLliurePositiva++;
			}
		}
		
		for(i=0;i<proximaLliure;i++){
			if(taula[i]<0){
				taulaNegatiu[proximaLliureNegativa]=taula[i];
				proximaLliureNegativa++;
			}
		}
		
		System.out.println("Taula dels positius");
		
		for(i=proximaLliurePositiva-1;i>=0;i--){
			System.out.println(taulaPositiu[i]);
		}
		
		System.out.println("Taula dels negatius");
		
		for(i=proximaLliureNegativa-1;i>=0;i--){
			System.out.println(taulaNegatiu[i]);
		}
		
		
		keyboard.close();
	
	}
}