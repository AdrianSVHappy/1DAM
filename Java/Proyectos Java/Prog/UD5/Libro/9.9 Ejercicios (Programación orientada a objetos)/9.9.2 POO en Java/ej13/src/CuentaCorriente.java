import java.util.Arrays;

/**
 * <h1>CuentaCorriente.java</h1><hr>
 * Esta clase representa a una cuenta corriente, se puede introducir, sacar y transferir dinero.
 *
 * @Author: Adrián Suárez Valdayo.
 * @Version: 04-04-2024
 */
public class CuentaCorriente {

//    Const
private final static int N = 10;

//    Atrib
    private String numero;
    private double saldo;

//    Constructor
    public CuentaCorriente() {
        this.numero = "";
        this.generaNumero(N);
        this.saldo = 0;
    }

    public CuentaCorriente(double saldo) {
        this.numero = "";
        this.generaNumero(N);
        this.saldo = saldo;
    }

//    Gets y Sets
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

//    toString

    @Override
    public String toString() {
        return "Número de cta: "+ this.numero +" Saldo: "+ this.saldo + " €";
    }


    //    Mis Metodos
    /**
     * Genera el id de la cuenta
     */
    private void generaNumero(int cantidad){
        int[] numer = new  int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            numer[i] = ((int)(Math.random()*10));
        }

        for (int aux : numer){
            this.numero += Integer.toString(aux);
        }

    }

    /**
     * Incrementa el saldo de la cuenta
     * @param cantidad Cuanto incrementa
     */
    public void ingreso(double cantidad){
        this.saldo += cantidad;
    }

    /**
     * Reduce el saldo de la cuenta
     * @param cantidad Cuanto se reduce
     */
    public void cargo(double cantidad){
        this.saldo -= cantidad;
    }

    /**
     * Transfiere saldo de una cuenta a otra
     * @param otro La cuenta que recive
     * @param cantidad La cantidad que se mueve
     */
    public void transferencia(CuentaCorriente otro, double cantidad){
        this.saldo-=cantidad;
        otro.saldo+=cantidad;
    }

}
