package EjerciciosJavaDaw;

import java.util.Scanner;

public class Ejercicio9 {
//     Crea un programa que reciba un carácter. Si el carácter está en minúsculas,
// debe imprimir en pantalla el mismo carácter en mayúsculas, y viceversa. La
// única función de la clase String que se puede utilizar es CharAt().
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un caracter: ");

        char caracter = entrada.next().charAt(0);

        if (caracter == Character.toLowerCase(caracter))
            System.out.println("El caracter en mayusculas es " + (Character.toUpperCase(caracter)));

        else
            System.out.println("El caracter en mayusculas es " + (Character.toLowerCase(caracter)));

        entrada.close();

    }
}
