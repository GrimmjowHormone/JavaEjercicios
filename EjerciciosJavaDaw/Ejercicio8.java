package EjerciciosJavaDaw;

import java.util.Scanner;

public class Ejercicio8 {
    // Dada una secuencia de números enteros acabada en 0, obtener la suma de
    // aquellos números tales que su número de cifras sea igual a la suma de las
    // mismas. Entrada: 1 5 111 66 201 273 0 | Salida: 1 + 111 + 201=313
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String resultado = "";
        int numero = 0;
        int total = 0;

        do {
            System.out.println("Introduce un numero positivo: ");
            numero = entrada.nextInt();
            int cifra = 1;
            int suma = numero % 10;
            int aux = numero;
            while (aux > 9) {
                aux /= 10;
                cifra++;
               
                suma += aux % 10;
              

            }
            if (cifra == suma) {
                resultado += numero + "+";
                total += numero;
            }
        } while (numero != 0);
        System.out.println(resultado + "\b=" + total);
        entrada.close();

        
    }
}
