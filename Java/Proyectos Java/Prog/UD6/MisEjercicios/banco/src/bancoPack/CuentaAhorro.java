package bancoPack;

/**
 * <h1>CuentaAhorro.java</h1><hr>
 * <p>Esta clase represanta una Cuenta de Ahorro</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 26-abr-2024
 */
public class CuentaAhorro extends Cuenta{

    private float interes;
    private float saldoMinimo;

    public CuentaAhorro(int numeroCuenta, Persona cliente, float interes, float saldoMinimo) {
        super(numeroCuenta, cliente);
        this.interes = interes;
        this.saldoMinimo = saldoMinimo;
    }

    @Override
    public String toString() {
        return super.toString() + "\t|\t" + this.interes + "\t|\t" + this.saldoMinimo;
    }

    @Override
    public boolean retirar(float dineros) {
        boolean aceptado = true;

        if(getSaldo()-dineros <this.saldoMinimo)
            aceptado = false;
        else
            super.setSaldo(super.getSaldo() - dineros);


        return aceptado;
    }

    @Override
    public float actualizarSaldo(){
        super.setSaldo(super.getSaldo() * (1+this.interes));
        return super.actualizarSaldo();
    }


}
