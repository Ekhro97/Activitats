//85.Una estació climàtica proporciona un parell de temperatures diàries (màxima i mínima) estan el
//rang permès d’aquestes temperatures entre -10 i 35. La parella final és 0,0. Determinar el
//nombre de dies, de les temperatures preses, la mitja màxima, la mitja mínima, el nombre
//d’errors (aquells dies que la temperatura màxima o mínima no esta dins el rang desitjat) i el
//percentatge d’errors respecte al total de temperatures que es tenen. Es simularà l’entrada de
//les temperatures per teclat.

package E_arrays;

import java.util.Scanner;

public class Exercici_85 {
	public static final int LLARGADA=5;
	public static void main (String[] args) {
		int proximaLliure=0;
		int index;
		
		int maxim[] = new int [LLARGADA];
		int minim[]= new int [LLARGADA];
		
		int tempMaxim;
		int tempMinim;
		int errors;
		double percentErrors;
		int contador=0;
		double mitjaMinim,mitjaMaxim;
		int sumaMinim=0,sumaMaxim=0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quina va ser la temperatura maxima el primer dia?");
		tempMaxim = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Quina va ser la temperatura minima el primer dia?");
		tempMinim = entrada.nextInt();
		entrada.nextLine();
		
		while ((proximaLliure<LLARGADA) && (tempMaxim!=0 || tempMinim!=0)) {
			maxim[proximaLliure]=tempMaxim;
			minim[proximaLliure]=tempMinim;
			
			proximaLliure++; 
			contador++;
			
			if (proximaLliure<LLARGADA){ 
				System.out.println("introdueix la maxima temperatura del dia "+(contador+1));
				tempMaxim = entrada.nextInt();
				entrada.nextLine();
				
				System.out.println("introdueix la maxima temperatura del dia "+(contador+1));
				tempMinim = entrada.nextInt();
				entrada.nextLine();
			}
		}
		
		errors = 0;
		sumaMaxim = 0;
		sumaMinim = 0;
		
		for (index=0;index<proximaLliure;index++) { 
			sumaMaxim = maxim[index] + sumaMaxim;
			sumaMinim = minim[index] + sumaMinim;
			
			if (maxim[index]>35) {
				errors++;
			} else if (maxim[index]<-10){
				errors++;
			}
			
			if (minim[index]<-10){
				errors++;
			} else if (minim[index]>35) {
				errors++;
			}
		}	
		
		if (contador!=0) {
			percentErrors=( (errors*100) / (contador*2) );
			mitjaMaxim=(sumaMaxim/contador);
			mitjaMinim=(sumaMinim/contador);
	
			System.out.println("La temperatura s'ha mesurat durant "+contador+" dies i en total s'han guardat "+contador*2+" temperatures");
			System.out.println("La temperatura mitjana de les maximes es "+mitjaMaxim+" i de les minimes "+mitjaMinim);
			System.out.println("La temperatura s'ha introduit amb errades "+errors+" vegades i aixo representa un "+percentErrors+" del total");
		} else {
			System.out.println("Error, no has introduit cap dada");
		}
		entrada.close();
	}		
}
