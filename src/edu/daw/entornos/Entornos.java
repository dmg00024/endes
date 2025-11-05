package edu.daw.entornos;


/**
 * La clase {@code Entornos} representa un programa sencillo que permite
 * al usuario introducir dos números por teclado y muestra la suma de ambos.
 * <p>
 * Este programa ejemplifica el uso básico de la clase {@link java.util.Scanner}
 * para la entrada de datos desde la consola, y la realización de una operación
 * aritmética simple.
 * </p>
 *
 * <p><strong>Ejemplo de ejecución:</strong></p>
 * <pre>
 * Introduce el primer número: 4.5
 * Introduce el segundo número: 3.2
 * La suma es: 7.7
 * </pre>
 */

import java.util.Scanner;

public class Entornos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();


        double suma = num1 + num2;


        System.out.println("La suma es: " + suma);

        sc.close();



    }
}
