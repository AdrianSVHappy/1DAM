import java.util.Scanner;

/**Ejercicio 1 -
 Realiza un programa que pida dos números y que luego muestre el resultado
 de su multiplicación.*/
public class Main {
    public static void main(String[] args) {
        //Var

        Scanner sn = new Scanner(System.in);
        double n1, n2, res;

        //Body

        System.out.println("Escribe los números que quieres multiplicar separados con espacios");

        n1 = sn.nextDouble();
        n2 = sn.nextDouble();

        System.out.println("El resultado es -> "+ (n1*n2));


    }
}