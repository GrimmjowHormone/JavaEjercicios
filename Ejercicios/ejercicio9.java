package JavaProyectos.Ejercicios;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una opcion (piedra, papel, tijera, spock o lagarto)");
        String humano = entrada.nextLine();
        int num = (int) ((Math.random() * 5) + 1);

        String maquina = "";

        switch (num) {
            case 1:
                maquina = "Piedra";
                break;
            case 2:
                maquina = "Papel";
                break;
            case 3:
                maquina = "Tijeras";
                break;
            case 4:
                maquina = "Lagarto";
                break;
            case 5:
                maquina = "Spock";
                break;
        }

        System.out.println("LA MAQUINA ESCOGIO :" + maquina);

        if ((     humano.equalsIgnoreCase("tijeras")
                && (maquina.equalsIgnoreCase("papel") || maquina.equalsIgnoreCase("lagarto")))
                ||(humano.equalsIgnoreCase("papel")
                && (maquina.equalsIgnoreCase("piedra") || maquina.equalsIgnoreCase("spock")))
                ||(humano.equalsIgnoreCase("piedra")
                && (maquina.equalsIgnoreCase("tijeras") || maquina.equalsIgnoreCase("lagarto")))
                ||(humano.equalsIgnoreCase("lagarto")
                && (maquina.equalsIgnoreCase("papel") || maquina.equalsIgnoreCase("spock")))
                ||(humano.equalsIgnoreCase("spock")
                && (maquina.equalsIgnoreCase("tijeras") || maquina.equalsIgnoreCase("piedra")))
                )
            System.out.println("Haz ganado");

        else {
            if (maquina.equalsIgnoreCase(humano)) {
                System.out.println("Empate");
            } else
                System.out.println("Cromaste circuitos, gano la maquina");

        }

        entrada.close();

    }
}
