package targetas;

public class TarjetaRegalo {

//    Atributos

    private int num;
    private float saldo;

//    Constructor

    public TarjetaRegalo(float saldo) {
        this.saldo = saldo;

        this.num = (int)(Math.random()*100000);
    }

//    Getters y Setters
    public int getNum() {
        return num;
    }

    public TarjetaRegalo setNum(int num) {
        this.num = num;
        return this;
    }

    public float getSaldo() {
        return saldo;
    }

    public TarjetaRegalo setSaldo(float saldo) {
        this.saldo = saldo;
        return this;
    }

//    toString
    @Override
    public String toString() {
        return "Tarjeta nº" +num+" - Saldo " +saldo+"€";
    }


//    Mis metodos

    public void gasta(float precio){

        if(precio>this.saldo)
            System.out.println("No tiene suficiente saldo para gastar "+precio+"€");
        else
            this.saldo-=precio;
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo otra){

//        Var
        TarjetaRegalo nueva;
//        Body

        nueva = new TarjetaRegalo(this.saldo+otra.saldo);
        this.saldo=0;
        otra.saldo=0;

//        Return
        return nueva;

    }


}
