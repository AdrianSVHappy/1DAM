import java.util.Scanner;

/**Ejercicio 5 -
 Escribe un programa que calcule el área de un rectángulo.*/
public class Main {
    public static void main(String[] args) {
        //Var
        Scanner sn = new Scanner(System.in);
        int base, h;

        //Body
        System.out.println("Escribe la base y altura del rectangulo:");

        base = sn.nextInt();
        h = sn.nextInt();

        System.out.println("El área es: "+(base*h));

    }
}