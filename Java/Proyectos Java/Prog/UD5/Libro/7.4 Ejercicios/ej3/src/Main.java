import java.util.Scanner;

/**Ejercicio 3
 Escribe un programa que lea 10 números por teclado y que luego los muestre
 en orden inverso, es decir, el primero que se introduce es el último en mostrarse
 y viceversa.*/
public class Main {
    public static void main(String[] args) {
//        Const
        final int N = 10;

//        Var
        int[] num = new int[N];
        int i;

        Scanner sn = new Scanner(System.in);

//        Body
        for (i = N-1; i > -1; i--) {
            num[i]= sn.nextInt();
        }

        for (int aux : num){
            System.out.print(aux+" ");
        }
    }
}