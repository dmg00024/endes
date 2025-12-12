package edu.daw.entornos;

/**
 * Clase de ejemplo que muestra funciones básicas en Java:
 * - un método sin parámetros ni valor de retorno (saludar)
 * - métodos con parámetros y retorno (sumar, doble, etc.)
 * - métodos con tipos {@code double} para cálculos numéricos
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

        // 1º Calcular la suma de dos números
        int suma = sumar(3, 5);
        System.out.println("La suma de 3 y 5 es: " + suma);

        // 2º Obtener el doble de un número
        int numero = 3;
        int dobleNumero = doble(numero);
        System.out.println("El doble de " + numero + " es: " + dobleNumero);

        // 3º Calcular el área de un cuadrado
        double lado = 30.0;
        double area = areaCuadrado(lado);
        System.out.println("El área de un cuadrado de lado " + lado + " es: " + area);

        // 4º Convertir grados Celsius a Fahrenheit
        double celsius = 21.0;
        double fahrenheit = celsiusAFahrenheit(celsius);
        System.out.println(celsius + "°C equivalen a " + fahrenheit + "°F");

        // 5º Sumar los primeros 10 números naturales
        int suma10 = sumaPrimeros10();
        System.out.println("La suma de los primeros 10 números naturales es: " + suma10);

        //Bloque 2
        System.out.println(saludoPersonalizado("Geremi alayo amaro"));
        System.out.println(aMayúsculas("hola mundo,este es mi primera programacion espero salga todo bien :C "));
        System.out.println(unirfrases("Hola", "Que tal"));
        System.out.println("Letras:" + contarletras("ordenar"));
        System.out.println("contiene 'a':"+ contieneA("ventana"));

        //Bloque 3
        System.out.println("Mayor:"+ mayordeDos(70,32));
        System.out.println("Par:"+ esPar(7));
        System.out.println(signoNumero(-8)) ;
        System.out.println(calificación(3));
        System.out.println("Puede votar:"+ puedeVotar(18));

        //Bloque 4
        System.out.println("suma 1-100:"+ sumarHasta100());
        System.out.println("factorial:"+ factorial(5));
    }

    /**
     * Muestra un mensaje de saludo por consola.
     */
    public static void saludar() {
        System.out.println("¡Hola! Este es mi primer programa en Java.");
    }

    // Bloque 1

    /**
     * 1º Calcula la suma de dos números enteros.
     * @param a primer número
     * @param b segundo número
     * @return la suma de {@code a} y {@code b}
     */
    public static int sumar(int a, int b) {
        return a + b;
    }

    /**
     * 2º Devuelve el doble de un número entero.
     * @param d número a duplicar
     * @return el doble del número {@code d}
     */
    public static int doble(int d) {
        return d * 2;
    }

    /**
     * 3º Calcula el área de un cuadrado.
     * @param lado longitud del lado
     * @return área del cuadrado
     */
    public static double areaCuadrado(double lado) {
        return lado * lado;
    }

    /**
     * 4º Convierte grados Celsius a Fahrenheit.
     * @param celsius grados Celsius
     * @return grados Fahrenheit
     */
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * 5º Suma los primeros 10 números naturales.
     * @return suma total
     */
    public static int sumaPrimeros10() {
        int suma = 0;
        for (int i = 1; i <= 10; i++) suma += i;
        return suma;
    }
    // Bloque 2


       /**
        * 6ª Devuelve un saludo personalizado.
        * @param nombre del usuario
        * @return saludo con el nombre
        */
       public static String saludoPersonalizado(String nombre) {
     return "HOLA" + nombre + "BIENVENIDO";
     }
    /**
     * 7ª convierte un texto a mayúsculas.
     * @param texto original
     * @return testo a mayúscula
     */
    public static String aMayúsculas(String texto) {
        return texto .toUpperCase();
    }
    /**
     *  8ª une dos frases en una sola
     * @param f1 primera frase
     * @param f2 segunda frase
     * @return frases unidas con espacio
     */
    public static String unirfrases (String f1, String f2) {
        return f1 + f2;
    }
    /**
     * 9ª cuenta cuantas letras tiene una palabra.
     * @param palabra a analizar
     * @return numero de caracteres
     */
    public static int contarletras(String palabra) {
        return palabra.length() ;
    }
    /**
     * 10ª comprueba si un texto tiene la letra 'a'
     * @param texto a analizar
     * @return {@code true} si contiene 'a'
     */
    public static boolean contieneA(String texto) {
        return texto.contains("a") ;
    }

    // Bloque 3

    /**
     * 11ª Devuelve el mayor de dos Numeros.
     * @param a primer numero
     * @param b segundo numero
     * @return el número mayor
     */
    public static int mayordeDos (int a, int b) {
        return (a > b) ? a : b;
    }
    /**
     * 12ª Comprueba si un numero es Par.
     * @param n numero a comprobar
     * @return {@code true} si es par
     */
    public static boolean esPar (int n) {
        return n % 2 == 0;
    }
    /**
     * 13ª indica si es un numero positivo, negativo o cero.
     * @param n número a analizar
     * @return texto con el estado de número
     */
    public static String signoNumero (int n) {
        if (n > 0) return "positivio";
        if (n < 0) return "negativo";
        return "cero";
    }
    /**
     * 14ª convierte una nota numerica en calificacion textual.
     * @param nota valor 0-10
     * @return palabra correspondiente
     */
    public static String calificación(int nota) {
        if (nota < 5 ) return "insuciente";
        if (nota < 6 ) return "suficiente";
        if (nota < 7 ) return "bien";
        if (nota < 9 ) return "notable";
        if (nota < 10 ) return "sobresaliente";
        return "sobresaliente";
    }
    /**
     * 15ª comprueba si una edad permite votar.
     * @param edad en años
     * @return {@code true} si es mayor de 18
     */
    public static boolean puedeVotar(int edad) {
        return edad >= 18;
    }

    // Bloque 4

    /**
     * 16ª suma todos los numeros del 1 al 100.
     * @return suma total
     */
    public static int sumarHasta100() {
        int suma = 0;
        for (int i = 1; i <= 100; i++) suma += i;
        return suma;
    }
    /**
     * 17ª Calcula el factorial de un número.
     * @param e número entero
     * @return factorial del número
     */
    public static int factorial(int e) {
        int Resultado = 1;
        for (int i = 1; i <= e; i++) Resultado *= i;
        return Resultado;
    }
}