package edu.daw.entornos;

//Incluida la función Sumar 2 numeros
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

        sumar(a, b);
        multiplicar(a, b);
        area(lado1, lado2);
        grados(celsius, fahrenheit);

        System.out.println("Hola, " + saludo + "! Bienvenido.");

        textoMayusculas(textomayus);

    }

//BLOQUE 1
    public static int sumar(int a, int b){
        return  a + b;
    }

    public static int multiplicar(int a, int b){
      return  a * b;
    }

    public static void area (int lado1, int lado2){
        System.out.println("El resultado del area es:");
        System.out.println(lado1 * lado2);
    }

    public static void grados (int celsius, int fahrenheit){
        System.out.println("El resultado de celsius a Fahrenheit es:");
        System.out.println(celsius + fahrenheit);
    }

    public static void textoMayusculas(String textomayus){
        System.out.println("Texto en mayúsculas:");
        System.out.println(textomayus.toUpperCase());
    }

}