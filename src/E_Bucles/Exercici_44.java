package E_Bucles;
import java.util.Scanner;

public class Exercici_44 {
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int num;
		int i;
		
		System.out.print("Introdueix un nombre: ");
		num = Entrada.nextInt();
		Entrada.nextLine();
		Entrada.close();
		
		for (i=0;i<=10;i++) {
			
			System.out.println(num + " * " + i + " = " + i * num);
		}
	}
}
