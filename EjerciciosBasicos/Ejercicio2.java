package EjerciciosJava.Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    
   public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     System.out.println("Introduzca el radio del circulo");
     double radio = entrada.nextDouble();

     double areaCirculo=Math.PI*(Math.pow(radio, 2));

     System.out.println("El area del circulo es "+areaCirculo );

   }
}
