package Tema3.MetodosJava.EjerciciosRecursividad;

public class Ejercicio4 {
    public static void main(String[] args) {
        if (binario(103)) {
            System.out.println("es binario");
        } else
            System.out.println("NO ES BINARIO");
    }

    static boolean binario(int numero) {

        if (numero >= 0 && numero < 10) {
            if (numero == 0 || numero == 1) {
                return true;
            }
            return false;

        }
        if (numero % 10 == 0 || numero % 10 == 1)
            return binario(numero / 10);
        return false;
    }
}
