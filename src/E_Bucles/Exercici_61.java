package E_Bucles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercici_61 {
	public static void main(String[] ar) throws IOException{
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

		int iCaracter;
		int compLA = 0;
		int compSI = 0;
		
        System.out.print("Introdueix el text: ");    
		iCaracter = buffer.read();
		
		while(iCaracter != 13) {
			
			if (iCaracter == 76 || iCaracter == 108) {
				
				iCaracter = buffer.read();      
				if (iCaracter == 65 || iCaracter == 97) {
					
					compLA++;
				}
			}
			if (iCaracter == 83 || iCaracter == 115) {
				
				iCaracter = buffer.read();      
				if (iCaracter == 73 || iCaracter == 105) {
					
					compSI++;
				}
			}
            iCaracter = buffer.read();
        }  
		System.out.print("Hi han " + compLA + " LA" + " i " + compSI + " SI");  
	}
}