package Tema3.MetodosJava.EjerciciosRecursividad;

public class Ejercicio3 {
    // Crea un método que dado un numero, lo imprima invertido por pantalla
    public static void main(String[] args) {
        System.out.println(invertido(951));
    }

    static int invertido(int numero) {
        if (numero > 9) {
            System.out.print(numero % 10);
            return invertido(numero / 10);
        }
        return numero;
    }

}
