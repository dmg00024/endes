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
        saludar();

        int resultado = sumar(5, 7);
        System.out.println("La suma de 5 y 7 es: " + resultado);

        double media = calcularPromedio3(8.5, 6.0, 9.0);
        System.out.println("La media es: " + media);

        String nombre="Alba";
        String apellido="Casdo García";
        System.out.println("El nombre completo es: " + nombreCompleto(nombre, apellido));

        int sumaNumeros = sumarNumeros(10, 20);
        System.out.println("La suma de 10 y 20 es: " + sumaNumeros);

        int dobleNumero = obtenerDoble(15);
        System.out.println("El doble de 15 es: " + dobleNumero);

        int area = areaCuadrado(4);
        System.out.println("El área de un cuadrado de lado 4 es: " + area);

        double fahrenheit = celsiusAFahrenheit(25);
        System.out.println("25 grados Celsius son: " + fahrenheit + " grados Fahrenheit");

        int sumaDiez = sumarPrimerosDiezNumeros();
        System.out.println("La suma de los primeros 10 números naturales es: " + sumaDiez);


        saludoPersonalizado("Carlos");

        String textoMayusculas = convertirAMayusculas("hola mundo");
        System.out.println("Texto en mayúsculas: " + textoMayusculas);

        String  fraseUnida = unirFrases("Hola", "mundo");
        System.out.println("Frase unida: " + fraseUnida);

        String fraseUnida2 = unirFrases("¿Cómo estás?", "Espero que bien.");
        System.out.println("Frase unida: " + fraseUnida2);

        int numeroLetras = contarLetras("Programación");
        System.out.println("Número de letras en 'Programación': " + numeroLetras);

        double numeroLetras2 = contarLetras("Entornos");
        System.out.println("Número de letras en 'Entornos': " + numeroLetras2); 

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

    /**
     * Combina un nombre y un apellido en una sola cadena.
     *
     * @param nombre el nombre de la persona
     * @param apellido el apellido de la persona
     * @return una cadena que contiene el nombre completo en el formato "nombre apellido"
     *
     * Ejemplo:
     * <pre>
     * String completo = Entornos.nombreCompleto("Juan", "Pérez"); // completo == "Juan Pérez"
     * </pre>
     */
    public static String nombreCompleto(String nombre, String apellido) {
        return nombre + " " + apellido;
    }

    /**Calcular la suma de dos números
     * 2. Calcular la resta de dos números
     *1. Calcular la suma de dos números
     */
    public static int sumarNumeros(int num1, int num2) {
        return num1 + num2;
    }


/** Obtener el doble de un número
 * 2. Calcular la resta de dos números
1. Calcular la suma de dos números
 */

    public static int obtenerDoble(int numero) {
        return numero * 2;
    }

    /** Calcular el área de un cuadrado
     * @param lado el lado del cuadrado
     * @return el área del cuadrado

     */
  public static  int areaCuadrado(int lado) {
        return lado * lado;
    }

    /** Convertir grados Celsius a Fahrenheit
     * @param celsius los grados en Celsius
     *@return los grados en Fahrenheit
     */
      public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    /** sumar los 10 primeros números naturales
     * @return la suma de los primeros diez números naturales

     */
    public static int sumarPrimerosDiezNumeros() {
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += i;
        }
        return suma;
    }

    /** mostrar un saludo personalizado
     * @param nombre el nombre de la persona a saludar

     */
    public static void saludoPersonalizado(String nombre) {
        System.out.println("¡Hola, " + nombre + "! Bienvenido a Java.");
    }

    /** convertir un texto en mayusculas
     * @param texto el texto a convertir
     * @return el texto en mayúsculas

     */
    public static String convertirAMayusculas(String texto) {
        return texto.toUpperCase();
    }

    /** unir dos fases en unsa sola cadena
     * @param frase1 la primera frase
     * @param frase2 la segunda frase
     * @return la frase unida
     */
    public static String unirFrases(String frase1, String frase2) {
        return frase1 + "hola que tal " + frase2;
    }

    /** contar  cuantas letras tiene una palabra
     * @param palabra la palabra a contar
     * @return el número de letras de la palabra
     */
    public static int contarLetras(String palabra) {
        return palabra.length();
    }

    /** comprobar si un texto contiene la letra 'a'
     * @param texto el texto a comprobar
     * @return {@code true} si el texto contiene la letra 'a', {@code false} en caso contrario
     */
    public static boolean contieneLetraA(String texto) {
        return texto.toLowerCase().contains("a");
    }
}

