//Tenint en compte la següent equació x=10*a/b. Demanar per teclat el
//valor de a i b per a calcular el valor de X, tenint en compte que la divisió
//per cero donaria un error.

package E_Condicionals;
import java.util.Scanner;


public class Exercici_22 {
 public static void main(String[] args) {
	 
	 Scanner Entrada = new Scanner(System.in);
	 
	 int a;
	 int b;
	 int x;
	 
	 System.out.print("Introdueix el valor de a: ");
	 a = Entrada.nextInt();
	 Entrada.nextLine();
	 
	 System.out.print("Introdueix el valor de b: ");
	 b = Entrada.nextInt();
	 Entrada.nextLine();
	 Entrada.close();
	 
	 if (b == 0) {

		 System.out.println("Error! no es pot dividir per 0.");
	 }else {	 
		 
		 x = 10*a/b;
		 
		 System.out.println("El resultat de la equació es: " + x); 
	 	}

 	}

}