package E_Condicionals;
import java.util.Scanner;

public class Exercici_29 {
	public static void main (String [] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		char lletra;
		
		System.out.print("Introdueix un caracter: ");
		lletra = Entrada.next().charAt(0);
		Entrada.nextLine();
		Entrada.close();
		
		if ((lletra >= 'A') && (lletra <= 'Z')) {
			
			System.out.println("Es majuscula");
		}else if ((lletra >= 'a') && (lletra <= 'z')) {
			
			System.out.println("Es minuscula");
		}else {
			
			System.out.println("No es ni majuscula ni minuscula");	
		}
	}
}
