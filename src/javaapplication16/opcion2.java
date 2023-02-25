
package javaapplication16;

import java.util.Scanner;


public class opcion2 {
    public void calcularPromedio() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de calificaciones: ");
        int n = scanner.nextInt();

        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese la calificación " + i + ": ");
            double calificacion = scanner.nextDouble();
            sum += calificacion;
        }

        double promedio = sum / n;
        System.out.println("El promedio es: " + promedio);
    }
}
