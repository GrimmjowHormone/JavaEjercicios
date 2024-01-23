package JavaPractica2;

import java.util.Scanner;

public class Ejercicio10 {
    // Crea un programa en JAVA que reciba 10 palabras y luego nos muestre la
    // que tiene una longitud mayor.
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        String palabra="",masLarga="";
       
        for (int i = 1; i <11; i++) {
            System.out.println("Introduzca la palabra "+i+": ");
            palabra=entrada.nextLine();
            if (palabra.length()>masLarga.length()) {
                masLarga=palabra;
            }
        }
        System.out.println("La palabra con mas letras fue: "+masLarga+" con "+masLarga.length()+" letras ");
        entrada.close();
    }
}
