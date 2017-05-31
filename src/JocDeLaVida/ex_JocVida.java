package JocDeLaVida;
import Entrada.cLector;

public class ex_JocVida {
	private static int ESTAT_MORT = 0;
	private static int ESTAT_VIDA = 1;
	
	public static void main (String [] args)  {
		ex_JocVida programa = new ex_JocVida();
		programa.inici();
	}

	private void inici() {
		int tamany;
		int generacio = 1;
		boolean continuar;
		
		// Serà demanar el tamany del taulell
		tamany = demanarTamany();
		
		// Crear taulell sobredimensionat pel contorn
		int[][] taulell = new int[tamany+2][tamany+2];
		
		// Inicialitzem tot a mort
		iniciarlitzarTaulell(taulell);
		
		// Omplir de vida la primera generació
		demanarPrimeraGeneracio(taulell);
		
		// mostrem al generació actual
		mostrarGeneracio(taulell, generacio);
		
		continuar = volMesGeneracions();

		while (continuar == true) {
			generacio++; 
			generarNovaGeneracio(taulell);
			mostrarGeneracio(taulell, generacio);
			continuar = volMesGeneracions();
		}
	}
	
	
	
	private int demanarTamany() {
		cLector lector = new cLector();
		int iTamany = 0;
		
		while (iTamany < 2) {
			iTamany = lector.llegirEnter("Quin tamany vol que tingui la seva població (mínim 2)?");
		}
		
		return iTamany;
	}
	
	private void iniciarlitzarTaulell(int[][] taulell) {
		// TODO Auto-generated method stub
		int fila,columna;
		
		for (fila = 0; fila < taulell[0].length; fila++) {
			for (columna = 0; columna < taulell[0].length; columna++) {
				taulell[fila][columna] = ESTAT_MORT;
			}			
		}
	}

	private void demanarPrimeraGeneracio(int[][] taulell) {
		// Demanem caselles tenint en compte els limits de la població
		int iTamany = taulell[0].length-2;
		int fila, columna;
		
		cLector lector = new cLector();
		
		System.out.println("Introdueixi la casella on vol vida, per finalitzar (0,0)");
		fila = lector.llegirEnter("Introdueixi la fila on vol vida (1 fins a " + iTamany + ")");
		columna = lector.llegirEnter("Introdueixi la columna on vol vida (1 fins a " + iTamany + ")");

		while ((fila != 0) || (columna != 0)) {
			if ((fila >=1) && (fila <= iTamany) && (columna >= 1) && (columna <= iTamany)){
				taulell[fila][columna] = ESTAT_VIDA;
				System.out.println("Vida posada a la casella indicada");
			}
			else {
				System.out.println("Coordenades incorrectes");
			}

			System.out.println("Introdueixi la casella on vol vida, per finalitzar (0,0)");
			fila = lector.llegirEnter("Introdueixi la fila on vol vida (1 fins a " + iTamany + ")");
			columna = lector.llegirEnter("Introdueixi la columna on vol vida (1 fins a " + iTamany + ")");
		}
	}
	
	private void mostrarGeneracio(int[][] taulell, int quinaGeneracio) {
		int iTamany = taulell[0].length;
		
		System.out.println("Mostrant la generació: " + quinaGeneracio);
		for (int fila=1; fila <= iTamany-2; fila++) {
			for (int columna=1; columna <= iTamany-2; columna++) {
				System.out.print(taulell[fila][columna] + "  ");
			}
			System.out.println("");
		}
		System.out.println("");
		
	}

	
	private boolean volMesGeneracions() {
		cLector lector = new cLector();
		String confirmacio;
		
		confirmacio = lector.llegirString("Vol generar una nova població, pulsi 'S' per SI, qualsevol altre tecla per NO.");
		return confirmacio.equalsIgnoreCase("S");
	}

	private void generarNovaGeneracio(int[][] taulell) {
		// dupliquem la taula per tenir una copia
		int iTamany = taulell[0].length;
		int veins, estatNovaGeneracio, estatAntigaGeneracio;
		int[][] original = new int[iTamany][iTamany];
		
		original = duplicarMatriu(taulell);
		
		// Recorrem la zona de la població real
		for (int fila=1; fila<=(iTamany-2); fila++) {
			for (int columna=1; columna<=(iTamany-2); columna++) {
				
			   veins = comptarVeins(original,fila,columna);
			   estatNovaGeneracio = original[fila][columna];
			   estatAntigaGeneracio = estatNovaGeneracio;
			   
			   if (estatAntigaGeneracio == ESTAT_MORT) {
			      // Anem a veure si pot neixer
				  if (veins == 3) {
					  estatNovaGeneracio = ESTAT_VIDA;
				  }
			   }
			   else {
				   // estem vius anema veure si morim
				   if ((veins < 2) || (veins >3)) {
					   estatNovaGeneracio = ESTAT_MORT;
				   }
			   }
			   
			   taulell[fila][columna] = estatNovaGeneracio;
			}
		}
		
	}
	
	private int comptarVeins(int[][] original, int fila, int columna) {
		// Per comptar només sumem ja que on hi ha vida hi ha un 1
		// al final ens restarem nosaltres mateixos
		int veins = 0;
		for (int iFila=fila-1;iFila<=fila+1;iFila++) {
			for (int iColumna=columna-1;iColumna<=columna+1;iColumna++) {
			   veins = veins + original[iFila][iColumna];	
			}
		}
		
		veins = veins - original[fila][columna];
		return veins;
	}

	private int[][] duplicarMatriu(int[][] taulell) {
		int iTamany = taulell[0].length;
		int[][] duplicat = new int[iTamany][iTamany];
		
		for (int fila=0; fila < iTamany; fila++) {
			for (int columna=0; columna < iTamany; columna++) {
				duplicat[fila][columna] = taulell[fila][columna];
			}
		}
		
		return duplicat;
	}

}
