import java.util.Scanner;

/**Ejercicio 12 -
 Realiza un programa que calcule la nota que hace falta sacar en el segundo
 examen de la asignatura Programación para obtener la media deseada. Hay
 que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 segundo examen un 60%.*/
/*
 tot =  n1*0.4 + n2*0.6

tot - n1*0.4 = n2*0.6

(tot - n1*0.4)/0.6 = n2
*/



public class Main {
    public static void main(String[] args) {
        //Var
        Scanner sn = new Scanner(System.in);
        double n1, n2, med;

        //Body
        System.out.println("Introduce la nota del primer examen");
        n1 = sn.nextDouble();
        System.out.println("Introduce la nota media deseada");
        med = sn.nextDouble();

        System.out.println("En el segundo examen deberás sacar: "+ ((med-(n1*0.4))/0.6));



    }
}