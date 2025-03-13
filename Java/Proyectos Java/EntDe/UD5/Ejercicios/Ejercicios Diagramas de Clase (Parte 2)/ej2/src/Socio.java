import java.time.LocalDate;
/**
 * <h1>Socio.java</h1><hr>
 * <p>Esta clase represanta a un socio</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 15-abr-2024
 */
public class Socio {
//    Atri
    private String dni;
    private String nombre;
    private String fechaAlta;
    private String fechaBaja;

//    Constructor
    public Socio(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaAlta = LocalDate.now().toString();
        this.fechaBaja = "";
    }

//    Gets y Sets
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getFechaAlta() {
        return fechaAlta;
    }
    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    public String getFechaBaja() {
        return fechaBaja;
    }
    public void setFechaBaja(String fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

//    toString
    @Override
    public String toString() {
        return "Socio{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaAlta='" + fechaAlta + '\'' +
                ", fechaBaja='" + fechaBaja + '\'' +
                '}';
    }

    //    Otros metodos
    public void altaSocio(){
        this.fechaAlta = LocalDate.now().toString();
        if(!this.fechaBaja.equals(""))
            this.fechaBaja = "";
    }

    public void bajaSocio(){
        this.fechaBaja = LocalDate.now().toString();
    }


}
