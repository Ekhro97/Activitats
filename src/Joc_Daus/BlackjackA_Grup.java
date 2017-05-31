//Queremos hacer una o mas partidas de blackjack en la que el programa siga un conjunto de reglas entre las cuales están:
//El jugador podra pedir numeros hasta plantarse o sobrepasar los 21. Si el jugador sobrepasa 21 automaticamente pierde la partida.
//Si al jugador le toca 1(as) se suman 11 puntos y las figuras 11(J), 12(Q), 13(K) tendran el valor de 10 puntos.
//La maquina pedira cartas y se plantara a partir de 17 puntos. Quien se acerque mas a 21 ganara.
//Si la maquina se pasa de 21 perdera.
//Guardaremos en una array todas las cartas disponibles para que así controlaremos que no puedan salir más de 4 cartas con el mismo numero.

package Joc_Daus;
import java.util.Scanner;

public class BlackjackA_Grup {
	private static int MIDA = 52;
	
	public static void main (String [] args) {
		
		Scanner Entrada = new Scanner(System.in);
		int[] Deck = new int[MIDA];
		
		//Omplir array i desordenarla
		int index;
		int index4;
		int indexR1;
		int indexR2;
		int ajuda;
		int OmplirCarta = 1;
		
		//Joc
		char Torna = 'Y';
		char Nova;
		int Partida = 1;
		int Carta;
		int indexCarta;
		boolean Perdut;
		
		int CartesJ = 0;
		int CartesM = 0;

		//Posem 4 cartes de cada tipus a la array
		for (index = 0; index <= MIDA; index = index + 4) {
			
			if (index <= 48) {
				for (index4 = index; index4 < index + 4; index4++) {
					
					Deck[index4] = OmplirCarta;
				}
			}
			
			OmplirCarta++;
		}
		
		//Intercambiem posicións aleatories
		indexR1 = (int) (Math.random() * MIDA);
		indexR2 = (int) (Math.random() * MIDA);
		for (index = 0; index < MIDA; index++) {
			
			ajuda = Deck[indexR1];
			Deck[indexR1] = Deck[indexR2];
			Deck[indexR2] = ajuda;

			indexR1 = (int) (Math.random() * MIDA);
			indexR2 = (int) (Math.random() * MIDA);
		    }
		
		while (Torna == 'Y' || Torna == 'y') {
			
			System.out.println("Benvingut al BlackJack");
			System.out.println();
			System.out.println("Partida " + Partida);
			System.out.println();
			
//			Cartas Jugador
			do {
					
				System.out.println("Nova carta");
				
				indexCarta = (int) (Math.random() * MIDA);
				Carta = Deck[indexCarta];
				Deck[indexCarta] = 0;
				
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
				
			}while (Nova == 'Y' || Nova == 'y' || Carta == 0);
			
//			Cartas Maquina
			while ((CartesM <= 17)  && (Perdut == false)) {
				
				indexCarta = (int) (Math.random() * MIDA);
				Carta = Deck[indexCarta];
				Deck[indexCarta] = 0;
				
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
				
				//Reset Deck
				OmplirCarta = 1;
				for (index = 0; index < MIDA; index++) {
					
					Deck[index] = 0;
				}
				
				//Posem 4 cartes de cada tipus a la array
				for (index = 0; index <= MIDA; index = index + 4) {
					
					if (index <= 48) {
						for (index4 = index; index4 < index + 4; index4++) {
							
							Deck[index4] = OmplirCarta;
						}
					}
					
					OmplirCarta++;
				}
				
				//Intercambiem posicións aleatories
				indexR1 = (int) (Math.random() * MIDA);
				indexR2 = (int) (Math.random() * MIDA);
				for (index = 0; index < MIDA; index++) {
					
					ajuda = Deck[indexR1];
					Deck[indexR1] = Deck[indexR2];
					Deck[indexR2] = ajuda;

					indexR1 = (int) (Math.random() * MIDA);
					indexR2 = (int) (Math.random() * MIDA);
				    }
			}
		}
		Entrada.close();
		
		
//		//Debug
//		//Mostrem array de cartes
		
//		for (index = 0; index < MIDA; index++) {
//			
//			System.out.print(Deck[index] + " ");
//		}
		
	}
}