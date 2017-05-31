package E_Condicionals;
import java.util.Scanner;

public class Exercici_30 {
	private static final int PEDRA = 1;
	private static final int PAPER = 2;
	private static final int TISORA = 3;
	public static void main (String [] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int jugador1;
		int jugador2;
		
		System.out.println("Pedra, Paper, Tisora");
		System.out.println("--------------------");
		
		System.out.println("Pedra = 1");
		System.out.println("Paper = 2");
		System.out.println("Tisora = 3");
		
		System.out.println(" ");
		
		System.out.print("Jugador 1, Introdueixi el nombre de la vostre figura: ");
		jugador1 = Entrada.nextInt();
		Entrada.nextLine();
		
		System.out.print("Jugador 2, Introdueixi el nombre de la vostre figura: ");
		jugador2 = Entrada.nextInt();
		Entrada.nextLine();
		Entrada.close();
		
		if (jugador1 > 3 || jugador2 > 3) {
			
			System.out.println("Has de introduir un nombre no superior a 3!");
		}else {
			
			if (jugador1 == jugador2) {
				
				System.out.println("Heu Empatat!");
			}else if ((jugador1 == PEDRA) && (jugador2 == TISORA)) {
				
				System.out.println("El jugador 1 ha guañat!");
			}else if ((jugador1 == PEDRA) && (jugador2 == PAPER)) {
				
				System.out.println("El jugador 2 ha guañat!");
			}else if ((jugador1 == PAPER) && (jugador2 == TISORA)) {
				
				System.out.println("El jugador 2 ha guañat!");
			}else if ((jugador1 == PAPER) && (jugador2 == PEDRA)) {
				
				System.out.println("El jugador 1 ha guañat!");
			}else if ((jugador1 == TISORA) && (jugador2 == PAPER)) {
				
				System.out.println("El jugador 1 ha guañat!");
			}else  {
				
				System.out.println("El jugador 2 ha guañat!");
			}
		}
	}
}
