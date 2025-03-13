import java.util.Scanner;

/**Ejercicio 14 -
 Realiza un programa que diga si un número introducido por teclado es par y/o
 divisible entre 5.*/
public class Main {
    public static void main(String[] args) {
//        Var
        Scanner sn = new Scanner(System.in);
        short num;

//        Body
        System.out.println("Escribe un entero:");
        num = sn.nextShort();

        if((num%2)==0)
            System.out.println("Es par");

        if ((num%5)==0)
            System.out.println("Es divisible ente 5");
    }
}