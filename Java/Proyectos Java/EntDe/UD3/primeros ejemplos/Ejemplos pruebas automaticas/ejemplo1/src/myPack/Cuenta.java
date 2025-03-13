package myPack;
public class Cuenta {
    private String numeroCuenta;
    private float saldo;

    //    Constructor
    public Cuenta(String numeroCuenta, float saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    //    Getters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    //    Setters
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }


    //    Mis metodos
    public void ingresarDinero(float saldo){
        this.saldo += saldo;
    }

    public void extraerDinero(float saldo){
        this.saldo-=saldo;
    }

    public void mostrarCuenta(){
        System.out.println("Nº Cuenta: "+getNumeroCuenta()+
                "\nSaldo: "+getSaldo()+"€");
    }
}

