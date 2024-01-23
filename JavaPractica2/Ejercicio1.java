package JavaPractica2;

import java.util.Scanner;

public class Ejercicio1 {
    // Crea un programa que te pida tu nombre y escriba la primera letra en
    // mayúsculas y el resto en minúsculas.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String caracter, nombre = entrada.next();
        nombre = nombre.toLowerCase();
        caracter = "" + nombre.charAt(0);
        System.out.println(nombre.replaceFirst(caracter, caracter.toUpperCase()));
        entrada.close();

    }
}
