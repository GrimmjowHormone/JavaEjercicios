package Tema4.Ejemplos;

public class MatricesIrregulares {

    public static void main(String[] args) {
        // int[][] b = { { 1, 2, 3 }, { 4, 5, 6, 7 },{},{ 8, 9 } };
        int b[][] = new int[10][];
     int contador=1;
        

        for (int i = 0; i < b.length; i++) {
            b[i]=new int[i+1];
            for (int j = 0; j < b[i].length; j++) {
                b[i][j]=contador++%10;
                if (b[i][j]==0) {
                    b[i][j]=1;
                }
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}