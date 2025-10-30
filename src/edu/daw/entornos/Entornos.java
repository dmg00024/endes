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

        // 1️⃣ Calcular la suma de dos números
        int suma = sumar(7, 8);
        System.out.println("La suma de 7 y 8 es: " + suma);

        // 2️⃣ Obtener el doble de un número
        int numero = 6;
        int dobleNumero = doble(numero);
        System.out.println("El doble de " + numero + " es: " + dobleNumero);

        // 3️⃣ Calcular el área de un cuadrado
        double lado = 5.0;
        double area = areaCuadrado(lado);
        System.out.println("El área de un cuadrado de lado " + lado + " es: " + area);

        // 4️⃣ Convertir grados Celsius a Fahrenheit
        double celsius = 25.0;
        double fahrenheit = celsiusAFahrenheit(celsius);
        System.out.println(celsius + "°C equivalen a " + fahrenheit + "°F");

        // 5️⃣ Sumar los primeros 10 números naturales
        int suma10 = sumaPrimeros10();
        System.out.println("La suma de los primeros 10 números naturales es: " + suma10);
    }

    /**
     * Muestra un mensaje de saludo por consola.
     *
     * Este método no recibe parámetros y no devuelve ningún valor.
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
     *
     * Ejemplo:
     * <pre>
     * int resultado = Entornos.sumar(7, 8); // resultado == 15
     * </pre>
     */
    public static int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Devuelve el doble de un número entero.
     *
     * @param n número a duplicar
     * @return el doble del número {@code n}
     *
     * Ejemplo:
     * <pre>
     * int resultado = Entornos.doble(6); // resultado == 12
     * </pre>
     */
    public static int doble(int n) {
        return n * 2;
    }

    /**
     * Calcula el área de un cuadrado a partir de la longitud de su lado.
     *
     * @param lado longitud del lado del cuadrado
     * @return área del cuadrado ({@code lado * lado})
     *
     * Ejemplo:
     * <pre>
     * double area = Entornos.areaCuadrado(5); // area == 25.0
     * </pre>
     */
    public static double areaCuadrado(double lado) {
        return lado * lado;
    }

    /**
     * Convierte grados Celsius a Fahrenheit.
     *
     * @param celsius grados Celsius
     * @return grados Fahrenheit equivalentes
     *
     * Ejemplo:
     * <pre>
     * double f = Entornos.celsiusAFahrenheit(25); // f == 77.0
     * </pre>
     */
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Suma los primeros 10 números naturales (del 1 al 10).
     *
     * @return la suma total de los números del 1 al 10
     *
     * Ejemplo:
     * <pre>
     * int total = Entornos.sumaPrimeros10(); // total == 55
     * </pre>
     */
    public static int sumaPrimeros10() {
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += i;
        }
        return suma;
    }
}
