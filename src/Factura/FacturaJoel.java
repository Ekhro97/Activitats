//Albert Gomez, David Laborda,Sergi Romeu i Joel Coll.
//
//Desitgem redactar una factura en la qual l’hi pugem introduir el nom del producte, el seu preu,
//la quantitat que volem comprar,i si l’hi apliquem algun tipus de descompte,
//tot introduït per teclat menys l’IVA, que serà una variable constant.
//També es vol saber detalladament la quantitat de diners que s’ha de pagar en cada pas,
//que mostri per pantalla el seu preu total, el descompte a aplicar, el preu amb el descompte aplicar,
//el IVA a aplicar i el preu amb IVA i sense IVA.

package Factura;
import java.util.Scanner;

public class FacturaJoel {
	// Constant IVA
	private static final int IVA = 21;
	
	public static void main (String[] args) {

		Scanner Entrada = new Scanner(System.in);
		
		// Variables per a la factura
		String Producte;
		double Preu;
		int Quantitat;
		double Descompte;
		double TotalDescompte;
		double TotalIva;
		double PreuTotal;
		
		// Demanar producte per teclat
		System.out.print("Producte Solicitat: ");
		Producte = Entrada.nextLine();
		
		// Demanar el preu del producte
		System.out.print("Preu de " + Producte + ": ");
		Preu = Entrada.nextDouble();
		Entrada.nextLine();
		
		// Demanar La quantitat del producte
		System.out.print("Quantitat de " + Producte + " desitgada: ");
		Quantitat = Entrada.nextInt();
		Entrada.nextLine();
		
		// Funcio de preu total sense descompte ni iva aplicats
		PreuTotal = Preu * Quantitat;
		System.out.println("El Preu es de " + PreuTotal + " Euros");
		
		// Aplica el descompte introduit
		System.out.print("Aplicar descompte " + " desitgat a " + Producte + "(Introdueixi un nombre del 0 al 100): ");
		Descompte = Entrada.nextDouble();
		Entrada.nextLine();
		Entrada.close();
		
		// Descompte a aplicar en euros
		TotalDescompte = ((PreuTotal * Descompte) / 100);
		System.out.println(String.format("El descompte a aplicar es de %1$.2f ", TotalDescompte) + "Euros");
		
		// Funcio descompte sense IVA
		PreuTotal = PreuTotal - TotalDescompte;
		System.out.println(String.format("El preu de " + Producte + " amb el descompte es de: %1$.2f" , PreuTotal) + " Euros");
		
		// Total Iva a pagar
		TotalIva = ((PreuTotal * IVA) / 100);
		System.out.println(String.format("L'IVA a aplicar es de %1$.2f", TotalIva) + " Euros");
		
		// Funcio del Preu total amb L'IVA aplicat
		PreuTotal = PreuTotal + TotalIva;
		System.out.println(String.format("El preu total amb l'iva aplicat es de %1$.2f", PreuTotal) + " Euros");
		
	}
}
