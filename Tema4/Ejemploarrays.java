package Tema4;

public class Ejemploarrays {
    public static void main(String[] args) {
        int[] array=new int[6];
        array[3]=7;
        array[5]=array[3]*2;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
