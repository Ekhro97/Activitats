//79.Introduir una frase caràcter a caràcter en una taula. Posteriorment caldrà mostrar-la per
//pantalla invertida canviant la vocat ‘a’ per la ‘e’, la ‘e’ per la ‘i’, la ‘i’ per la ‘o’, la ‘o’ per la
//‘u’ i la ‘u’ per la ‘a’

package E_arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercici_79 {
	private static int MIDA = 100;
	public static void main (String [] args) throws IOException{
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		char[] frase = new char[MIDA];
		
		int index = 0;
		int proximaLliure = 0;
		int valor;
		
		System.out.print("Introdueix el text: ");    
		valor= buffer.read();
		
		while(valor != 13 && proximaLliure < MIDA) {
			
            frase[proximaLliure] = (char) valor;
            valor= buffer.read();
            proximaLliure++;
            
        }
		
		for(index=0; index < proximaLliure; index++){
			
			if (frase[index] == 'a') {
				
	            	frase[index] = 'e';
			}
			else if (frase[index] == 'e') {
	            	
        			frase[index] = 'i';
        	}
			else if (frase[index] == 'i') {
	            	
        			frase[index] = 'o';
        	}
			else if (frase[index] == 'o') {
	            	
        			frase[index] = 'u';
        	}
			else  if (frase[index] == 'u') {
	            	
        			frase[index] = 'a';
        	}
		}
		
		for(index=0; index < proximaLliure; index++){
			
			System.out.print(frase[index]); 
		}
	}
}
	
	