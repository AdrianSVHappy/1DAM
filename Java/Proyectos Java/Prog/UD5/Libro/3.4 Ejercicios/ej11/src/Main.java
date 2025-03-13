import java.util.Scanner;

/**Ejercicio 11 -
 Realiza un conversor de Kb a Mb.*/
public class Main {
    public static void main(String[] args) {
        //Var
        Scanner sn = new Scanner(System.in);

        double num;

        //Body

        System.out.println("Introduce el número de Kb que quieres pasar a Mb");

        num = sn.nextDouble();

        System.out.println(num/1000+" Mb");

    }
}