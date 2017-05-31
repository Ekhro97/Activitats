package MasterMind;

import Entrada.cLector;
public class MasterMind {
	private static int RONDES = 15;
	private static int COLORS = 4;
	public static void main (String []args) {
		
		MasterMind programa = new MasterMind();
		programa.Inici();
		
	}

	private void Inici() {

		int[] jugador1 = new int[COLORS];
		int[] jugador2 = new int[COLORS];
		String[][] mostra = new String[RONDES* 2][COLORS];
		int comptadorRondes = 0;
		int graella = 29;
		
		boolean victoria = false;
		
		iniMostra(mostra);
		System.out.println("Jugador1, intordueix els colors a endevinar un per un.");
		colorsJugador(jugador1); // 1: BLANC – 2: NEGRE – 3: VERMELL – 4: LILA – 5: GROC – 6: CREMA
		
		System.out.println("Torn del jugador 2, intordueix els colors un per un.");
		while (comptadorRondes < RONDES && victoria == false) {
			System.out.println("Intent " + (comptadorRondes+1));
			colorsJugador(jugador2);
			insertarJugador(jugador2, mostra, graella);
			
			victoria = comprovarjugador2(jugador1, jugador2, mostra, graella);
			mostraResultat(jugador2, mostra);
			
			comptadorRondes++;
			graella = graella - 2;
		}
		if (comptadorRondes == 15) {
			System.out.println("Has perdut, torna a jugar!");
		}else {
			System.out.println("Has guanyat!, molt be!");
		}
	}

	private void insertarJugador(int[] jugador2, String[][] mostra, int graella) {
		
		int fila;
		
		graella = graella - 1;
		
		for(fila = 0; fila < mostra[fila].length; fila++){
			if(jugador2[fila] == 1){
				mostra[graella][fila] = "Blanc";
			}else if(jugador2[fila] == 2) {
				mostra[graella][fila] = "Negre";
			}else if(jugador2[fila] == 3) {
				mostra[graella][fila] = "Vermell";
			}else if(jugador2[fila] == 4) {
				mostra[graella][fila] = "Lila";
			}else if(jugador2[fila] == 5) {
				mostra[graella][fila] = "Groc";
			}else if(jugador2[fila] == 6) {
				mostra[graella][fila] = "Crema";
			}
		}
	}

	private void iniMostra(String[][] mostra) {
		
		int fila;
		int columna;
		
		for(fila = 0; fila < mostra.length; fila++){
			for(columna = 0; columna < mostra[fila].length; columna++){
				mostra[fila][columna] = "0";
			}
		}
	}

	private void mostraResultat(int[] jugador2, String[][] mostra) {
		
		int fila;
		int columna;
		int rondes = 15;
		
		for(fila = 0; fila < mostra.length; fila++){
			if(fila % 2 == 0){
				System.out.print (rondes + "\t");
				rondes--;
			}else{
				System.out.print ("\t");
			}
			for(columna = 0; columna < mostra[fila].length; columna++){
				
				System.out.print (mostra[fila][columna] + "\t");
			}
			System.out.println();
		}	
		
	}

	private boolean comprovarjugador2(int[] jugador1, int[] jugador2, String[][] mostra, int graella) {
		
		boolean victoria = false;
		boolean existeix;
		int index1;
		int index2;
		
		int posicio = 0;
		
		for(index1 = 0; index1 < jugador1.length; index1++){
			for(index2 = 0; index2 < jugador2.length; index2++){
				if((jugador2[index1] == jugador1[index2])){
					existeix = true;
				}else{
					existeix = false;
				}
				if(existeix){
					mostra[graella][index1] = "V";
					existeix = false;
				}else if(mostra[graella][index1] == "0") {
					mostra[graella][index1] = "X";
				}
			}
			existeix = false;
		}
		for(index1 = 0; index1 < jugador1.length; index1++){
			if((jugador2[index1] == jugador1[index1])){
				mostra[graella][index1] = "+";
			}else if(mostra[graella][index1] == "0") {
				mostra[graella][index1] = "X";
			}
		}
		if(posicio >= 4){	
			victoria = true;
		}
		return victoria;
	}

	private void colorsJugador(int[] jugador) {
		
		cLector Entrada = new cLector();
		
		String color;
		int index = 0;
		
		System.out.println("-------------------------------");
		System.out.println("Introdueixi 4 colors un per un.");
		System.out.println("Pots escollir entre BLANC – NEGRE – VERMELL – LILA – GROC – CREMA ");
		System.out.println("-------------------------------");
		while(index < 4) {
			color = Entrada.llegirString("Introdueix el color: ");
			color = color.toLowerCase();
			if(comprovarColor(color, jugador, index)){
				index++;
			}
		}
	}

	private boolean comprovarColor(String color, int[] jugador1, int index) {
		boolean correcte;
		if(color.equals("blanc")){
			jugador1[index] = 1;
			correcte = true;
		}else if(color.equals("negre")) {
			jugador1[index] = 2;
			correcte = true;
		}else if(color.equals("vermell")) {
			jugador1[index] = 3;
			correcte = true;
		}else if(color.equals("lila")) {
			jugador1[index] = 4;
			correcte = true;
		}else if(color.equals("groc")) {
			jugador1[index] = 5;
			correcte = true;
		}else if(color.equals("crema")) {
			jugador1[index] = 6;
			correcte = true;
		}else {
			System.out.println("Introdueix un color correcte");
			correcte = false;
		}
		
		return correcte;
	}
}
