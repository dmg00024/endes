package edu.daw.entornos;
public class Entornos {
    public static void main(String[] args) {
        int a=2;
        int b=6;
        int c=b*2;
        int lado1=32;
        int lado2=20;
        int celsius=30;
        int far=32;


        sumar(a, b);
        doble(a,c);
        area(lado1, lado2);
        grados(celsius, far);
    }
    public static void sumar(int a, int b){
        System.out.println("El resultado de la suma es:"+(a+b));
    }
    public static void doble(int b, int c){
        System.out.println("El resultado de la doble es:"+(c));
    }
    public static void area(int lado1, int lado2){
        System.out.println("El resultado de la area es:"+(lado1*lado2));
    }
    public static void grados (int celsius, int far){
        System.out.println("Los grados en fahrenheit:"+(celsius+far));
    }
}