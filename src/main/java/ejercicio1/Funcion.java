package ejercicio1;

import java.util.Scanner;

public class Funcion {
    private int x,y;
    private double solución;
    Scanner teclado = new Scanner(System.in);

    public double fun_recursiva(int numero, int exponente){
        if (exponente == 0){
            return 1;
        }else{
            return numero * fun_recursiva(numero, exponente- 1);
        }
    }


    public double fun_De_Orden_Computacional(int numero, int exponente){
        if (exponente == 0){
            return 1;
        }else if(exponente % 2 !=0){
            return numero * fun_recursiva( numero,  (exponente- 1)/2) * fun_recursiva( numero,  (exponente- 1)/2);
        }else {
            return fun_recursiva(numero,(exponente / 2)) * fun_recursiva(numero,(exponente/ 2));
        }
    }


}
