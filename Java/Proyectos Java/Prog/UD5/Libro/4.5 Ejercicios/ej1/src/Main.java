import java.util.Scanner;
/**Ejercicio 1 -
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.*/
public class Main {
    public static void main(String[] args) {
        //Var
        Scanner sn = new Scanner(System.in);
        String dia;

        //Body
        System.out.print("¿Que día de la semana es hoy? ");
        dia = sn.next();

        if(dia.equals("lunes"))
            System.out.println("Lenguaje de marcas");
        else if(dia.equals("martes"))
            System.out.println("Entorno de desarrollo");
        else if(dia.equals("miercoles"))
            System.out.println("Sistemas informáticos");
        else if(dia.equals("jueves"))
            System.out.println("Programación");
        else if(dia.equals("viernes"))
            System.out.println("Formación profesional");
        else
            System.out.println("Debes escribir el dia correctamente, todo en minúsculas");
    }
}
