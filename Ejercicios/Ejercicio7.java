package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int numero;
        String cadena;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero(maximmo 5 cifras)");
        numero = entrada.nextInt();
        entrada.close();
        cadena = String.valueOf(numero);

        char primerCifra = cadena.charAt(0);
        char ultimaCifra = cadena.charAt((cadena.length() - 1));
        if (numero >= 0 && cadena.length() <=5)
            System.out.println("Del numero " + numero + " a primer cifra es: " + primerCifra + " la ultima cifra es: "
                    + ultimaCifra);

        else
            System.out.println("Numero invalido");

    }
}
