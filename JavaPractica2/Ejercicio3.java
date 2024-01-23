package JavaPractica2;

import java.util.Scanner;

public class Ejercicio3 {
    // Crea un programa que escriba un triángulo con las letras de una palabra
    // recibida por teclado,mostrando primero la primera letra, luego las dos
    // primeras y así sucesivamente: Ejemplo: Pepe
    // P
    // Pe
    // Pep
    // Pepe
   public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String nombre = "";
    
    System.out.println("Introduce un nombre: ");
    nombre = entrada.next();
    for (int i = 0; i < nombre.length(); i++) {
        
        for (int j = 0; j <=i; j++) {
            char caracter=nombre.charAt(j);
            System.out.print(caracter);
        }
        System.out.println();
    }
    
    
   
    entrada.close();
   }
}
