//100. Igual que l’anterior però caldrà dir quantes ‘a’, ‘e’, ‘i’, ‘o’, ‘u’ per separat hi ha a la paraula.
//Caldrà desenvolupar els següents mètodes
//• String llegirString();
//• int comptarLletra(String paraula, char lletra); ‘ retorna el número de vegades lletra dins de
//paraula

package E_Moduls;

import Entrada.cLector;

public class Exercici_100 {
	public static void main (String[] args) {
		
		Exercici_100 programa = new Exercici_100();
		programa.inici();
	}

	private void inici() {
		
		cLector Entrada = new cLector();
		
		String paraula;
		
		paraula = Entrada.llegirString("Introdueix una paraula, per acabar escriu Exit: ");
		while (!paraula.equals("Exit") && !paraula.equals("exit")) {
			
			System.out.println("Hi han " + comptarLletres(paraula, 'a') + " As");
			System.out.println("Hi han " + comptarLletres(paraula, 'e') + " Es");	
			System.out.println("Hi han " + comptarLletres(paraula, 'i') + " Is");	
			System.out.println("Hi han " + comptarLletres(paraula, 'o') + " Os");	
			System.out.println("Hi han " + comptarLletres(paraula, 'u') + " Us");	

			
			paraula = Entrada.llegirString("Introdueix una paraula, per acabar escriu Exit: ");
		}
	}

	private int comptarLletres(String paraula, char Lletra) {
		
		int nombreAs = 0;
		int index;
		
		char[] descomposada = new char[paraula.length()];
		
		for (index = 0; index < paraula.length(); index++) {
			
			descomposada[index] = paraula.charAt(index);
		}
		
		for (index = 0; index < descomposada.length; index++) {
			
			if (descomposada[index] == Lletra || descomposada[index] == Character.toUpperCase(Lletra)) {
				
				nombreAs++;
			}
		}
		
		return nombreAs;
	}
}
