package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cual tabla quieres saber?");
        int entrada=sc.nextInt();
        System.out.println(" La tabla del "+entrada);
        for (int i = 1; i <13; i++) {
            System.out.println(entrada+" x "+i+" = "+entrada*i);

        }

        sc.close();
    }
}
