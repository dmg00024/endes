package edu.daw.entornos;
public class Entornos {
    public static void main(String[] args) {
        int a=2;
        int b=6;
        int c=2;
        int lado1=32;
        int lado2=20;
        int celsius=73;
        int far=32;
        int sumaen=1+2+3+4+5+6+7+8+9+10;

        int ressumar=sumar(a, b);
        int resdoble=doble(a,c);
        int resarea=area(lado1, lado2);
        int resgrados=grados(celsius, far);
        int resentero=enteros(sumaen);

        System.out.println("El resultado de la suma es:" + ressumar);
        System.out.println("El resultado de la doble es:" + resdoble);
        System.out.println("El resultado de la area es:" + resarea);
        System.out.println("Los grados en fahrenheit:"+ resgrados);
        System.out.println("La suma de los 10 primeros numeros enteros es:"+ resentero);

    }
    //Calcular la suma de dos números
    public static int sumar(int a, int b){
       return a+b ;
    }

    //Obtener el doble de un número
    public static int doble(int a, int c){
      return a*c ;
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