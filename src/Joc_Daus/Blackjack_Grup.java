//Queremos hacer una o mas partidas de blackjack en la que el programa siga un conjunto de reglas entre las cuales están:
//El jugador podra pedir numeros hasta plantarse o sobrepasar los 21. Si el jugador sobrepasa 21 automaticamente pierde la partida.
//Si al jugador le toca 1(as) se suman 11 puntos y las figuras 11(J), 12(Q), 13(K) tendran el valor de 10 puntos.
//La maquina pedira cartas y se plantara a partir de 17 puntos. Quien se acerque mas a 21 ganara.
//Si la maquina se pasa de 21 perdera.

package Joc_Daus;
import java.util.Scanner;

public class Blackjack_Grup {
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		char Torna = 'Y';
		char Nova;
		int Partida = 1;
		int Carta;
		boolean Perdut;
		
		int CartesJ = 0;
		int CartesM = 0;
		
		while (Torna == 'Y' || Torna == 'y') {
			
			System.out.println("Benvingut al BlackJack");
			System.out.println();
			System.out.println("Partida " + Partida);
			System.out.println();
			
//			Cartas Jugador
			do {
					
				System.out.println("Nova carta");
				Carta = (int) (Math.random() * 13 + 1);
				
				if (Carta == 1) {
					
					Carta = 11;
				}else if (Carta == 11 || Carta == 12 || Carta == 13) {
					
					Carta = 10;
				}
				
				CartesJ = CartesJ + Carta;
				System.out.println("Jugador tens " + CartesJ);
				if (CartesJ > 21) {
					
					System.out.println("Has perdut! la banca guanya");
					Nova = 'N';
					Perdut = true;
				}else {
				System.out.print("Vols un altre carta? (Y per a si, altre caracter per a plantarse)");
				System.out.println();
				Nova = Entrada.nextLine().charAt(0);
				Perdut = false;
				}
				
			}while (Nova == 'Y' || Nova == 'y');
			
//			Cartas Maquina
			while ((CartesM <= 17)  && (Perdut == false)) {
				
				Carta = (int) (Math.random() * 13 + 1);
				
				if (Carta == 1) {
					
					Carta = 11;
				}else if (Carta == 11 || Carta == 12 || Carta == 13) {
					
					Carta = 10;
				}
				
				CartesM = CartesM + Carta;
				if (CartesM > 21) {
					
					System.out.println("Has guanyat!, la maquina s'ha pasat de 21!");
				}
			}
			
//			Final
			if (CartesJ <= 21 && CartesM <= 21) {
				
				if (CartesJ > CartesM) {
					
					System.out.println("Cartas Jugador: " + CartesJ + ", Cartas Maquina: " + CartesM);
					System.out.println("Has guanyat!");
				}else if (CartesJ == CartesM) {
					
					System.out.println("Cartas Jugador: " + CartesJ + ", Cartas Maquina: " + CartesM);
					System.out.println("Heu empatat!");
				}else {
					
					System.out.println("Cartas Jugador: " + CartesJ + ", Cartas Maquina: " + CartesM);
					System.out.println("Has Perdut!");
				}
			}
//			Reset
			System.out.println("Vols tornar a jugar? (Y per a si, altre caracter per a plantarse)");
			System.out.println();
			Torna = Entrada.nextLine().charAt(0);
			if (Torna == 'Y' || Torna == 'y') {
					
				CartesJ = 0;
				CartesM = 0;
				Partida++;
			}
		}
		Entrada.close();
	}
}
