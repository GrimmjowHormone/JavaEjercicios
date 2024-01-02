package JavaProyectos.Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        double numero1, numero2, mayor;
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduzca el primer numero");
        numero1 = entrada.nextDouble();
        System.out.println("introduzca el segundo numero");
        numero2 = entrada.nextDouble();

        mayor = numero1 > numero2 ? numero1 : numero2==numero1 ? numero1 :numero2;
        System.out.println("El mayor es: "+mayor);

        if (mayor % 2 == 0)
            System.out.println("Es divisible entre dos");
        else
            System.out.println("No es divisible entre dos");

        if (mayor % 5 == 0)
            System.out.println("Es divisible entre cinco");
        else
            System.out.println("No es divisible entre cinco");

            entrada.close();
    }
}
