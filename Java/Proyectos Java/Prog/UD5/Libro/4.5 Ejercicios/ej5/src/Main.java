import java.util.Scanner;

/**Ejercicio 5 -
 Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =
 0).*/
/*
* ax + b = 0
* ax = -b
* x = -b/a
*/
public class Main {
    public static void main(String[] args) {
//          Var
        Scanner sn = new Scanner(System.in);
        short a, b;
//          Body
        System.out.print("Cuanto vale a: ");
        a = sn.nextShort();
        System.out.print("Cuanto vale b: ");
        b = sn.nextShort();

        if (a == 0)
            System.out.println("Indeterminado");
        else
            System.out.println("El resultado es: "+(-b/a));
    }
}