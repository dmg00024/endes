package edu.daw.entornos;

import java.util.Random;
import java.util.Scanner;



public class Entornos {

    static Random generador = new Random();

    public static void main(String[] args) {

        /**
         * Solicita dos números reales al usuario a través de la entrada estándar,
         * * calcula la suma aritmética y muestra el resultado en consola.
         * * <p>Este metodo asume que el objeto Scanner ya ha sido inicializado
         *  y está abierto para la lectura.</p>
         *
         ** @param sc El objeto {@code Scanner} utilizado para leer la entrada del usuario.
         *  * @throws java.util.InputMismatchException Si el usuario introduce un valor que no es un número.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();
        double suma = num1 + num2;
        System.out.println("La suma es: " + suma);

        /**
         * Solicita un numero al usuario y calcula su valor duplicado.
         * <p>
         *     El resultado se imprime directamente desde la consola con el formato:
         *    "El doble de [numer0] es: [resultado]".*
         * </p>
         * * @param sc El objeto {@code Scanner} usado para leer la entrada. No debe ser null.
         * @throws java.util.InputMismatchException Si el usuario introduce un valor no entero
         */
        System.out.print("Introduce un número: ");
        int numer0 = sc.nextInt();

        int d0ble = numer0 * 2;

        System.out.println("El doble de " + numer0 + " es: " + d0ble);


        /**
         * Solicita la longitud de unn lado, calcula la area de un cuadrado
         * y muestra el resultado en pantalla
         * *<p>
         * La formula sera: area=lado*lado
         *</p>
         * * @param sc Objeto {@code Scanner} necesario para leer la entrada del teclado.
         */
        double lado;
        double area;


        System.out.println("Por favor, introduce la longitud de un lado del cuadrado:");


        lado = sc.nextDouble();


        area = lado * lado;


        System.out.println("El área del cuadrado es: " + area);

        /**
         * Solicita una temperatura Fahrenheit y calcula su valor en Celsius
         * <p>
         * La conversión utiliza la fórmula: {@code celsius = (fahrenheit - 32) * 5.0 / 9.0}.
         * </p>
         *
         * @param sc El objeto {@code Scanner} utilizado para leer la entrada del usuario.
         */

        double fahrenheit;
        double celsius;


        System.out.println("Introduce la temperatura en grados Fahrenheit:");
        fahrenheit = sc.nextDouble();

        celsius = (fahrenheit - 32) * 5.0 / 9.0;

        System.out.println(fahrenheit + " grados Fahrenheit equivalen a " + celsius + " grados Celsius.");

        /**
         * Se pide un numero limite y se realiza una suma entre 2 numero eneteros
         * <p>
         *
         *Recorre por los numeros mediante un bucle(for), acumulando el valor en una variable y muestran un mensaje en consola
         * </p>
         */
        int suma01 = 0;
        int limite = 10;

        for (int i = 1; i <= limite; i++) {
            suma01 += i;


            System.out.println("La suma de los primeros " + limite + " números naturales es: " + suma);


            //Bloque 2


            System.out.println("Por favor, introduce tu nombre:");

            String nombre = sc.nextLine();

            System.out.println("¿Que tal?," + nombre);


            System.out.println("Introduce un texto para enseñar su version en mayúscula:");

            String textoOriginal = sc.nextLine();


            String textoMayusculas = textoOriginal.toUpperCase();

            System.out.println("Resultado:");
            System.out.println("Texto en Mayúsculas: " + textoMayusculas);

            System.out.println("Introduce la primera frase:");
            String frase1 = sc.nextLine();

            System.out.println("Introduce la segunda frase:");
            String frase2 = sc.nextLine();

            String fraseunica = frase1 + frase2;

            System.out.println("Resultado:");
            System.out.println("La cadena unida es: " + fraseunica);

            String palabracontar = frase1.concat(" ").concat(frase2);

            System.out.println("Resultado");
            System.out.println("La cadena unida es: " + palabracontar);

            System.out.println("Escriba una palabra para saber su cantidad de caracteres");

            String texto = sc.nextLine();

            int longitud = texto.length();

            System.out.println("Resultado");
            System.out.println("Texto introducido: " + texto);
            System.out.println("La longitud total es: " + longitud);

            System.out.println("Introduce una palabra para saber cuantas veces se repite la letra a");


            String texto2 = texto.toLowerCase();

            boolean contieneA = texto2.contains("a");

            System.out.println("Resultado");
            System.out.println("Texto analizado:" + texto);

            if (contieneA) {
                System.out.println("El texto contiene la letra 'a' o 'A'");
            } else {
                System.out.println(" El texto no contiene la letra 'a' ni 'A'");
            }

            System.out.println(" El numero Mayor de Dos Números");

            System.out.print("Introduce el primer número: ");
            double num01 = sc.nextDouble();

            System.out.print("Introduce el segundo número: ");
            double num02 = sc.nextDouble();


            if (num01 > num02) {
                System.out.println("El mayor: " + num01);
            } else if (num02 > num01) {
                System.out.println("El mayor: " + num02);
            } else {
                System.out.println("Ambos números son iguales:" + num01);
            }

            System.out.println("¿Es Par o Impar?");

            System.out.print("Introduce un número entero: ");

            int numero = sc.nextInt();

            if (numero % 2 == 0) {

                System.out.println("El número " + numero + " es par.");
            } else {

                System.out.println("El número " + numero + " es impar.");
            }

            System.out.println("Comprobar positivo, negativo o cero");

            System.out.print("Introduce un número: ");

            double numero2 = sc.nextDouble();

            if (numero2 > 0) {

                System.out.println("El número " + numero2 + "es positivo.");
            } else if (numero2 < 0) {

                System.out.println("El número " + numero2 + " es negativo.");
            } else {

                System.out.println("El número es cero.");
            }

            System.out.println("Introduce tu nota para saber si pasastes o no");

            System.out.print("Introduce la nota numérica (0.0 a 10.00): ");
            double nota = sc.nextDouble();

            String calificacion;

            if (nota < 0.0 || nota > 10.0) {

                calificacion = "Nota fuera del rango 0-10.";
            } else if (nota < 5) {

                calificacion = "Insuficiente";
            } else if (nota < 6) {

                calificacion = "Suficiente";
            } else if (nota < 7) {

                calificacion = "Bien";
            } else if (nota < 9) {

                calificacion = "Notable";
            } else {

                calificacion = "Sobresaliente";
            }

            System.out.println("Resultado");
            System.out.println("Nota:" + nota);
            System.out.println("Resultado:" + calificacion);

            System.out.println(" Comprobar si puedo votar");

            System.out.print("Introduce tu edad: ");

            int edad = sc.nextInt();

            if (edad >= 18) {
                System.out.println("Con " + edad + " años, si puedes votar!");
            } else {

                int aniosFaltantes = 18 - edad;
                System.out.println("Con " + edad + " años, todavía  no puedes votar.");


            }

            System.out.println("Calcular el Factorial de un Número");

            System.out.print("Introduce un número entero que no sea negativo: ");
            int numero3 = sc.nextInt();


            long factorial = 1;

            if (numero3 < 0) {
                System.out.println("El factorial no está definido para números negativos.");
            } else if (numero3 == 0) {

                System.out.println("El factorial de 0 es: 1");
            } else {

                for (i = 1; i <= numero3; i++) {

                    factorial *= i;
                }

                System.out.println("El factorial de " + numero3 + " (" + numero3 + "!) es: " + factorial);
            }


            System.out.println("Cuantas vocales tiene la siguiente frase:");

            System.out.print("Introduce una palabra para saber cuantas vocales hay");
            String textovocales = sc.nextLine();

            int contVocales = 0;

            String text = textovocales.toLowerCase();

            for (i = 0; i < text.length(); i++) {

                char caracter = text.charAt(i);


                if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                    contVocales++;
                }
            }

            // 5. Mostrar el resultado
            System.out.println("Resultado");
            System.out.println("Texto inicial:" + textovocales);
            System.out.println("El número total de vocales es: " + contVocales);


            System.out.println("Repetir un mensaje varias veces");

            System.out.print("Introduce el mensaje que deseas repetir: ");
            String mensaje = sc.nextLine();

            System.out.print("¿Cuántas veces quieres repetirlo?: ");
            int nVeces = sc.nextInt();

            System.out.println("Mensaje Repetido (" + nVeces + " veces) ---");

            for (i = 1; i <= nVeces; i++) {
                System.out.println(i + ". " + mensaje);
            }


            System.out.print("Introduce hasta que numero se mostraran multiplos de 3: ");
            int X = sc.nextInt();

            System.out.println(" Múltiplos de 3 hasta " + limite);


            for (i = 1; i <= X; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " El numero es multiplo de 3");
                }
            }

            System.out.println();


            Random rand = new Random();

            int numRandom = rand.nextInt(100) + 1;

            System.out.println("El número es: " + numRandom);

            System.out.print("Introduce un año: ");
            int anio = sc.nextInt();

            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                System.out.println(anio + " es bisiesto.");
            } else {
                System.out.println(anio + " no es bisiesto.");

            }

            sc.close();
        }
    }
    }




