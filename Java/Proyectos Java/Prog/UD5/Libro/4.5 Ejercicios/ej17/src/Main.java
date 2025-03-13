import java.util.Scanner;

/**Ejercicio 17 -
 Escribe un programa que diga cuál es la última cifra de un número entero
 introducido por teclado.*/
public class Main {
    public static void main(String[] args) {
//        Var
        Scanner sn = new Scanner(System.in);
        int num, rest, aux;

//        Body
        System.out.println("Introduce un entero:");
        num = sn.nextInt();


        if((num < 10)&&(num > -10))
            System.out.println(num);
        else {
            aux = (num / 10) * 10;

            System.out.println(num-aux);
        }
    }
}