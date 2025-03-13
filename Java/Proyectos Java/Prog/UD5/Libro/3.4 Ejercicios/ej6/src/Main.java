import java.util.Scanner;

/**Ejercicio 6 -
 Escribe un programa que calcule el área de un triángulo.*/
public class Main {
    public static void main(String[] args) {
        //Var
        Scanner sn = new Scanner(System.in);
        int base, h;

        //Body
        System.out.println("Escribe la base y altura del triangulo:");

        base = sn.nextInt();
        h = sn.nextInt();

        System.out.println("El área es: "+((base*h)/2));

    }
}