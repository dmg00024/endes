package edu.daw.entornos;

/**
 * Clase de ejemplo que muestra funciones básicas en Java:
 * - un método sin parámetros ni valor de retorno (saludar)
 * - un método con parámetros y retorno (sumar)
 * - un método que trabaja con tipos {@code double} para calcular un promedio
 *
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

        /**
         *

        saludar();

        int resultado = sumar(5, 7);
        System.out.println("La suma de 5 y 7 es: " + resultado);

        double media = calcularPromedio3(8.5, 6.0, 9.0);
        System.out.println("La media es: " + media);
         */

        /** Doble el valor de un número entero.
         *
         * @param n número entero a doblar
         * @return el doble de {@code n}
         */
        int doble = Entornos.doble(5);
        System.out.println("El doble de 5 es: " + doble);
        /** Área de un cuadrado.
         *
         * @param lado longitud del lado del cuadrado
         * @return área del cuadrado
         */

        int area = Entornos.areaCuadrado(4);
        System.out.println("El área de un cuadrado de lado 4 es: " + area);
        /** Conversión de grados Celsius a Fahrenheit.
         *
         * @param gradosC temperatura en grados Celsius
         * @return temperatura en grados Fahrenheit
         */

        int gradosF = Entornos.gradosAFahrenheit(25);
        System.out.println("25 grados Celsius son: " + gradosF + " grados Fahrenheit");
        /** Suma de diez números enteros.
         *
         * @param a primer entero
         * @param b segundo entero
         * @param c tercer entero
         * @param d cuarto entero
         * @param e quinto entero
         * @param f sexto entero
         * @param g séptimo entero
         * @param h octavo entero
         * @param i noveno entero
         * @param j décimo entero
         * @return suma de los diez enteros
         */

        int sumaDiez = Entornos.sumaDiezEnteros(10,20,30,40,80,200,220,300,350,400);
        System.out.println("La suma de los diez enteros es: " + sumaDiez);
        /** Saludo personalizado a un usuario.
         *
         * @param nombre nombre del usuario
         * @return mensaje de saludo
         */

        String saludarUsuario = Entornos.saludarUsuario("Ana");
        System.out.println(saludarUsuario);
        /** Convierte un texto a mayúsculas.
         *
         * @param texto texto a convertir
         * @return texto en mayúsculas
         */

        String textoMayusculas = Entornos.textoMayusculas("hola mundo");
        System.out.println("Texto en mayúsculas: " + textoMayusculas);
        /** Cuenta el número de letras en un texto.
         *
         * @param texto texto a analizar
         * @return mensaje con el número de letras
         */

        String contarLetras = Entornos.contarletras("Enseñando Java a Alba");
        System.out.println(contarLetras);
        /** Comprueba si un texto contiene la letra 'a' o 'A'.
         *
         * @param texto texto a analizar
         * @return mensaje indicando si contiene la letra 'a' o 'A'
         */

        String comprobarLetraA = Entornos.comprobarletraa("Programar en Java");
        System.out.println(comprobarLetraA);
        /** Compara dos números enteros y determina cuál es mayor.
         *
         * @param a primer número entero
         * @param b segundo número entero
         * @return mensaje indicando cuál número es mayor o si son iguales
         */

        String mayorDeDos = Entornos.mayorDeDos(15, 20);
        System.out.println(mayorDeDos);
        /** Determina si un número es par o impar.
         *
         * @param n número entero a evaluar
         * @return mensaje indicando si el número es par o impar
         */

        String numeroPar = Entornos.numeroPar(5);
        System.out.println(numeroPar);
    }

    /**
     * Muestra un mensaje de saludo por consola.
     *
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
    /** Doble el valor de un número entero.
     *
     * @param n número entero a doblar
     * @return el doble de {@code n}
     */
    public static int doble(int n) { return n * 2;}
    /** Área de un cuadrado dado el lado.
     *
     * @param lado longitud del lado del cuadrado
     * @return área del cuadrado
     */
    public static int areaCuadrado(int lado) { return lado * lado; }
    /** Conversión de grados Celsius a Fahrenheit.
     *
     * @param gradosC temperatura en grados Celsius
     * @return temperatura en grados Fahrenheit
     */

    public static int gradosAFahrenheit(int gradosC) { return (gradosC * 9/5) + 32; }
    /** Suma de diez números enteros.
     *
     * @param a primer entero
     * @param b segundo entero
     * @param c tercer entero
     * @param d cuarto entero
     * @param e quinto entero
     * @param f sexto entero
     * @param g séptimo entero
     * @param h octavo entero
     * @param i noveno entero
     * @param j décimo entero
     * @return suma de los diez enteros
     */

    public static int sumaDiezEnteros(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {
        return a + b + c + d + e + f + g + h + i + j;
    }
    /** Saludo personalizado a un usuario.
     *
     * @param nombre nombre del usuario
     * @return mensaje de saludo
     */

    public static String saludarUsuario(String nombre) {
        return ("¡Hola, " + nombre + "! Bienvenido al programa.");
    }
    /** Convierte un texto a mayúsculas.
     *
     * @param texto texto a convertir
     * @return texto en mayúsculas
     */
    public static String textoMayusculas(String texto) {
        return(texto.toUpperCase());
    }
    /** Cuenta el número de letras en un texto.
     *
     * @param texto texto a analizar
     * @return mensaje con el número de letras
     */
    public static String contarletras(String texto) {
        return("El texto tiene " + texto.length() + " letras.");
    }
    /** Comprueba si un texto contiene la letra 'a' o 'A'.
     *
     * @param texto texto a analizar
     * @return mensaje indicando si contiene la letra 'a' o 'A'
     */
    public static String comprobarletraa(String texto) {
        if (texto.contains("a") || texto.contains("A")) {
            return("El texto contiene la letra 'a'.");
        } else {
            return("El texto no contiene la letra 'a'.");
        }
    }
    /** Compara dos números enteros y determina cuál es mayor.
     *
     * @param a primer número entero
     * @param b segundo número entero
     * @return mensaje indicando cuál número es mayor o si son iguales
     */
    public static String mayorDeDos(int a, int b) {
        if (a > b) {
            return (a + " es mayor que " + b);
        } else if (b > a) {
            return (b + " es mayor que " + a);
        } else {
            return ("Ambos números son iguales.");
        }
    }
    /** Determina si un número es par o impar.
     *
     * @param n número entero a evaluar
     * @return mensaje indicando si el número es par o impar
     */
    public static String numeroPar(int n) {
        if (n % 2 ==  0) {
            return (n + "es un numero par.");
        } else {
            return (n + " es un numero impar.");
        }
    }
    // Fin de la practica 1 de entornos
}
