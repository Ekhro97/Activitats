package E_Bucles;
import java.util.Scanner;

public class Exercici_65 {
	public static void main (String[] args) {
		
		 int valor = 1;
	        double resultat = 0;
	        double mitjana = 0;
	        double contadorMitjana = 0;
	        Scanner sc = new Scanner(System.in);
	       
	            System.out.print("Introdueix un valor, quan sigui 0 es fara la suma d'aquests: ");
	            valor = sc.nextInt();
	           
	            while (valor != 0) {
	                if (valor > 0){
	                resultat = valor + resultat;
	                contadorMitjana++;
	                }
	                System.out.print("Introdueix un valor, quan sigui 0 es fara la suma d'aquests: ");
	                valor = sc.nextInt();
	            }
	            sc.close();
	            mitjana = resultat / (contadorMitjana);
	            System.out.println("La mitjana es: " + mitjana + ".");
	}
}
