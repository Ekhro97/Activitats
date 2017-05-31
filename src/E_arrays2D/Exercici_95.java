//95.Es necessari crear un programa per tal d’introduir les notes d’un màxim de 30 alumnes que
//cursen 5 assignatures.
//Per tant primer s’haurà de demanar el codiAlumne dels alumnes que volem avaluar, tenint
//en compte que com a màxim hi hauran 30 alumnes i que quan l’usuari vulgui dir que no hi ha
//més alumnes introduirà el codiAlumne 0. S’ha de validar que els CodiAlumne sempre ha de
//ser positiu pel que si l’usuari introdueix un codiAlumne negatiu s’haurà d’ignorar.
//Per altra banda s’haurà d’introduir els 5, i sempre 5, codiAssignatura.
//Al final l’usuari haurà d’introduir les notes per tots els alumnes informats per les 5
//assignatures. El client ens ha demanat que vol introduir les notes per assignatura, és a dir,
//primer totes les notes de la primera assignatura, després de la segona... fins a cinquena.
//Evidentment quan es demani la nota s’haurà de mostrar per pantalla de quin alumne i quina
//assignatura s’està demanant la nota. Existeix la possibilitat de que un alumne no cursi una
//assignatura, en aquest cas el client posarà com a nota un -1, de tal manera que aquesta
//nota no haurà d’afectar als càlculs que posteriorment es demanen.
//Al final amb totes les notes introduïdes caldrà mostrar la següent informació.
//• Per cada assignatura la mitjana de notes, la més gran i la més petita.
//• Per cada alumne quants suspesos i quants aprovats té, a més de la mitjana de notes.
//• Dir quina es la assignatura que té una mitja més baixa de nota.

package E_arrays2D;

import java.util.Scanner;

public class Exercici_95 {
	private static int MIDAASSIGNATURA = 6;
	private static int MIDAALUMNES = 5;
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		int[][] notes = new int[MIDAALUMNES][MIDAASSIGNATURA];
		
		int idAlumne;
		int idAssignatura;
		int comptadorAlumne;
		
		int fila;
		int columna;
		
		System.out.print("Introdueix el ID del alumne: ");
		idAlumne = Entrada.nextInt();
		
		//Alumne
		comptadorAlumne = 0;
		columna = 0;
		fila = 1;
		while (idAlumne != 0 && comptadorAlumne < MIDAALUMNES-1) {
			
			if (idAlumne < 0) {
				
				System.out.println("Has de introduir un nombre positiu");
			}else {
				
				notes[fila][columna] = idAlumne;
				
				comptadorAlumne++;
				fila++;
			}		
			System.out.print("Introdueix el ID del alumne: ");
			idAlumne = Entrada.nextInt();
			
		}
		if (idAlumne != 0 && comptadorAlumne == MIDAALUMNES-1) {
			
			System.out.println("Has exedit el maxim de alumnes, continua amb les asignatures.");
		}
		//Assignatures
		fila = 0;
		for(columna = 1;columna<MIDAASSIGNATURA;columna++){
			
			System.out.print("Intordueix el codi de la assigatura" + columna + ": ");
			idAssignatura = Entrada.nextInt();
			
			if (idAssignatura < 0) {
				
				System.out.println("Has de introduir un nombre positiu");
			}else {
				
				notes[fila][columna] = idAssignatura;
			}
		}
		
		//Notes
		for(columna = 1;columna<MIDAALUMNES-1;columna++){
			for(fila = 1;fila<MIDAASSIGNATURA-1;fila++){
							
				System.out.println("Introdueix la nota per al alumne " + notes[fila][0] + " per a la assignatura " + notes[0][columna]);
				notes[fila][columna] = Entrada.nextInt();
			}
		}
		
		//Mostra
	    for (int row = 0; row < notes.length; row++) {
	        for (int col = 0; col < notes[row].length; col++) {
	            System.out.printf("%4d", notes[row][col]);
	        }
	        System.out.println();
	    }
		
		Entrada.close();
	}
}
