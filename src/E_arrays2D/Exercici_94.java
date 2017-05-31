//94.Introduir números en una matriu de 10x10 de enters. Després l’usuari anirà indicant fila i
//columna i el que s’haurà de fer es eliminar el contingut de la casella indicada però
//arrossegant cap a l’esquerra totes les caselles següents. Finalitzarem quan l’usuari indiqui la
//coordenada 0,0 i mostrarem el contingut de la matriu al finalitzar l’algoritme.

package E_arrays2D;

import java.util.Scanner;

public class Exercici_94 {
	private static final int LLARGADA = 3;
		public static void main(String[] args){
			
			int indexHoritzontal= 0;
			int indexVertical;
			int valorUsuari;
			int lol;
			int taula[][] = new int[LLARGADA][LLARGADA];
			Scanner sc = new Scanner(System.in);
			
			for(indexVertical = 0;indexVertical<LLARGADA;indexVertical++){
				
				for(indexHoritzontal = 0;indexHoritzontal<LLARGADA;indexHoritzontal++){
				
					System.out.print("Introdueix un nombre: ");
					valorUsuari = sc.nextInt();
					sc.nextLine();
					taula [indexVertical][indexHoritzontal] = valorUsuari;
				}
			}
			
			while(indexHoritzontal != 0 || indexVertical != 0 ){
				System.out.print("Introdueix una fila per esborrar: ");
				indexHoritzontal = sc.nextInt();
				sc.nextLine();
			
				while(indexHoritzontal > LLARGADA-1){
					System.out.print("Introdueix un nombre valid per la fila: ");
					indexHoritzontal = sc.nextInt();
					sc.nextLine();
				}
				
				System.out.print("Introdueix una columna per esborrar: ");
				indexVertical = sc.nextInt();
				sc.nextLine();
			
				while(indexVertical > LLARGADA-1){
					System.out.print("Introdueix un nombre valid per la columna: ");
					indexVertical = sc.nextInt();
					sc.nextLine();
				}
				
				if(indexHoritzontal != 0 || indexVertical != 0) {
					
				//Tractar primera linia	
				lol = indexHoritzontal;
				for(indexHoritzontal = lol;indexHoritzontal<LLARGADA-1;indexHoritzontal++){
					taula[indexVertical][indexHoritzontal] = taula[indexVertical][indexHoritzontal+1];
				}
				
				//Tractar taula restant
				for(indexVertical = indexVertical+1;indexVertical<LLARGADA;indexVertical++){
					
					for(indexHoritzontal=0;indexHoritzontal<LLARGADA-1;indexHoritzontal++){
						
						if(indexHoritzontal == 0){
							taula[indexVertical-1][LLARGADA - 1] = taula[indexVertical][indexHoritzontal];		
						}
						
						taula[indexVertical][indexHoritzontal] = taula[indexVertical][indexHoritzontal+1];		
					}
					
					taula[LLARGADA-1][LLARGADA-1] = 0;
				}
				
				//Imprimir taula
				for(indexVertical = 0;indexVertical<LLARGADA;indexVertical++){
					
					for(indexHoritzontal = 0;indexHoritzontal<LLARGADA;indexHoritzontal++){
									
						System.out.print(taula[indexVertical][indexHoritzontal] + " ,");
					}
					
					System.out.println(" ");
				}
				
			}
		}		
			
			sc.close();			
	}
}
