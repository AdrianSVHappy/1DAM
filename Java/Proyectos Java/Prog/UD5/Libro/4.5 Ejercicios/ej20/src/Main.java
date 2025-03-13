import java.util.Scanner;

/**Ejercicio 20 -
 Realiza un programa que diga si un número entero positivo introducido por
 teclado es capicúa. Se permiten números de hasta 5 cifras.*/
public class Main {
    public static void main(String[] args) {
//        Var
        Scanner sn = new Scanner(System.in);
        int num, aux, invert, cont, pos;

//        Body
        System.out.println("introduce un entero de (0-99999)");
        num = sn.nextInt();

        if((num > 99999)||(num<0))
            System.out.println("El entero es incorrecto");
        else{

            aux = num;
            invert = 0;
            cont = 1;
            pos = 10000;


            if(num > 9999){
                invert += (aux/pos)*cont;
                aux -= (aux/pos)*pos;
                cont *=10;
            }
            pos /=10;

            if(num > 999){
                invert += (aux/pos)*cont;
                aux -= (aux/pos)*pos;
                cont *=10;
            }
            pos /=10;

            if(num > 99){
                invert += (aux/pos)*cont;
                aux -= (aux/pos)*pos;
                cont *=10;
            }
            pos /=10;


            if(num > 9){
                invert += (aux/pos)*cont;
                aux -= (aux/pos)*pos;
                cont *=10;
            }
            pos /=10;

            if(num > 0){
                invert += (aux/pos)*cont;
                aux -= (aux/pos)*pos;
            }


            System.out.println("Numero original: "+num+
                    "\nNumero invertido: "+invert);

            if(num == invert)
                System.out.println("Son capicua");
            else
                System.out.println("No son capicua");

        }
    }
}