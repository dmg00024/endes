package edu.daw.entornos;

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


        System.out.print("Introduce un número: ");
        int numer0 = sc.nextInt();

        int d0ble = numer0 * 2;

        System.out.println("El doble de " + numer0 + " es: " + d0ble);

        //Con el double, "lado" y "area" pueden usar numeros decimales
        double lado;
        double area;

        // El sistema pide datos para poder resolver el problema
        System.out.println("Por favor, introduce la longitud de un lado del cuadrado:");

        //Se le nombra asi al valor para que el sistema lo reconozca
        lado = sc.nextDouble();

        // Se aplica la fromula para sacar el area
        area = lado * lado;

        // Mostrar el resultado
        System.out.println("El área del cuadrado es: " + area);


        double fahrenheit;
        double celsius;


        System.out.println("Introduce la temperatura en grados Fahrenheit:");
        fahrenheit = sc.nextDouble();

        // Aplica la fórmula de conversión: (Fahrenheit - 32) * 5/9
        celsius = (fahrenheit - 32) * 5.0 / 9.0;

        System.out.println(fahrenheit + " grados Fahrenheit equivalen a " + celsius + " grados Celsius.");


        int suma01 = 0; // Inicializamos una variable para acumular la suma
        int limite = 10; // Definimos el límite hasta el cual queremos sumar

        // Usamos un bucle for para iterar desde 1 hasta 10 (inclusive)
        for (int i = 1; i <= limite; i++) {
            suma01 += i; //Significa que si el resultado es igual o mayor a uno pasa un evento determinado


            // Imprimimos el resultado final
            System.out.println("La suma de los primeros " + limite + " números naturales es: " + suma);


            //Bloque 2

            // 2. Imprimir el mensaje para pedir el nombre
            System.out.println("Por favor, introduce tu nombre:");

            // *** Este es el paso clave que faltaba o estaba incorrecto ***
            // 3. Leer la entrada del usuario (el nombre) y guardarla en una variable
            String nombre = sc.nextLine();

            // 4. Imprimir el saludo personalizado usando la variable 'nombre'
            System.out.println("¿Que tal?," + nombre);

            // 2. Solicitar la entrada al usuario
            System.out.println("Introduce un texto para enseñar su version en mayúscula:");

            // 3. Leer el texto introducido
            String textoOriginal = sc.nextLine();

            // 4. Aplicar el método .toUpperCase() para la conversión
            // El método .toUpperCase() devuelve una *nueva* cadena de texto
            String textoMayusculas = textoOriginal.toUpperCase();

            // 5. Imprimir los resultados
            System.out.println("--- Resultado ---");
            System.out.println("Texto Original: " + textoOriginal);
            System.out.println("Texto en Mayúsculas: " + textoMayusculas);

            System.out.println("Introduce la primera frase:");
            String frase1 = sc.nextLine();

            System.out.println("Introduce la segunda frase:");
            String frase2 = sc.nextLine();

            // -----------------------------------------------------------------
            // Opción 1: Usando el operador de concatenación (+)
            // -----------------------------------------------------------------
            // Se añade un espacio " " entre las dos frases para que no queden pegadas.
            String resultadoConOperador = frase1 + " " + frase2;

            System.out.println("\n--- Resultado con Operador (+) ---");
            System.out.println("La cadena unida es: " + resultadoConOperador);

            // -----------------------------------------------------------------
            // Opción 2: Usando el método .concat()
            // -----------------------------------------------------------------
            // El método .concat() solo une dos cadenas directamente, por lo que
            // debemos unir el espacio por separado.
            String resultadoConMetodo = frase1.concat(" ").concat(frase2);

            System.out.println("\n--- Resultado con Método .concat() ---");
            System.out.println("La cadena unida es: " + resultadoConMetodo);

            System.out.println("Introduce una palabra o frase para contar sus caracteres:");

            // La entrada se guarda en una variable String
            String texto = sc.nextLine();

            // -----------------------------------------------------------------
            // El método .length() devuelve un entero que representa la longitud
            // -----------------------------------------------------------------
            int longitud = texto.length();

            System.out.println("\n--- Resultado ---");
            System.out.println("Texto introducido: \"" + texto + "\"");
            System.out.println("La longitud total es: " + longitud);

            System.out.println("Introduce una frase o palabra:");


            // -----------------------------------------------------------------
            // El método .contains() devuelve 'true' o 'false'
            // -----------------------------------------------------------------

            // 1. Convertir el texto a minúsculas para asegurar que la búsqueda
            //    incluya tanto 'a' como 'A'.
            String textoMinusculas = texto.toLowerCase();

            // 2. Usar .contains() para verificar la presencia de la subcadena "a"
            boolean contieneA = textoMinusculas.contains("a");

            System.out.println("\n--- Resultado ---");
            System.out.println("Texto analizado: \"" + texto + "\"");

            if (contieneA) {
                System.out.println("¡Sí! El texto SÍ contiene la letra 'a' o 'A'.");
            } else {
                System.out.println("No. El texto NO contiene la letra 'a' ni 'A'.");
            }

            System.out.println("--- Determinar el Mayor de Dos Números ---");

            // 1. Pedir los números al usuario
            System.out.print("Introduce el primer número (A): ");
            double numA = sc.nextDouble();

            System.out.print("Introduce el segundo número (B): ");
            double numB = sc.nextDouble();

            // -----------------------------------------------------------
            // Opción 1: Usando la Estructura Condicional if-else
            // -----------------------------------------------------------

            System.out.println("\n[Método 1: if-else]");

            if (numA > numB) {
                System.out.println("El mayor es A: " + numA);
            } else if (numB > numA) {
                System.out.println("El mayor es B: " + numB);
            } else {
                System.out.println("Ambos números son iguales: " + numA);
            }

            // -----------------------------------------------------------
            // Opción 2: Usando el Método de la Librería Math.max()
            // -----------------------------------------------------------

            // El método Math.max() devuelve directamente el valor más alto entre los dos.
            double mayorConMath = Math.max(numA, numB);

            System.out.println("\n[Método 2: Math.max()]");
            System.out.println("El número mayor es: " + mayorConMath);

            System.out.println("--- Comprobar Par o Impar ---");

            // 1. Pedir el número
            System.out.print("Introduce un número entero: ");

            // Se recomienda usar 'int' para esta operación
            int numero = sc.nextInt();

            // 2. Aplicar la lógica del módulo
            // La expresión (numero % 2) calcula el resto de dividir el número entre 2.
            if (numero % 2 == 0) {
                // El resto es 0, por lo tanto, es par.
                System.out.println("El número " + numero + " es PAR.");
            } else {
                // El resto es 1, por lo tanto, es impar.
                System.out.println("El número " + numero + " es IMPAR.");
            }

            System.out.println("--- Comprobar Positivo, Negativo o Cero ---");

            // 1. Pedir el número
            System.out.print("Introduce un número: ");

            // Usamos 'double' para permitir números con decimales
            double numero2 = sc.nextDouble();

            // 2. Aplicar la estructura condicional
            if (numero2 > 0) {
                // Condición 1: Si el número es mayor que 0, es positivo.
                System.out.println("El número " + numero2 +2  + "es POSITIVO.");
            } else if (numero2 < 0) {
                // Condición 2: Si el número no es positivo Y es menor que 0, es negativo.
                System.out.println("El número " + numero2 + " es NEGATIVO.");
            } else {
                // Condición 3: Si no es mayor que 0 y no es menor que 0, debe ser 0.
                System.out.println("El número es CERO.");
            }

            System.out.println("--- Convertir Nota Numérica a Calificación Textual ---");

            // 1. Pedir la nota
            System.out.print("Introduce la nota numérica (0.0 a 10.0): ");
            double nota = sc.nextDouble();

            String calificacionTextual;

            // 2. Aplicar la estructura condicional para determinar la calificación
            // Usamos la escala de calificación española (típicamente de 0 a 10)

            if (nota < 0 || nota > 10) {
                // Comprobación de nota fuera de rango
                calificacionTextual = "ERROR: Nota fuera del rango 0-10.";
            } else if (nota < 5) {
                // Rango: [0.0 - 5.0)
                calificacionTextual = "Insuficiente";
            } else if (nota < 6) {
                // Rango: [5.0 - 6.0)
                calificacionTextual = "Suficiente";
            } else if (nota < 7) {
                // Rango: [6.0 - 7.0)
                calificacionTextual = "Bien";
            } else if (nota < 9) {
                // Rango: [7.0 - 9.0)
                calificacionTextual = "Notable";
            } else {
                // Rango: [9.0 - 10.0] - El resto, incluyendo el 10
                calificacionTextual = "Sobresaliente";
            }

            // 3. Mostrar el resultado
            System.out.println("\n--- Resultado ---");
            System.out.println("Nota numérica: " + nota);
            System.out.println("Calificación textual: " + calificacionTextual);

            System.out.println("--- Comprobar Edad para Votar (>= 18) ---");

            // 1. Pedir la edad
            System.out.print("Introduce tu edad: ");

            // Usamos 'int' ya que la edad suele ser un número entero
            int edad = sc.nextInt();

            // 2. Aplicar la condición
            // La condición clave es: edad >= 18
            if (edad >= 18) {
                System.out.println("Con " + edad + " años, ¡SÍ puedes votar!");
            } else {
             // Se ejecuta si la condición (edad >= 18) es falsa
             int aniosFaltantes = 18 - edad;
             System.out.println("Con " + edad + " años, todavía NO puedes votar.");
             System.out.println("Te faltan " + aniosFaltantes + " años para alcanzar la mayoría de edad.");

             System.out.println("--- Comprobar Edad para Votar (>= 18) ---");

                // 1. Pedir la edadSystem.out.print("Introduce tu edad: ");

                // Usamos 'int' ya que la edad suele ser un número entero
              int edad1 = sc.nextInt();

                // 2. Aplicar la condición
                // La condición clave es: edad >= 18
              if (edad1 >= 18) {
                    System.out.println("Con " + edad + " años, ¡SÍ puedes votar!");
              } else {
                  // Se ejecuta si la condición (edad >= 18) es falsa
                  int faltan = 18 - edad;
                  System.out.println("Con " + edad + " años, todavía NO puedes votar.");
                  System.out.println("Te faltan " + faltan + " años para alcanzar la mayoría de edad.");


              }

                System.out.println("--- Calcular el Factorial de un Número ---");

                // 1. Pedir el número
                System.out.print("Introduce un número entero no negativo: ");
                int numero3 = sc.nextInt();

                // Variable para almacenar el resultado del factorial.
                // Se inicializa en 1, ya que el factorial de 0 es 1 y la multiplicación por 1 no afecta.
                long factorial = 1;

                // 2. Comprobación y cálculo
                if (numero3 < 0) {
                    System.out.println("El factorial no está definido para números negativos.");
                } else if (numero3 == 0) {
                    // Caso base: 0! = 1
                    System.out.println("El factorial de 0 es: 1");
                } else {
                    // Caso general: Usar un bucle for para multiplicar
                    for (i = 1; i <= numero3; i++) {
                        // Multiplicamos el factorial acumulado por el contador (i) en cada paso
                        factorial *= i; // Esto es equivalente a: factorial = factorial * i;
                    }

                    // 3. Mostrar el resultado
                    System.out.println("El factorial de " + numero3 + " (" + numero3 + "!) es: " + factorial);
                }


                System.out.println("--- Contar Vocales en una Cadena ---");

                        // 1. Pedir la frase
                System.out.print("Introduce una palabra o frase: ");
                String textovocales = sc.nextLine();

                        // Variable para almacenar el contador de vocales
                int contadorVocales = 0;

                        // 2. Simplificar el texto para la comprobación
                        // Convertimos todo a minúsculas para solo tener que comprobar (a, e, i, o, u)
                String text = textovocales.toLowerCase();

                        // 3. Recorrer el texto y contar
                        // Usamos un bucle for para iterar sobre cada carácter del texto
                for (i = 0; i < text.length(); i++) {
                            // Obtenemos el carácter en la posición 'i'
              char caracter = text.charAt(i);

                            // 4. Comprobar si el carácter es una vocal
                            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                                contadorVocales++;
                            }
                        }

                        // 5. Mostrar el resultado
                        System.out.println("\n--- Resultado ---");
                        System.out.println("Texto analizado: \"" + textovocales + "\"");
                        System.out.println("El número total de vocales es: " + contadorVocales);


                System.out.println("--- Repetir Mensaje N Veces ---");

                // 1. Pedir el mensaje
                System.out.print("Introduce el mensaje que deseas repetir: ");
                String mensaje = sc.nextLine();

                // 2. Pedir el número de veces (N)
                System.out.print("¿Cuántas veces (N) deseas repetirlo?: ");
                int nVeces = sc.nextInt();

                System.out.println("\n--- Mensaje Repetido (" + nVeces + " veces) ---");

                // 3. Aplicar el bucle for
                // El bucle empieza en i=1 y se ejecuta mientras i sea menor o igual a nVeces.
                for (i = 1; i <= nVeces; i++) {
                    System.out.println(i + ". " + mensaje);
                }



                // 1. Pedir el límite superior (N)
                System.out.print("Introduce el número límite (N): ");
                int N = sc.nextInt();

                System.out.println("\n--- Múltiplos de 3 hasta " + limite + " ---");

                // 2. Aplicar el bucle for
                // Recorremos todos los números desde 1 hasta el límite
                for (i = 1; i <=N ; i++) {
                    // 3. Aplicar la condición de múltiplo (operador módulo %)
                    // Si el resto de dividir 'i' entre 3 es 0, es un múltiplo de 3.
                    if (i % 3 == 0) {
                        System.out.print(i + " ");
                    }
                }

                System.out.println(); // Salto de línea al finalizar

                sc.close();
            }
        }
    }
}



