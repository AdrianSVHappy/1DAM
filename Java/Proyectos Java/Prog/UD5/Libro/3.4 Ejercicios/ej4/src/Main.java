import java.util.Scanner;

/**Ejercicio 4 -
 Escribe un programa que sume, reste, multiplique y divida dos números
 introducidos por teclado.*/
public class Main {
    public static void main(String[] args) {
        //Var
        Scanner sn = new Scanner(System.in);
        int n1, n2;

        //Body

        System.out.println("Introduce los dos números con los que quieres hacer las operaciónes: ");

        n1 = sn.nextInt();
        n2 = sn.nextInt();

        System.out.println("Suma: "+(n1+n2)+"\nResta: "+(n1-n2)+"\nMultiplicación: "+(n1*n2)+"\nDivisión: "+(n1/n2));
    }
}