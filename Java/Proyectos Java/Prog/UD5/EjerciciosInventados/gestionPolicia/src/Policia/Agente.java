package Policia;

/**
 * <h1>Agente.java</h1><hr>
 * <p>Esta clase represanta a un agente de policia</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 19-abr-2024
 */
public class Agente {

//    Atrib
    private int id;
    private String nombre;
    private int edad;
    private float salario;

//    Constructor
    public Agente(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.salario = 1000;
    }

//    Gets y Sets
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //    toString
    @Override
    public String toString() {
        return (this.id + " | " + this.nombre + " | " + this.edad + " | " + this.salario);
    }
}
