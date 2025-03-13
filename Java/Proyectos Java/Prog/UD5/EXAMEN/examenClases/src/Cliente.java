/**
 * <h1>Cliente.java</h1><hr>
 * <p>Esta clase represanta a un cliente</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 10-abr-2024
 */
public class Cliente {
    //Datos del cliente
    private int identificador;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String direccion;
    private String codigoPostal;
    private String poblacion;
    private String provincia;

    /**
     * Constructor de Cliente
     * @param identificador Identificador del cliente
     * @param nombre Nombre del cliente
     * @param apellidos Apellidos del cliente
     * @param telefono Telefono del cliente
     * @param direccion Dirección del cliente
     * @param codigoPostal Codigo postal del cliente
     * @param poblacion Pueblo donde vive el cliente
     * @param provincia Provincia donde vive el cliente
     */
    public Cliente(int identificador, String nombre, String apellidos, String telefono, String direccion, String codigoPostal, String poblacion, String provincia) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.poblacion = poblacion;
        this.provincia = provincia;
    }

    /**
     * Almacena en un String la información del cliente
     * @return El String con la información
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", poblacion='" + poblacion + '\'' +
                ", provincia='" + provincia + '\'' +
                '}';
    }
}
