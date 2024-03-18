package Tema4;

/**
 * StringBordes
 */
public class StringBordes {
    static final char LINEA_HORIZONTAL = '═';
    static final char LINEA_VERTICAL = '║';
    static final char ESQUINASUPIZQ = '╔';
    static final char ESQUINAINFIZQ = '╚';
    static final char ESQUINASUPDER = '╗';
    static final char ESQUINAINFDER = '╝';
    static final char SEPERADORSUP = '╦';
    static final char SEPARADORINF = '╩';
    static final int BORDESUP = 0;
    static final int BORDEINF = 1;

    public static void main(String[] args) {
        String texto = """
                Programacion en java
                tema 4
                """;

        mostrarTitulo(texto);
    }

    static void mostrarTitulo(String cadena) {

        // pasando cadena a mayusculas
        cadena = cadena.toUpperCase();

        // obtenemos un array de strings
        String[] lineas = cadena.split("\n");

        // Obteniendo la longitud maxima del arreglo de lineas
        int lineaMax = lineaMaxima(lineas);

        // imprimimos el texto con los bordes
        imprimirCadena(lineas, lineaMax);

    }

    static void imprimirCadena(String[] lineas, int lineaMax) {

        // borde superior
        imprimirBordeSuperior(lineaMax);

        // metodo para imprimir lineas
        lineas(lineas, lineaMax);
        // borde inferior
        imprimirBordeInferior(lineaMax);
    }

    static int lineaMaxima(String[] lineas) {
        int lineaMax = 0;
        for (String lineaActual : lineas) {
            if (lineaActual.length() > lineaMax)
                lineaMax = lineaActual.length();
        }
        return lineaMax;
    }

    static void lineas(String[] lineas, int lineaMax) {
        // lineas centrales
        for (int i = 0; i < lineas.length; i++) {
            System.out.print(LINEA_VERTICAL + "  ");
            for (int j = 0; j < lineaMax; j++) {

                // en esta parte agrego un espacio por caracter agregado en la nueva cadena
                if (j < lineas[i].length()) {
                    System.out.print(lineas[i].charAt(j) + " ");
                } else
                    System.out.print("  ");

            }
            System.out.println(" " + LINEA_VERTICAL);
        }
    }

    static void imprimirBorde(int tipoBorde, int longitudCadena) {
        // borde superior
        System.out.print(tipoBorde == BORDESUP ? ESQUINASUPIZQ : ESQUINAINFIZQ);
        for (int i = 0; i < longitudCadena * 2 + 3; i++) {
            System.out.print(LINEA_HORIZONTAL);
        }
        System.out.println(tipoBorde == BORDESUP ? ESQUINASUPDER : ESQUINAINFDER);

    }

    static void imprimirBordeSuperior(int longitud) {
        imprimirBorde(BORDESUP, longitud);
    }

    static void imprimirBordeInferior(int longitud) {
        imprimirBorde(BORDEINF, longitud);
    }

}