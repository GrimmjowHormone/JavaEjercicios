package Tema3.MetodosJava;

import java.util.Scanner;

public class Ejercicio1 {
    //Implemente un metodo que, dado un nombre, muestre un saludo
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre=entrada.nextLine();
        entrada.close();
        System.out.println(saludo(nombre));
    }

    static String saludo(String nombre) {
        return "Hola papu,"+nombre;
    }
}
