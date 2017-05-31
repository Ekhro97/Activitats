package E_Bucles;
import java.util.Scanner;

public class Exercici_68 {
	public static void main (String [] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int num = (int) (Math.random() * 100 + 1);
		int player;
		int comp = 0;
		
//		System.out.println(num);
		
		do {
			
			System.out.print("Introdueix un nombre del 1 al 100: ");
			player = Entrada.nextInt();
			Entrada.nextLine();
			
			if (player < 0 || player > 100) {
				
				System.out.println("Introdueix un nombre correcte.");
				System.out.println();

			}else {
				
				if (player < num) {
					
					System.out.println("El nombre a encertar es mes gran.");
				}else {
					
					System.out.println("El nombre a encertar es mes petit.");
				}
				comp++;
			}
		}
		while (player != num);
		
		System.out.print("Molt be el nombre es " + num + ", has necesitat " + comp + " intents");
		Entrada.close();
	}
}
