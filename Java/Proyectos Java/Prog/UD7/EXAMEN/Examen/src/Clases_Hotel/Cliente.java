package Clases_Hotel;

/**
 * <h1>Cliente.java</h1><hr>
 * <p>Esta clase represanta  un cliente</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 21-may-2024
 */
public class Cliente implements Comparable<Cliente>{

    private String direccion;
    private String nif;
    private String nombre;
    private String cp;
    private String poblacion;
    private String provincia;
    private String pais;
    private String apellidos;
    private String telefono;

    public Cliente(String direccion, String nif, String nombre, String cp, String poblacion, String provincia, String pais, String apellidos, String telefono) {
        this.direccion = direccion;
        this.nif = nif;
        this.nombre = nombre;
        this.cp = cp;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.pais = pais;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNif() {
        return nif;
    }

    public String getApellidos() {
        return apellidos;
    }

    @Override
    public String toString() {
        return this.nif + "\t" + this.nombre + "\t" + this.apellidos ;
    }

    /**
     * Metodo para ordenar por apellido
     * @param o the object to be compared.
     * @return int
     */
    @Override
    public int compareTo(Cliente o) {
        return this.apellidos.compareTo(o.apellidos);
    }
}
