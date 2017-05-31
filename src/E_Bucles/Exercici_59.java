package E_Bucles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercici_59 {
	public static void main(String[] ar) throws IOException{
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

		int iCaracter;
		double compA = 0;
		double compE = 0;
		double res;
		
        System.out.print("Introdueix el text: ");    
		iCaracter = buffer.read();
		
		while(iCaracter != 13) {
			
//			Si es 'A' o 'a'
			if (iCaracter == 65 || iCaracter == 97) {
				compA++;
				
//			Si es un espai
			}else if (iCaracter == 32) {
				compE++;
			}
            iCaracter = buffer.read();      
        }  
		res = (compA / compE) * 100;
		System.out.print("La relacio es de " + res + "%");  
	}
}