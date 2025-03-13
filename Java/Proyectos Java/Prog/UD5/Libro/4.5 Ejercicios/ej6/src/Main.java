import java.util.Scanner;

import static java.lang.Math.sqrt;

/**Ejercicio 6
 Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
 una altura h. Aplica la fórmula t =
 √
 2h
 g siendo g = 9:81m/s2*/
public class Main {
    public static void main(String[] args) {
//        Var
        Scanner sn = new Scanner(System.in);
        double g = 9.81,
            h,
        total;


//        Body

        System.out.println("Dime la altura");
        h = sn.nextDouble();

        total = sqrt((2*h)/g);

        System.out.println("Tardará "+total+" s");


    }
}