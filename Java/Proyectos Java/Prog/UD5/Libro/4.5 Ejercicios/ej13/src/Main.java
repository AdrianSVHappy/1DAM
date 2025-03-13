import java.util.Scanner;

/**Ejercicio 13 -
 Escribe un programa que ordene tres números enteros introducidos por teclado.*/
public class Main {
    public static void main(String[] args) {
//        Var
        Scanner sn = new Scanner(System.in);
        short n1, n2, n3;
//        Boddy

        System.out.println("Escribe 3 enteros");
        n1 = sn.nextShort();
        n2 = sn.nextShort();
        n3 = sn.nextShort();

        if((n1>=n2)&&(n1>=n3)){
            if(n2>=n3)
                System.out.println(n1+""+n2+" "+n3);
            else
                System.out.println(n1+""+n3+" "+n2);
        }else if ((n2>=n1)&&(n2>=n3)){
            if(n1>=n3)
                System.out.println(n2+""+n1+" "+n3);
            else
                System.out.println(n2+""+n3+" "+n1);
        }else {
            if(n1>=n2)
                System.out.println(n3+""+n1+" "+n2);
            else
                System.out.println(n3+" "+n2+" "+n1);
        }
    }
}