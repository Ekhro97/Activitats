//Fer un joc en el qual l’ordinador s’inventarà dos número (entre el 1 i el 100) i l’usuari haurà de dir quin és el
//resultat de la seva multiplicació. Si l’usuari l’encerta guanya i se li mostrà un missatge de guanyador. Si l’usuari
//no indica correctament el resultat de la multiplicació anirà introduint valors fins que l’encerti. Al finalitzar se li
//preguntarà si vol fer un altre partida, en cas afirmatiu el procés torna a començar.

package E_Bucles;
import java.util.Scanner;

public class Exercici_70 {
	public static void main (String [] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		char partida = 'Y';
		
		while (partida == 'Y' || partida == 'y') {
			
			int num = (int) ((Math.random() * 100 + 1) * (Math.random() * 100 + 1));
			int player;
			
			System.out.println(num);
			do {
				
				System.out.print("Introdueix un nombre del 1 al 10000: ");
				player = Entrada.nextInt();
				Entrada.nextLine();
				
				if (player < 0 || player > 10000) {
					
					System.out.println("Introdueix un nombre correcte!");
				}
				
			} while (player != num);
			
			System.out.println("Molt be el nombre es " + num);
			System.out.println();
			System.out.println("Vols fer un altre partida? (Y per si, altre caracter no)"); 
			partida = Entrada.next().charAt(0);
			
		}
		System.out.println("Partida acabada!"); 
		Entrada.close();
	}
}
