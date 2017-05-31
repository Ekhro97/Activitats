//87.Realitzar un algoritme que permeti entrar per teclat (caràcter a caràcter) un text no buit acabat
//amb punt. Determinar quantes paraules comencen amb la lletra ‘A’ i d’aquestes quantes
//contenen la seqüencia ‘LA’. Nota: S’entén que una paraula sempre porta un espai davant i
//darrera, excepte la primera i última paraula. Exemple
//Frase: A LA CALA DEL ALAN HI HA ARCILLA.
//Solució: 3 paraules comencen amb ‘A’ de les que 2 tenen ‘LA’

package E_arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercici_87 {
	private static int MIDA = 100;
	public static void main (String [] args) throws IOException{
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		char[] frase = new char[MIDA];
		
		int index = 0;
		int indexP;
		int proximaLliure = 1; // forçem un "espai" al principi (0) a.k.a chapuzilla
		int valor;
		int as = 0;
		int las = 0;
		
		System.out.print("Introdueix el text: ");    
		valor = buffer.read();
				
		// Posem la frase en la array
		while(valor != 46 && proximaLliure < MIDA) {
			
            frase[proximaLliure] = (char) valor;
            valor= buffer.read();
            proximaLliure++;
            
        }
		
		index = 0;
		for(index=0; index < proximaLliure; index++){ 						//Recorrem la taula logica
			
			if (frase[index] == 'a' || frase[index] == 'A') { 				//Comprovem si es = 'a'
				if (frase[index - 1] == ' ' || frase[index - 1] == 0) {		//Si es aixis comprovem si el anterior es un espai o un "espai"
					
					indexP = index;
					while (frase[indexP] != ' ' && frase[indexP] != 0) {	//Un while per a que recorri la paraula
						if ((frase[indexP] == 'l' || frase[indexP] == 'L') && (frase[indexP + 1] == 'a' || frase[indexP + 1] == 'A')) { 	//Comprovem si en aquesta paraula hi ha una 'l' segida de una 'a'
							
							las++;
						}
						indexP++;
					}
					
					as++;
				}
			}	
		}
		
		//Print de tot
		System.out.print("La teva frase es: ");
		
		index = 0;
		for(index=0; index < proximaLliure; index++){
			
			System.out.print(frase[index]);
		}
		
		System.out.println();
		System.out.println("La frase comença amb " + as + " lletres as.");
		System.out.println("de les quals " + las + " tenen las.");
	}
}
