package JavaDAWCurso;

import java.util.Scanner;

public class BuclesFor {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double media=0;
        System.out.println("Dime la cantidad de numeros que quieres: ");
        
        int cantidadNumeros=entrada.nextInt();

        for (int i = 1; i <=cantidadNumeros; i++) {
            System.out.println(" Dime un numero: "+i+" de "+cantidadNumeros);
            int num=entrada.nextInt();
            media+=num;
        }
        System.out.println("Gracias, el promedio es: "+media/cantidadNumeros);
        entrada.close();
    }
}

