package Clases_Hotel;

/**
 * Esta clase almacena toda la información de un cliente.
 *
 * @Author: Manuel Sánchez Alcántara.
 * @Version: 2024.05
 */
public class Cliente implements Comparable<Cliente>{
    private String nif;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String direccion;
    private String cp;
    private String poblacion;
    private String provincia;
    private String pais;

    /**
     * Constructor de la clase. Datos del cliente:
     * @param nif
     * @param nombre
     * @param apellidos
     * @param telefono
     * @param direccion
     * @param cp
     * @param poblacion
     * @param provincia
     * @param pais
     */
    public Cliente(String nif, String nombre, String apellidos, String telefono, String direccion, String cp, String poblacion, String provincia, String pais){
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cp = cp;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.pais = pais;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNif() {
        return nif;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCp() {
        return cp;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString(){
        return (this.nif + "  " + this.apellidos + "  " + this.nombre);
    }

    @Override
    public int compareTo(Cliente c){
        return (this.apellidos).compareTo(c.getApellidos());
    }

}
