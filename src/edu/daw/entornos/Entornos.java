package edu.daw.entornos;
public class Entornos {
    public static void main(String[] args) {
        int a=2;
        int b=6;
        int c=2;
        int lado1=32;
        int lado2=20;
        int celsius=30;
        int far=32;
        int sumaen=1+2+3+4+5+6+7+8+9+10;
        sumar(a, b);
        doble(a,c);
        area(lado1, lado2);
        grados(celsius, far);
        enteros(sumaen);


        System.out.println("El resultado de la suma es:" + (a+b));
        System.out.println("El resultado de la doble es:" + (a*c));
        System.out.println("El resultado de la area es:" + (lado2*lado1));
        System.out.println("Los grados en fahrenheit:"+(celsius+far));
    }
    //Calcular la suma de dos números
    public static int sumar(int a, int b){
       return a+b ;
    }

    //Obtener el doble de un número
    public static int doble(int b, int c){
      return c ;
    }

    //Calcular el área de un cuadrado
    public static int area(int lado1, int lado2){
       return lado1*lado2;
    }

    //Convertir grados Celsius a Fahrenheit
    public static int grados (int celsius, int far){
        return celsius+far;
    }

    //Sumar los primeros 10 números naturales
    public static int enteros(int sumaen){
        return sumaen;
    }
}