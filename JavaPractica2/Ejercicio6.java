package JavaPractica2;

import java.util.Scanner;

public class Ejercicio6 {
    // Crea un programa en JAVA que reciba una palabra por teclado e indique si es
    // un palíndromo. Un palíndromo es una palabra que se lee igual de derecha a
    // izquierda, y de izquierda a derecha. Ejemplo: RECONOCER
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String palindromo = "", palabra = entrada.nextLine();
        int desContador = palabra.length()-1;
        entrada.close();
        for (int i = 0; i < palabra.length(); i++) {
            palindromo += "" + palabra.charAt(desContador);
            desContador--;
           
        }
        
        if (palabra.equalsIgnoreCase(palindromo)) {
            System.out.println("La palabra " + palabra + " es un palindromo");
        } else
            System.out.println("La palabra "+palabra+" no es palindromo");
    }
}
