//Determinar la quantitat de diners que rebrà un treballador per concepte
//de les hores extres treballades en una empresa, sabent que quan les
//hores de treball excedeixen de 40, la resta es consideren hores extres i
//que aquestes es paguen al doble d'una hora normal quan no excedeixen
//de 8; si les hores extres excedeixen de 8 es paguen les primeres 8 al
//doble del que paguen les hores normals i la resta al triple.

package E_Condicionals;
import java.util.Scanner;

public class Exercici_32 {
	private static int MINHORES = 40;
	private static int MAXHORESDOBLE = 8;
	private static int DOBLE = 2;
	private static int TRIPLE = 3;
	public static void main (String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		double DinersExtres;
		int Hores;
		int HoresExtres;
		double PreuHora;
		
		System.out.print("Introduiex el Preu per hora del treballador: ");
		PreuHora = Entrada.nextInt();
		Entrada.nextLine();
		
		System.out.print("Introduiex el nombre d'hores treballades: ");
		Hores = Entrada.nextInt();
		Entrada.nextLine();
		Entrada.close();
		
		if (Hores <= 0 || PreuHora <= 0) {
			
			System.out.println("Error, El Sou o el nombre d'hores no pot ser 0 o negatiu.");
		}else {
			
			if (Hores <= MINHORES) {
				
				System.out.println("No ha realitzat hores extres, No rebra diners extres.");
			}else {
				
				HoresExtres = Hores - MINHORES;
				
				if (Hores - MINHORES <= MAXHORESDOBLE) {
					
					DinersExtres = (PreuHora * HoresExtres) * DOBLE;
				}else {
					
					DinersExtres = (PreuHora * MAXHORESDOBLE) * DOBLE;
					HoresExtres = HoresExtres - MAXHORESDOBLE;
					DinersExtres = DinersExtres + (PreuHora * HoresExtres) * TRIPLE;
					HoresExtres = HoresExtres + MAXHORESDOBLE;
				}
				System.out.println("Ha realitzat " + HoresExtres + " hores extres, rebra " + DinersExtres + "€ extres");
			}
		}
	}
}
