package E_Bucles;
import java.util.Scanner;

public class Exercici_50 {
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		
		int num1 = 0;
		int num2 = 1;
		int save;
		int N;
		int i; 
		
		System.out.print("Introdueix el nombre de nombres a mostrar: ");
		N = Entrada.nextInt();
		Entrada.nextLine();
		Entrada.close();

		if (N < 2) {
			
			System.out.println("No es pot calcular la serie amb un nombre inferior a 2.");
		}else {
			
			for(i=1;i<=N;i++) { 
				
				save=num1+num2; 
				num1=num2; 
				num2=save; 
				
				System.out.print(num1 + " "); 
				} 
		}
	}
}
