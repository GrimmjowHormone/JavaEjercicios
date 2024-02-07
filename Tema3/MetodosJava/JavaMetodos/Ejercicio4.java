package Tema3.MetodosJava.JavaMetodos;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Seleccione una opción");
        int opcion = 0;
        int lado = 0;
        do {
            menu();
            opcion = entrada.nextInt();
            switch (opcion) {

                case 1:
                    lado = entrada(entrada);
                    cuadrado(lado);
                    break;
                case 2:
                    lado = entrada(entrada);
                    cuadradoSinRelleno(lado);
                    break;
                case 3:
                    lado = entrada(entrada);
                    triangulo(lado);
                    break;
                case 4:
                    lado = entrada(entrada);
                    trianguloSinRelleno(lado);
                    break;

            }
        } while (opcion != 5);
        entrada.close();
    }

    /**
     * Regresa el valor del lado
     * 
     * @return lado es el lado del cuadrado o triangulo
     */
    static int entrada(Scanner entrada) {
        System.out.println("Ingrese la altura o lado");
        int lado = entrada.nextInt();

        return lado;
    }

    /**
     * Dibuja un cuadrado con relleno
     * 
     * @param lado es el lado del cuadrado
     */

    static void cuadrado(int lado) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print("x ");
            }
            System.out.println("");
        }
    }

    /**
     * Dibuja un cuadrado sin relleno
     * 
     * @param lado es el lado del cuadrado
     */

    static void cuadradoSinRelleno(int lado) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i == 0 || i == lado - 1) {
                    System.out.print("x ");
                } else {
                    if (j == 0 || j == lado - 1) {
                        System.out.print("x ");
                    } else
                        System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

    /**
     * Dibuja un triangulo rectangulo
     * 
     * @param altura es la altura del triangulo
     */
    static void triangulo(int altura) {
        for (int i = 1; i < altura; i++) {
            System.out.println("x");
            for (int j = 0; j < i; j++) {
                System.out.print("x ");

            }
            if (i == altura - 1) {
                System.out.println("x");
            }
        }
    }

    /**
     * Dibuja un triangulo sin relleno
     * 
     * @param altura es la altura del triangulo
     */
    static void trianguloSinRelleno(int altura) {
        for (int i = 0; i < altura; i++) {
            System.out.println(" ");
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == altura - 1) {
                    System.out.print("x ");
                } else
                    System.out.print("  ");

            }
            if (i == altura - 1) {
                System.out.println(" ");
            }

        }
    }

    /** Imprime un menu */
    static void menu() {

        System.out.println("1- Dibujar un cuadrado");
        System.out.println("2- Dibujar un cuadrado sin relleno");
        System.out.println("3- Dibujar un triangulo");
        System.out.println("4- Dibujar un triangulo sin relleno");
        System.out.println("5- salir");

    }
}
