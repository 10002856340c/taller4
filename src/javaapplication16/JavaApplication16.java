
package javaapplication16;

import java.util.Scanner;

public class JavaApplication16 {

    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {

            System.out.println("MENU");
            System.out.println("1. OPCION 1");
            System.out.println("2. OPCION 2");
            System.out.println("3. OPCION 3");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opción:");

            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                   opcion1.jugarAjedrez();
                    break;
                case 2:
                    opcion2 calcularPromedio = new opcion2();
                 calcularPromedio.calcularPromedio();
                    break;
                case 3:
                  opcion3 contarCalcomanias = new opcion3();
                     contarCalcomanias.contarCalcomanias();
                    break;
                case 4:
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 4);

    }
    
}
