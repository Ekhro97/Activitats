package E_Condicionals;
import java.util.Scanner;

public class Exercici_15 {
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int Nombre;
		
		System.out.print("Introdueix el nombre desitgat: ");
		Nombre = Entrada.nextInt();
		Entrada.nextLine();
		Entrada.close();
		
		if (Nombre == 0) {
			
			System.out.println("El nombre es neutre");
			
		}
		else {
			if (Nombre < 0) {
				
				System.out.println("El nombre es negatiu");
				
			}
			else {
				if (Nombre > 0) {
					
					System.out.println("El nombre es positiu");
					
				}
			}
		}
	}
}
