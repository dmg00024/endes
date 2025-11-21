package edu.daw.entornos;

/**
 * Clase que contiene varios métodos para operaciones básicas
 * como suma, multiplicación, área, conversiones de temperatura,
 * manejo de texto y otras utilidades.
 */
public class Entornos {

    /**
     * Método principal que ejecuta pruebas de todos los métodos.
     * @param args Argumentos de línea de comandos (no usados).
     */
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int lado1 = 10;
        int lado2 = 20;
        int celsius = 34;
        int fahrenheit = 32;
        String saludo = "javi";
        String textomayus = "hola buenas que tal estas";
        String frase1 = "Hola, ¿cómo estás?";
        String frase2 = "Estoy bien, gracias.";

        int resultadoSuma = sumar(a, b);
        int resultadoMultiplicacion = multiplicar(a, b);
        int resultadoArea = area(lado1, lado2);
        int resultadoGrados = grados(celsius, fahrenheit);
        String resultadoMayusculas = textoMayusculas(textomayus);

        System.out.println("Hola, " + saludo + "! Bienvenido.");
        System.out.println("La respuesta de la suma es " + resultadoSuma);
        System.out.println("La respuesta de la multiplicación es " + resultadoMultiplicacion);
        System.out.println("El resultado del área es: " + resultadoArea);
        System.out.println("El resultado de celsius a Fahrenheit es: " + resultadoGrados);
        System.out.println("Texto en mayúsculas: " + resultadoMayusculas);
        String resultadounir = unirFrases(frase1, frase2);
        System.out.println(resultadounir);

        // Uso de las nuevas funciones
        int letrasPalabra = contarLetras("entornos");
        boolean contieneA = contieneLetraA("programacion");
        int mayor = mayorDeDos(5, 7);
        String parImpar = parOImpar(20);
        String tipo = tipoNumero(-7);
        String calif = calificacion(8);
        boolean vota = puedeVotar(17);

        System.out.println("Letras de 'entornos': " + letrasPalabra);
        System.out.println("¿Contiene 'a'?: " + contieneA);
        System.out.println("Mayor entre 5 y 7: " + mayor);
        System.out.println("20 es: " + parImpar);
        System.out.println("-7 es: " + tipo);
        System.out.println("Nota 8 es: " + calif);
        System.out.println("¿Puede votar con 17?: " + vota);
    }

    /**
     * Suma dos números enteros.
     * @param a Primer sumando.
     * @param b Segundo sumando.
     * @return Resultado de la suma a + b.
     */
    public static int sumar(int a, int b){
        return  a + b;
    }

    /**
     * Multiplica dos números enteros.
     * @param a Primer factor.
     * @param b Segundo factor.
     * @return Producto de a * b.
     */
    public static int multiplicar(int a, int b){
        return  a * b;
    }

    /**
     * Calcula el área de un rectángulo dados sus lados.
     * @param lado1 Longitud del primer lado.
     * @param lado2 Longitud del segundo lado.
     * @return Área del rectángulo lado1 * lado2.
     */
    public static int area(int lado1, int lado2){
        return lado1 * lado2;
    }

    /**
     * Suma dos temperaturas representadas en Celsius y Fahrenheit.
     * Nota: Este método simplemente suma ambos valores enteros.
     * @param celsius Temperatura en grados Celsius.
     * @param fahrenheit Temperatura en grados Fahrenheit.
     * @return Suma de ambos valores.
     */
    public static int grados(int celsius, int fahrenheit){
        return celsius + fahrenheit;
    }

    /**
     * Convierte un texto a mayúsculas.
     * @param textomayus Texto original.
     * @return Texto convertido a mayúsculas.
     */
    public static String textoMayusculas(String textomayus){
        return textomayus.toUpperCase();
    }

    /**
     * Une dos frases separándolas con un espacio.
     * @param frase1 Primera frase.
     * @param frase2 Segunda frase.
     * @return Frase resultante de unir frase1 y frase2 con un espacio.
     */
    public static String unirFrases(String frase1, String frase2) {
        return frase1 + " " + frase2;
    }

    /**
     * Cuenta cuántas letras tiene una palabra.
     * @param palabra Palabra de entrada.
     * @return Número de caracteres de la palabra.
     */
    public static int contarLetras(String palabra) {
        return palabra.length();
    }

    /**
     * Comprueba si un texto contiene la letra 'a' (mayúscula o minúscula).
     * @param texto Texto a comprobar.
     * @return true si contiene 'a' o 'A', false en caso contrario.
     */
    public static boolean contieneLetraA(String texto) {
        return texto.contains("a") || texto.contains("A");
    }

    /**
     * Determina el mayor de dos números.
     * @param num1 Primer número.
     * @param num2 Segundo número.
     * @return El número mayor entre num1 y num2.
     */
    public static int mayorDeDos(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    /**
     * Comprueba si un número es par o impar.
     * @param numero Número a comprobar.
     * @return "par" si es par, "impar" si es impar.
     */
    public static String parOImpar(int numero) {
        return (numero % 2 == 0) ? "par" : "impar";
    }

    /**
     * Determina si un número es positivo, negativo o cero.
     * @param numero Número a evaluar.
     * @return "positivo", "negativo" o "cero" según corresponda.
     */
    public static String tipoNumero(int numero) {
        if (numero > 0) {
            return "positivo";
        } else if (numero < 0) {
            return "negativo";
        } else {
            return "cero";
        }
    }

    /**
     * Convierte una nota numérica a su calificación textual según el sistema escolar.
     * @param nota Nota numérica del 0 al 10.
     * @return Calificación textual correspondiente.
     */
    public static String calificacion(int nota) {
        if(nota >= 9) return "Sobresaliente";
        else if(nota >= 7) return "Notable";
        else if(nota >= 6) return "Bien";
        else if(nota >= 5) return "Suficiente";
        else return "Insuficiente";
    }

    /**
     * Comprueba si una edad permite votar (18 años o más).
     * @param edad Edad a comprobar.
     * @return true si la edad es 18 o más, false si no.
     */
    public static boolean puedeVotar(int edad) {
        return edad >= 18;
    }
}
