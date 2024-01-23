package JavaPractica2;

import java.util.Scanner;

public class Ejercicio2 {
    // Crea un programa que te pida un nombre y escriba las letras separadas por
    // espacios. Ejemplo, a partir de "Pepe" escribirá "P e p e ".
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre = "";

        System.out.println("Introduce un nombre: ");
        nombre = entrada.next();
        for (int i = 0; i < nombre.length(); i++) {

            char caracter = nombre.charAt(i);
            System.out.print(caracter + " ");

        }

        entrada.close();
    }
}
