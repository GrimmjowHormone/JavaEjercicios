package JavaPractica2;

import java.util.Scanner;

public class Ejercicio8 {
    // Escribe un programa que devuelve sin caracteres de espacio en blanco la
    // cadena indicada como parámetro
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        String cadenaSinEspacios="",cadena=entrada.nextLine();
        entrada.close();
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)!=' ') {
                cadenaSinEspacios+=""+cadena.charAt(i);
            }
        }
        System.out.println(cadenaSinEspacios);
    }
}
