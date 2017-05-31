//D’una llista de 10 nombres calcular la seva mitja aritmètica.

package E_Bucles;
import java.util.Scanner;

public class Exercici_39 {
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int num;
		double total = 0;
		int i;
		
		for (i=1;i<=10;i++) {
			
			System.out.print("Introdueix el nombre numero " + i + ": ");
			num = Entrada.nextInt();
			Entrada.nextLine();
			
			total = total + num;
		}	
		total = total / 10 ;
		System.out.println("La mitjana artimetica es: " + total);
		Entrada.close();
	}
}
