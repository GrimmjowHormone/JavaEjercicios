package EjerciciosJavaDaw;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int numero = 0, aux = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero para invertir sus cifras: ");

        numero = entrada.nextInt();
        while (numero > 9) {
            aux=numero%10;
            numero /= 10;
            System.out.print(aux);
        }
        System.out.println(numero);
        entrada.close();

    }
}
