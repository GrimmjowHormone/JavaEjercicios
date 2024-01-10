package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        double nota1, nota2, nota3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzaca las notas: ");
        System.out.println("Introduce la primera nota ");
        nota1 = entrada.nextDouble();
        System.out.println("Introduce la segunda nota ");

        nota2 = entrada.nextDouble();
        System.out.println("Introduce la tercera nota ");

        nota3 = entrada.nextDouble();
        double resultado = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio es: " + resultado);
        if (resultado<=6) {
            System.out.println("No aprobado");
            
        }else if(resultado>=6 && resultado<=10){
            System.out.println("Aprobaste");
        }else{
            System.out.println("Introduce valores validos en las notas ");
        }
        entrada.close();
    }
}
