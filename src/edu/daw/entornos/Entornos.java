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

        // Bloque 1
        System.out.println("Suma: " + sumar(5, 7));
        System.out.println("Doble: " + doble(4));
        System.out.println("Área cuadrado: " + areaCuadrado(5));
        System.out.println("Celsius a Fahrenheit: " + celsiusAFahrenheit(25.0));
        System.out.println("Suma 1..10: " + sumarPrimeros10());

        // Bloque 2
        System.out.println(saludoPersonalizado("McFly"));
        System.out.println("Mayúsculas: " + aMayusculas("Doc, ¿me estás diciendo que construiste una máquina del tiempo... con un DeLorean?"));
        System.out.println("Unir frases: " + unirFrases("El valdemora y sus carencias", "Nunca se arreglo"));
        System.out.println("Cantidad de letras: " + contarLetras("entornos"));
        System.out.println("Contiene 'a': " + contieneLetraA("Entornos"));

        // Bloque 3
        System.out.println("Mayor: " + mayorDeDos(10, 3));
        System.out.println("Es par: " + esPar(8));
        System.out.println("Signo: " + signoNumero(-3));
        System.out.println("Nota 8: " + notaATexto(8));
        System.out.println("Puede votar (17): " + puedeVotar(17));

        // Bloque 4
        System.out.println("Suma 1..100: " + suma1a100());
        System.out.println("Factorial de 5: " + factorial(5));
        System.out.println("Vocales: " + contarVocales("Programación"));
        System.out.println(repetirMensaje("Palabra repetida", 3));
        System.out.println("Múltiplos de 3 hasta 20: " + multiplosDe3Hasta(20));

        // Bloque 5
        System.out.println("Aleatorio 1..10: " + aleatorio1a10());
        System.out.println("¿Es bisiesto 2028?: " + esBisiesto(2028));
        System.out.println("Día 3: " + diaSemana(3));
        System.out.println("Tirada de dado: " + tirarDado());
        System.out.println("Promedio de tres números: " + calcularPromedio3(8.5, 6.0, 9.0));
    }

    // ---------- BLOQUE 1 - Operaciones numéricas ----------

    /** Calcular la suma de dos números
     *
     * @param a
     * @param b
     * @return
     */
    public static int sumar(int a, int b) {
        return a + b;
    }

    /** Obtener el doble de un número
     *
     * @param n
     * @return
     */

     public static int doble(int n) {
        return n * 2;
    }

    /**Calcular el área de un cuadrado
     *
     * @param lado
     * @return
     */
    public static double areaCuadrado(double lado) {
        return lado * lado;
    }

    /**  Convertir grados Celsius a Fahrenheit
     *
     * @param celsius
     * @return
     */
    public static double celsiusAFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    /** Sumar los primeros 10 números naturales
     *
     * @return
     */
    public static int sumarPrimeros10() {
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma = suma + i;
        }
        return suma;
    }

    // ---------- BLOQUE 2 - Texto y cadenas ----------

    /**Mostrar un saludo personalizado
     *
     * @param nombre
     * @return
     */
    public static String saludoPersonalizado(String nombre) {
        return "Hola, " + nombre + "!";
    }

    /** Convertir un texto a mayúsculas
     *
     * @param texto
     * @return
     */

     public static String aMayusculas(String texto) {
        return texto.toUpperCase();
    }

    /** Unir dos frases en una sola cadena
     *
     * @param f1
     * @param f2
     * @return
     */
    public static String unirFrases(String f1, String f2) {
        return f1 + " " + f2;
    }

    /** Contar cuántas letras tiene una palabra
     *
     * @param palabra
     * @return
     */
    public static int contarLetras(String palabra) {
        return palabra.length();
    }

    /** Comprobar si un texto contiene la letra ‘a
     *
     * @param texto
     * @return
     */
    public static boolean contieneLetraA(String texto) {
        texto = texto.toLowerCase();
        if (texto.indexOf('a') >= 0) {
            return true;
        } else {
            return false;
        }
    }

    // ---------- BLOQUE 3 - Condicionales ----------

    /** Determinar el mayor de dos números
     *
     * @param a
     * @param b
     * @return
     */
    public static int mayorDeDos(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /** Comprobar si un número es par o impar
     *
     * @param n
     * @return
     */
    public static boolean esPar(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /** Comprobar si un número es positivo, negativo o cero
     *
     * @param n
     * @return
     */
    public static String signoNumero(int n) {
        if (n > 0) {
            return "positivo";
        } else if (n < 0) {
            return "negativo";
        } else {
            return "cero";
        }
    }

    /** Convertir una nota numérica a calificación textual
     *
     * @param nota
     * @return
     */

     public static String notaATexto(int nota) {
        if (nota < 5) {
            return "Insuficiente";
        } else if (nota == 5) {
            return "Suficiente";
        } else if (nota == 6) {
            return "Bien";
        } else if (nota == 7 || nota == 8) {
            return "Notable";
        } else {
            return "Sobresaliente";
        }
    }

    /** Comprobar si una edad permite votar (≥18)
     *
     * @param edad
     * @return
     */

 public static boolean puedeVotar(int edad) {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    // ---------- BLOQUE 4 - Bucles ----------

    /** Sumar todos los números del 1 al 100
     *
     * @return
     */
    public static int suma1a100() {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma = suma + i;
        }
        return suma;
    }

    /** Calcular el factorial de un número
     *
     * @param n
     * @return
     */
    public static long factorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }

    /**Contar cuántas vocales tiene una palabra
     *
     * @param palabra
     * @return
     */
    public static int contarVocales(String palabra) {
        palabra = palabra.toLowerCase();
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        return contador;
    }

    /** Mostrar un mensaje repetido N veces
     *
     * @param msg
     * @param n
     * @return
     */
    public static String repetirMensaje(String msg, int n) {
        String resultado = "";
        for (int i = 0; i < n; i++) {
            resultado = resultado + msg + "\n";
        }
        return resultado;
    }

    /**  Mostrar los múltiplos de 3 hasta un número dado
     *
     * @param n
     * @return
     */

     public static String multiplosDe3Hasta(int n) {
        String texto = "";
        for (int i = 3; i <= n; i = i + 3) {
            texto = texto + i + " ";
        }
        return texto;
    }

    // ---------- BLOQUE 5 - Para avanzar ----------

    /** Generar un número aleatorio entre 1 y 10
     *
     * @return
     */
    public static int aleatorio1a10() {
        int numero = (int) (Math.random() * 10) + 1;
        return numero;
    }

    /** Comprobar si un año es bisiesto
     *
     * @param year
     * @return
     */
    public static boolean esBisiesto(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    /**  Mostrar el día de la semana según un número (1–7)
     *
     * @param n
     * @return
     */
    public static String diaSemana(int n) {
        if (n == 1) return "Lunes";
        if (n == 2) return "Martes";
        if (n == 3) return "Miércoles";
        if (n == 4) return "Jueves";
        if (n == 5) return "Viernes";
        if (n == 6) return "Sábado";
        if (n == 7) return "Domingo";
        return "Número inválido";
    }

    /**  Simular una tirada de dado (1–6)
     *
     * @return
     */
    public static int tirarDado() {
        int dado = (int) (Math.random() * 6) + 1;
        return dado;
    }

    /** Calcular la media de tres números
     *
     * @param n1
     * @param n2
     * @param n3
     * @return
     */
    public static double calcularPromedio3(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
}

// Rubén Galindo Pedraza
