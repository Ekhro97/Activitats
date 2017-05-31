package E_Bucles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercici_62 {
	public static void main(String[] ar) throws IOException{
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

		int iCaracter;
		int comp = 0;
		
        System.out.print("Introdueix el text: ");    
		iCaracter = buffer.read();
		
		while(iCaracter != 13) {
			
			if (iCaracter == 32 || iCaracter == 46 || iCaracter == 44 || iCaracter == 59) {
				
				iCaracter = buffer.read(); 
				if (iCaracter == 76 || iCaracter == 108) {
					
					iCaracter = buffer.read();      
					if (iCaracter == 65 || iCaracter == 97) {
						
						comp++;
					}
				}
			}
            iCaracter = buffer.read();
        }  
		System.out.print("Hi han " + comp + " LA");  
	}
}