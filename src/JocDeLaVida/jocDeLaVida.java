package JocDeLaVida;
import java.util.Scanner;
public class jocDeLaVida {
    public static void main(String[] args) {
       
        Scanner lector = new Scanner(System.in);
        int fila;
        int columna;
        int num1;
        int num2;
        int posicio1;
        int posicio2;
        int contadorViu;
        int partida;
        
        //Modificar cel·lules
        char mort = '0';
        char vida = '*';
       
        System.out.println("Comença el joc de la vida: Quines dimensions tindra el teu poble ?");
        System.out.println("------------------------------------------------------------------");
        System.out.print("Introdueix la Mida de les files: ");
        num1= lector.nextInt();
        System.out.print("Introdueix la Mida de les columnes: ");
        num2= lector.nextInt();
       
        fila=num1 + 2;
        columna= num2 + 2;
        char taula[][] = new char[fila][columna];
        char taulaAux[][] = new char[fila][columna];
       
        //inicialitzem la taula
       
        for(fila=0;fila<num1+2;fila++){
            for(columna=0;columna<num2+2;columna++){
                taula[fila][columna] = mort;
                taulaAux[fila][columna] = mort;
            }
        }
       
        System.out.println("Tria les caselles on vols que hi hagi vida a la primera generació:(Escriu -1,-1 per acabar)");
        System.out.println("Les posicions vas des de 1,1 a " + (num1-1) + ","+(num2-1));
       
        System.out.print("Introdueix la fila: ");
        posicio1= lector.nextInt();
        System.out.print("Introdueix la columna: ");
        posicio2=lector.nextInt();
       
        while(posicio1!=-1 && posicio2!=-1){
            taula[posicio1][posicio2]= vida;
           
            System.out.print("Introdueix la fila: ");
            posicio1= lector.nextInt();
            System.out.print("Introdueix la columna: ");
            posicio2=lector.nextInt();
        }
       
        System.out.println("Primera Generació");
        System.out.println();
        
        //Mostra 1
        for(fila=1;fila<num1+1;fila++){
            for(columna=1;columna<num2+1;columna++){
                System.out.print(taula[fila][columna]);
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Vols passar a la següent generació? Escriu 0 per parar, o escriu 1 per continuar");
        
        partida = lector.nextInt();
       
        while(partida==1){
        	
        //Algorisme
        contadorViu=0;
       
        for(fila=1;fila<num1+1;fila++){
            for(columna=1;columna<num2+1;columna++){
                taulaAux[fila][columna]=taula[fila][columna];
            }
        }
       
        for(fila=1;fila<num1+1;fila++){
            for(columna=1;columna<num2+1;columna++){
            	
                if(taula[fila][columna]==vida){
                	contadorViu = 0;
                    if(taula[fila-1][columna-1]==vida){ 	//Adalt Esquerra
                        contadorViu++;
                    }
                    if(taula[fila-1][columna]==vida){ 		//Adalt
                        contadorViu++;
                    }
                    if(taula[fila-1][columna+1]==vida){ 	//Adalt Dreta
                        contadorViu++;
                    }
                    if(taula[fila][columna-1]==vida){ 		//Esquerra
                        contadorViu++;
                    }
                    if(taula[fila][columna+1]==vida){ 		//Dreta
                        contadorViu++;
                    }
                    if(taula[fila+1][columna-1]==vida){ 	//Abaix Esquerra
                        contadorViu++;
                    }
                    if(taula[fila+1][columna]==vida){ 		//Abaix
                        contadorViu++;
                    }
                    if(taula[fila+1][columna+1]==vida){ 	//Abaix Dreta
                        contadorViu++;
                    }
                    
                    //Mor o viu
                    if(contadorViu>3 || contadorViu<2){
                        taulaAux[fila][columna]=mort;
                    }
                    
                }else{
                	contadorViu = 0;
                	if(taula[fila-1][columna-1]==vida){ 	//Adalt Esquerra
                        contadorViu++;
                    }
                    if(taula[fila-1][columna]==vida){ 		//Adalt
                        contadorViu++;
                    }
                    if(taula[fila-1][columna+1]==vida){ 	//Adalt Dreta
                        contadorViu++;
                    }
                    if(taula[fila][columna-1]==vida){ 		//Esquerra
                        contadorViu++;
                    }
                    if(taula[fila][columna+1]==vida){ 		//Dreta
                        contadorViu++;
                    }
                    if(taula[fila+1][columna-1]==vida){ 	//Abaix Esquerra
                        contadorViu++;
                    }
                    if(taula[fila+1][columna]==vida){ 		//Abaix
                        contadorViu++;
                    }
                    if(taula[fila+1][columna+1]==vida){ 	//Abaix Dreta
                        contadorViu++;                   
                    }
                    
                    //Mor o viu
                    if(contadorViu==3){
                        taulaAux[fila][columna]=vida;
                    }
                }
            }
        }
        
        for(fila=1;fila<num1+1;fila++){
            for(columna=1;columna<num2+1;columna++){
                taula[fila][columna]=taulaAux[fila][columna];
            }
        }
        
        //Mostrem
        for(fila=1;fila<num1+1;fila++){
            for(columna=1;columna<num2+1;columna++){
                System.out.print(taula[fila][columna]);
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Vols passar a la següent generació? Escriu 0 per parar, o escriu 1 per continuar");
        
        partida = lector.nextInt();
        
       }
       
        lector.close();
    }
}