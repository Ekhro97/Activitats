package E_Condicionals;
import java.util.Scanner;

public class Exercici_27 {
	public static void main (String [] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int aleatori;
		int valor1;
		
		aleatori = (int) (Math.random() * 10 + 1);
		
		System.out.print("Quin nombre es?: ");
		valor1 = Entrada.nextInt();
		Entrada.nextLine();
		
		if (valor1 > 10) {
			
			System.out.println("El valor ha de estar entre el 1 i el 10");
		}else if (valor1 == aleatori) {
			
			System.out.println("Molt be!, el nombre era " + aleatori);
		}else {
			
			System.out.println("Nope, torna a intentar-ho");
			
			System.out.print("Quin nombre es?: ");
			valor1 = Entrada.nextInt();
			Entrada.nextLine();
			
			if (valor1 == aleatori) {
				
				System.out.println("Molt be!, el nombre era " + aleatori);
			}else if (valor1 > 10) {
				
				System.out.println("El valor ha de estar entre el 1 i el 10");
			}else {
				
				System.out.println("Nope, torna a intentar-ho");
				
				System.out.print("Quin nombre es?: ");
				valor1 = Entrada.nextInt();
				Entrada.nextLine();
				
				if (valor1 == aleatori) {
					
					System.out.println("Molt be!, el nombre era " + aleatori);
				}else if (valor1 > 10) {
					
					System.out.println("El valor ha de estar entre el 1 i el 10");
				}else {
					
					System.out.println("Nope, el nombre era: " + aleatori);
				}
			}
		}
		
		Entrada.close();
	}
}
