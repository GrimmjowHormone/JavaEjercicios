package JavaPractica2;

import java.util.Scanner;

public class Ejercicio4 {
    // Crea un programa en JAVA que lea por teclado una cadena de texto e indique
    // la cantidad de palabras y la cantidad de letras que tiene
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int palabras = 1, letras = 1;
        System.out.println("Introduzca una oracion: ");
        String cadena = entrada.nextLine().trim();
        entrada.close();

        for (int i = 0; i < cadena.length() - 1; i++) {

            if (cadena.charAt(i) == ' ' && cadena.charAt(i + 1) != ' ') {

                palabras++;

            } else {
                if (cadena.charAt(i) != ' ') {
                    letras++;
                }
            }

            if (i>0) {
                
                if (cadena.charAt(i-1)==' '  && cadena.charAt(i+1)==' ') {
                    System.out.println("x");
                    palabras--;
                }
            }
        }

        System.out.println(cadena + " tiene " + palabras + " palabras  y " + letras + " letras");
    }
}

// papu y mamu