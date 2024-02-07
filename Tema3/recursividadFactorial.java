package Tema3;

public class recursividadFactorial {
    public static void main(String[] args) {
        System.out.println("el factorial de 4 es:" + factorial(4));
    }

    static int factorial(int n) {

        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
