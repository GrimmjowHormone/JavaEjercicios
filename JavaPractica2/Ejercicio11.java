package JavaPractica2;

import java.util.Scanner;

public class Ejercicio11 {
    // Escribe un programa Java que escriba en la salida estándar una línea de
    // texto dada con todas sus minúsculas convertidas en mayúsculas y viceversa,
    // sin cambiar ningún otro carácter; además, el programa debe devolver como
    // resultado el número de cambios realizados.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce una palabra u oración");
        String aux = "", cadena = entrada.nextLine();
        int mayus = 0, minus = 0;
        entrada.close();

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') {
                aux += "" + cadena.charAt(i);
            }
            if ((cadena.charAt(i) != Character.toUpperCase(cadena.charAt(i)))) {
                if (cadena.charAt(i) != ' ') {
                    aux += "" + Character.toUpperCase(cadena.charAt(i));
                    mayus++;
                }

            } else {
                if (cadena.charAt(i) != ' ') {
                    aux += "" + Character.toLowerCase(cadena.charAt(i));
                    minus++;
                }
            }

        }
        System.out.println("La frase o palabra con los cambios quedo como  " + aux + " la cantidad de cambios fueron "
                + minus + " minusculas y " + mayus + " mayusculas ");

    }
}
