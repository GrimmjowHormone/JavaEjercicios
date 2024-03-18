package Tema4;

import java.util.Arrays;

public class EjercicioMatricesIrrgulares {

    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3, 4 }, { 5, 6 }, { 1, 4, 7, 9 }, { 10, 1, 2 } };
        int[][] b = { { 9, 5, 6 }, { 7, 3, 5, 6 }, { 2, 6, 1, 8 } };
        mostrarMatrizMaxima(a, b);

    }

    static void mostrarMatrizMaxima(int[][] a, int[][] b) {

        int[][] c = matrizMaxima(a, b);
        for (int[] fila : c) {
            System.out.println(Arrays.toString(fila));
        }
    }

    static int[][] crearMatriz(int[][] a, int[][] b) {
        // el siguiente ternario regresa el valor de a o b segun cual tenga mas filas
        int filas = a.length > b.length ? a.length : b.length;
        // inicializamos el nuevo arreglo con la cantidad de filas que regresa el valor
        // ternario
        int[][] s = new int[filas][];

        for (int i = 0; i < filas; i++) {
            // CASO 1: A tiene mas filas que b

            if (i >= b.length) {
                int columnas = a[i].length;
                s[i] = new int[columnas];
            }
            // CASO 2: si en a no existe fila
            else if (i >= a.length) {
                int columnas = b[i].length;
                s[i] = new int[columnas];
            }
            // CASO 3: si en a y b existe la fila
            else {
                int columnas = a[i].length > b[i].length ? a[i].length : b[i].length;
                s[i] = new int[columnas];
            }

        }
        return s;

    }

    static int[][] matrizMaxima(int[][] a, int[][] b) {

        int[][] c = crearMatriz(a, b);

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                // CASO 1: A tiene mas filas que b

                // si en b no existe la fila
                if (i >= b.length) {

                    c[i][j] = a[i][j];
                }

                // CASO 2: si en a no existe la fila
                else if (i >= a.length) {
                    c[i][j] = b[i][j];
                } // CASO 3: si en a y en b existe la fila
                else {
                    // CASO 3.1 : si en b no existe la columna
                    if (j >= b[i].length) {
                        c[i][j] = a[i][j];
                    }
                    // CASO 3.2 :si en a no existe la columna
                    else if (j >= a[i].length) {
                        c[i][j] = b[i][j];
                    }
                    // CASO 3.3 :si en a y en b existe la columna
                    else {
                        c[i][j] = a[i][j] > b[i][j] ? a[i][j] : b[i][j];
                    }
                }
            }
        }
        return c;
    }
}
