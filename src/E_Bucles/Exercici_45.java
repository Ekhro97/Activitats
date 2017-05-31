package E_Bucles;
import java.util.Scanner;

public class Exercici_45 {
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int n;
		int m;
		int i;
		
		System.out.print("Introdueix quina taula vols fer: ");
		n = Entrada.nextInt();
		Entrada.nextLine();
		
		System.out.print("Introdueix fins a quin nombre vols fer la taula: ");
		m = Entrada.nextInt();
		Entrada.nextLine();
		Entrada.close();
		
		for (i=0;i<=m;i++) {
			
			System.out.println(n + " * " + i + " = " + i * n);
		}
	}
}
