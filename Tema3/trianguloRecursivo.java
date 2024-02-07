package Tema3;

public class trianguloRecursivo {
    public static void main(String[] args) {
      triangulo(4);
        //triangulo(4);
    }

    /**
     * Dibuja la linea del triangulo con la altura
     * @param altura
     */
    static void trianguloFila(int altura){

        if (altura>0) {
            System.out.print("x ");
            trianguloFila(altura-1);
        }else System.out.println();
       
       
    }
    /**
     * Dibuja el triangulo utilizando el metodo de la fila pero le resta 1 cada vez
     * @param altura es la altura de la fila
     */
    static void triangulo(int altura){
        if (altura>0) {
            triangulo(altura-1);
            trianguloFila(altura);
        }
    }
}
