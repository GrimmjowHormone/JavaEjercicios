package JavaFiguras;

import java.util.Scanner;

public class Ejercicio3 {
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
                System.out.print("x");
            }
            
            System.out.println();
        }
    }
}
