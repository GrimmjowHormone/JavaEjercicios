package JavaFiguras;

import java.util.Scanner;

// Crear un programa en JAVA que dibuje un rectángulo formado
// por asteriscos(*). Se deben pedir base y altura por teclado.
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        int base=0,altura=0;
        System.out.println("Introduce la base: ");
        base=entrada.nextInt();
        entrada.nextLine();
        System.out.println("Introduce la altura: ");
        altura=entrada.nextInt();
        entrada.close();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1) {
                    System.out.print("x");
                } else {
                    if (j == 0 || j == base - 1) {
                        System.out.print(j);
                    } else
                        System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
}
