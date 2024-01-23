package JavaFiguras;

import java.util.Scanner;

public class Ejercicio9 {
    // 9. Crea un programa en JAVA que muestre un menú para
    // seleccionar qué figura se desea crear, el programa te deberá
    // hacer las siguientes preguntas:
    // a. En primer lugar te pedirá la cantidad de lados de la figura
    // b. A continuación se deberá mostrar un menú con las distintas
    // formas que se pueden elegir según los lados indicados.
    // c. A continuación deberá pedir si la figura se desea que tenga
    // relleno o NO. En caso de quererla con relleno, se deberá
    // pedir también el carácter de relleno, dicho carácter deberá
    // ser introducido por teclado.
    // d. En último lugar se deberán pedir las dimensiones de la
    // figura dependiendo del tipo de figura que se vaya a dibujar.
    // Además se nos debe ofrecer la opción del salir del programa. Si
    // seleccionamos dicha opción, el programa terminará y mostrará un
    // mensaje personalizado. El programa debe seguir pidiendo figuras
    // mientras no seleccionemos la opción de Salir.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int figura = 0;
        String relleno = "";
        String parrafo = "Selecciona una opción:\n" +
                "a) Dibujar figura de 3 lados.\n" +
                "b) Dibujar figura de 4 lados.\n" +
                "c) Salir.\n";

        System.out.println(parrafo);
        System.out.println("Introduzca su eleccion: ");
        String opcion = entrada.nextLine();
        opcion.toLowerCase();
        switch (opcion) {
            case "a":
            
                System.out.println("Un (1)triangulo equilatero o (2)triangulo rectangulo");
                figura = entrada.nextInt();
                entrada.nextLine();
                if (figura == 2) {
                    System.out.println("Con o sin relleno? (c/s)");
                    relleno = entrada.nextLine();
                    if (relleno.equalsIgnoreCase("c")) {
                        System.out.println("Introduzca el caracter de relleno que quiere: ");
                        relleno = entrada.nextLine();
                        System.out.println("Introduzca la altura para dibujar su triangulo: ");
                        int altura = entrada.nextInt();
                        entrada.nextLine();
                  
                        entrada.close();
                        if (altura<=1) {
                            System.out.println("no se puede con esa altura");
                            break;
                        }
                       
                        for (int i = 1; i < altura; i++) {
                            System.out.println(relleno);
                            for (int j = 0; j < i; j++) {
                                System.out.print(relleno);

                            }
                            if (i == altura - 1) {
                                System.out.println(relleno);
                            }
                        }
                    } else {
                        System.out.println("Introduzca la altura para dibujar su triangulo: ");
                        int altura = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("Introduzca el caracter de contorno que quiere: ");
                        relleno = entrada.nextLine();
                        entrada.close();
                          if (altura<=1) {
                            System.out.println("no se puede con esa altura");
                            break;
                        }
                        for (int i = 0; i < altura; i++) {
                            System.out.println(" ");
                            for (int j = 0; j <= i; j++) {
                                if (j == 0 || j == i || i == altura - 1) {
                                    System.out.print(relleno);
                                } else
                                    System.out.print(" ");

                            }
                            if (i == altura - 1) {
                                System.out.println(" ");
                            }
                        }
                    }
                } else if (figura == 1) {
                    System.out.println("Con o sin relleno? (c/s)");
                    relleno = entrada.nextLine();
                    if (relleno.equalsIgnoreCase("c")) {

                        System.out.println("Introduzca la altura para dibujar su triangulo: ");
                        int altura = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("Introduzca el caracter de relleno que quiere: ");
                        relleno = entrada.nextLine();
                        entrada.close();
                        for (int i = 0; i < altura; i++) {
                            System.out.println(" ");
                            for (int j = altura; j > i; j--) {

                                System.out.print(" ");

                            }
                            for (int j = 0; j < i; j++) {
                                System.out.print(relleno);
                                System.out.print(" ");
                            }
                            System.out.print(relleno);
                        }
                        System.out.println();
                    } else {
                        System.out.println("Introduzca la altura para dibujar su triangulo: ");
                        int altura = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("Introduzca el caracter de relleno que quiere: ");
                        relleno = entrada.nextLine();
                        entrada.close();
                        for (int i = 0; i < altura; i++) {
                            System.out.println("");
                            for (int j = altura; j > i; j--) {

                                System.out.print(" ");

                            }
                            for (int j = 0; j < i; j++) {
                                if (i == altura - 1)
                                    System.out.print(relleno);

                                else if (j == 0) {
                                    System.out.print(relleno);

                                } else
                                    System.out.print(" ");

                                System.out.print(" ");

                            }
                            System.out.print(relleno);
                        }
                        System.out.println();
                    }

                }
                break;
            case "b":
                System.out.println("Quiere un cuadrado(1) o un rectangulo(2)? ");
                figura = entrada.nextInt();
                entrada.nextLine();
                if (figura == 1) {
                    System.out.println("Con o sin relleno s/c");
                    relleno = entrada.nextLine();
                    if (relleno.equalsIgnoreCase("c")) {
                        System.out.println("Que caracter quiere de relleno? ");
                        relleno = entrada.nextLine();

                        System.out.println("De cuanto es el lado del cuadrado: ");
                        int lado = entrada.nextInt();
                        entrada.close();
                        for (int i = 0; i < lado; i++) {
                            for (int j = 0; j < lado; j++) {
                                System.out.print(relleno);
                            }
                            System.out.println("");
                        }
                    } else if (relleno.equalsIgnoreCase("s")) {
                        System.out.println("Introduzca el lado del cuadrado");
                        int lado = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("Que caracter quiere de contorno? ");
                        relleno = entrada.nextLine();

                        entrada.close();
                        for (int i = 0; i < lado; i++) {
                            for (int j = 0; j < lado; j++) {
                                if (i == 0 || i == lado - 1) {
                                    System.out.print(relleno);
                                } else {
                                    if (j == 0 || j == lado - 1) {
                                        System.out.print(relleno);
                                    } else
                                        System.out.print(" ");
                                }

                            }
                            System.out.println();
                        }
                    }
                } else if (figura == 2) {
                    System.out.println("Con o sin relleno s/c");
                    relleno = entrada.nextLine();
                    if (relleno.equalsIgnoreCase("c")) {
                        System.out.println("Que caracter quiere de relleno? ");
                        relleno = entrada.nextLine();

                        int base=0,altura=0;
                        System.out.println("Introduce la base: ");
                        base=entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("Introduce la altura: ");
                        altura=entrada.nextInt();
                        entrada.close();
                        for (int i = 0; i < altura; i++) {
                            for (int j = 0; j < base; j++) {
                                System.out.print("x");
                            }
                            
                            System.out.println();
                        }
                    } else if (relleno.equalsIgnoreCase("s")) {
                       
                        System.out.println("Que caracter quiere de contorno? ");
                        relleno = entrada.nextLine();

                        int base=0,altura=0;
                        System.out.println("Introduce la base: ");
                        base=entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("Introduce la altura: ");
                        altura=entrada.nextInt();
                        entrada.close();
                        for (int i = 0; i < altura; i++) {
                            for (int j = 0; j < base; j++) {
                                if (i == 0 || i == altura - 1) {
                                    System.out.print(relleno);
                                } else {
                                    if (j == 0 || j == base - 1) {
                                        System.out.print(relleno);
                                    } else
                                        System.out.print(" ");
                                }
                            }
                            
                            System.out.println();
                        }
                    }
                }
                break;
            case "c":
                
                break;

            default:
                System.out.println("Ingrese una opcion valida(cualquiera de los incisos mostrados)");
                break;
        }
        entrada.close();
    }
}
