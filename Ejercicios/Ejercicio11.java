package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, altura;
        System.out.println("Vamos adibujar un rectangulo");
        System.out.println("introduce la base: ");
        base = sc.nextInt();
        System.out.println("introduce la altura: ");
        altura = sc.nextInt();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i==0 || i==altura-1) {
                    System.out.print(i);
                }else{
                    if (j==0 || j==base-1) {
                        System.out.print(j);
                    }else
                    System.out.print(" ");
                }
            }
            System.out.println();
            sc.close();
        }
        
        
    }
}

