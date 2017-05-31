package E_Bucles;
import java.util.Scanner;

public class Exercici_66 {

    public static void main(String[] args) {
        
        int valor;
        int i;
        Scanner Entrada = new Scanner(System.in);
       
            System.out.print("Introdueix un nombre del que desitges saber els divisors: ");
            valor = Entrada.nextInt();
            Entrada.close();
           
            for(i = 1;i <= valor/2;i++){
                if (valor % i == 0) {
                    System.out.println("El valor " + i + " es divisor de " + valor + ".");
                }
            }
            System.out.println("El valor " + valor + " es divisor de " + valor + ".");
    }
}

