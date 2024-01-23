package JavaFiguras;

import java.util.Scanner;

// Crea un programa en JAVA que dibuje un triángulo rectángulo
// sin relleno formado por asteriscos(*). Se debe pedir la altura del
// triángulo por teclado.
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la altura para dibujar su triangulo: ");
        int altura = entrada.nextInt();
        entrada.close();
        for (int i = 0; i < altura; i++) {
            System.out.println(" ");
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == altura - 1) {
                    System.out.print("x");
                } else
                    System.out.print(" ");

            }
            if (i==altura-1) {
                System.out.println(" ");
            }

        }
    }
}
