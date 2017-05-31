package E_Condicionals;
import java.util.Scanner;

public class Exercici_25 {
	public static void main (String [] args) {
		
		
	Scanner Entrada = new Scanner(System.in);
	
	double nota;
	
	System.out.print("Introdueix la nota");
	nota = Entrada.nextDouble();
	Entrada.nextLine();
	Entrada.close();
	
	if (nota >= 9 && nota <= 10) {
		
		System.out.print("Excel·lent");
		}else {
			
			if (nota >= 6.5 && nota < 9) {
				
				System.out.print("Notable");
			}else {
				
				if (nota >= 5 && nota < 6.5) {
					
					System.out.print("Suficient");
				}else {
					
					System.out.print("Suspès");
				}
			}
		}
	}
}
