import java.util.Scanner;
import static java.lang.Math.pow;

/**Ejercicio 9 -
 Escribe un programa que calcule el volumen de un cono según la fórmula V =
 1/3*pi*r^2*h*/
public class Main {
    public static void main(String[] args) {
        //Var
        Scanner sn = new Scanner(System.in);
        double pi = 3.14159265359,
        h, r;

        //body
        System.out.println("Introduce el radio y la altura del cono");

        r = sn.nextDouble();
        h= sn.nextDouble();

        System.out.println("El volumen del cono es:"+ ((1*pi*(pow(r, 2))*h)/3));

    }
}