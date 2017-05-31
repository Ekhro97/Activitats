//78.Anar introduint caràcters pel teclat una frase finalitzada amb punt. Després caldrà dir quantes
//lletres de tot l'abecedari s'han introduït. (‘a’-‘z’)

package E_arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercici_78 {
	private static int MIDA = 100;
	public static void main (String [] args) throws IOException{
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		char[] frase = new char[MIDA];
		
		int index = 0;
		int proximaLliure = 0;
		int lletres = 0;
		int valor;
		
		
		System.out.print("Introdueix el text: ");    
		valor= buffer.read();
		
		while(valor != '.' && proximaLliure < MIDA) {
			
            frase[proximaLliure] = (char) valor;
            valor= buffer.read();
            proximaLliure++;
        }
		
		for(index=0; index < proximaLliure; index++){
			
			if ((frase[index] >= 'a' && frase[index] <= 'z') || (frase[index] >= 'A' && frase[index] <= 'Z')) {
				
				lletres++;
			}
		}
		
		System.out.println("Hi han " + lletres + " lletres del abecedari.");  
	}
}
