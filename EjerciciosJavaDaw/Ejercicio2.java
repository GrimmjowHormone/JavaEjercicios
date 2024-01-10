package EjerciciosJavaDaw;

import java.util.Scanner;

public class Ejercicio2 {
//     Introducir 10 números y decir si alguno ha sido negativo e indicar el valor
// máximo introducido.
    public static void main(String[] args) {
        int numeros = 1, contador = 1,contadorNega=0,aux=Integer.MIN_VALUE;
        String negativos="";
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Introduzca el numero ");
            numeros=entrada.nextInt();
            if (numeros<0) {
                negativos+=numeros+" ";
                contadorNega++;
            }
            if (numeros>aux) {
                aux=numeros;
            }
            contador++;
        } while (contador <= 10);
        if (contadorNega>=1) {
                    System.out.println((contadorNega>1?"Los negativos son ":"Solo hay un negativo y es ")+negativos +" y el valor maximo introducido es "+aux);

        }
        else
        System.out.println("No hay negativos y el valor maximo introducido es "+aux);
        entrada.close();
    }

}
