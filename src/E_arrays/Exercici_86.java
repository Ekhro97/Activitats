/*
Es necessita un aplicatiu on es pugui introduir el codi postal, nom 
i la quantitat d�habitants de 20
poblacions catalanes. Finalment es demana que es digui el nom 
de la poblaci� amb m�s
habitants i el n�mero d�habitants que t�, aix� com la mitja 
d�habitants de les 20 poblacions.
 */
package E_arrays;

import java.util.Scanner;

public class Exercici_86 {
public static final int LONGITUD=3;
	
	public static void main(String[] args) {
		
		long tabla_codigo_postal[]= new long [LONGITUD];
		long tabla_numero_habitantes[]= new long [LONGITUD];
		String tabla_nombre_ciudad[]= new String [LONGITUD];
		int tabla_posiciones[]=new int [LONGITUD];
		
		String poblacion;		
		int proximo_libre=0;
		int proximo_libre1=0;
		long valor;
		long max_habitantes;
		float total=0;
		float mediana_habitantes;
		int contador;
//		int contador_mismos_hab=0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa guarda el nombre, codigo postal y el numero de habitantes de 20 poblaciones, dice que poblacion tiene mas habitantes, el numero de habitantes y la media de habitantes de las 20 poblaciones.");
		
		
		for (proximo_libre=0;proximo_libre<LONGITUD;proximo_libre++){
			
			System.out.println("Introduzca el nombre de la ciudad:");
			poblacion=teclado.next();
			teclado.nextLine();	
			tabla_nombre_ciudad[proximo_libre]=poblacion;
			
			System.out.println("Introduzca el codigo postal de la ciudad:");
			while (!teclado.hasNextInt()){
				teclado.nextLine();	
			}
			valor=teclado.nextLong();
			teclado.nextLine();
			tabla_codigo_postal[proximo_libre]=valor;
			
			System.out.println("Introduzca el numero de habitantes de la ciudad:");
			while (!teclado.hasNextInt()){
				teclado.nextLine();	
			}
			valor=teclado.nextLong();
			teclado.nextLine();
			tabla_numero_habitantes[proximo_libre]=valor;
		}
		
		max_habitantes=tabla_numero_habitantes[0];
		for (contador=1;contador<LONGITUD;contador++){					//Si hay mas de una con los  mismos habitantes, solo coge la primera.
			if (max_habitantes < tabla_numero_habitantes[contador]){		
				max_habitantes=tabla_numero_habitantes[contador];		//Guardo el numero max de habitantes.
				
			}
		}
		
		proximo_libre1=0;
		for (contador=0;contador<LONGITUD;contador++){					
			if (tabla_numero_habitantes[contador] == max_habitantes){		// De los que coincidan con max de habitantes, guardo su posicion en tabla.
				tabla_posiciones[proximo_libre1]=contador;
				proximo_libre1++;
			}
		}
		
		total = 0;
		for (contador=0;contador<LONGITUD;contador++){			//Para calcular la media.
			total= (total+tabla_numero_habitantes[contador]);
		}
		
		mediana_habitantes=total/LONGITUD;

		if (proximo_libre1 > 1){		//Si es >1, es que hay repetidos.
			System.out.println("Las poblaciones con mas habitantes entre las  20 introducidas son: ");
			for (contador=0;contador<proximo_libre1;contador++){									//Para sacar nombre y hab. de las posiciones guardadas.
				System.out.println("-" + tabla_nombre_ciudad[tabla_posiciones[contador]] + " y tiene " + tabla_numero_habitantes[tabla_posiciones[contador]] + " habitantes");
			}
		}else{
			System.out.println("La poblacion con m�s habitantes entre las 20 introducidas es: " + tabla_nombre_ciudad[tabla_posiciones[0]] + " y tiene " + tabla_numero_habitantes[tabla_posiciones[0]] + " habitantes");
		}
		
		System.out.println("La media de habitantes de las 20 ciudades es: " + mediana_habitantes);
		teclado.close();
	}
}