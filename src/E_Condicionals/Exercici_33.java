//Calcular l'import que un treballador rep en el repartiment anual de
//beneficis si aquest se li assigna com un percentatge del seu salari
//mensual que depèn de la seva antiguitat en l'empresa d'acord amb la
//taula:

package E_Condicionals;
import java.util.Scanner;
public class Exercici_33 {
	private static double PMENYS1= 0.05;
	private static double PMES1MENYS2 = 0.07;
	private static double PMES2MENYS5 = 0.10;
	private static double PMES5MENYS10 = 0.15;
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		double RepAnual;
		double Sou;
		double Ant;
		
		System.out.print("Introdueix el sou del treballador: ");
		Sou = Entrada.nextDouble();
		Entrada.nextLine();
		
		System.out.print("Introdueix l'antiguetat del treballador: ");
		Ant = Entrada.nextDouble();
		Entrada.nextLine();
		Entrada.close();
		
		if (Sou <=0 ) {
			
			System.out.print("El sou no pot ser zero o negatiu.");
		}else {
			
			if (Ant < 1) {
				
				RepAnual = Sou * PMENYS1;
			}else if (Ant < 2) {
				
				RepAnual = Sou * PMES1MENYS2;
			}else if (Ant < 5) {
				
				RepAnual = Sou * PMES2MENYS5;
			}else if (Ant < 10) {
				
				RepAnual = Sou * PMES5MENYS10;
			}else {
				
				RepAnual = Sou * PMES5MENYS10;
			}
			
			System.out.println(RepAnual);
		}
	}
}
