package MasterMind;
import java.util.Scanner;

public class rmyz {
    public static void main (String [] args)  {
        rmyz programa = new rmyz();
        programa.inici();
    }
   
    private void inici() {
       
        int [] ColoresInicio = new int [4];
        int [][] ColoresJ2 = new int [4][15];
        char [][] ColoresPista = new char [4][15];
        int oportunidad = 0;
        boolean gana = false;
       
        introColorJ1(ColoresInicio);
        inicializar(ColoresPista);
        mostrar(ColoresPista);
       
        while (oportunidad != 15 && gana == false){
        introColorJ2(ColoresJ2, oportunidad);
        ComproColorJ2(ColoresInicio,ColoresJ2,ColoresPista,oportunidad);
        mostrar(ColoresPista);
        gana = comproWin(ColoresPista,oportunidad);
        oportunidad++;
        }
    }
   
    private void introColorJ1(int[] tabla) {
        // TODO Auto-generated method stub
        Scanner lector = new Scanner(System.in);
       
        int color;
        int Blanco = 1, Negro = 2, Rojo = 3, Lila = 4, Amarillo = 5, Crema = 6;
        int i = 0;
 
        while(i<4){
            System.out.println("Introduzca un color en la posicion " + (i+1) );
            System.out.println("Blanco (1), Negro (2), Rojo (3), Lila (4), Amarillo (5), Crema (6).");
            color = lector.nextInt();
            if (color <= 6 && color > 0){
            if (color == Blanco){
                tabla[i] = 1;
            }else if (color == Negro){
                tabla[i] = 2;
            }else if (color == Rojo){
                tabla[i] = 3;
            }else if (color == Lila){
                tabla[i] = 4;
            }else if (color == Amarillo){
                tabla[i] = 5;
            }else if (color == Crema){
                tabla[i] = 6;
            }
            }else{
                System.out.println("Numero fuera de rango");
                i--;
            }
            i++;
        }
    }
    private void introColorJ2(int [][] tabla,int oportunidad) {
        // TODO Auto-generated method stub
        Scanner lector = new Scanner(System.in);
       
        int color;
        int Blanco = 1, Negro = 2, Rojo = 3, Lila = 4, Amarillo = 5, Crema = 6;
        int col = 0;
 
        while(col<4){
           
            System.out.println("Intento: " + oportunidad );
            System.out.println("Introduzca un color en la posicion" + (col+1));
            System.out.println("Blanco (1), Negro (2), Rojo (3), Lila (4), Amarillo (5), Crema (6).");
            color = lector.nextInt();
            if (color <= 6 && color > 0){
            if (color == Blanco){
                tabla[col][oportunidad] = 1;
            }else if (color == Negro){
                tabla[col][oportunidad] = 2;
            }else if (color == Rojo){
                tabla[col][oportunidad] = 3;
            }else if (color == Lila){
                tabla[col][oportunidad] = 4;
            }else if (color == Amarillo){
                tabla[col][oportunidad] = 5;
            }else if (color == Crema){
                tabla[col][oportunidad] = 6;
            }
            }else{
                System.out.println("Numero fuera de rango");
                col--;
            }
            col++;
        }
    }
    private void ComproColorJ2(int [] tabla1,int [][] tabla2, char [][] tabla3, int oportunidad) {
        // TODO Auto-generated method stub
   
        char Blanca = 'V', Roja = '+', Negra = 'X';
        boolean existe = false;
       
        for (int col = 0;col<4;col++){
            if (tabla2[col][oportunidad] == tabla1[col]){
                tabla3[col][oportunidad] = Blanca;
            }else{
                for (int col2 = 0;col2 < 4; col2++) {
                    if(tabla2[col][oportunidad] == tabla1[col2]){
                        existe = true;
                    }
                }
                if(existe == true){
                    tabla3[col][oportunidad] = Roja;
                }else{
                    tabla3[col][oportunidad] = Negra;
                }
                existe = false;
            }
        }
    }
    private void mostrar(char [][] tabla) {
        // TODO Auto-generated method stub
        for (int f = 14;f>-1;f--) {
            for (int c = 0;c<4;c++) {
                System.out.print(tabla[c][f]);
            }
            System.out.println();
        }
    }
    private void inicializar(char [][] tabla) {
        // TODO Auto-generated method stub
        char ini = '-';
       
        for (int f = 0;f<15;f++) {
            for (int c = 0;c<4;c++) {
                tabla[c][f] = ini;
            }
        }
    }
    private boolean comproWin(char [][] tabla, int oportunidad) {
        // TODO Auto-generated method stub
        boolean gana = false;
       
        if (tabla[0][oportunidad] == 'V' && tabla[1][oportunidad] == 'V' && tabla[2][oportunidad] == 'V' && tabla[3][oportunidad] == 'V'){
            gana = true;
            System.out.println("Enhorabuena has ganado!");
        }else{
            gana = false;
        }
        return gana;
    }
 
}