package JavaFiguras;

import java.util.Scanner;

public class Ejercicio1 {
    // Crea un programa en JAVA que dibuje un cuadrado formado por
    // asteriscos(*). Se debe pedir el lado del cuadrado por teclado.
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("De cuanto es el lado del cuadrado: ");
        int lado=entrada.nextInt();
        entrada.close();
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print("x");
            }
            System.out.println("");
        }
    }
}
