package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    static void mostrar(){
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        Funcion funcion1 = new Funcion();
        do {
            System.out.println("\n¿Qué quiere hacer?");
            System.out.println("1-Funcion recursiva");
            System.out.println("2-Funcion de orden computacional");
            System.out.println("3-Salir");
            opcion = teclado.nextInt();
            try {
                switch (opcion) {
                    case 1:
                        //System.out.println(funcion1.fun_recusirva(2,5));
                        System.out.println("Dime un número");
                        int numero = teclado.nextInt();
                        System.out.println("Dime otro número");
                        int numero2 = teclado.nextInt();
                        System.out.println(funcion1.fun_recursiva(numero,numero2));
                        break;
                    case 2:
                        System.out.println("Dime un número");
                        numero = teclado.nextInt();
                        System.out.println("Dime otro número");
                         numero2 = teclado.nextInt();
                        System.out.println(funcion1.fun_De_Orden_Computacional(numero,numero2));
                        break;

                    case 3:
                        System.out.println("Adios 🖐");
                        salir = true;
                        break;
                    default:
                        System.out.println("⚠⚠ ¡El número que ha insertado es incorrecto😡!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Inserte de nuevo una opcion valida");
                teclado.nextInt();
            }
        } while (!salir);
    }

}

