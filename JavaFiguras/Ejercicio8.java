package JavaFiguras;

import java.util.Scanner;

public class Ejercicio8 {
    // Crea un programa en JAVA que dibuje un triángulo equilátero
    // sin relleno formado por asteriscos(*). Se debe pedir la altura del
    // triángulo por teclado.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la altura para dibujar su triangulo: ");
        int altura = entrada.nextInt();

        entrada.close();
        for (int i = 0; i < altura; i++) {
            System.out.println("");
            for (int j = altura; j > i; j--) {

                System.out.print(" ");

            }
            for (int j = 0; j < i; j++) {
                if (i == altura - 1)
                    System.out.print("x");

                else if (j == 0) {
                    System.out.print("1");

                } else
                    System.out.print(" ");

                System.out.print(" ");

            }
            System.out.print("x");
        }
        System.out.println();

    }
}
