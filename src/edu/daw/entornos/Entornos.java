import java.util.Scanner;

public class Entornos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();


        double suma = num1 + num2;


        System.out.println("La suma es: " + suma);

        sc.close();



    }
}
