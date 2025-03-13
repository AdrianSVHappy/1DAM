package EmpleadosPack;

/**
 * <h1>Gerente.java</h1><hr>
 * <p>Esta clase represanta un gerente</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 22-abr-2024
 */
public class Gerente extends Empleado{

    private String departamento;

    public Gerente(String nombre, String departamento) {
        super(nombre, 40000);
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "\t|\t" + this.departamento;
    }
}
