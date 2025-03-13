package pedidos;

public class Pizza {
//    Atributos
    private String tama, tipo, estado;
    private static int totalPedidas, totalServidas;

//    Constructor

    public Pizza(String tama, String tipo) {
        this.tama = tama;
        this.tipo = tipo;
        this.estado = "pedida";
        Pizza.totalPedidas++;
    }

//    Getter y Setter
    public String getTama() {
        return tama;
    }

    public Pizza setTama(String tama) {
        this.tama = tama;
        return this;
    }

    public String getTipo() {
        return tipo;
    }

    public Pizza setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public String getEstado() {
        return estado;
    }

    public Pizza setEstado(String estado) {
        this.estado = estado;
        return this;
    }

    public static int getTotalPedidas() {
        return totalPedidas;
    }

    public static void setTotalPedidas(int totalPedidas) {
        Pizza.totalPedidas = totalPedidas;
    }

    public static int getTotalServidas() {
        return totalServidas;
    }

    public static void setTotalServidas(int totalServidas) {
        Pizza.totalServidas = totalServidas;
    }


//    toString

    @Override
    public String toString() {
        return ("pizza "+this.tipo+" "+this.tama+", "+this.estado);
    }


//    Mis metodos
    public void sirve(){
        this.estado = "servida";

        Pizza.totalServidas++;
    }

}
