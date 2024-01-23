package Tema3.MetodosJava;

import java.util.Scanner;

public class Ejercicio2 {
    //Implemente un metodo que, dado un numeri, calcule el cubo.

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingresa el numero a elevar al cubo");
        int numero=entrada.nextInt();
        entrada.close();
        System.out.println("El cubo de tu numero es "+cubo(numero));
    }
    static int cubo(int numero){
        return numero*numero*numero;
    }
}
