package empleadosPack;

/**
 * <h1>Comercial.java</h1><hr>
 * <p>Esta clase represanta un comercial y hereda de la clase abstracta Empleado</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 26-abr-2024
 */
public class Comercial extends Empleado{

    private float comision;

    public Comercial(String nombre, int edad, float salario, float comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    @Override
    public boolean plus() {boolean si = false;
        if((super.getEdad() > 30) && (this.comision > 200)){
            super.setSalario(super.getSalario() + Empleado.PLUS);
            si = true;
        }
        return si;
    }
}
