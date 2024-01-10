package EjerciciosJavaDaw;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int numero = 0, aux = 0, capicuaInicio = 0, capicuaFinal = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero capicua");
        numero = entrada.nextInt();
        aux = numero;
        capicuaFinal = numero % 10;
        while (numero > 9) {
            
            numero /= 10;
            if (numero < 9) {
                capicuaInicio = numero;
            }

           
        }
        System.out.println(capicuaInicio+" "+capicuaFinal );
         if (capicuaInicio == capicuaFinal) {
                
                System.out.println("El numero " + aux + " es capicua");
            } else
                System.out.println("El numero " + aux + " no es capicua");
        entrada.close();

    }

}
