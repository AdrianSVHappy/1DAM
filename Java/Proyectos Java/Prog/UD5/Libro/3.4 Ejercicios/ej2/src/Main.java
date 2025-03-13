import java.util.Scanner;

/**Ejercicio 2 -
 Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 convertir debe ser introducida por teclado.*/

public class Main {
    public static void main(String[] args) {
        //Var

        Scanner sn = new Scanner(System.in);
        double constante = 166.386;
        double cantidad;

        //Body

        System.out.println("Escribe la cantidad de euros que quieres pasar a pesetas");

        cantidad = sn.nextDouble();

        System.out.println("Son "+(cantidad*constante)+" pesetas");

    }
}