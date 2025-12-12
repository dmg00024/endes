package edu.daw.entornos;

/**
 * Práctica 1 - Entornos de Desarrollo 1º DAW
 * @author Sebastián Manrique
 */
public class Entornos {

    public static void main(String[] args) {
        saludar();
        int resultado = sumar(5, 7);
        System.out.println("La suma de 5 y 7 es: " + resultado);

        double media = calcularPromedio3(8.5, 6.0, 9.0);
        System.out.println("La media es: " + media);

        System.out.println("\n--- Mis funciones de la práctica ---");

        System.out.println("Multiplicación 7×8 = " + multiplicar(7,8));
        System.out.println("¿15 es par? " + esNumeroPar(15));
        System.out.println("Factorial de 5 = " + calcularFactorial(5));
        System.out.println("Texto invertido: " + invertirTexto("Hola mundo"));
        System.out.println("Mayor entre 45 y 23 = " + obtenerMayor(45,23));
        System.out.println("Área círculo radio 5 = " + calcularAreaCirculo(5.0));

        System.out.println("Tabla del 3:");
        mostrarTablaMultiplicar(3);

        int[] nums = {5,12,3,45,2,18};
        System.out.println("Suma del array = " + sumarArray(nums));

        System.out.println("¿'reconocer' es palíndromo? " + esPalindromo("reconocer"));
        System.out.println("25°C son " + celsiusAFahrenheit(25.0) + "°F");

        contarVocales("Entornos de Desarrollo");

        System.out.println("2 elevado a 8 = " + calcularPotencia(2,8));
    }

    // Métodos originales (NO TOCAR)
    public static void saludar() {
        System.out.println("¡Hola! Este es mi primer programa en Java.");
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static double calcularPromedio3(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3.0;
    }

    // ================= MIS 12 MÉTODOS NUEVOS =================

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static boolean esNumeroPar(int num) {
        return num % 2 == 0;
    }

    public static long calcularFactorial(int n) {
        long fact = 1;
        for(int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static String invertirTexto(String s) {
        StringBuilder rev = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--) rev.append(s.charAt(i));
        return rev.toString();
    }

    public static int obtenerMayor(int x, int y) {
        return Math.max(x, y);
    }

    public static double calcularAreaCirculo(double r) {
        return Math.PI * r * r;
    }

    public static void mostrarTablaMultiplicar(int n) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " × " + i + " = " + (n * i));
        }
    }

    public static int sumarArray(int[] arr) {
        int total = 0;
        for(int num : arr) total += num;
        return total;
    }

    public static boolean esPalindromo(String pal) {
        return pal.equals(invertirTexto(pal));
    }

    public static double celsiusAFahrenheit(double c) {
        return c * 9/5 + 32;
    }

    public static void contarVocales(String texto) {
        int cont = 0;
        texto = texto.toLowerCase();
        for(int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if("aeiouáéíóú".indexOf(letra) != -1) cont++;
        }
        System.out.println("El texto \"" + texto + "\" tiene " + cont + " vocales");
    }

    public static int calcularPotencia(int base, int exp) {
        int res = 1;
        for(int i = 0; i < exp; i++) res *= base;
        return res;
    }
}