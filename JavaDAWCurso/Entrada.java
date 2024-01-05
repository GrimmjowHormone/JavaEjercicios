package JavaDAWCurso;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        String nombre;
        int n;
        System.out.println("Introduzca un número entero: ");
        n=entrada.nextInt();
        entrada.nextLine();
        System.out.println("El caudrado es: "+ Math.pow(n, 2));
        System.out.println("Introduzca su  nombre: ");
        nombre=entrada.nextLine();
        System.out.println("Hola "+nombre+"!!");
        entrada.close();
        
    }
}
