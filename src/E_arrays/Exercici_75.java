//75.Donada una taula de n elements enters, buscar el valor màxim, i el lloc on es troba aquest valor,
//tenint en compte que no poden existir valors repetits. Aquests números seran introduïts pel
//teclat validant que no hi hagi duplicacions, finalitzant la sèrie amb el -999.

package E_arrays;
import java.util.Scanner;

public class Exercici_75 {
private static final int LLARGADA = 100;
    public static void main(String[] args){
       
        int index=0;
        int duplicat = 0;
        int valor=0;
        int max = 0;
        
        int [] taula = new int[LLARGADA];
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Introdueix un nombre, -999 finalitzarà la sèrie: ");
        valor = sc.nextInt();
        max = valor;
        while(valor != -999 && index<LLARGADA){
           
            duplicat = 0;
            while(valor != taula[duplicat] && duplicat<index) {
            	duplicat++;
            	
            }
            if (duplicat< index) {
                System.out.println("Repetit.");
                
            }else {
            	taula[index] = valor;
                index++;
                
            }
            System.out.print("Introdueix un nombre, -999 finalitzarà la sèrie: ");
            valor = sc.nextInt();
         
        }
        for (index = 0; index < LLARGADA; index++) {
            if(taula[index] > max) {
                max = taula[index];
                
            }
        }

        sc.close();
        System.out.print("El nombre mes gran es: " + max);
    }
}