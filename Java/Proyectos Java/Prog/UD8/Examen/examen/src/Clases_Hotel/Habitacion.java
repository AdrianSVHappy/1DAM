package Clases_Hotel;
import java.time.LocalDate;


/**
 * Esta clase...
 *
 * @Author: Manuel Sánchez Alcántara.
 * @Version: 2024.05
 */
public class Habitacion {
    private LocalDate fecha_entrada;
    private LocalDate fecha_salida;
    private Cliente cliente;

    /**
     * Contrustor de la clase. Información:
     * @param fecha_salida fecha final periodo de estancia.
     * @param cliente cliente responsable.
     */
     public Habitacion(LocalDate fecha_salida, Cliente cliente) {
        this.fecha_entrada = LocalDate.now();
        this.fecha_salida = fecha_salida;
        this.cliente = cliente;
    }

    public Habitacion(){
         this.fecha_entrada = null;
         this.fecha_salida = null;
         this.cliente = null;
    }


    public LocalDate getFecha_entrada() {
        return fecha_entrada;
    }

    public LocalDate getFecha_salida() {
        return fecha_salida;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setFecha_entrada(LocalDate fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public void setFecha_salida(LocalDate fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void iniHabitacion(){
        this.fecha_entrada = null;
        this.fecha_salida = null;
        this.cliente = null;
    }

    /**
     * Comprueba si una habitación está libre
     * @return "true" si está libre; "false" en caso contrario.
     */
    public boolean libre(){
         boolean l = true;
         if(this.cliente != null)
             l = false;

         return l;
    }

    @Override
    public String toString(){
        return (this.cliente.getApellidos() + "  " + this.cliente.getNombre() + "  " +
                this.fecha_entrada + "  " + this.fecha_salida);
    }
}
