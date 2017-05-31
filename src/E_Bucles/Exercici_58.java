package E_Bucles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercici_58 {
	public static void main(String[] ar) throws IOException{
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

		int iCaracter;
		int comp = 0;
		
        System.out.print("Introdueix el text: ");    
		iCaracter = buffer.read();
		
		while(iCaracter != 13) {
			
			if (iCaracter == 65 || iCaracter == 97|| iCaracter == 69 || iCaracter == 101 || iCaracter == 73 || iCaracter == 105 || iCaracter == 79 || iCaracter == 111 || iCaracter == 85 || iCaracter == 117) {
				
				comp++;
			}
            iCaracter = buffer.read();      
        }  
		System.out.print("Hi han " + comp + " vocals");  
	}
}