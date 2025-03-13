/**
 * <h1>Name.java</h1><hr>
 * <p>Esta clase represanta </p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 21-may-2024
 */
public class Persona implements Comparable<Persona>{

    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona p){
        return this.apellido.compareTo(p.apellido);
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}

