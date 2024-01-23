package Tema3.MetodosJava;

import java.util.Scanner;

public class Ejercicio3 {
    // Implementa un metodo qué, dados dos numeros,los multiplique.
    // Implementa un metodo qué, dado un numero, muestres su tabla de multiplicar.
    // Implementa un metodo qué, dado un numero, muestre si este es par.
    public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
        // System.out.println("Introduzca el primer numero a multiplicar: ");
        // int a=entrada.nextInt();
        // entrada.nextLine();
        // System.out.println("Introduzca el segundo numero a multiplicar: ");
        // int b=entrada.nextInt();
         System.out.println("Introduzca un numero para generar el menu:");
        int num=entrada.nextInt();
        entrada.close();
        menu(num);
        // entrada.close();
        // System.out.println("El producto de los numeros"+a+" y "+b+" es
        // "+multiplicar(a, b));
        // tablaMul(num);

    }

    static double multiplicar(double a, double b) {
        return a * b;
    }

    static void par(int num) {
        if (num % 2 == 0) {
            System.out.println("El numero " + num + " es par");
        } else
            System.out.println("El numero " + num + " No es par");
    }

    static void tablaMul(int num) {
        System.out.println("la tabla de multiplicar del numero " + num + " es : ");
        for (int i = 1; i < 13; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
    static void menu(int opciones){
        System.out.println("=====Menu Principal=====");
        
        for (int i = 1; i <=opciones; i++) {
            System.out.println(i+"- Seleccionar esta opción ");
        }
        System.out.println(opciones+1+" SALIR");
    
    }
}
