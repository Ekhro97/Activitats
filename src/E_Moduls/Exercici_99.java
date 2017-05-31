//99. Fer un programa on l’usuari anirà introduint paraules. Per cada paraula se li mostrarà al usuari
//quantes ‘a’ hi ha a la paraula. Cadrà desenvolupar els següents mètodes
//• String llegirString();
//• int comptarA(String paraula);

package E_Moduls;

import Entrada.cLector;

public class Exercici_99 {
	public static void main (String[] args) {
		
		Exercici_99 programa = new Exercici_99();
		programa.inici();
	}

	private void inici() {
		
		cLector Entrada = new cLector();
		
		String paraula;
		int nombreAs;
		
		paraula = Entrada.llegirString("Introdueix una paraula, per acabar escriu Exit: ");
		
		while (!paraula.equals("Exit") && !paraula.equals("exit")) {
			
			nombreAs = comptarA(paraula);
			System.out.println(nombreAs);	
			
			paraula = Entrada.llegirString("Introdueix una paraula, per acabar escriu Exit: ");
		}
	}

	private int comptarA(String paraula) {
		
		int nombreAs = 0;
		int index;
		
		char[] descomposada = new char[paraula.length()];
		
		for (index = 0; index < paraula.length(); index++) {
			
			descomposada[index] = paraula.charAt(index);
		}
		
		for (index = 0; index < descomposada.length; index++) {
			
			if (descomposada[index] == 'A' || descomposada[index] == 'a') {
				
				nombreAs++;
			}
		}
		
		return nombreAs;
	}
}

