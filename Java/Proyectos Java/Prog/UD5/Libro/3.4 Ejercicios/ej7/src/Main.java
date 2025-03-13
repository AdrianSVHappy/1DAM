import java.util.Scanner;

/**Ejercicio 7 -
 Escribe un programa que calcule el total de una factura a partir de la base
 imponible.*/
public class Main {
    public static void main(String[] args) {
        //Var
        Scanner sn = new Scanner(System.in);

        double constante = 0.21, total;

        //Body

        System.out.println("Introduce el precio del producto");

        total = sn.nextDouble();

        System.out.println("El total es: "+(total+ (total*constante)));

    }
}