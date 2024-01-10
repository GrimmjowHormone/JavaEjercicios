package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int entradas;
        double precio;
        char miembro;
        String dia;
        Scanner input = new Scanner(System.in);

        System.out.println("Cuantas entradas necesitas?");
        entradas = input.nextInt();
        System.out.println("Para que dia son las entradas ");
        input.nextLine();
        dia = input.nextLine();
        System.out.println("Cuentas con membresía (S/N)");
        miembro = input.next().charAt(0);

        boolean esJueves = dia.equalsIgnoreCase("jueves");
        boolean esMiercoles = dia.equalsIgnoreCase("miercoles");
        boolean esPar = entradas % 2 == 0;
        boolean esMiembro = miembro == 's' || miembro == 'S';

        if (esMiercoles) {
            precio = 5;
            if (esMiembro) 
                precio *= 0.9;
        } else {
            precio = 8;
            if (esMiembro)
            precio *= 0.9;
        }
        if (esJueves) {
            precio = 11;
            if (esPar) {
                if (esMiembro) {
                    precio *= 0.9;
                    System.out.println("El total seria de: $" + ((precio * entradas / 2)));
                } else
                    System.out.println("El total seria de: $" + ((precio * entradas / 2)));
            } else {
                if (esMiembro) {
                    precio *= 0.9;
                    System.out.println("El total seria de: $" + ((precio * (entradas - 1) / 2) + 7.2));
                } else
                    System.out.println("El total  seria de: $" + ((precio * (entradas - 1) / 2) + 8));
            }
        } else
            System.out.println("El total seria de: $" + ((precio * entradas)));
        input.close();
    }
}
