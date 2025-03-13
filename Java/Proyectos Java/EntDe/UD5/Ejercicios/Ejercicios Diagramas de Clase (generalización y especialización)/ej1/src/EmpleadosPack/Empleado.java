package EmpleadosPack;

/**
 * <h1>Empleado.java</h1><hr>
 * <p>Esta clase represanta un empleado</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 22-abr-2024
 */
public class Empleado {
    private String nombre;
    private float salario;

    public Empleado(String nombre, float salario) {
        this.nombre = nombre;
        this.salario = salario;
    }



    public String trabajando(){
        return this.nombre + " está trabajando";
    }

    @Override
    public String toString() {
        return this.nombre + "\t|\t" + this.salario;
    }
}
