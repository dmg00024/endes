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

        sumar(a, b);
        multiplicar(a, b);
        area(lado1, lado2);
        grados(celsius, fahrenheit);

        System.out.println("Hola, " + saludo + "! Bienvenido.");
    }

//BLOQUE 1
    public static void sumar(int a, int b){
        System.out.println("El resultado de la suma es:");
        System.out.println(a + b);
    }

    public static void multiplicar(int a, int b){
        System.out.println("El resultado de la multiplicacion es:");
        System.out.println(a * b);
    }

    public static void area (int lado1, int lado2){
        System.out.println("El resultado del area es:");
        System.out.println(lado1 * lado2);
    }

    public static void grados (int celsius, int fahrenheit){
        System.out.println("El resultado de celsius a Fahrenheit es:");
        System.out.println(celsius + fahrenheit);
    }


}