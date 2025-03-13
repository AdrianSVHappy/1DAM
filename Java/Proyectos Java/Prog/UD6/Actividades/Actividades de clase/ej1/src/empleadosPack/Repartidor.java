package empleadosPack;

/**
 * <h1>Repartidor.java</h1><hr>
 * <p>Esta clase represanta un repartidor y hereda de la clase abstracta Empleado</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 26-abr-2024
 */
public class Repartidor extends Empleado{

    private String zona;

    public Repartidor(String nombre, int edad, float salario, String zona) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    @Override
    public boolean plus() {
        boolean si = false;
        if((super.getEdad() < 25) && (this.zona.equals("zona 3"))){
            super.setSalario(super.getSalario() + Empleado.PLUS);
            si = true;
        }
        return si;
    }
}
