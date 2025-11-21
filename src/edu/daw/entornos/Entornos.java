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
     * , {@link #sumar(int, int)} y {@link #calcularPromedio3(double, double, double)}.
     *
     * @param args argumentos de línea de comandos (no se usan)
     */
    public static void main(String[] args) {

        //1er Bloque de ejercicios

        System.out.println("Suma: " + sumar(5, 7));

        System.out.println("Doble: " + doble(4));

        System.out.println("Área cuadrado: " + areaCuadrado(5));

        System.out.println("Celsius a Fahrenheit: " + celsiusAFahrenheit(10.0));

        System.out.println("Suma 1..10: " + sumarPrimeros10());

        //2do Bloque de ejercicios

        System.out.println(saludoPersonalizado("profeee!!"));

        System.out.println("Mayúsculas: " + aMayusculas("entornos de desarrollo"));

        System.out.println("Unir frases: " + unirFrases("windows", "mac"));

        System.out.println("Cantidad de letras: " + contarLetras("entornos"));

        System.out.println("Contiene 'a': " + contieneLetraA("Entornos"));

        // 3er Bloque de ejercicios

        System.out.println("Mayor: " + mayorDeDos(10, 3));

        System.out.println("Es par: " + esPar(7));

        System.out.println("Signo: " + signoNumero(-3));

        System.out.println("Nota 4: " + notaATexto(4));

        System.out.println("Puede votar (15): " + puedeVotar(15));

        //4to Bloque de ejercicios

        System.out.println("Suma 1..100: " + suma1a100());

        System.out.println("Factorial de 3: " + factorial(3));

        System.out.println("Vocales: " + contarVocales("Programación"));

        System.out.println(repetirMensaje("Hola", 3));

        System.out.println("Múltiplos de 3 hasta 20: " + multiplosDe3Hasta(20));

        // 5to bloque de ejercicios

        System.out.println("Aleatorio 1..10: " + aleatorio1a10());

        System.out.println("¿Es bisiesto 2023?: " + esBisiesto(2023));

        System.out.println("Día 5: " + diaSemana(5));

        System.out.println("Tirada de dado: " + tirarDado());

        System.out.println("Promedio de tres números: " + calcularPromedio3(4.5, 7.0, 9.0));

    }

    //1er Bloque
/**Calcular la suma de dos números
 * @param a Primer número a sumar
 * @param b Segundo número a sumar
 * @return La suma de los dos números
 * */
    public static int sumar(int a, int b) {
        return a + b;
    }
/**Obtener el doble de un número
 * @param n Número del cual se quiere obtener el doble
 * @return El doble del número proporcionado
 * */
    public static int doble(int n) {
        return n * 2;
    }
/**Calcular el área de un cuadrado
 * @param lado Longitud del lado del cuadrado
 * @return El área del cuadrado
 * */
    public static double areaCuadrado(double lado) {
        return lado * lado;
    }
/**Convertir grados Celsius a Fahrenheit
 * @param celsius Temperatura en grados Celsius
 * @return Temperatura convertida a grados Fahrenheit
 * */
    public static double celsiusAFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }
/**Sumar los primeros 10 números naturales
 * @return La suma de los números del 1 al 10
 * */
    public static int sumarPrimeros10() {
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma = suma + i;
        }
        return suma;
    }

    //2do Bloque

    /**Mostrar un saludo personalizado
     * @param nombre Nombre de la persona a saludar
     * @return Un saludo personalizado con el nombre proporcionado
     * */
    public static String saludoPersonalizado(String nombre) {
        return "Hola, " + nombre + "!";
    }
/**Convertir un texto a mayúsculas
 * @param texto Texto a convertir
 * @return El texto convertido a mayúsculas
 * */

    public static String aMayusculas(String texto) {
        return texto.toUpperCase();
    }
/**Unir dos frases en una sola cadena
 * @param f1 Primera frase
 * @param f2 Segunda frase
    * @return La unión de las dos frases separadas por un espacio
 * */
    public static String unirFrases(String f1, String f2) {
        return f1 + " " + f2;
    }
/**Contar cuántas letras tiene una palabra
 * @param palabra Palabra de la cual se quiere contar las letras
 * @return El número de letras en la palabra proporcionada
 * */
    public static int contarLetras(String palabra) {
        return palabra.length();
    }
/**Comprobar si un texto contiene la letra ‘a’
 * @param texto Texto a comprobar
 * @return {@code true} si el texto contiene la letra 'a', {@code false}
 * */
    public static boolean contieneLetraA(String texto) {
        texto = texto.toLowerCase();
        if (texto.indexOf('a') >= 0) {
            return true;
        } else {
            return false;
        }
    }

    //3er bloque

/**Determinar el mayor de dos números
 * @param a Primer número a comparar
 * @param b Segundo número a comparar
 * @return El número mayor entre los dos proporcionados
 * */
    public static int mayorDeDos(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
/**Comprobar si un número es par o impar
 * @param n Número a comprobar
 * @return {@code true} si el número es par, {@code false} si es impar
 * */
    public static boolean esPar(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
/**Comprobar si un número es positivo, negativo o cero
 * @param n Número a comprobar
 * @return "positivo" si el número es mayor que cero, "negativo" si es menor que cero, "cero" si es igual a cero
 * */
    public static String signoNumero(int n) {
        if (n > 0) {
            return "positivo";
        } else if (n < 0) {
            return "negativo";
        } else {
            return "cero";
        }
    }
/**Convertir una nota numérica a calificación textual
 * @param nota Nota numérica (0-10)
 * @return Calificación textual correspondiente a la nota proporcionada
 * */
    public static String notaATexto(int nota) {
        if (nota < 5) {
            return "Suspenso";
        } else if (nota == 5) {
            return "Aprobado";
        } else if (nota == 6) {
            return "Bien";
        } else if (nota == 7 || nota == 8) {
            return "Notable";
        } else {
            return "Sobresaliente";
        }
    }
/**15. Comprobar si una edad permite votar (≥18)
 * @param edad Edad a comprobar
 * @return {@code true} si la edad es 18 o mayor, {@code false} en caso contrario
 * */
    public static boolean puedeVotar(int edad) {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    // 4to bloque
/**Sumar todos los números del 1 al 100
 * @return La suma de los números del 1 al 100
 * */
    public static int suma1a100() {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma = suma + i;
        }
        return suma;
    }
/**Calcular el factorial de un número
 * @param n Número del cual se quiere calcular el factorial
 * @return El factorial del número proporcionado
 * */
public static long factorial(int n) {
    long resultado = 1;
    int i = 1;

    while (i <= n) {
        resultado *= i;
        i++;
    }

    return resultado;
}
/**Contar cuántas vocales tiene una palabra
 * @param palabra Palabra de la cual se quiere contar las vocales
 * @return El número de vocales en la palabra proporcionada
 * */
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
/**Mostrar un mensaje repetido N veces
 * @param msg Mensaje a repetir
 * @param n Número de veces que se quiere repetir el mensaje
 * @return El mensaje repetido N veces, cada uno en una nueva línea
 * */
    public static String repetirMensaje(String msg, int n) {
        String resultado = "";
        for (int i = 0; i < n; i++) {
            resultado = resultado + msg + "\n";
        }
        return resultado;
    }
/**Mostrar los múltiplos de 3 hasta un número dado
 * @param n Número límite hasta el cual se quieren mostrar los múltiplos de 3
 * @return Una cadena con los múltiplos de 3 separados por espacios
 * */
    public static String multiplosDe3Hasta(int n) {
        String texto = "";
        for (int i = 3; i <= n; i = i + 3) {
            texto = texto + i + " ";
        }
        return texto;
    }

    // 5to bloque

    /**Generar un número aleatorio entre 1 y 10
     * @return Un número entero aleatorio entre 1 y 10
     * */
    public static int aleatorio1a10() {
        int numero = (int) (Math.random() * 10) + 1;
        return numero;
    }
/**Comprobar si un año es bisiesto
 * @param year Año a comprobar
 * @return {@code true} si el año es bisiesto, {@code false}
 * */
    public static boolean esBisiesto(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
/**Mostrar el día de la semana según un número (1–7)
 * @param n Número del día de la semana (1 para Lunes, 2 para Martes, ..., 7 para Domingo)
 * @return El nombre del día de la semana correspondiente al número proporcionado, o "Número inválido" si el número no está entre 1 y 7
 * */
public static String diaSemana(int n) {
    String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
    if (n >= 1 && n <= 7) {
        return dias[n - 1]; // porque los arrays empiezan en índice 0
    }
    return "Número inválido";
}
/**Simular una tirada de dado (1–6)
 * @return Un número entero aleatorio entre 1 y 6, representando la tirada de un dado
 * */
    public static int tirarDado() {
        int dado = (int) (Math.random() * 6) + 1;
        return dado;
    }
/**Calcular la media de tres números
 * @param n1 Primer número
 * @param n2 Segundo número
 * @param n3 Tercer número
 * @return El promedio de los tres números proporcionados
 * */
    public static double calcularPromedio3(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
}