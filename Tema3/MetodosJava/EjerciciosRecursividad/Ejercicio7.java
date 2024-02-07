package Tema3.MetodosJava.EjerciciosRecursividad;

public class Ejercicio7 {
    // Crea un método que obtenga la suma de los números naturales desde 1 hasta N.
    // Se debe
    // pasar como parámetro el número N, debe ser mayor que cero.
    public static void main(String[] args) {
        mostrarSuma(3);
    }
        
    static void mostrarSuma(int n){
       System.out.println( sumaRecursiva(n, 0));
    }
    static int sumaRecursiva(int n, int contador) {
        
        if (n == 0) {
            
            System.out.print("\b=");
            return 0;

        }
        contador++;
        System.out.print(contador + "+");
        
        return n + sumaRecursiva(n - 1,contador);
    }

}
