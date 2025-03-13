/**Ejercicio 1 -
 Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 también la suma total (los puntos que suman entre los tres dados).*/
public class Main {
    public static void main(String[] args) {
//        Var
        int sum, rand;

//        Body
        sum = 0;
        for (int i = 0; i < 3; i++) {

            rand = (int)(Math.random()*6+1);

            System.out.print(rand+ " ");

            sum += rand;
        }
        System.out.println("\nTotal: "+sum);
    }
}