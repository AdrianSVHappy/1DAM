import EmpleadosPack.*;

/**
 * <h1>Main.java</h1><hr>
 * <p>Desarrollar un programa para la gestión de empleados con los siguientes requisitos. De cada empleado se debe almacenar el nombre y el salario, además de implementar un método que muestre el nombre del empleado y el texto “ está trabajando.”. Existen dos tipos de empleado, los Gerentes y los Programadores, los primeros gestionan un departamento y los segundos están organizados por lenguaje de programación. El sueldo de los gerentes comienza en 40.000€ y el de los programadores en 20.000€.</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 22-abr-2024
 */
public class Main {
    public static void main(String[] args) {

        Empleado test1 = new Gerente("test1", "I+D");
        Empleado test2 = new Programador("test2", "Java");

        System.out.println(test1);

        System.out.println(test1.trabajando());

        System.out.println(test2);

    }
}