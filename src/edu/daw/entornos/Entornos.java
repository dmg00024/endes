package edu.daw.entornos;

/**
 * Clase de ejemplo que muestra funciones básicas en Java:
 * - un método sin parámetros ni valor de retorno (saludar)
 * - métodos con parámetros y retorno (sumar, doble, etc.)
 * - métodos con tipos {@code double} para cálculos numéricos
 *
 * Esta clase contiene un método {@code main} para ejecutar ejemplos de uso.
 */
public class Entornos {

    /**
     * Punto de entrada de la aplicación. Ejecuta ejemplos de uso de las funciones numéricas.
     *
     * @param args argumentos de línea de comandos (no se usan)
     */
    public static void main(String[] args) {

        // Ejemplo 0: Saludo simple
        saludar();

        // Bloque 1
        int suma = sumar(7, 8);
        System.out.println("La suma de 7 y 8 es: " + suma);

        int numero = 6;
        int dobleNumero = doble(numero);
        System.out.println("El doble de " + numero + " es: " + dobleNumero);

        double lado = 5.0;
        double area = areaCuadrado(lado);
        System.out.println("El área de un cuadrado de lado " + lado + " es: " + area);

        double celsius = 25.0;
        double fahrenheit = celsiusAFahrenheit(celsius);
        System.out.println(celsius + "°C equivalen a " + fahrenheit + "°F");

        int suma10 = sumaPrimeros10();
        System.out.println("La suma de los primeros 10 números naturales es: " + suma10);

        // Bloque 2
        System.out.println(saludoPersonalizado("Pablo"));
        System.out.println(aMayusculas("hola mundo"));
        System.out.println(unirFrases("Hola", "qué tal"));
        System.out.println("Letras: " + contarLetras("ordenador"));
        System.out.println("Contiene 'a': " + contieneA("ventana"));

        // Bloque 3
        System.out.println("Mayor: " + mayorDeDos(10, 4));
        System.out.println("Par: " + esPar(7));
        System.out.println(signoNumero(-3));
        System.out.println(calificacion(8));
        System.out.println("Puede votar: " + puedeVotar(20));

        // Bloque 4
        System.out.println("Suma 1-100: " + sumarHasta100());
        System.out.println("Factorial: " + factorial(5));
        System.out.println("Vocales: " + contarVocales("murciélago"));
        repetirMensaje("Hola", 3);
        mostrarMultiplosDeTres(20);

        // Bloque 5
        System.out.println("Número aleatorio (1-10): " + aleatorio1a10());
        System.out.println("2024 es bisiesto: " + esBisiesto(2024));
        System.out.println("Día 5: " + diaDeLaSemana(5));
        System.out.println("Tirada de dado: " + tiradaDado());
        System.out.println("Media de 5, 8, 10: " + mediaDeTres(5.0, 8.0, 10.0));
    }

    /**
     * Muestra un mensaje de saludo por consola.
     */
    public static void saludar() {
        System.out.println("¡Hola! Este es mi primer programa en Java.");
    }

    /**
     * Calcula la suma de dos números enteros.
     *
     * @param a primer número
     * @param b segundo número
     * @return la suma de {@code a} y {@code b}
     */
    public static int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Devuelve el doble de un número entero.
     *
     * @param n número a duplicar
     * @return el doble del número {@code n}
     */
    public static int doble(int n) {
        return n * 2;
    }

    /**
     * Calcula el área de un cuadrado.
     *
     * @param lado longitud del lado
     * @return área del cuadrado
     */
    public static double areaCuadrado(double lado) {
        return lado * lado;
    }

    /**
     * Convierte grados Celsius a Fahrenheit.
     *
     * @param celsius grados Celsius
     * @return grados Fahrenheit
     */
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Suma los primeros 10 números naturales.
     *
     * @return suma total
     */
    public static int sumaPrimeros10() {
        int suma = 0;
        for (int i = 1; i <= 10; i++) suma += i;
        return suma;
    }

    /**
     * Devuelve un saludo personalizado.
     *
     * @param nombre nombre del usuario
     * @return saludo con el nombre
     */
    public static String saludoPersonalizado(String nombre) {
        return "Hola " + nombre + ", bienvenido.";
    }

    /**
     * Convierte un texto a mayúsculas.
     *
     * @param texto texto original
     * @return texto en mayúsculas
     */
    public static String aMayusculas(String texto) {
        return texto.toUpperCase();
    }

    /**
     * Une dos frases en una sola.
     *
     * @param f1 primera frase
     * @param f2 segunda frase
     * @return frases unidas con espacio
     */
    public static String unirFrases(String f1, String f2) {
        return f1 + " " + f2;
    }

    /**
     * Cuenta cuántas letras tiene una palabra.
     *
     * @param palabra palabra a analizar
     * @return número de caracteres
     */
    public static int contarLetras(String palabra) {
        return palabra.length();
    }

    /**
     * Comprueba si un texto contiene la letra 'a'.
     *
     * @param texto texto a analizar
     * @return {@code true} si contiene 'a'
     */
    public static boolean contieneA(String texto) {
        return texto.contains("a");
    }

    /**
     * Devuelve el mayor de dos números.
     *
     * @param a primer número
     * @param b segundo número
     * @return el número mayor
     */
    public static int mayorDeDos(int a, int b) {
        return (a > b) ? a : b;
    }

    /**
     * Comprueba si un número es par.
     *
     * @param n número a comprobar
     * @return {@code true} si es par
     */
    public static boolean esPar(int n) {
        return n % 2 == 0;
    }

    /**
     * Indica si un número es positivo, negativo o cero.
     *
     * @param n número a analizar
     * @return texto con el estado del número
     */
    public static String signoNumero(int n) {
        if (n > 0) return "positivo";
        if (n < 0) return "negativo";
        return "cero";
    }

    /**
     * Convierte una nota numérica en calificación textual.
     *
     * @param nota valor numérico 0-10
     * @return palabra correspondiente
     */
    public static String calificacion(int nota) {
        if (nota < 5) return "Insuficiente";
        if (nota < 6) return "Suficiente";
        if (nota < 7) return "Bien";
        if (nota < 9) return "Notable";
        return "Sobresaliente";
    }

    /**
     * Comprueba si una edad permite votar.
     *
     * @param edad edad en años
     * @return {@code true} si es mayor de 18
     */
    public static boolean puedeVotar(int edad) {
        return edad >= 18;
    }

    /**
     * Suma todos los números del 1 al 100.
     *
     * @return suma total
     */
    public static int sumarHasta100() {
        int suma = 0;
        for (int i = 1; i <= 100; i++) suma += i;
        return suma;
    }

    /**
     * Calcula el factorial de un número.
     *
     * @param n número entero
     * @return factorial del número
     */
    public static int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) resultado *= i;
        return resultado;
    }

    /**
     * Cuenta cuántas vocales contiene una palabra.
     *
     * @param palabra texto a analizar
     * @return número de vocales
     */
    public static int contarVocales(String palabra) {
        int contador = 0;
        palabra = palabra.toLowerCase();
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if ("aeiou".indexOf(c) != -1) contador++;
        }
        return contador;
    }

    /**
     * Muestra un mensaje repetido N veces.
     *
     * @param mensaje texto a repetir
     * @param veces número de repeticiones
     */
    public static void repetirMensaje(String mensaje, int veces) {
        for (int i = 0; i < veces; i++) System.out.println(mensaje);
    }

    /**
     * Muestra los múltiplos de 3 hasta un número dado.
     *
     * @param limite valor máximo
     */
    public static void mostrarMultiplosDeTres(int limite) {
        for (int i = 3; i <= limite; i += 3) System.out.println(i);
    }

    // ─────────────────────────────
    // BLOQUE 5 – PARA AVANZAR
    // ─────────────────────────────

    /**
     * Genera un número aleatorio entre 1 y 10. [cite: 91]
     *
     * @return número aleatorio (int)
     */
    public static int aleatorio1a10() {
        return (int) (Math.random() * 10) + 1;
    }

    /**
     * Comprueba si un año es bisiesto. [cite: 92]
     *
     * @param anio año a comprobar
     * @return {@code true} si es bisiesto
     */
    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    /**
     * Devuelve el día de la semana según un número. [cite: 93]
     *
     * @param dia número del 1 (Lunes) al 7 (Domingo)
     * @return nombre del día o "Día inválido"
     */
    public static String diaDeLaSemana(int dia) {
        switch (dia) {
            case 1: return "Lunes";
            case 2: return "Martes";
            case 3: return "Miércoles";
            case 4: return "Jueves";
            case 5: return "Viernes";
            case 6: return "Sábado";
            case 7: return "Domingo";
            default: return "Día inválido";
        }
    }

    /**
     * Simula una tirada de dado (1-6). [cite: 94]
     *
     * @return número aleatorio entre 1 y 6
     */
    public static int tiradaDado() {
        return (int) (Math.random() * 6) + 1;
    }

    /**
     * Calcula la media de tres números. [cite: 95]
     *
     * @param a primer número
     * @param b segundo número
     * @param c tercer número
     * @return la media aritmética
     */
    public static double mediaDeTres(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }
}