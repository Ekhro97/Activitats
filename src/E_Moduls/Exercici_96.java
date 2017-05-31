//88. Desenvolupar un programa per tal de demanar un conjunt de n�meros pel teclat, finalitzant la 
//s�rie amb el 0. Una vegada tots els n�meros introdu�ts caldr� dir per a 
//cada n�mero quin �s el seu 
//factorial.
//Caldr� desenvolupar els seg�ent m�todes
//� int LlegirEnter();
//� int factorial(int numero);  � El factorial d�un n�mero negatiu es 0

package E_Moduls;
import Entrada.cLector;

public class Exercici_96 {
	private static int MIDA = 100;
	
	public static void main (String[] args){
		Exercici_96 programa = new Exercici_96();
		programa.inici();
	}
	public void inici () {
		int proximaLliure = 0;
		int nombre;
		int[] nombres = new int[MIDA];
		
		cLector Entrada = new cLector();
		
		nombre = Entrada.llegirEnter("Introdueix un nombre: ");	
		while (nombre != 0) {
			nombres[proximaLliure] = nombre;
			nombre = Entrada.llegirEnter("Introdueix un nombre: ");	
			proximaLliure++;
		}
		
		for (int index = 0; index < proximaLliure; index++) {
			nombre = nombres[index];
			nombre = factorial(nombre);
			System.out.println(nombre);	
		}
	}
	
	private int factorial(int nombre) {
		int factorial = 1;
		
		for (int mult = 1; mult <= nombre; mult++) {
			factorial = factorial * mult;
		}
		return factorial;
	}
}
