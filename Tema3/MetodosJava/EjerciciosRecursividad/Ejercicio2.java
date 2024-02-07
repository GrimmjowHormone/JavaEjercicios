package Tema3.MetodosJava.EjerciciosRecursividad;

public class Ejercicio2 {
//Crear un metodo que obtenga el resultado de elevar un número a otro.
//Ambos números se deben pasar como parámetros. 
//Los números deben  ser positos
    public static void main(String[] args) {
       System.out.println( elevarNum(2, 2));
    }

    static int elevarNum(int numero,int potencia){
        if (potencia==0)return 1;
        return numero*elevarNum(numero, potencia-1);
        
    }
}


