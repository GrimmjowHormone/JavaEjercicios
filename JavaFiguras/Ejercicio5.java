package JavaFiguras;

import java.util.Scanner;

public class Ejercicio5 {
    // Crea un programa en JAVA que dibuje un triángulo rectángulo
    // formado por asteriscos(*). Se debe pedir la altura del triángulo por
    // teclado.
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduzca la altura para dibujar su triangulo: ");
        int altura=entrada.nextInt();
       
        entrada.close();
        for (int i = 1; i <altura; i++) {
            System.out.println("i");
            for (int j = 0; j <i; j++) {
                System.out.print("j ");
               
            }
            if (i==altura-1) {
                System.out.println("x ");
            }
        }
    }
}
