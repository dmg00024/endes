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
public static void main(String[] args) {
    System.out.println("Suma primeros 10 naturales: " + sumarPrimerosDiez());
}
//7.Unir dos frases
public static String unirFrases(String frase1, String frase2) {
    return frase1 + " " + frase2;
}
/**unión de frases*/
public static void main(String[] args) {
    System.out.println("Frase unida: " + unirFrases("Hola Luismi,", "bienvenido a Java"));
}



