package Tema4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EjercicioMatrices {
    // Debes utilizar los siguientes métodos:
    // static int[][] crearMatriz(int n ), para crear la matriz de tamaño n.
    // static void imprimirMatriz(int[][] m), para mostrar el contenido.
    public static void main(String[] args) {
        imprimirArreglo();
        System.out.println();
        matrizInversa(4);
        System.out.println();
        imprimirMatrizInvertida2(crearMatriz2(4));

    }

    static int[][] crearMatriz(int n) {
        int[][] matriz = new int[n][n];
        return matriz;
    }

    static void imprimirArreglo() {
        int contadorFilas = 0;

        for (int[] filas : crearMatriz(4)) {
            int contadorColumnas = 0;
            for (int i : filas) {

                if (contadorFilas == contadorColumnas) {
                    System.out.print("x ");

                } else
                    System.out.print(i + " ");
                contadorColumnas++;
            }
            contadorFilas++;
            System.out.println();
        }
    }

    static void matrizInversa(int n) {

        int contadorFilas = 0;

        for (int[] filas : crearMatriz(n)) {
            int contadorColumnas = n;
            for (int i : filas) {
                contadorColumnas--;
                if (contadorFilas == contadorColumnas) {
                    System.out.print("x ");

                } else
                    System.out.print(i + " ");

            }
            contadorFilas++;

            System.out.println();
        }
    }

    static void imprimirMatrizInvertida2(int[][] m) {
        for (int[] fila : m) {
            String linea = "";
            for (int columna : fila) {
                if (columna == 1)
                    linea = "x " + linea;
                else
                    linea = "- " + linea;
            }
            System.out.println(linea);
        }
    }

    static int[][] crearMatriz2(int n) {
        int[][] m = new int[n][n];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                if (i == j)
                    m[i][j] = 1;

                else
                    m[i][j] = 0;

        return m;
    }
}