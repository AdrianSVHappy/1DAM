import java.util.Scanner;

/**Ejercicio 8 -
 Escribe un programa que calcule el salario semanal de un empleado en base a
 las horas trabajadas, a razón de 12 euros la hora.*/
public class Main {
    public static void main(String[] args) {
        //Var
        Scanner sn = new Scanner(System.in);
        int horas, constante= 12;

        //Body
        System.out.println("Introduce el numero de horas trabajadas");

        horas = sn.nextInt();

        System.out.println("Salario: "+(horas*constante));
    }
}