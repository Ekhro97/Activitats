//90. Fer un programa on l’usuari anirà introduint números, finalitzant la sèrie amb el 0. Tots els
//números s’aniran guardant en una taula i al final caldrà donar com a resultat, el número més gran
//de la sèrie, el número més petit, la mitjana i quants son més grans que la mitjana. Caldrà
//desenvolupar els següents mètodes
//• int Llegirenter();
//• int mesGran(int[] valors);
//• int mesPetit(int[] valors);
//• double mitjana(int[] valors);

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
