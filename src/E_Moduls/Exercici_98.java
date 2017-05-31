//90. Fer un programa on l�usuari anir� introduint n�meros, finalitzant la s�rie amb el 0. Tots els
//n�meros s�aniran guardant en una taula i al final caldr� donar com a resultat, el n�mero m�s gran
//de la s�rie, el n�mero m�s petit, la mitjana i quants son m�s grans que la mitjana. Caldr�
//desenvolupar els seg�ents m�todes
//� int Llegirenter();
//� int mesGran(int[] valors);
//� int mesPetit(int[] valors);
//� double mitjana(int[] valors);

package E_Moduls;

import Entrada.cLector;

public class Exercici_98 {
	private static int MIDA = 100;
	public static void main (String[] args) {
		
		Exercici_98 programa = new Exercici_98();
		programa.inici();
	}
	private void inici() {
		
		int proximaLliure = 0;
		int nombre;
		
		int[] nombres = new int[MIDA];
		
		cLector Entrada = new cLector();
		
		nombre = Entrada.llegirEnter("Introdueix un nombre: ");	
		while (nombre != 0 && proximaLliure < MIDA) {
			nombres[proximaLliure] = nombre;
			nombre = Entrada.llegirEnter("Introdueix un nombre: ");	
			proximaLliure++;
		}
		
		System.out.println(mesGran(nombres, proximaLliure));
		System.out.println(mesPetit(nombres, proximaLliure));
		System.out.println(mitjana(nombres, proximaLliure));
	}
	private double mitjana(int[] nombres, int proximaLliure) {
		int mitjana = 0;
		int index;
		
		for (index=0; index < proximaLliure; index++) {
			mitjana = mitjana + nombres[index];
			}
		
		mitjana = mitjana / proximaLliure;
		
		return mitjana;
	}
	private int mesPetit(int[] nombres, int proximaLliure) {
		int mesPetit;
		int index;
		
		mesPetit = nombres[0];
		for (index = 1; index < proximaLliure; index++){
			if (nombres[index] < mesPetit){
				   mesPetit = nombres[index];
			} 
		}
		return mesPetit;
		
	}
	private int mesGran(int[] nombres, int proximaLliure) {
		int mesGran;
		int index;
		
		mesGran = nombres[0];
		for (index = 1; index < proximaLliure; index++){
			if (nombres[index] > mesGran){
				   mesGran = nombres[index];
			} 
		}
		return mesGran;
	}
}
