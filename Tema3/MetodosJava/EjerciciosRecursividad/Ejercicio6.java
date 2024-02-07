package Tema3.MetodosJava.EjerciciosRecursividad;

public class Ejercicio6 {
    // Crea un método que compruebe si una palabra está ordenada alfabéticamente.

    public static void main(String[] args) {
        mostrarAlfabeticamente("abCdeF");
       

    }
    static void mostrarAlfabeticamente(String cadena){
        cadena=cadena.toLowerCase();
        if (alfabeticamente(cadena)) {
            System.out.println("esta ordenada");
        }else{
            System.out.println("no esta ordenada");
        }
    }

    static boolean alfabeticamente(String palabra) {

        if (palabra.length() > 1) {

            if (palabra.charAt(0) < palabra.charAt(1)) {
                return alfabeticamente(palabra.substring(1, palabra.length()));
            }
            return false;

        }
        return true;

    }
}
