package JavaPractica2;

import java.util.Scanner;

public class Ejercicio7 {
    // Escribe un programa que indica si todos los caracteres contenidos en un
    // string dado como parámetro corresponden a letras (mayúsculas o
    // minúsculas)
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una palabra u oración");
        String mayusculas = "", minusculas = "", palabra = entrada.nextLine();
       
        entrada.close();
        for (int i = 0; i < palabra.length(); i++) {

          
            if (palabra.charAt(i) == Character.toUpperCase(palabra.charAt(i)) && palabra.charAt(i)!=' ') {
                mayusculas += "" + palabra.charAt(i);

            } else
                minusculas += "" + palabra.charAt(i);
        }
        if (palabra.equals(palabra.toUpperCase())) {
            System.out.println("Del String " + palabra + " todas sus letras son MAYUSCULAS");

        } else if (palabra.equals(palabra.toLowerCase())) {
            System.out.println("Del String " + palabra + " todas sus letras son minusculas");

        } else {
           
            System.out.println("Del String " + palabra + " las letras mayusculas son " + mayusculas);
            System.out.println("Del String " + palabra + " las letras mayusculas son " + minusculas);

        }

    }
}
