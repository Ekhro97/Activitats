package Calculadora;
import java.util.Scanner;

public class CalculadoraTest {
	public static void main (String [] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		//Variables
		
		int Val1 = 1;
		int Val2 = 1;
		String operacio = "+";
		int Resultat = 1;
			
		// Introduim el primer valor
		
		System.out.println("Introdueix primer valor");
		Val1 = Entrada.nextInt();
		Entrada.nextLine();
		
		//Inroduim el l'operació +, -, *, /.
		
		System.out.println("Introdueix l'operació");
		operacio = Entrada.next();
		Entrada.nextLine();
		
		//Loop per a afegir operacions, si es diferent a "=" fara el loop
		
		while (!"=".equals(operacio)) {
		
		//Si es + executara la suma, sino continuara amb el else if
		
		if ("+".equals(operacio)) {
			
			System.out.println("Introdueix segon valor");
			Val2 = Entrada.nextInt();
			Entrada.nextLine();
			
			Resultat = Val1 + Val2;
			Val1 = Resultat;
			
			System.out.println("Quina operacio vol realitzar?");
			operacio = Entrada.next();
			Entrada.nextLine();
			
			//Donara el resultat si introduim "=" per teclat
			
				if ("=".equals(operacio)) {
					
					System.out.println( "El resultat de la operacio es " + Resultat);
					Entrada.close();
				}
			
			//Si es - executara la suma, sino continuara amb el else if
			
		}	else if ("-".equals(operacio)) {
			
			System.out.println("Introdueix segon valor");
			Val2 = Entrada.nextInt();
			Entrada.nextLine();
			
			Resultat = Val1 - Val2;
			Val1 = Resultat;
			
			System.out.println("Quina operacio vol realitzar?");
			operacio = Entrada.next();
			Entrada.nextLine();
			
				if ("=".equals(operacio)) {
					
					System.out.println( "El resultat de la operacio es " + Resultat);
					Entrada.close();
				}
			
			//Si es * o x executara la suma, sino continuara amb el else if
			
		} 	else if ("*".equals(operacio) || "x".equals(operacio) ) {
			
			System.out.println("Introdueix segon valor");
			Val2 = Entrada.nextInt();
			Entrada.nextLine();
			
			Resultat = Val1 * Val2;
			Val1 = Resultat;
			
			System.out.println("Quina operacio vol realitzar?");
			operacio = Entrada.next();
			Entrada.nextLine();
			
				if ("=".equals(operacio)) {
					
					System.out.println( "El resultat de la operacio es " + Resultat);
					Entrada.close();
				}
			
			//Si es / executara la suma, sino continuara amb el else if

			
		} 	else if ("/".equals(operacio)) {
			
			System.out.println("Introdueix segon valor");
			Val2 = Entrada.nextInt();
			Entrada.nextLine();
			
			Resultat = Val1 / Val2;
			Val1 = Resultat;
			
			System.out.println("Quina operacio vol realitzar?");
			operacio = Entrada.next();
			Entrada.nextLine();
			
				if ("=".equals(operacio)) {
					
					System.out.println( "El resultat de la operacio es " + Resultat);
					Entrada.close();
				}
			
			//Si s'introduiex un altre signe donara error i tancara el loop
			
		}	else {
			
				System.out.println("Error, torna a executar el programa");
				break;
			}
		
		}
		
	}
	
}
