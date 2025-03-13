package EmpleadosPack;

/**
 * <h1>Programador.java</h1><hr>
 * <p>Esta clase represanta un programador</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 22-abr-2024
 */
public class Programador extends Empleado{
    private String lenguajeProg;

    public Programador(String nombre, String lenguajeProg) {
        super(nombre, 20000);
        this.lenguajeProg = lenguajeProg;
    }

    @Override
    public String toString() {
        return super.toString() + "\t|\t" + this.lenguajeProg;
    }
}
