package JavaFiguras;

import java.util.Scanner;

public class Ejercicio2 {
    // Crea un programa en JAVA que dibuje un cuadrado sin relleno
    // formado por asteriscos(*). Se debe pedir el lado del cuadrado por
    // teclado
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int lado = entrada.nextInt();
        entrada.close();
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i == 0 || i == lado - 1) {
                    System.out.print("x");
                } else {
                    if (j == 0 || j == lado - 1) {
                        System.out.print(j);
                    } else
                        System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
