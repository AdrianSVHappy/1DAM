import java.util.Scanner;

/**Ejercicio 3 -
 Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 convertir debe ser introducida por teclado.*/
public class Main {
    public static void main(String[] args) {
        //Var

        Scanner sn = new Scanner(System.in);
        double constante = 166.386;
        double cantidad;

        //Body

        System.out.println("Escribe la cantidad de pesetas que quieres pasar a euros");

        cantidad = sn.nextDouble();

        System.out.println("Son "+(cantidad/constante)+" €");

    }
}