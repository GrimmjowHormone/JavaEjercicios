package Tema4.Ejemplos;

import java.util.Arrays;

public class EjemplosArray3 {
    public static void main(String[] args) {
        int[][] array = { {1, 2, 3}, {4, 5}, {6, 7, 8} };
        for (int []i : array) {
            System.out.println(Arrays.toString(i));

        }
       
        System.out.println(Arrays.deepToString(array));
    }
}
