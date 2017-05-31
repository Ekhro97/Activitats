package E_Bucles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercici_63 {
	public static void main(String[] ar) throws IOException{
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

		int iCaracter;
		int comp = 1;
		char lletra1;
		char lletra2;
		
        System.out.print("Introdueix el text: ");    
		lletra1 = (char) buffer.read();
		lletra2 = (char )buffer.read();
		iCaracter = buffer.read();

		
		while(iCaracter != 13) {
			
			if (iCaracter == lletra1) {
				iCaracter = buffer.read(); 
				
				if (iCaracter == lletra2) {
					
					comp++;     
				}
			}
            iCaracter = buffer.read();
        }  
		System.out.print("Hi han " + comp + " " + lletra1 + lletra2);  
	}
}