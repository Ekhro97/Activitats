//104. Joc del Simón dice.
//La dinàmica del joc és la següent:
//1. L’ordinador estriarà aleatòriament un color entre els 4 colors VERMELL – BLAU – GROCVERD
//2. Aquest color es posarà a la cua de colors inventats per l’ordinador.
//3. L’ordinador mostrarà en pantalla tota la cua de colors durant INTERVAL segons.
//4. Es neteja la pantalla.
//5. L’usuari ha de dir tots els colors de la cua en el mateix ordre.
//6. En el moment que s’equivoqui amb un color el joc acava mostrant la puntuació.
//7. Si els encerta tots s’incrementa un punt a la puntuació i es torna al punt 1.
//
//Al començar una partida es demanarà en quin nivell es vol jugar.
//• Nivell bàsic: INTERVAL a 5 segons
//• Nivell intermig: INTERVAL a 3 segons
//• Nivell pro: INTERVAL a 1 segon

package Joc_Simon;
import Entrada.cLector;
public class Joc_Simon {
	public final int MIDA = 3;
	public static void main(String[] args) throws InterruptedException {
		
		Joc_Simon programa = new Joc_Simon();
		programa.inici();
	}

	private void inici() throws InterruptedException {
		
		boolean encerta = true;
		int interval;
		int seguentColor = 0;
		int[] Colors = new int[MIDA];
		int[] Jugador = new int[MIDA];
		
		interval = dificultat();
		
		while (encerta && seguentColor < MIDA) {
			
			seguentColor = colorAleatori(Colors, seguentColor);		// 1 = Vermell
			mostraColors(Colors, seguentColor);						// 2 = Blau
			Thread.sleep(interval);									// 3 = Groc
			amagaColors();											// 4 = Verd
			colorsJugador(Jugador, seguentColor);									
			encerta = comprovaColors(Colors, Jugador, seguentColor);

		}
		
	}

	private void amagaColors() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}

	private boolean comprovaColors(int[] colors, int[] jugador, int seguentColor) {
		boolean encerta;
		int index;
		int correctes = 0;
		
		for (index = 0; index < seguentColor; index++) {
			if (colors[index] == jugador[index]) {	
				correctes++;
			}
		}
		if (correctes == seguentColor){
			encerta = true;
		}else {
			System.out.println("Has Perdut!");
			encerta = false;
		}
		
		return encerta;
	}

	private void colorsJugador(int[] jugador, int seguentColor) {
		int index;
		String color;
		
		cLector Entrada = new cLector();
		
		System.out.println("Introdueix els colors per ordre");
		for(index = 0; index < seguentColor; index++) {
			color = Entrada.llegirString("Introdueix el color: ");
			color = color.toLowerCase();
			
			if(color.equals("vermell")){
				jugador[index] = 1;
			}else if(color.equals("blau")) {
				jugador[index] = 2;
			}else if(color.equals("groc")) {
				jugador[index] = 3;
			}else if(color.equals("verd")) {
				jugador[index] = 4;
			}
			
		}
	}

	private void mostraColors(int[] colors, int seguentColor) throws InterruptedException {
		int index;
		
		System.out.println();
		System.out.println("A continuacio es mostrar els colors");
		Thread.sleep(1000);
		for (index = 0; index < seguentColor; index++) {
			if(colors[index] == 1){
				System.out.println("VERMELL");
			}else if(colors[index] == 2) {
			    System.out.println("BLAU");
			}else if(colors[index] == 3) {
			    System.out.println("GROC");
			}else if(colors[index] == 4) {
			    System.out.println("VERD");
			}
		}
	}

	private int colorAleatori(int[] colors, int seguentColor) {
		
		int color;
		color = (int) (Math.random() * 4 + 1);
		
		colors[seguentColor] = color;
		seguentColor++;
		
		return seguentColor;
	}

	private int dificultat() {
		
		cLector Entrada = new cLector();
		
		String dificultat;
		int segons = 0;
		
		System.out.println("• Nivell bàsic: INTERVAL a 5 segons (Introdueix basic)");
		System.out.println("• Nivell intermig: INTERVAL a 3 segons (Introdueix intermig)");
		System.out.println("• Nivell pro: INTERVAL a 1 segon (Introdueix pro)");
		System.out.println();
		
		while(segons == 0){
			dificultat = Entrada.llegirString("En quina dificultat vols jugar? ");
			
			if (dificultat.equals("basic") || dificultat.equals("Basic")) {
				segons = 5000;
				System.out.println("Dificultat establerta a Basic");
			}else if (dificultat.equals("intermig") || dificultat.equals("Intermig")) {
				segons = 3000;
				System.out.println("Dificultat establerta a intermig");
			}else if (dificultat.equals("pro") || dificultat.equals("Pro")) {
				segons = 1000;
				System.out.println("Dificultat establerta a pro");
			}else {
				System.out.println("Has de introduir una dificultat correcte");
			}	
		}	
		
		return segons;
	}

}
