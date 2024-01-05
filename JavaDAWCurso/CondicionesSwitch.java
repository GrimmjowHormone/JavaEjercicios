package JavaDAWCurso;

public class CondicionesSwitch {
    public static void main(String[] args) {
        int x = 4;
        switch (x) {
            case 1:
            case 2:
            case 3:
                System.out.println("El valor de x estaba entre 1 y 3");
                break;
            case 4:

            case 5:
                System.out.println("El valor de x estaba entre 4 y 5");
                break;
            case 6:
                System.out.println("El valor de x era 6");
                break;
            default:
                break;
        }
    }
}
