import java.util.Scanner;

/**Ejercicio 27 -
 Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
 jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
 introduce una opción incorrecta, el programa deberá mostrar un mensaje de
 error.*/
public class Main {
    public static void main(String[] args) {
//        Var
        int rand;
        String p1, cpu;
        Scanner sn = new Scanner(System.in);
//        Body
        System.out.println("piedra, papel o tijeras");
        p1 = sn.next();

        rand = (int)(Math.random()*3);
        switch (rand){
            case 0:
                cpu = "piedra";
                if (p1.compareTo("papel"))
                break;
            case 1:
                cpu = "papel";
                break;
            case 2:
                cpu = "tijeras";
                break;
        }

    }
}