/*Donada una taula de N posicions anar demanant 
 a l�usuari un conjunt de n�meros enters,
 finalitzant la seq��ncia amb 0. Cada vegada que s�introdueixi 
 un n�mero el programa haur� de
 dir si aquest n�mero ja l�havia introdu�t i quantes vegades 
 l�ha introdu�t en total.*/

package E_arrays;

import java.util.Scanner;
public class 	Exercici_83 {
	private static final int LLARGADA = 10;	
	public static void main (String[] args ) {
		
		//Declaraci� de variables	
		
		int index=0;
		int valor=1;
		int duplicat=0;
		int[] taula = new int [LLARGADA];
		
		Scanner lector = new Scanner (System.in);
		
	
		int proximLliure=0;
		
		System.out.print("introdueix un numero");
		valor=lector.nextInt();
		
		while ((valor!=0)&&(proximLliure<LLARGADA)){ 
			duplicat=0;
			
			for(index=0;index<proximLliure;index++){
				
				if(taula[index]==valor){
					duplicat++;
				}
			}
			
			if (duplicat>0){
				System.out.println("aquest numero est� duplicat "+ duplicat+ " vegades.");
			}
			else{
				System.out.println("aquest numero es nou!");
			}
			
			taula[proximLliure]=valor;
			proximLliure++;
			
			System.out.print("introdueix un numero");
			valor=lector.nextInt();
					
		}	
		
				
		System.out.println("fi de la serie");
		
				
				
				
			
		lector.close();
	}
}	