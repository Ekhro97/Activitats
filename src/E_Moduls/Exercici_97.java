//89. 
//Fer  un  programa  on  l’usuari  anirà  introduint  números,  finalitzant  la  sèrie  amb  el  0.  P
//er  cada 
//dos números introduïts s’haurà de mostrar com a resultat si el segon número es divisor del primer número
//• Caldrà desenvolupar els següents mètodes
//• int LlegirEnter();
//• boolean esDivisor(int Divisor, int Divident)

package E_Moduls;
import Entrada.cLector;

public class Exercici_97 {
	private static int MIDA = 100;
	public static void main (String[] args) {
		
		Exercici_97 programa = new Exercici_97();
		programa.inici();
	}

	private void inici() {
		
		int proximaLliure = 0;
		int nombre;
		boolean Divisor;
		
		int[] nombres = new int[MIDA];
		
		cLector Entrada = new cLector();
		
		nombre = Entrada.llegirEnter("Introdueix un nombre: ");
		while (nombre != 0) {
			nombres[proximaLliure] = nombre;
			nombre = Entrada.llegirEnter("Introdueix un nombre: ");
			proximaLliure++;
		}
		
		for (int index = 0; index < proximaLliure; index++) {
			System.out.println(esDivisor());	
		}
	}

	private boolean[] esDivisor() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
