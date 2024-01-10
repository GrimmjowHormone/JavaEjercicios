package EjerciciosJavaDaw;

import java.util.Scanner;

public class Ejercicio6 {
//     Escribir un algoritmo que pida números enteros hasta que se introduzca un
// valor menor o igual a cero. A continuación debe mostrar la suma total de
// dichos números. Se deben incluir todos los números que hemos ido
// introduciendo por teclado. (Ejemplo. 3+4+5+6+8=26)
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        int numero=0,total=0;
        String cadenaSuma="";
        do {
            System.out.println("Introduce un numero");
            numero=entrada.nextInt();
           if (numero>0) {
             total+=numero;
             cadenaSuma+=numero+"+";
           }
            
        } while (numero!=0);
        System.out.println("La suma de "+cadenaSuma+"\b="+total);
        entrada.close();
    }
}
