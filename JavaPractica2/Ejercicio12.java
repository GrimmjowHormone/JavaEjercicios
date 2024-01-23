package JavaPractica2;

import java.util.Scanner;

public class Ejercicio12 {
    // Crear un programa en JAVA que lea por teclado una frase e indique la letra
    // que aparece con más frecuencia y las veces que ha aparecido.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una frase para saber cual letra se repite más: ");
        String letraActual = "", frase = entrada.nextLine();
        entrada.close();
        int contador = 0, maximo = 0;

        for (int i = 0; i < frase.length(); i++) {

            for (int j = 0; j < frase.length(); j++) {
                if (frase.charAt(i) == frase.charAt(j)) {

                    contador++;
                }
                if (maximo < contador) {
                    maximo = contador;
                    letraActual = "" + frase.charAt(i);
                }
            }
            contador = 0;
        }
        System.out.println("la letra que mas se repitio fue " + letraActual + " y se repitio " + maximo);
    }
}
