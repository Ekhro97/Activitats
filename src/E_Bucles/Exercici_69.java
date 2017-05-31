package E_Bucles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercici_69 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

		int lletra;
		int chars = 0;
		int Paraules = 0;
		int Linies = 0;
		
        System.out.print("Introdueix el text: ");    
		lletra = (char) buffer.read();
		
		while(lletra != 47) {
				
			if (lletra != 32 && lletra != 42) {
				
				chars++;
			} else if (lletra == 32) {
				
				Paraules++;
			} else if (lletra == 42) {
				
				Linies++;
			}
			lletra = (char) buffer.read();
        }
		System.out.print("Caràcters: " + chars + "  Paraules: " + Paraules + "  Línies: " + Linies);
	}
}