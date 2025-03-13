package empleadosPack;

/**
 * <h1>Empleado.java</h1><hr>
 * <p>Esta clase abstracta represanta un Empleado</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 26-abr-2024
 */
public abstract class Empleado {

    public static final float PLUS = 300;

    private String nombre;
    private int edad;
    private float salario;

    public Empleado(String nombre, int edad, float salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public abstract boolean plus();
}
