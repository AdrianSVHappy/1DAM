import java.util.Scanner;

/**Ejercicio 3 -
 Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
 nombre del día de la semana.*/
public class Main {
    public static void main(String[] args) {
//        Var
        Scanner sn = new Scanner(System.in);
        short dia;

//        Body

        System.out.println("Escribe un número del (1-7)");
        dia = sn.nextShort();

        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Lee bien lo que se te pide");
        }

    }
}