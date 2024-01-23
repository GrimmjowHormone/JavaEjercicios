package JavaPractica2;

import java.util.Scanner;

public class Ejercicio5 {
    // Escribe un programa Java que valide la hora representada en un String h con
    // formato HH:MM. Se considera que una hora es válida cuando su longitud es
    // 5 y contiene dos dígitos correctos seguidos de ': ' y dos dígitos correctos
    // más
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un hora con minutos");
        String hora = entrada.next();
        if (hora.charAt(2) == ':' && hora.length() <=5) 
            System.out.println("la hora es valida");
         else
            System.out.println("La hora no es valida");
        entrada.close();
        
    }
}
