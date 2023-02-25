/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

import java.util.Scanner;

import java.util.Scanner;

public class opcion1 {

    public static void jugarAjedrez() {
        int[][] tablero = new int[8][8];
        int fila;
        int columna;
        Scanner sc = new Scanner(System.in);

        // Dibujar el tablero de ajedrez
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("W ");
                } else {
                    System.out.print("B ");
                }
            }
            System.out.println();
        }

        // Obtener la ubicación del usuario
        System.out.print("Ingrese la fila del alfil (0-7): ");
        fila = sc.nextInt();
        System.out.print("Ingrese la columna del alfil (0-7): ");
        columna = sc.nextInt();

        // Imprimir el recorrido del alfil
        System.out.println("Recorrido del alfil:");
        int i = fila;
        int j = columna;
        while (i >= 0 && i < 8 && j >= 0 && j < 8) {
            System.out.print("(" + i + ", " + j + ") ");
            i--;
            j--;
        }
        i = fila + 1;
        j = columna + 1;
        while (i >= 0 && i < 8 && j >= 0 && j < 8) {
            System.out.print("(" + i + ", " + j + ") ");
            i++;
            j++;
        }
        i = fila - 1;
        j = columna + 1;
        while (i >= 0 && i < 8 && j >= 0 && j < 8) {
            System.out.print("(" + i + ", " + j + ") ");
            i--;
            j++;
        }
        i = fila + 1;
        j = columna - 1;
        while (i >= 0 && i < 8 && j >= 0 && j < 8) {
            System.out.print("(" + i + ", " + j + ") ");
            i++;
            j--;
        }

        // Imprimir el recorrido de la torre
        System.out.println("\nRecorrido de la torre:");
        for (i = 0; i < 8; i++) {
            if (i != fila) {
                System.out.print("(" + i + ", " + columna + ") ");
            }
        }
        for (j = 0; j < 8; j++) {
            if (j != columna) {
                System.out.print("(" + fila + ", " + j + ") ");
            }
        }

        sc.close();
    }
}
