package EjerciciosJavaDaw;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 10 para mostrar su tabla");

        int numero = entrada.nextInt();
        if (numero>0 && numero<11) {
            for (int i = 0; i < 10; i++) {
                System.out.println(numero+" x "+(i+1));
            }
        }
    }
}
