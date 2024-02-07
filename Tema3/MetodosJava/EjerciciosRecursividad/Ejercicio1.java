package Tema3.MetodosJava.EjerciciosRecursividad;

import java.util.Scanner;

public class Ejercicio1 {
    // Crea un método que obtenga la cantidad de dígitos de un número N mayor que
    // cero. Se debe pasar como parámetro el número N.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int n = entrada.nextInt();
        int contador = 1;
        entrada.close();

        digitos(n, contador);
        System.out.println(digitos(n));
    }

    static void digitos(int n, int c) {
        if (n > 9) {
            n /= 10;
            c++;
            digitos(n, c);
        } else
            System.out.println("El numero tiene " + c + " digitos");

    }

    static int digitos(int n) {
        if (n == 0)
            return 0;
        return 1 + digitos(n / 10);

    }
}
