package EjerciciosJavaDaw;
// Dado un número, determinar cuántos dígitos tiene. No se pueden utilizar ni
// variables ni funciones de tipo String.

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = entrada.nextInt();
        int cifras = 1;
        if (numero<0) {
          System.out.println("Favor de introducir un numero positivo o valido");  
        }else{
        while (numero >9 ) {
            numero /= 10;
          
            cifras++;
        }
        System.out.println("El numero introducido tiene " + cifras + " " + (cifras == 1 ? " cifra" : "cifras"));
    }
        entrada.close();
    }
}
