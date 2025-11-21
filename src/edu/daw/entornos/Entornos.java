package edu.daw.entornos;

public class Entornos {
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

        // Nuevas funciones uso
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

    public static int sumar(int a, int b){
        return  a + b;
    }

    public static int multiplicar(int a, int b){
        return  a * b;
    }

    public static int area(int lado1, int lado2){
        return lado1 * lado2;
    }

    public static int grados(int celsius, int fahrenheit){
        return celsius + fahrenheit;
    }

    public static String textoMayusculas(String textomayus){
        return textomayus.toUpperCase();
    }

    public static String unirFrases(String frase1, String frase2) {
        return frase1 + " " + frase2;
    }

    // 9. Contar cuántas letras tiene una palabra
    public static int contarLetras(String palabra) {
        return palabra.length();
    }

    // 10. Comprobar si un texto contiene la letra 'a'
    public static boolean contieneLetraA(String texto) {
        return texto.contains("a") || texto.contains("A");
    }

    // 11. Determinar el mayor de dos números
    public static int mayorDeDos(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    // 12. Comprobar si un número es par o impar
    public static String parOImpar(int numero) {
        return (numero % 2 == 0) ? "par" : "impar";
    }

    // 13. Comprobar si un número es positivo, negativo o cero
    public static String tipoNumero(int numero) {
        if (numero > 0) {
            return "positivo";
        } else if (numero < 0) {
            return "negativo";
        } else {
            return "cero";
        }
    }

    // 14. Convertir una nota numérica a calificación textual
    public static String calificacion(int nota) {
        if(nota >= 9) return "Sobresaliente";
        else if(nota >= 7) return "Notable";
        else if(nota >= 6) return "Bien";
        else if(nota >= 5) return "Suficiente";
        else return "Insuficiente";
    }

    // 15. Comprobar si una edad permite votar (≥18)
    public static boolean puedeVotar(int edad) {
        return edad >= 18;
    }
}




