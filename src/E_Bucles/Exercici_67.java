package E_Bucles;
import java.util.Scanner;

public class Exercici_67 {
	public static void main (String [] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int a=0;
		int i;
		int N;
		 
        System.out.print("Introdueix un nombre: ");
        N=Entrada.nextInt();
        Entrada.nextLine();
        Entrada.close();
        
        for(i = 1; i < (N + 1); i++){
        
        	if(N % i == 0){
             a++;
            }
         }
         if(a!=2){
              System.out.println("No es nombre primer");
            }else{
                System.out.println("Si es nombre primer");
         }
	}
}
