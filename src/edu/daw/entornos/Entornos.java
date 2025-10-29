package edu.daw.entornos;

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
        saludar();

        int resultado = sumar(5, 7);
        System.out.println("La suma de 5 y 7 es: " + resultado);

        double media = calcularPromedio3(8.5, 6.0, 9.0);
        System.out.println("La media es: " + media);

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
     * x es el número del cual obtendremos el doble
     * @return el doble del número seleccionado*/

    public static int ObtenerDoble(int x) { return x * 2 ;}

    /**
     * Calcula el area de un cuadrado
     * l es la longitud del lado del cuadrado
     * @return el cuadrado del lado
     * */

    public static int AreaCuadrado(int l) { return l * l ;}

    /**
     * Mostrar un saludo personalizado
     * nombre es el nombre de la persona a saludar
     * @return un saludo dirigido al nombre seleccionado
     */
    public static String SaludoPersonalizado(String nombre) { return "Hola " + nombre + ", bienvenido a mi programa." ;}

    /**
     * Comprobar si un número es par
     * n es el número a comprobar
     * @return true si el número es par, false si es impar
     */
    public static boolean EsPar(int n) { return n % 2 == 0 ;}

    /**
     * Comprobar si un número es impar
     * n es el número a comprobar
     * @return true si el número es impar, false si es par
     */
    public static boolean esImpar(int n) { return n % 2 != 0 ;}
}
