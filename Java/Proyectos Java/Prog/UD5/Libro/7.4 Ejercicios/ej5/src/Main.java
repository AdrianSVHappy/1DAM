import java.util.Scanner;

/**Ejercicio 5 -
 Escribe un programa que pida 10 números por teclado y que luego muestre los
 números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 máximo y del mínimo respectivamente.*/
public class Main {
    public static void main(String[] args) {
//        Const
        final int N = 10;

//        Var
        int[] num = new int[N];
        int max = -99;
        int min = 99;

        Scanner sn = new Scanner(System.in);

//        Body

        for (int i= 0; i < N; i++){

            num[i] = sn.nextInt();

            if(max < num[i])
                max = num[i];

            if(num[i] < min)
                min = num[i];
        }

        for (int aux : num){
            System.out.print(aux+" ");

            if (aux == max)
                System.out.println("máximo");
            else if (aux == min)
                System.out.println("mínimo");
            else
                System.out.println(" ");
        }
    }
}