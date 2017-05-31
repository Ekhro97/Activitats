//Fer un programa que permet� calcular descomptes segons unes premises
//donades per l'usuari, les regles i passos a seguir son els seguents
//	> Decidir quin �s el valor m�nim per optar al descompte, quin
//	percentatge es descomptar� i el valor m�xim possible.
//	> Demanar que s�introdueixi el preu inicial, en euros, pel teclat.
//	> Llegir-lo.
//	> Comprovar que el preu �s correcte i no �s negatiu:
//		> Si es compleix, veure si el preu introdu�t �s igual o superior al
//		valor m�nim per optar al descompte:
//			> Si �s aix�, calcular el descompte.
//			> Comprovar si el descompte supera el m�xim permissible:
//				> Si �s aix�, el descompte es redueix al m�xim permissible.
//			> Aplicar el descompte sobre el preu inicial.
//	> Mostrar el preu final.
//	> Si el preu era negatiu, mostrar un missatge d�error.

package E_Condicionals;
import java.util.Scanner;

public class Exercici_31 {
	private static int OPTARDESC = 30;
	private static double DESC = 0.2;
	private static int MAXDESC = 30;
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		double PreuInicial;
		double PreuTotal;
		
		System.out.print("Introdueix el preu Inicial: ");
		PreuInicial = Entrada.nextInt();
		Entrada.nextLine();
		Entrada.close();
		
		if (PreuInicial <= 0) {
			
			System.out.println("El preu no pot ser 0 o negatiu!");
		}else {
			
			if (PreuInicial >= OPTARDESC) {
				
				PreuTotal = PreuInicial * DESC;
				
				if (PreuTotal >= MAXDESC) {
					
					PreuTotal = PreuInicial - MAXDESC;
				}else {
					
					PreuTotal = PreuInicial - (PreuInicial * DESC);
				}
			}else {
				
				PreuTotal = PreuInicial;
			}
			
			System.out.print("El Preu sera de " + PreuTotal);
		}
	}
}
