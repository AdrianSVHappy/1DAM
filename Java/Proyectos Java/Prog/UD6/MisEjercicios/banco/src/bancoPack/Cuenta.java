package bancoPack;

/**
 * <h1>Cuenta.java</h1><hr>
 * <p>Esta clase abstracta represanta una cuenta</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 24-abr-2024
 */
public abstract class Cuenta {

    private int numeroCuenta;
    private float saldo;
    private Persona cliente;

    public Cuenta(int numeroCuenta, Persona cliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
        this.cliente = cliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return (this.numeroCuenta + "\t|\t" + this.saldo + "\t|\t" + this.cliente);
    }

    public void ingresar (float dineros) {
        this.saldo += dineros;
    }

    public abstract boolean retirar(float dineros);

    public float actualizarSaldo(){
        System.out.println("SALDO ACTUAL: " + this.saldo);
        return this.saldo;
    }

}
