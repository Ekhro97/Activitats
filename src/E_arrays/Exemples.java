package E_arrays;
import java.util.Scanner;

public class Exemples {
	private static  int LLARGADA = 10;
	private static  int FILAS = 5;
	private static  int COLUMNAS = 7;
	public static void main (String [] args) {
	
		Scanner Entrada = new Scanner(System.in);
		
		int index;
		int[] taula= new int[LLARGADA];	     
		 
		 
	//	-----Recorregut total:-----
		 
		  for(index = 0; index < LLARGADA; index++) {
			  
		      taula[index]=0;
		  }
		 
		 
	//	-----posar valors de manera ordenada:-----
		
		int proximaLliure = 0;
		int valor;
		
		valor = Entrada.nextInt();
		
		while ((valor != 0) && (proximaLliure < LLARGADA)){
			
		  taula[proximaLliure]=valor;
		  proximaLliure++;
		  valor = Entrada.nextInt();
		}
		 
		 
	//	-----Recorregut total taula logica:-----
		
		int proximaLliure2 = 0;
		int valor2;
		
		valor2 = Entrada.nextInt();
		
		for(index=0; index < proximaLliure2; index++){
			
		  taula[proximaLliure] = valor2;
		  proximaLliure2++;
		  valor = Entrada.nextInt();
		}
		 
		 
	//	-----Cerca-----
		
		int valorAbuscar = Entrada.nextInt();
		int indexB = 0;
		
		while((taula[indexB] != valorAbuscar) && (indexB < proximaLliure)){
		  indexB++;
		}
		
		if(indexB < proximaLliure){
			
		  System.out.println("s'ha trobat");
		}else{
			
			System.out.println("no s´ha trobat");
		}
		
		Entrada.close();
		
		//----Recorregut total array 2 dimenions
		
		int[][] taula2d = new int[LLARGADA][];	
		
		int fil;
		int col;
		
		for (fil = 0; fil < FILAS; fil++) {
			for (col = 0; col < COLUMNAS; col++) {
				
				taula2d[fil][col] = 024;
			}	
				taula2d[fil][col] = 024;
		}
	}
}
