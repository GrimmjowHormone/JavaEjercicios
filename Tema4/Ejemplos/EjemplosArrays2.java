package Tema4.Ejemplos;

import java.util.Random;

public class EjemplosArrays2 {
    public static void main(String[] args) {
        int[] array = crearArray(10,10);
        
        mostrarArray(array," . ");
        

    }

    static void mostrarArray(int[] n,String s) {
        for (int i = 0; i < n.length-1; i++) {
            System.out.print( n[i] +s);
        }
        System.out.println(n[n.length-1]);
    }

    static int[] crearArray(int elementos, int rango) {
        int[] array = new int[elementos];
        Random r=new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]=r.nextInt(rango)+1;
        }
        return array;
    }
}
