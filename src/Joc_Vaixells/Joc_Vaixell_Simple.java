//103. Joc dels vaixells simple
//Caldrà desenvolupar un joc del vaixells amb les següents premisses.
//• Es juga en un taulell de MIDAxMIDA
//• Jugaran dos jugadors
//• Cada jugador col·locarà en el taulell els seus MIDA vaixells, vaixells d’una sola posició,
//vigilant que dos vaixells no es poden tocar.
//• Alternativament cada jugador anirà disparant i el programa haurà de dir si es aigua o
//tocat i enfonsat. Abans de disparar caldrà mostrar en pantalla l’estat del taulell mostrant
//de manera diferent les caselles on encara no s’ha disparat, les que s’ha disparat i s’ha
//fallat i les que s’ha disparat i s’ha enfonsat un vaixell.
//• El joc finalitza quan un jugador enfosa tots els vaixells de l’altre jugador.

package Joc_Vaixells;
import Entrada.cLector;

public class Joc_Vaixell_Simple {
	public final int MIDA = 7;
	public static void main (String[] args) {
		Joc_Vaixell_Simple programa = new Joc_Vaixell_Simple();
		programa.inici();
	}

	private void inici() {
		
		int[][] Jugador1 = new int[MIDA][MIDA];
		int[][] Jugador2 = new int[MIDA][MIDA];
		
		IniciarTaulell(Jugador1);
		IniciarTaulell(Jugador2);
		
		System.out.println("Jugador 1");	// 0 = aigua
		IniciarVaixells(Jugador1);			// 1 = vaixell
		System.out.println("Jugador 2");	// 2 = Miss
		IniciarVaixells(Jugador2);			// -1 = Enfonsat
			
		MostrarVaixells(Jugador1);
		System.out.println("---------------------------------------------");
		MostrarVaixells(Jugador2);

		while (!VaixellsVius(Jugador1, Jugador2)){
			
			System.out.println("Jugador 1, Dispara");
			System.out.println("------------------");
			DispararA(Jugador2);
			MostrarVaixells(Jugador2);
			
			System.out.println("Jugador 2, Dispara");
			System.out.println("------------------");
			DispararA(Jugador1);
			MostrarVaixells(Jugador1);

		}
		
		System.out.println("Resultat Final");
		MostrarVaixells(Jugador1);
		System.out.println("---------------------------------------------");
		MostrarVaixells(Jugador2);
	}

	private void DispararA(int[][] taulell) {
		int fila;
		int columna;
		
		cLector Entrada = new cLector();
		
		fila = Entrada.llegirEnter("Fila a disparar:");
		columna = Entrada.llegirEnter("Columna a disparar");
		
		if (fila > 0 && columna < 6) {
			if (taulell[fila][columna] == 0) {
				taulell[fila][columna] = 2;
			}else if(taulell[fila][columna] == 1){
				taulell[fila][columna] = -1;
			}
			
		}	
	}

	private boolean VaixellsVius(int[][] jugador1, int[][] jugador2) {
		int fila;
		int columna;
		int contJugador1 = 0;
		int contJugador2 = 0;
		
		boolean Acabat = false;
		
		//Jugador1
		for(fila = 1; fila < 6; fila++) {
			for(columna = 1; columna < 6; columna++) {
				if(jugador1[fila][columna] == 1) {
					contJugador1++;
				}
			}
		}
		
		//Jugador2
		for(fila = 1; fila < 6; fila++) {
			for(columna = 1; columna < 6; columna++) {
				if(jugador2[fila][columna] == 1) {
					contJugador2++;
				}
			}
		}
		if (contJugador1 == 0) {
			Acabat = true;
		}else if (contJugador2 == 0) {
			Acabat= true;
		}
		
		return Acabat;
	}

	private void MostrarVaixells(int[][] taulell) {
		int fila;
		int columna;
		
		System.out.println("\t1 \t2 \t3 \t4 \t5");
        System.out.println();
        
        for(fila = 1 ; fila < 6 ; fila++ ){
            System.out.print((fila)+"");
            for(columna = 1 ; columna < 6 ; columna++ ) {
                if(taulell[fila][columna] == 0){
                    System.out.print("\t"+"~");
                }else if(taulell[fila][columna] == 1) {
                    System.out.print("\t"+"*");
                }else if(taulell[fila][columna] == -1) {
                    System.out.print("\t"+"X");
                }else if (taulell[fila][columna] == 2) {   
                    System.out.print("\t"+"O");
                }
            }
            System.out.println();
        }

	}

	private void IniciarVaixells(int[][] taulell) {
		int filaJ;
		int columnaJ;
		
		int MaxVaixells = 0;
		cLector Entrada = new cLector();
		
		while (MaxVaixells < 5) {
			System.out.println();
			System.out.println("En quina posició vols colocar el vaixell");
			System.out.println("Vaixell numero " + (MaxVaixells+1));
			System.out.println("----------------------------------------");
			filaJ = Entrada.llegirEnter("Intordueix la fila: ");
			columnaJ = Entrada.llegirEnter("Intordueix la columna: ");
			
			if ((filaJ > 0 && filaJ < 6) && (columnaJ > 0 && columnaJ < 6)) {
				if (taulell[filaJ][columnaJ] == 0) {
					if(noVaixellsTocant(taulell, filaJ, columnaJ)) {
						taulell[filaJ][columnaJ] = 1;
						MaxVaixells++;
					}else {		
						System.out.println("No pots introduir un Vaixell al canto d'un altre");
					}
					
				}else {
					System.out.println("Ja tens un vaixell aqui!");
				}
			}
			else {
				System.out.println("Introdueix unes coordenades correctes");
			}
		}
	}

	private boolean noVaixellsTocant(int[][] taulell, int filaJ, int columnaJ) {
		boolean toca = true;
		
		if (taulell[filaJ-1][columnaJ] == 1) {
			toca = false;
		}else if (taulell[filaJ+1][columnaJ] == 1) {
			toca = false;	
		}else if (taulell[filaJ][columnaJ+1] == 1) {
			toca = false;		
		}else if (taulell[filaJ][columnaJ-1] == 1) {
			toca = false;	
		}
		
		return toca;
	}

	private void IniciarTaulell(int[][] taulell) {
		int fila;
		int columna;
		
		for(fila = 1; fila < 6; fila++) {
			for(columna = 0; columna < 6; columna++) {
				
				taulell[fila][columna] = 0;
			}
		}
	}
}
