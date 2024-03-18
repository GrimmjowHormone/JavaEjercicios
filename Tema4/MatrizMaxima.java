package Tema4;

public class MatrizMaxima {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3, 4 }, { 3, 2, 5, 6 }, { 1, 4, 7, 9 }, { 10, 1, 2 } };
        int[][] b = { { 9, 5, 2, 6 }, { 7, 3, 5, 6 }, { 2, 6, 1, 8 } };

        matrizMaxima(a, b);

    }

    

    static void matrizMaxima(int[][] a, int[][] b) {

        int[][] c = new int[a.length][];
        for (int i = 0; i < a.length; i++) {
            c[i] = new int[a[i].length];
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                if (b[i][j] > a[i][j]) {
                    c[i][j] = b[i][j];
                } else
                    c[i][j] = a[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}
