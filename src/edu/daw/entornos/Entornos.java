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
    }


    /**
     * @param a
     * @param b
     * @return
     */
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


    
}
