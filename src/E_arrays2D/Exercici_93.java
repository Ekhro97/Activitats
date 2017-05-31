//93.Fer un algoritme on l'usuari haur� d'anar introduint de manera aleat�ria, indicant fila i
//columna, de n�meros enters. S'haur� de validar que estigui dins dels marges de la columna i
//que no es pot introduir un valor en la casella on ja s'havia introdu�t un valor pr�viament.
//Finalment s'haur� de dir quantes caselles per cada fila tenen valors introdu�ts.

package E_arrays2D;

import java.util.Scanner;

public class Exercici_93 {
	public static int MIDA = 10;
	public static void main (String [] args) {
		
		Scanner Entrada = new Scanner(System.in);
		boolean[][] taula = new boolean[MIDA][MIDA];
		
		int valor;
		int fila;
		int columna;
		int totalValors;
		
		System.out.println("Vols introduir un nombre? (0 per no, altre nombre per a si)");
		valor = Entrada.nextInt();
		while(valor != 0) {
			
			System.out.println("Introdueix en quina posici� vols eliminar");
			System.out.println("Posici� fila");
			fila = Entrada.nextInt();
			System.out.println("Posici� columna");
			columna = Entrada.nextInt();
			
			if (((fila >= 0 && fila < MIDA) && (columna >= 0 && columna < MIDA))) {
				if (taula[fila][columna] == false) {
					
					taula[fila][columna] = true;
				}else {
					
					System.out.println("No pots tornar a introduir un valor en aquesta posici�");
				}
			}else {
				
				System.out.println("Has pasat la mida de la taula!");
			}
			System.out.println("Vols introduir un altre nombre? (0 per no)");
			valor = Entrada.nextInt();
		}
		
		totalValors = 0;
		for (fila = 0; fila < MIDA; fila++) {
			for (columna = 0; columna < MIDA; columna++) {
				if (taula[fila][columna] == true) {
					
					totalValors++;
				}
			}
			
			System.out.println("Hi han " + totalValors + " nombres en la fila " + fila);
			totalValors = 0;
		}
		
		Entrada.close();
	}
}