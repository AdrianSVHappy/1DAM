/**
 * <h1>Cuenta.java</h1><hr>
 * <p>Esta clase represanta una cuenta</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 15-abr-2024
 */
public class Cuenta {

//    Atrib
    private String numero;
    private float saldo;

//    Constructor
    public Cuenta(String numero) {
        this.numero = numero;
        this.saldo = 0;
    }

//    Gets y Sets
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

//    toString
    @Override
    public String toString() {
        return "Cuenta{" +
                "numero='" + numero + '\'' +
                ", saldo=" + saldo +
                '}';
    }

//    Otros metodos

    public void ingresarDinero(float importe){
        this.saldo += importe;
    }

    public void extraerDinero(float importe){
        this.saldo -= importe;
    }
}
