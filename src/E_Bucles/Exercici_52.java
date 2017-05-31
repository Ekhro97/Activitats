package E_Bucles;
import java.util.Scanner;

public class Exercici_52 {
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int M;
		int N;
		int residu = 1;
		
		System.out.print("Introdueix el primer nombre: ");
		N = Entrada.nextInt();
		Entrada.nextLine();
		
		System.out.print("Introdueix el segon nombre: ");
		M = Entrada.nextInt();
		Entrada.nextLine();
		Entrada.close();
		
		System.out.println("M.C.D(" + N + "," + M + ")");
		
		while (residu != 0) {
			
			residu = N % M;
			
			if (residu == 0 ) {
				
			}else {
				N = M;
				M = residu;
				
				System.out.println("M.C.D(" + N + "," + M + ")");

			}
		}
		System.out.println("M.C.D(" + M + "," + residu + ")");
		System.out.println("El M.C.D es: " + M);
	}
}
