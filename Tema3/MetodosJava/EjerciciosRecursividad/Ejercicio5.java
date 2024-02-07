package Tema3.MetodosJava.EjerciciosRecursividad;

public class Ejercicio5 {
    // 5. Crea un método que obtenga el número binario de un número N pasado como
    // parámetro.
    public static void main(String[] args) {
        System.out.println(conversion(10));

    }

    static int conversion(int n) {
        if (n == 0 || n == 1)
            return n;
        else
            return n%2+10*conversion(n/2);

    }

}
