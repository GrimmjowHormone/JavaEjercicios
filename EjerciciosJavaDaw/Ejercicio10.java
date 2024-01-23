package EjerciciosJavaDaw;

public class Ejercicio10 {
    // Crea un programa en JAVA que dibuje N-1 cuadrados de lado 2 hasta lado N.
    // Es decir, de pequeño a grande. Los cuadrados estarán formados por el
    // carácter que hace referencia a la longitud del lado. Ejemplo para N=3:
    public static void main(String[] args) {
        int ncuadrados = 4;

        for (int i = 2; i <= ncuadrados; i++) {
            System.out.println("");
            for (int j = 0; j < i * i; j++) {
                if (j % i == 0) {
                    System.out.println("");
                }
                System.out.print(i);

            }
            System.out.println("");

        }
    }
}
