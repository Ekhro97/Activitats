package E_Bucles;
import java.util.Scanner;

public class Exercici_54 {
	public static void main(String []arg) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int dia = 31;
		int mes = 13;
		int any = 0;
		
		while (dia > 30 || mes > 12) {
			
			System.out.println("Introdueix la data correctament.");

			System.out.print("Introdueix el dia: ");
			dia = Entrada.nextInt();
			Entrada.nextLine();
			
			System.out.print("Introdueix el mes: ");
			mes = Entrada.nextInt();
			Entrada.nextLine();
			
			System.out.print("Introdueix l'any: ");
			any = Entrada.nextInt();
			Entrada.nextLine();
			
			while (mes == 2 && dia > 29) {
				System.out.print("Febrer no pot tenir mes de 29 dies, torna a introduir el dia. ");
				dia = Entrada.nextInt();
				Entrada.nextLine();
			}
		}
		System.out.print(dia + "/" + mes + "/" + any );
		Entrada.close();
	}
}