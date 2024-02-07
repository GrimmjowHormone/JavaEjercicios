package Tema4;

import java.util.Arrays;

public class EjerciciosArrays {
    // Crea un método que dado un Array de enteros y un valor entero, muestre la
    // cantidad de veces que aparece el entero en el Array.

    // Crea un método que reciba un Array de Strings y un char. Deberá mostrar
    // todas las Strings cuya primera letra sea el char pasado como parámetro.

    public static void main(String[] args) {
        int[] array = { 10, 2, 3, 4, 3, 25 };
        int[] array2 = { 4, 6, 3, 5, 3, 5, 6, 3 };
        String[] cadena = { "Other ways of saying for example", "exmple", "Anita lava la tina",
                "Es diferente hacerlo asi" };
        maxString(cadena);
        aparece(array, 3);
        primerChar(cadena, 'A');
        nuevoArreglo(array, array2);
    }

    static void aparece(int[] array, int n) {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                contador++;
            }
        }
        System.out.println(contador);
    }
    // Crea un método que reciba un Array de Strings y muestre la String más larga.

    static void maxString(String[] cadena) {
        String max = "";
        for (int i = 0; i < cadena.length; i++) {
            if (cadena[i].length() > max.length()) {
                max = cadena[i];
            }
        }
        System.out.println("La String más larga es: " + max);
    }

    static void primerChar(String[] cadena, char c) {
        for (int i = 0; i < cadena.length; i++) {
            if (cadena[i].charAt(0) == c) {
                System.out.println(cadena[i]);
            }
        }
    }

    // Crea un método que reciba dos Arrays como parámetros, y devuelva un Array
    // con los valores máximos en cada una de las posiciones. Se debe tener en
    // cuenta que los Arrays podrán ser de tamaños distintos.
    static int[] nuevoArreglo(int[] a, int[] b) {
        int[] c;
        if (a.length > b.length)
            c = new int[b.length];
        else
            c = new int[a.length];

        for (int i = 0; i < c.length; i++) {
            if (a[i] > b[i])
                c[i] = a[i];
            else
                c[i] = b[i];
        System.out.print(c[i] + " ");
        }
        return c;
    }
}
