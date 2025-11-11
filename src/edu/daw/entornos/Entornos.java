package edu.daw.entornos;

import  java.util.Scanner;

/**
 * Clase de ejemplo que muestra funciones básicas en Java:
 * - un método sin parámetros ni valor de retorno (saludar)
 * - un método con parámetros y retorno (sumar)
 * - un método que trabaja con tipos {@code double} para calcular un promedio
 * Esta clase contiene un método {@code main} para ejecutar ejemplos de uso.
 */
public class Entornos {

    /**
     * Punto de entrada de la aplicación. Ejecuta ejemplos de uso de los métodos
     * {@link #saludar()}, {@link #sumar(int, int)} y {@link #calcularPromedio3(double, double, double)}.
     *
     * @param args argumentos de línea de comandos (no se usan)
     */
    public static void main(String[] args) {

        // Crear el objeto Scanner para leer datos desde la consola

        Scanner scanner = new Scanner(System.in);

        //Funciones profesor.

        saludar();

        int resultado = sumar(5, 7);
        System.out.println("La suma de 5 y 7 es: " + resultado);

        double media = calcularPromedio3(8.5, 6.0, 9.0);
        System.out.println("La media es: " + media);

        //Funciones alumno.

        int doble_numero = ObtenerDoble(7);
        System.out.println("El doble de 7 es: " + doble_numero);

        int area = AreaCuadrado(3);
        System.out.println("El área del cuadrado de lado 3 es: " + area);

        String saludo = SaludoPersonalizado("Daniel");
        System.out.println(saludo);

        boolean esPar = EsPar(10);
        if (esPar) {
            System.out.println("El número 10 es par.");
        } else {
            System.out.println("El número 10 es impar.");
        }

        boolean impar = esImpar(7);
        if (impar) {
            System.out.println("El número 7 es impar.");
        } else {
            System.out.println("El número 7 es par.");
        }

        String Factorial = calcularFactorial(3);
        System.out.println(Factorial);

        // Solicitar el radio al usuario

        System.out.print("Introduce el radio del círculo: ");
        double radio = scanner.nextDouble();

        double areaCirculo = calcularAreaCirculo(radio);

        System.out.printf("El área del círculo con radio %.2f es %.2f\n", radio, areaCirculo);

        // Solicitar números a sumar al usuario

        System.out.print("Introduce el primero número: ");
        double x = scanner.nextDouble();
        System.out.print("Introduce el segundo numero: ");
        double y = scanner.nextDouble();
        double SumaDeDos =  CalculoSuma(x, y);
        System.out.println("La suma de " + x + " y " + y + " es igual a: " + SumaDeDos);

        //Solicitar el número al usuario a partir del cual se sumaran los siguientes
        System.out.print("Introduce el número que quieras sumar : ");
        int num = scanner.nextInt();

        //Llamamos a la función.

        int sumaconsecutiva = Sumar10Siguientes(num);

        //Devlvemos la suma al usuario.

        System.out.println("La suma de " + num + " y sus nueve consecutivos números es: " + sumaconsecutiva);

        //Solicitar al usuario los números a traves de los cuales obtendremos el mayor.

        System.out.print("Introduce el primero número a comparar: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo numero a comparar: ");
        int num2 = scanner.nextInt();

        //Llamamos a la función.

        int mayor = determinarMayor(num1, num2);

        //Devolvemos el mayor al usuario.

        System.out.println("EL mayor de los números elegidos es: " + mayor);

        //Solicitar al usuario su edad en años

        System.out.print("Indique su edad en años: ");
        int edad = scanner.nextInt();

        //Llamamos a la función.
        boolean voto = puedeVotar(edad);

        //Devolvemos al usuario si puede votar o no

        if (voto) {
            System.out.println("El usuario es mayor, por lo tanto, puede votar.");
        } else {
            System.out.println("El usuario no es mayor de edad, por consecuencia, no puede votar.");

        }
        // Cerrar el scanner
        scanner.close();



    }

    /**
     * Muestra un mensaje de saludo por consola.
     * Uso típico:
     * <pre>
     * Entornos.saludar();
     * </pre>
     *
     * Este método no recibe parámetros y no devuelve ningún valor.
     */
    public static void saludar() {
        System.out.println("¡Hola! Este es mi primer programa en Java.");
    }

    /**
     * Calcula la suma de dos enteros.
     *
     * @param a primer sumando
     * @param b segundo sumando
     * @return la suma de {@code a} y {@code b}
     *
     * Ejemplo:
     * <pre>
     * int s = Entornos.sumar(3, 4); // s == 7
     * </pre>
     */
    public static int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Calcula el promedio aritmético de tres números reales.
     *
     * @param n1 primer número
     * @param n2 segundo número
     * @param n3 tercer número
     * @return el promedio {@code (n1 + n2 + n3) / 3}
     *
     * Nota: Si alguno de los valores es {@code Double.NaN}, el resultado será {@code NaN}.
     */
    public static double calcularPromedio3(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    /**
     * Calcula el doble de un número real
     * @param x es el número del cual obtendremos el doble
     * @return el doble del número seleccionado
     * */

    public static int ObtenerDoble(int x) { return x * 2 ;}

    /**
     * Calcula el area de un cuadrado
     * @param l es la longitud del lado del cuadrado
     * @return el cuadrado del lado
     * */

    public static int AreaCuadrado(int l) { return l * l ;}

    /**
     * Mostrar un saludo personalizado
     * @param nombre es el nombre de la persona a saludar
     * @return un saludo dirigido al nombre seleccionado
     */
    public static String SaludoPersonalizado(String nombre) { return "Hola " + nombre + ", bienvenido a mi programa." ;}

    /**
     * Comprobar si un número es par
     * @param n es el número a comprobar
     * @return {@code true} si el número es par, {@code false} si es impar
     */
    public static boolean EsPar(int n) { return n % 2 == 0 ;}

    /**
     * Comprobar si un número es impar
     * @param n es el número a comprobar
     * @return {@code true} si el número es impar, {@code false} si es par
     */
    public static boolean esImpar(int n) { return n % 2 != 0 ;}

    /**
     * Calcula el factorial de un número entero no negativo.
     * @param n número del cual se desea calcular el factorial
     * @return una cadena con el resultado del factorial o un mensaje de error si el número es negativo
     */

    public static String calcularFactorial(int n) {
            if (n < 0) {
                return "El factorial no está definido para números negativos.";
            }
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            return "El factorial de " + n + " es: " + factorial;
    }

    /**
     * Calcula el área de un círculo dado su radio.
     * @param radio el radio del círculo
     * @return el área calculada usando la fórmula {@code PI * radio^2}
     */

    public static double calcularAreaCirculo(double radio) {
            return Math.PI * Math.pow(radio, 2);
    }

    /**
     * Calcular la suma de dos numeros
     * @param x es el primer número a sumar
     * @param y es el segundo número a sumar
     * @return la suma de {@code x} y {@code y}
     */
    public static double CalculoSuma(double x, double y) {
        return x + y;
    }

    /**
     * Calcula la suma de los 10 números enteros consecutivos comenzando desde el número dado.
     * @param num El número entero desde el cual comienza la suma.
     * @return La suma de los 10 números consecutivos empezando desde {@code num}.
     */

    public static int Sumar10Siguientes (int num) {
        int suma = 0;
        for (int i = 0; i < 10; i++) {
            suma += num + i;
        }
        return suma;
    }

    /**
     * Determina cuál de dos números es mayor
     * @param num1 Primer número
     * @param num2 Segundo número
     * @return El mayor de los dos números (o cualquiera si son iguales)
     */
    public static int determinarMayor(int num1, int num2) {
        // Sí son iguales, devuelve cualquiera
        return Math.max(num1, num2);
    }

    /**
     * Comprueba si una persona puede votar según su edad
     * @param edad Edad de la persona
     * @return true si puede votar (edad >= 18), false en caso contrario
     */
    public static boolean puedeVotar(int edad) {
        return edad >= 18;
    }
}
