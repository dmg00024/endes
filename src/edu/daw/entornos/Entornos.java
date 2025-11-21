package edu.daw.entornos;

/**
 * Clase de ejemplo que muestra funciones básicas en Java:
 * - un método sin parámetros ni valor de retorno (saludar)
 * - un método con parámetros y retorno (sumar)
 * - un método que trabaja con tipos {@code double} para calcular un promedio
 *
 * Esta clase contiene un método {@code main} para ejecutar ejemplos de uso.
 */
public class Entornos {

    /**
     * Punto de entrada de la aplicación. Ejecuta ejemplos de uso de los métodos
     * {@link #saludar()}, {@link #sumar(int, int)} y {@link #calcularPromedio3(double, double, double)}.
     *
     * @param args argumentos de línea de comandos (no se usan)
     */
    public static void main(String[] args) {
        saludar();

        int resultado = sumar(5, 7);
        System.out.println("La suma de 5 y 7 es: " + resultado);

        double media = calcularPromedio3(8.5, 6.0, 9.0);
        System.out.println("La media es: " + media);

        String nombre = "Sergio";
        String apellidos = "Uriel";

        System.out.println("El nombre completo: " + nombreCompleto(nombre, apellidos));
    }

    /**
     * Muestra un mensaje de saludo por consola.
     *
     * Uso típico:
     * <pre>
     * Entornos.saludar();
     * </pre>
     *
     * Este método no recibe parámetros y no devuelve ningún valor.
     */
    public static void saludar() {
        System.out.println("¡Hola! Este es mi primer programa en Java.");
    }

    /**
     * Calcula la suma de dos enteros.
     *
     * @param a primer sumando
     * @param b segundo sumando
     * @return la suma de {@code a} y {@code b}
     *
     * Ejemplo:
     * <pre>
     * int s = Entornos.sumar(3, 4); // s == 7
     * </pre>
     */
    public static int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Calcula el promedio aritmético de tres números reales.
     *
     * @param n1 primer número
     * @param n2 segundo número
     * @param n3 tercer número
     * @return el promedio {@code (n1 + n2 + n3) / 3}
     *
     * Nota: Si alguno de los valores es {@code Double.NaN}, el resultado será {@code NaN}.
     */
    public static double calcularPromedio3(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    /**
     *
     * @param nombre
     * @param apellidos
     * @return nombre completo concatenado
     */
    public static String nombreCompleto (String nombre, String apellidos) {
        return nombre + " " + apellidos;
    }
    public class SumaNumeros {
        public static void main(String[] args) {
            double num1 = 15.5;
            double num2 = 24.3;

            double suma = num1 + num2;

            System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
        }
    }
    public class DobleNumero {
        public static void main(String[] args) {
            double numero = 12.0;

            double doble = numero * 2;

            System.out.println("El doble de " + numero + " es: " + doble);
        }
    }
    public class AreaCuadrado {
        public static void main(String[] args) {
            double lado = 5.0;

            double area = lado * lado;

            System.out.println("El área del cuadrado con lado " + lado + " es: " + area);
        }
    }
    public class CelsiusAFahrenheit {
        public static void main(String[] args) {
            double celsius = 25.0;

            double fahrenheit = celsius * 9.0 / 5.0 + 32;

            System.out.println(celsius + "°C equivale a " + fahrenheit + "°F");
        }
    }
    public class SumaPrimerosNumeros {
        public static void main(String[] args) {
            // Método 1: Usando un bucle for
            int suma = 0;
            for (int i = 1; i <= 10; i++) {
                suma += i;
            }

            System.out.println("La suma de los primeros 10 números naturales es: " + suma);

            // Método 2: Usando la fórmula matemática n*(n+1)/2
            int n = 10;
            int sumaFormula = n * (n + 1) / 2;
            System.out.println("Usando la fórmula: " + sumaFormula);
        }
    }
    public class SaludoPersonalizado {
        public static void main(String[] args) {
            String nombre = "Juan";

            String saludo = "¡Hola, " + nombre + "! Bienvenido.";

            System.out.println(saludo);
        }
    }
    public class TextoMayusculas {
        public static void main(String[] args) {
            String texto = "hola mundo";

            String textoMayusculas = texto.toUpperCase();

            System.out.println("Texto original: " + texto);
            System.out.println("Texto en mayúsculas: " + textoMayusculas);
        }
    }
    public class UnirFrases {
        public static void main(String[] args) {
            String frase1 = "Me gusta programar";
            String frase2 = "en Java";

            String fraseCompleta = frase1 + " " + frase2;

            System.out.println("Frase completa: " + fraseCompleta);
        }
    }
    public class ContarLetras {
        public static void main(String[] args) {
            String palabra = "programacion";

            int numeroLetras = palabra.length();

            System.out.println("La palabra '" + palabra + "' tiene " + numeroLetras + " letras");
        }
    }
    public class ContieneLetraA {
        public static void main(String[] args) {
            String texto = "Java es genial";

            boolean contieneA = texto.contains("a");

            System.out.println("Texto: " + texto);
            System.out.println("¿Contiene la letra 'a'? " + contieneA);

            if (contieneA) {
                System.out.println("Sí, el texto contiene la letra 'a'");
            } else {
                System.out.println("No, el texto NO contiene la letra 'a'");
            }
        }
    }
    public class MayorDeDos {
        public static void main(String[] args) {
            int num1 = 25;
            int num2 = 18;

            if (num1 > num2) {
                System.out.println("El número mayor es: " + num1);
            } else if (num2 > num1) {
                System.out.println("El número mayor es: " + num2);
            } else {
                System.out.println("Los números son iguales");
            }
        }
    }
    public class ParImpar {
        public static void main(String[] args) {
            int numero = 17;

            if (numero % 2 == 0) {
                System.out.println(numero + " es un número PAR");
            } else {
                System.out.println(numero + " es un número IMPAR");
            }
        }
    }
    public class PositivoNegativoCero {
        public static void main(String[] args) {
            int numero = -5;

            if (numero > 0) {
                System.out.println(numero + " es POSITIVO");
            } else if (numero < 0) {
                System.out.println(numero + " es NEGATIVO");
            } else {
                System.out.println("El número es CERO");
            }
        }
    }
    public class NotaCalificacion {
        public static void main(String[] args) {
            double nota = 7.5;

            System.out.println("Nota numérica: " + nota);

            if (nota >= 9) {
                System.out.println("Calificación: SOBRESALIENTE");
            } else if (nota >= 7) {
                System.out.println("Calificación: NOTABLE");
            } else if (nota >= 6) {
                System.out.println("Calificación: BIEN");
            } else if (nota >= 5) {
                System.out.println("Calificación: SUFICIENTE");
            } else {
                System.out.println("Calificación: INSUFICIENTE");
            }
        }
    }
    public class PuedeVotar {
        public static void main(String[] args) {
            int edad = 20;

            System.out.println("Edad: " + edad + " años");

            if (edad >= 18) {
                System.out.println("SÍ puede votar");
            } else {
                System.out.println("NO puede votar");
                int faltanAnios = 18 - edad;
                System.out.println("Faltan " + faltanAnios + " años para poder votar");
            }
        }
    }
    public class SumaHasta100 {
        public static void main(String[] args) {
            int suma = 0;

            for (int i = 1; i <= 100; i++) {
                suma += i;
            }

            System.out.println("La suma de los números del 1 al 100 es: " + suma);
        }
    }
    public class Factorial {
        public static void main(String[] args) {
            int numero = 5;
            int factorial = 1;

            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }

            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
    }
    public class ContarVocales {
        public static void main(String[] args) {
            String palabra = "programacion";
            int contadorVocales = 0;

            palabra = palabra.toLowerCase();

            for (int i = 0; i < palabra.length(); i++) {
                char letra = palabra.charAt(i);

                if (letra == 'a' || letra == 'e' || letra == 'i' ||
                        letra == 'o' || letra == 'u') {
                    contadorVocales++;
                }
            }

            System.out.println("La palabra '" + palabra + "' tiene " + contadorVocales + " vocales");
        }
    }
    public class MensajeRepetido {
        public static void main(String[] args) {
            String mensaje = "Hola Mundo";
            int veces = 5;

            System.out.println("Mostrando el mensaje " + veces + " veces:");

            for (int i = 1; i <= veces; i++) {
                System.out.println(i + ". " + mensaje);
            }
        }
    }
    public class MultiplosDeTres {
        public static void main(String[] args) {
            int numeroLimite = 30;

            System.out.println("Múltiplos de 3 hasta " + numeroLimite + ":");

            for (int i = 3; i <= numeroLimite; i += 3) {
                System.out.print(i + " ");
            }

            System.out.println();

            // Alternativa usando módulo
            System.out.println("\nUsando módulo:");
            for (int i = 1; i <= numeroLimite; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
    public class NumeroAleatorio {
        public static void main(String[] args) {
            int numeroAleatorio = (int)(Math.random() * 10) + 1;

            System.out.println("Número aleatorio generado entre 1 y 10: " + numeroAleatorio);
        }
    }
    public class AnioBisiesto {
        public static void main(String[] args) {
            int anio = 2024;

            boolean esBisiesto = false;

            if (anio % 4 == 0) {
                if (anio % 100 == 0) {
                    if (anio % 400 == 0) {
                        esBisiesto = true;
                    }
                } else {
                    esBisiesto = true;
                }
            }

            if (esBisiesto) {
                System.out.println(anio + " SÍ es un año bisiesto");
            } else {
                System.out.println(anio + " NO es un año bisiesto");
            }
        }
    }
    public class DiaSemana {
        public static void main(String[] args) {
            int numeroDia = 3;
            String dia;

            switch (numeroDia) {
                case 1:
                    dia = "Lunes";
                    break;
                case 2:
                    dia = "Martes";
                    break;
                case 3:
                    dia = "Miércoles";
                    break;
                case 4:
                    dia = "Jueves";
                    break;
                case 5:
                    dia = "Viernes";
                    break;
                case 6:
                    dia = "Sábado";
                    break;
                case 7:
                    dia = "Domingo";
                    break;
                default:
                    dia = "Número inválido (debe ser del 1 al 7)";
            }

            System.out.println("Día " + numeroDia + ": " + dia);
        }
    }
    public class TiradaDado {
        public static void main(String[] args) {
            int dado = (int)(Math.random() * 6) + 1;

            System.out.println("🎲 Tirando el dado...");
            System.out.println("Resultado: " + dado);
        }
    }
    public class MediaTresNumeros {
        public static void main(String[] args) {
            double num1 = 8.5;
            double num2 = 7.0;
            double num3 = 9.2;

            double media = (num1 + num2 + num3) / 3;

            System.out.println("Números: " + num1 + ", " + num2 + ", " + num3);
            System.out.println("La media es: " + media);
            System.out.printf("La media redondeada es: %.2f%n", media);
        }
    }
}
