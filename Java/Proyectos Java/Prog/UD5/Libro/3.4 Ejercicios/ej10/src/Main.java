import java.util.Scanner;

/**Ejercicio 10 -
 Realiza un conversor de Mb a Kb.*/
public class Main {
    public static void main(String[] args) {
        //Var
        Scanner sn = new Scanner(System.in);

        double num;

        //Body

        System.out.println("Introduce el número de Mb que quieres pasar a Kb");

        num = sn.nextDouble();

        System.out.println(num*1000+" Kb");

    }
}