package Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = 0;
        int intentos = 10;
        int random = (int) (Math.random() * 100 + 1);
       
        for (int i = 1; i < 11; i++) {
            System.out.println("Adivina el numero: ");
            entrada = sc.nextInt();
            if (entrada == random) {
                System.out.println("Felicidades adivinaste el numero");
                break;
            } else {
                if (entrada<random) {
                    System.out.println("El numero es mayor que el que introdujiste");
                }else{
                    System.out.println("El numero es menor que el que introdujiste");
                }
                intentos -= 1;
                System.out.println("Lo siento suerte para la proxima, te restan " + intentos + " intentos");
                if (i == 10) {
                    System.out.println("El numero era " + random);
                }

            }

        }
        sc.close();
    }
}
