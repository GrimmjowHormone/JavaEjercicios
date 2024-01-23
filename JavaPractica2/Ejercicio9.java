package JavaPractica2;

import java.util.Scanner;

public class Ejercicio9 {
    // Crea un programa en JAVA que reciba datos por teclado y escriba un
    // mensaje personalizado. El mensaje debe ser una única String que se deberá
    // imprimir por pantalla. Se deben pedir los siguientes datos: nombre,
    // apellidos,
    // edad a partir del año de nacimiento(mostramos edad y pedimos año de
    // nacimiento) y ciudad de residencia.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String  cadena="Tu nombre es ";
        int edad=2024;
        System.out.println("Ingresa tu nombre y apellidos: ");
        cadena+=entrada.nextLine();
        System.out.println("Ingresa tu año de nacimiento: ");
        cadena+=", tu edad son "+(edad-entrada.nextInt())+" años y resides en la ciudad de ";
        entrada.nextLine();
        System.out.println("Ingresa tu ciudad de residencia: ");
        cadena+=entrada.nextLine();
        System.out.println(cadena);
        entrada.close();
    }
}
