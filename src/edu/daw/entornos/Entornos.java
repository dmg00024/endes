package edu.daw.entornos;

/**
 * Clase de ejemplo que muestra funciones básicas en Java:
 * - un método sin parámetros ni valor de retorno (saludar)
 * - un método con parámetros y retorno (sumar)
 * - un método que trabaja con tipos {@code double} para calcular un promedio

 * Esta clase contiene un método {@code main} para ejecutar ejemplos de uso.
 */
public abstract class Entornos {

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

        /* Ejercicios adicionales */

        int doble = multiplicar(5, 2);
        System.out.println("El doble del numero  es: " + doble);
        /* Ejercicio 2: Calcular el área de un objeto rectangular */

        int areaobjeto = area(5, 20);
        System.out.println("El área del objeto es: " + areaobjeto);
        /* Ejercicio 3: Convertir una temperatura de Celsius a Fahrenheit */

        double calulotemperatura = calcularTemperatura(30, 1.8);
        System.out.println("La calulo de la temperatura es: " + calulotemperatura);

        /* Ejercicio 4: Convertir un texto a mayúsculas */

        String textoMayusculas = "hola como estas".toUpperCase();
        System.out.println("El texto en mayusculas es: " + textoMayusculas);

        /* Ejercicio 5: Unir dos textos */

        String unirTexto = "adios" + " " + "Hasta luego";
        System.out.println("El texto unido es: " + unirTexto);

        /* Ejercicio 6: Contar el número de caracteres en un texto */
        int contadorDeCaracteres = "Hola como estais".length();
        System.out.println("El numero de caracteres es: " + contadorDeCaracteres);

        /* Ejercicio 7: Comprobar si un texto contiene la letra 'a' */
        String comprobarletraA = "manzana";
        if (comprobarletraA.contains("a")||comprobarletraA.contains("A")) {
            System.out.println("El texto contiene la letra 'a'");
        } else {
            System.out.println("El texto no contiene la letra 'A'");
        }

        /* Ejercicio 8: Comprobar si un año es bisiesto */
        int anio = 2020;
        boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        if (esBisiesto) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");}

        /* Ejercicio 9: Obtener el día de la semana a partir de un número */
        int dia = 3;
        String nombreDia;
        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Día inválido"; }


        /* Ejercicio 10: Calcular el factorial de un número */
        System.out.println("El día de la semana es: " + nombreDia);
        int factorialdeunnumero = 5;
        int factorial = 1;
        for (int i = 1; i <= factorialdeunnumero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + factorialdeunnumero + " es: " + factorial);


    }

    /*
     * Muestra un mensaje de saludo por consola.
     * <p>
     * Uso típico:
     * <pre>
     * Entornos.saludar();
     * </pre>
     * <p>
     * Este método no recibe parámetros y no devuelve ningún valor.
     */
   public static void saludar() {
        System.out.println("¡Hola! Bienvenido a la clase Entornos.");
    }

    /*
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
     * <p>
     * Nota: Si alguno de los valores es {@code Double.NaN}, el resultado será {@code NaN}.
     */
    public static double calcularPromedio3(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    /**
     * Calcula el producto de dos enteros.
     *
     * @param a primer factor
     * @param b segundo factor
     * @return el producto de {@code a} y {@code b}
     * <p>
     * Ejemplo:
     * <pre>
     * int p = Entornos.multiplicar(3, 4); // p == 12
     * </pre>
     */


    public static int multiplicar(int a, int b) {
        return a * b;
    }

    /** Ejercicio 2: Calcular el área de un objeto rectangular */
    public static int area(int base, int altura) {
        return base * altura;
    }
    /**Ejercicio 3: Convertir una temperatura de Celsius a Fahrenheit */
    public static double calcularTemperatura(int c, double f) {
        return (c * f) + 32;
    }

    /** Ejercicio 4: Convertir un texto a mayúsculas */
    public static String textoMayusculas(String texto)
         {
        return texto.toUpperCase();

    }

    /**Ejercicio 5: Unir dos textos */
    public static String unirTexto(String texto1, String texto2) {
        return texto1 + " " + texto2;
    }




    /**Contar el número de caracteres en un texto */
    public static int contadorDeCaracteres(String texto) {
        return texto.length();
    }


    /**Ejercicio 7: Comprobar si un texto contiene la letra 'a' */
    public static boolean comprobarletraA(String texto) {
        return texto.contains("a") || texto.contains("A");
    }

    /**Ejercicio 8: Comprobar si un año es bisiesto */
    public static boolean comprobrasbisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
    /**Ejercicio 9: Obtener el día de la semana a partir de un número */
    public static String  diadelasemana(int dia) {
        switch (dia) {
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miércoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
            default:
                return "Día inválido";
        }
    }


    /**Ejercicio 10: Calcular el factorial de un número */
   public static int factorialdeunnumero(int numero) {
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
