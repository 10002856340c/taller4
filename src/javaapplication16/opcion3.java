/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class opcion3 {
    public void contarCalcomanias() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de autos que entran a la ciudad: ");
        int n = scanner.nextInt();

        int amarilla = 0, rosa = 0, roja = 0, verde = 0, azul = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese el último dígito de la placa del automóvil " + i + ": ");
            int ultimoDigito = scanner.nextInt();

            switch (ultimoDigito) {
                case 1:
                case 2:
                    amarilla++;
                    break;
                case 3:
                case 4:
                    rosa++;
                    break;
                case 5:
                case 6:
                    roja++;
                    break;
                case 7:
                case 8:
                    verde++;
                    break;
                case 9:
                case 0:
                    azul++;
                    break;
            }
        }

        System.out.println("Cantidad de autos con calcomanía amarilla: " + amarilla);
        System.out.println("Cantidad de autos con calcomanía rosa: " + rosa);
        System.out.println("Cantidad de autos con calcomanía roja: " + roja);
        System.out.println("Cantidad de autos con calcomanía verde: " + verde);
        System.out.println("Cantidad de autos con calcomanía azul: " + azul);
    }
}
