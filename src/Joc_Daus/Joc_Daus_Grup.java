//	Volem crear un joc de daus per a 2 jugadors que consistira en:
//	Els jugadors apostaran la mateixa quantitat de diners (amb un limit de 100€ per aposta),
//	tot seguit cada jugador tirara 2 daus i la suma mes alta de aquests sera el guanyador,
//	el guanyador s'emportara els diners apostats, el joc constara de 3 rondes i al final es vol
//	saber amb la quantitat de diners que a acabat cada jugador.

package Joc_Daus;
import java.util.Scanner;

public class Joc_Daus_Grup {
	private static int MAXAPOSTA = 100;
	public static void main (String[] args) {
	
		Scanner Entrada = new Scanner (System.in);
		
		//Variables jugador1
		int Dinersj1 = 0;
		int ResDausj1;
		
		//Variables jugador2
		int Dinersj2 = 0;
		int ResDausj2;
		
		//Variables Generals
		int Dau1;
		int Dau2;
		int Aposta;
		
		//Demanem aposta RONDA1
		System.out.println(" Daus amb apostes");
		System.out.println("------------------");
		
		System.out.println(" Ronda 1");
		System.out.println("---------");
		System.out.println("");
		System.out.print("Cuants diners aposta cada jugador? feu la vostre aposta:");
		Aposta = Entrada.nextInt() * 2;
		Entrada.nextLine();
		System.out.println("");
		
		//Limit aposta
		if (Aposta / 2 > MAXAPOSTA) {
			
			System.out.println("La aposta no pot ser superior a 100€!");
			System.out.println("");
			
		//Si aposta esta dins del limit, el joc continua
		}else {
			
			// Jugador 1
			Dau1 = (int) (Math.random() *6 + 1);
			Dau2 = (int) (Math.random() *6 + 1);
			ResDausj1 = Dau1 + Dau2;
			
			System.out.println("Els daus del jugador 1 són: " + Dau1 + " + " + Dau2 + " = " + ResDausj1);
			
			// Jugador 2
			Dau1 = (int) (Math.random() *6 + 1);
			Dau2 = (int) (Math.random() *6 + 1);
			ResDausj2 = Dau1 + Dau2;
			
			System.out.println("Els daus del jugador 2 són: " + Dau1 + " + " + Dau2 + " = " + ResDausj2);
			System.out.println("");
			
			//Cas d'empat
			if (ResDausj1 == ResDausj2) {
				
				System.out.println("Heu empatat! els marcadors són:");
				
			//Cas jugador1 guanya
			}else if (ResDausj1 > ResDausj2) {
				
				Dinersj1 = Dinersj1 + Aposta;
				Dinersj2 = Dinersj2 - Aposta;
				
				System.out.println("Molt bé jugador 1, has guanyat! els marcadors són:");
		
			//Cas jugador2 guanya
			}else {
				
				Dinersj1 = Dinersj1 - Aposta;
				Dinersj2 = Dinersj2 + Aposta;
				
				System.out.println("Molt bé jugador2, has guanyat! els marcadors són:");
			}
			//Print dels Resultats de la RONDA1
			System.out.println("");
			System.out.println("Jugador 1: " + Dinersj1 + "€ guanyats/perduts");
			System.out.println("Jugador 2: " + Dinersj2 + "€ guanyats/perduts");
			System.out.println("");
			
			//Comença la RONDA2
			System.out.println("---------");
			System.out.println(" Ronda 2");
			System.out.println("---------");
			System.out.println("");
			System.out.print("Cuants diners aposta cada jugador? feu la vostre aposta:");
			Aposta = Entrada.nextInt() * 2;
			Entrada.nextLine();
			System.out.println("");
			
			//Limit aposta
			if (Aposta / 2 > MAXAPOSTA) {
				
				System.out.println("La aposta no pot ser superior a 100€!");
				System.out.println("");
				
			//Si aposta esta dins del limit, el joc continua
			}else {
				
				// Jugador 1
				Dau1 = (int) (Math.random() *6 + 1);
				Dau2 = (int) (Math.random() *6 + 1);
				ResDausj1 = Dau1 + Dau2;
				
				System.out.println("Els daus del jugador 1 són: " + Dau1 + " + " + Dau2 + " = " + ResDausj1);
				
				// Jugador 2
				Dau1 = (int) (Math.random() *6 + 1);
				Dau2 = (int) (Math.random() *6 + 1);
				ResDausj2 = Dau1 + Dau2;
				
				System.out.println("Els daus del jugador 2 són: " + Dau1 + " + " + Dau2 + " = " + ResDausj2);
				System.out.println("");
				
				//Cas d'empat
				if (ResDausj1 == ResDausj2) {
					
					System.out.println("Heu empatat! els marcadors són:");
					
				//Cas jugador1 guanya
				}else if (ResDausj1 > ResDausj2) {
					
					Dinersj1 = Dinersj1 + Aposta;
					Dinersj2 = Dinersj2 - Aposta;
					
					System.out.println("Molt bé jugador1, has guanyat! els marcadors són:");

				//Cas jugador2 guanya
				}else {
					
					Dinersj1 = Dinersj1 - Aposta;
					Dinersj2 = Dinersj2 + Aposta;
					
					System.out.println("Molt bé jugador 2, has guanyat! els marcadors són:");
				}
				//Print dels Resultats de la RONDA2
				System.out.println("");
				System.out.println("Jugador 1: " + Dinersj1 + "€ guanyats/perduts");
				System.out.println("Jugador 2: " + Dinersj2 + "€ guanyats/perduts");
				System.out.println("");
				
				//Comença la RONDA3
				System.out.println("---------");
				System.out.println(" Ronda 3");
				System.out.println("---------");
				System.out.println("");
				System.out.print("Cuants diners aposta cada jugador? feu la vostre aposta:");
				Aposta = Entrada.nextInt() * 2;
				Entrada.nextLine();
				System.out.println("");
				
				//Limit aposta
				if (Aposta / 2 > MAXAPOSTA) {
					
					System.out.println("La aposta no pot ser superior a 100€!");
					System.out.println("");
					
				//Si aposta esta dins del limit, el joc continua
				}else {
					
					// Jugador 1
					Dau1 = (int) (Math.random() *6 + 1);
					Dau2 = (int) (Math.random() *6 + 1);
					ResDausj1 = Dau1 + Dau2;
					
					System.out.println("Els daus del jugador 1 són: " + Dau1 + " + " + Dau2 + " = " + ResDausj1);
					
					// Jugador 2
					Dau1 = (int) (Math.random() *6 + 1);
					Dau2 = (int) (Math.random() *6 + 1);
					ResDausj2 = Dau1 + Dau2;
					
					System.out.println("Els daus del jugador 2 són: " + Dau1 + " + " + Dau2 + " = " + ResDausj2);
					System.out.println("");
					
					//Cas d'empat
					if (ResDausj1 == ResDausj2) {
						
						System.out.println("Heu empatat! el resultat final és:");
						
					//Cas jugador1 guanya
					}else if (ResDausj1 > ResDausj2) {
						
						Dinersj1 = Dinersj1 + Aposta;
						Dinersj2 = Dinersj2 - Aposta;
						
						System.out.println("Molt bé jugador1, has guanyat! el resultat final és:");
						
					//Cas jugador2 guanya
					}else {
						
						Dinersj1 = Dinersj1 - Aposta;
						Dinersj2 = Dinersj2 + Aposta;
						
						System.out.println("Molt bé jugador 2, has guanyat! el resultat final és:");
					}
					//Print dels Resultats de la RONDA3 i final
					System.out.println("");
					System.out.println("----------------------------------");
					System.out.println(" Jugador 1: " + Dinersj1 + "€ guanyats/perduts");
					System.out.println(" Jugador 2: " + Dinersj2 + "€ guanyats/perduts");
					System.out.println("----------------------------------");
				}
			}
		}
		
		Entrada.close();
	}
}