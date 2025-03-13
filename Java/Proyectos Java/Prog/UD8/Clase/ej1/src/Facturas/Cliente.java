package Facturas;

/**
 * Esta clase almacena toda la información y procedimientos relativos al cliente.
 *
 * @Author: Manuel Sánchez Alcántara.
 * @Version: 2024.03
 */
public class Cliente {
    private String codigo;//Identificador del cliente.
    private String nombre;//Nombre del cliente.
    private String apellidos;//Apellidos del cliente.
    private String direccion;//Dirección del cliennte.
    private String cp;//Código postal del cliente.
    private String poblacion;//Población donde reside el cliente.
    private String provincia;//Provincia donde reside el cliente.
    private String telefono;//Número de teléfono del cliente.

    /**
     * Constructor de la clase "Cliente".
     *
     * @param codigo Identificador del cliente. String.
     * @param nombre Nombre del cliente. String.
     * @param apellidos Apellidos del cliente. String.
     * @param direccion Dirección de residencia del cliente. String.
     * @param cp Código postal del cliente. String.
     * @param poblacion Población de residencia del cliente. String.
     * @param provincia Provincia de residencia del cliente. String.
     * @param telefono Número de teléfono  del cliente. String.
     *
     */
    public Cliente(String codigo, String nombre, String apellidos, String direccion, String cp, String poblacion, String provincia, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.cp = cp;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.telefono = telefono;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Devuelve toda la información del cliente, incluido el encabezado de cada campo o atributo.
     * @return
     */
    @Override
    public String toString() {
        return ("Codigo: " + this.codigo +
                "\nNombre: " + this.nombre +
                "\nApellidos: " + this.apellidos +
                "\nDireccion: " + this.direccion +
                "\nCP: " + this.cp +
                "\nPoblacion: " + this.poblacion +
                "\nProvincia: " + this.provincia +
                "\nTelefono: " + this.telefono);
    }
}
