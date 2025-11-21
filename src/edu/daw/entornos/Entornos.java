package edu.daw.entornos;

public class Entornos {
    public static void main(String[] args) {

        // Variables de los ejercicios anteriores
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

        // Resultados de los métodos
        int ressumar = sumar(a, b);
        int resdoble = doble(a, c);
        int resarea = area(lado1, lado2);
        int resgrados = grados(celsius, far);
        int resentero = enteros(sumaen);

        String ressaludo = saludo(nombre);
        String resmayus = mayusculas(texto);
        String resur = unir(frase1, frase2);
        int rescontar = contarLetras(palabra);
        boolean rescontiene = contieneA(textoConA);

        // Salidas por pantalla de calculos
        System.out.println("El resultado de la suma es: " + ressumar);
        System.out.println("El resultado del doble es: " + resdoble);
        System.out.println("El resultado del área es: " + resarea);
        System.out.println("Los grados en Fahrenheit son: " + resgrados);
        System.out.println("La suma de los 10 primeros números enteros es: " + resentero);

        //Salidas por pantalla de cadenas de texto
        System.out.println("Saludo personalizado: " + ressaludo);
        System.out.println("Texto en mayúsculas: " + resmayus);
        System.out.println("Frases unidas: " + resur);
        System.out.println("La palabra tiene " + rescontar + " letras.");
        System.out.println("¿El texto contiene la letra 'a'? " + rescontiene);
    }

    // Calcular la suma de dos números
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Obtener el doble de un número
    public static int doble(int a, int c) {
        return a * c;
    }

    // Calcular el área de un cuadrado
    public static int area(int lado1, int lado2) {
        return lado1 * lado2;
    }

    // Convertir grados Celsius a Fahrenheit
    public static int grados(int celsius, int far) {
        return celsius + far;
    }

    // Sumar los primeros 10 números naturales
    public static int enteros(int sumaen) {
        return sumaen;
    }

    // Mostrar un saludo personalizado
    public static String saludo(String nombre) {
        return "Hola " + nombre + ", ¡bienvenido!";
    }

    // Convertir un texto a mayúsculas
    public static String mayusculas(String texto) {
        return texto.toUpperCase();
    }

    // Unir dos frases en una sola cadena
    public static String unir(String frase1, String frase2) {
        return frase1 + " " + frase2;
    }

    // Contar cuántas letras tiene una palabra
    public static int contarLetras(String palabra) {
        return palabra.length();
    }

    // Comprobar si un texto contiene la letra ‘a’
    public static boolean contieneA(String texto) {
        return texto.contains("a");
    }
}
