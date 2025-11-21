package edu.daw.entornos;

/**
 * Clase que contiene diferentes métodos de ejemplo
 * para realizar operaciones numéricas y de manejo de cadenas.
 * Forma parte de ejercicios de aprendizaje en entornos de desarrollo.
 */
public class Entornos {

    /**
     * Método principal que ejecuta los ejemplos del programa.
     *
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {

        // Variables de los ejercicios numéricos
        int a = 2;
        int b = 6;
        int c = 2;
        int lado1 = 32;
        int lado2 = 20;
        int celsius = 73;
        int far = 32;
        int sumaen = 1+2+3+4+5+6+7+8+9+10;

        // Variables para los ejercicios de texto
        String nombre = "Carlos";
        String texto = "hola mundo";
        String frase1 = "Hola";
        String frase2 = "mundo";
        String palabra = "programacion";
        String textoConA = "computadora";

        // Resultados de los métodos numéricos
        int ressumar = sumar(a, b);
        int resdoble = doble(a, c);
        int resarea = area(lado1, lado2);
        int resgrados = grados(celsius, far);
        int resentero = enteros(sumaen);

        // Resultados de los métodos de texto
        String ressaludo = saludo(nombre);
        String resmayus = mayusculas(texto);
        String resur = unir(frase1, frase2);
        int rescontar = contarLetras(palabra);
        boolean rescontiene = contieneA(textoConA);

        // Salidas por pantalla con separadores
        System.out.println("----------- BLOQUE 1: CÁLCULOS NUMÉRICOS -----------");
        System.out.println("El resultado de la suma es: " + ressumar);
        System.out.println("El resultado del doble es: " + resdoble);
        System.out.println("El resultado del área es: " + resarea);
        System.out.println("Los grados en Fahrenheit son: " + resgrados);
        System.out.println("La suma de los 10 primeros números enteros es: " + resentero);

        System.out.println("\n----------- BLOQUE 2: TEXTO Y CADENAS -----------");
        System.out.println("Saludo personalizado: " + ressaludo);
        System.out.println("Texto en mayúsculas: " + resmayus);
        System.out.println("Frases unidas: " + resur);
        System.out.println("La palabra tiene " + rescontar + " letras.");
        System.out.println("¿El texto contiene la letra 'a'? " + rescontiene);
    }

    /**
     * Calcula la suma de dos números enteros.
     *
     * @param a primer número
     * @param b segundo número
     * @return suma de a y b
     */
    public static int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Obtiene el doble de un número multiplicando dos valores.
     *
     * @param a número base
     * @param c factor multiplicador
     * @return resultado de a * c
     */
    public static int doble(int a, int c) {
        return a * c;
    }

    /**
     * Calcula el área de un rectángulo a partir de sus lados.
     *
     * @param lado1 longitud del primer lado
     * @param lado2 longitud del segundo lado
     * @return área (lado1 * lado2)
     */
    public static int area(int lado1, int lado2) {
        return lado1 * lado2;
    }

    /**
     * Convierte grados Celsius a Fahrenheit.
     * (Actualmente suma celsius + far porque así está planteado el ejercicio.)
     *
     * @param celsius valor en grados Celsius
     * @param far ajuste fijo para Fahrenheit
     * @return valor convertido a Fahrenheit
     */
    public static int grados(int celsius, int far) {
        return celsius + far;
    }

    /**
     * Devuelve la suma de los primeros 10 números naturales
     * (ya calculados previamente y pasados como parámetro).
     *
     * @param sumaen valor ya sumado externamente
     * @return sumaen sin modificaciones
     */
    public static int enteros(int sumaen) {
        return sumaen;
    }

    /**
     * Genera un saludo personalizado para un nombre.
     *
     * @param nombre nombre de la persona
     * @return una frase de saludo
     */
    public static String saludo(String nombre) {
        return "Hola " + nombre + ", ¡bienvenido!";
    }

    /**
     * Convierte un texto a mayúsculas.
     *
     * @param texto cadena a convertir
     * @return texto convertido a mayúsculas
     */
    public static String mayusculas(String texto) {
        return texto.toUpperCase();
    }

    /**
     * Une dos frases separadas por un espacio.
     *
     * @param frase1 primera frase
     * @param frase2 segunda frase
     * @return combinación de ambas frases
     */
    public static String unir(String frase1, String frase2) {
        return frase1 + " " + frase2;
    }

    /**
     * Cuenta cuántas letras tiene una palabra.
     *
     * @param palabra cadena que se quiere analizar
     * @return número de caracteres de la palabra
     */
    public static int contarLetras(String palabra) {
        return palabra.length();
    }

    /**
     * Comprueba si un texto contiene la letra 'a'.
     *
     * @param texto cadena a analizar
     * @return true si contiene 'a', false si no
     */
    public static boolean contieneA(String texto) {
        return texto.contains("a");
    }
}
