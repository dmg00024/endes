void main()
{}

// 1. Saludar
public static String saludar(String nombre) {
    return "Hola, " + nombre;
    /**saludamos al usuario*/
    System.out.println(saludar("luismi"));
    }
// 2. Sumar
public static int sumar(int a, int b) {
    return a + b;
/**calculamos suma*/
    System.out.println("Suma: " + sumar(5, 3));
}
// 3. Área de un cuadrado
    public static int areaCuadrado(int lado) {
        return lado * lado;
    /**calculamos el area de un cuadrado*/
        System.out.println("Área cuadrado: " + areaCuadrado(4));
}
// 4. Verificar si un número es positivo
public static boolean esPositivo(int numero) {
    return numero > 0;

    /**comprobamos si el numero es positivo*/
    System.out.println("¿Es positivo?: " + esPositivo(-3));
}
// 5. Obtener el último carácter de un texto
public static char ultimoCaracter(String texto) {
    return texto.charAt(texto.length() - 1);
    /**obtenemos el ultimo caracter*/
    System.out.println("Último carácter: " + ultimoCaracter("Copilot"));
}
//6.Suma de los diez primeros numeros naturales
public static int sumarPrimerosDiez() {
    int suma = 0;
    for (int i = 1; i <= 10; i++) {
        suma += i;
    }
    return suma;

}
/**Llamamos la suma de los numeros naturales*/
public static int main(String[] args) {
    System.out.println("Suma primeros 10 naturales: " + sumarPrimerosDiez());
}
//7.Unir dos frases
public static String unirFrases(String frase1, String frase2) {
    return frase1 + " " + frase2;
}
/**unión de frases*/
public static int main(String[] args) {
    System.out.println("Frase unida: " + unirFrases("Hola Luismi,", "bienvenido a Java"));
}

//8.Suma del 1 hasta el 100
//param numeros del 1-100
// return suma numeros
public static int sumarHasta100() {
    int suma = 0;
    for (int i = 1; i <= 100; i++) suma += i;
    return suma;
}
//9. contar letras
//param letras
//return Conteo de letras
public static int contarLetras(String palabra) { return palabra.length(); }
//10. Un numero mayor>
//param numeros
//return x es mayor que
public static int mayor(int a, int b) { return (a > b) ? a : b; }
  // 11. Comprobar si un texto contiene la letra 'a'
// param: texto (cadena a evaluar)
// return: true si contiene 'a' o 'A', false en caso contrario

  public static boolean contieneA(String texto) {
      return texto.toLowerCase().contains("a");
  }
/**11.Comprobamos la letra "A"*/

public static void main(String[] args) {
    System.out.println(contieneA("perro")); // false
    System.out.println(contieneA("Java"));  // true
}
//12. comprobar si puede votar
// param: edad (años)
// return: true si edad >= 18, false en caso contrario
public static boolean puedeVotar(int edad) {
    return edad >= 18;
/**12.comprobamos si pòdemos votar*/
    System.out.println(puedeVotar(20));
}
//13.División de dos numeros
// param: a (dividendo), b (divisor)
// return: resultado de la división
public static double dividir(double a, double b) {
    if (b == 0) {
        System.out.println("Error: división por cero");
        return 0;
    }
    return a / b;
}
//14.Función de resta
// param: a (minuendo), b (sustraendo)
// return: resultado de la resta
public static int restar(int a, int b) {
    return a - b;
}
//15.Calcular el cuadrado de un numero
// param: n (número a elevar)
// return: resultado de n al cuadrado
public static int cuadrado(int n) {
    return n * n;
}



