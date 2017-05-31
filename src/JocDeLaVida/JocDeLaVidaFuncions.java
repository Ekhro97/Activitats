package JocDeLaVida;
import java.util.Scanner;
public class JocDeLaVidaFuncions {
	private static char VIDA = '*';
	private static char MORT = '0';
	public static void main (String[] args) {
		
		JocDeLaVidaFuncions programa = new JocDeLaVidaFuncions();
		programa.inici();
	}
	public void inici() {
		int tamany;
		int continuar;
		
		//Demanar tamany del poble
		tamany = demanarTamany();
		
		//Crear poble
		char[][] taulell = new char[tamany+2][tamany+2];
		char[][] taulellAux = new char[tamany+2][tamany+2];

		CrearPoble(taulell, tamany);
		
		//Primera generacio
		DemanarPrimeraGeneracio(taulell, tamany);
		
		//Mostrem generacio
		MostraGrid(taulell, tamany);
		
		continuar = volsMesGeneracions();
		
		while (continuar == 1) {
			generarNovaGeneracio(taulell, taulellAux, tamany);
			MostraGrid(taulell, tamany);
			continuar = volsMesGeneracions();
		}
		
	}
	private int demanarTamany() {
		int tamany;
		
		Scanner Entrada = new Scanner(System.in);
		
		System.out.println("Comença el joc de la VIDA: Quines dimensions tindra el teu poble ?");
		System.out.println("------------------------------------------------------------------");
		
		System.out.print("Introdueix la Mida: ");
        tamany = Entrada.nextInt();
        Entrada.nextLine();
        
		return tamany;
	}
	private void CrearPoble(char[][] taulell, int tamany) {
		int fila;
		int columna;
				
		for(fila=0;fila<tamany+2;fila++){
            for(columna=0;columna<tamany+2;columna++){
            	taulell[fila][columna] = MORT;
            }
        }
	}
	private void DemanarPrimeraGeneracio(char[][] taulell, int tamany) {
		int posicio1;
		int posicio2;
				
		Scanner Entrada = new Scanner(System.in);
		
		System.out.println("Tria les caselles on vols que hi hagi VIDA a la primera generació:(Escriu -1,-1 per acabar)");
        System.out.println("Les posicions vas des de 1,1 a " + (tamany-1) + ","+(tamany-1));
       
        System.out.print("Introdueix la fila: ");
        posicio1= Entrada.nextInt();
        Entrada.nextLine();
        System.out.print("Introdueix la columna: ");
        posicio2=Entrada.nextInt();
        Entrada.nextLine();
       
        while(posicio1!=-1 && posicio2!=-1){
            taulell[posicio1][posicio2]= VIDA;
           
            System.out.print("Introdueix la fila: ");
            posicio1= Entrada.nextInt();
            Entrada.nextLine();

            System.out.print("Introdueix la columna: ");
            posicio2=Entrada.nextInt();
            Entrada.nextLine();

        }
	}
	private void MostraGrid(char[][] taulell, int tamany) {
		int fila;
		int columna;
		
		System.out.println("Generacio: ");
        System.out.println();
        
        //Mostra 1
        for(fila=1;fila<tamany+1;fila++){
            for(columna=1;columna<tamany+1;columna++){
                System.out.print(taulell[fila][columna]);
            }
            System.out.println();
        }
	}
	private int volsMesGeneracions() {
		int continuar;
		
		Scanner Entrada = new Scanner(System.in);
		
		System.out.println();
        System.out.println("Vols passar a la següent generació? Escriu 0 per parar, o escriu 1 per continuar");
        
        continuar = Entrada.nextInt();
        Entrada.nextLine();
        
		return continuar;
	}
	private void generarNovaGeneracio(char[][] taulell, char[][] taulellAux, int tamany) {
		int contadorViu;
		int fila;
		int columna;
		
		 contadorViu=0;
	       
	        for(fila=1;fila<tamany+1;fila++){
	            for(columna=1;columna<tamany+1;columna++){
	                taulellAux[fila][columna]=taulell[fila][columna];
	            }
	        }
	       
	        for(fila=1;fila<tamany+1;fila++){
	            for(columna=1;columna<tamany+1;columna++){
	            	
	            	contadorViu = 0;
	                if(taulell[fila-1][columna-1]==VIDA){ 	//Adalt Esquerra
	                    contadorViu++;
	                }
	                if(taulell[fila-1][columna]==VIDA){ 	//Adalt
	                    contadorViu++;
	                }
	                if(taulell[fila-1][columna+1]==VIDA){ 	//Adalt Dreta
	                    contadorViu++;
	                }
	                if(taulell[fila][columna-1]==VIDA){ 	//Esquerra
	                    contadorViu++;
	                }
	                if(taulell[fila][columna+1]==VIDA){ 	//Dreta
	                    contadorViu++;
	                }
	                if(taulell[fila+1][columna-1]==VIDA){ 	//Abaix Esquerra
	                    contadorViu++;
	                }
	                if(taulell[fila+1][columna]==VIDA){ 	//Abaix
	                    contadorViu++;
	                }
	                if(taulell[fila+1][columna+1]==VIDA){ 	//Abaix Dreta
	                    contadorViu++;
	                }
	                
	                //Mor o viu
	                if(contadorViu>3 || contadorViu<2){
	                    taulellAux[fila][columna]=MORT;
	                }else if(contadorViu==3){
	                    taulellAux[fila][columna]=VIDA;
	                }
	                
	            }
	        }
        
        for(fila=1;fila<tamany+1;fila++){
            for(columna=1;columna<tamany+1;columna++){
                taulell[fila][columna]=taulellAux[fila][columna];
            }
        }
	}
}