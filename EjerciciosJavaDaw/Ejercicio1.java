package EjerciciosJavaDaw;
import java.util.Scanner;

public class Ejercicio1 {

    // Leer una cantidad 'N' y luego introducir 'N' números enteros. Se pide
    // imprimir
    // el mayor y el menor y las veces que aparece cada uno.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, minContador = 0, maxContador = 0, numero = 0;
        System.out.println("Introduce cuantos valores necesitas");
        int cantidad = entrada.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduce el valor " + (i + 1));
            numero = entrada.nextInt();
          

            if (numero > mayor) {
                mayor = numero;
                maxContador = 1;
            } else if (numero == mayor) {
                maxContador++;
            }
            if (numero < menor) {
                menor = numero;
                minContador = 1;
            } else if (numero == menor) {
                minContador++;
            }
        }

        System.out.println(
                "El valor minimo es " + menor + " y se repitio " + minContador
                        + (minContador == 1 ? " vez" : " veces"));
        System.out.println(
                "El valor minimo es " + mayor + " y se repitio " + maxContador
                        + (maxContador == 1 ? " vez" : " veces"));

        entrada.close();

    }
}
