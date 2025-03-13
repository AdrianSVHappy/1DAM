package bancoPack;

/**
 * <h1>CuentaCorriente.java</h1><hr>
 * <p>Esta clase represanta una cuenta corriente</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 24-abr-2024
 */
public class CuentaCorriente extends Cuenta{

    public static final float INTERES = 1.5f;

    public CuentaCorriente(int numeroCuenta, Persona cliente) {
        super(numeroCuenta, cliente);
    }

    @Override
    public String toString() {
        return super.toString() + "\t|\t" + INTERES;
    }

    @Override
    public boolean retirar(float dineros) {

        super.setSaldo(super.getSaldo() - dineros);

        return true;

    }

    @Override
    public float actualizarSaldo(){
        super.setSaldo(super.getSaldo() * (1+INTERES));
        return super.actualizarSaldo();
    }



}
