package Policia;

/**
 * <h1>Arma.java</h1><hr>
 * <p>Esta clase represanta un arma</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 19-abr-2024
 */
public class Arma {

//    Atrib
    private int id;
    private TipoArma tipo;
    private int balas;

//    Constructor
    public Arma(int id, TipoArma tipo) {
        this.id = id;
        this.tipo = tipo;
        this.recargar();
    }

//    Gets y Sets
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoArma getTipo() {
        return tipo;
    }

    public void setTipo(TipoArma tipo) {
        this.tipo = tipo;
    }

    public int getBalas() {
        return balas;
    }

    public void setBalas(int balas) {
        this.balas = balas;
    }

//    toString
    @Override
    public String toString() {
        return (this.id + " | " + this.tipo + " | " + this.balas);
    }

//    Metodos auxiliares
    private void recargar(){
        switch(this.tipo){
            case RIFLE:
                this.balas = 100;
                break;
            case PISTOLA:
                this.balas = 50;
                break;
            case CUCHILLO:
                this.balas = 0;
                break;
        }
    }

//    Otros metodos
    public boolean disparar(){
        boolean disparado = true;

        if(this.tipo != TipoArma.CUCHILLO){
            if((int)(Math.random()*2)==0)
                this.balas -= 10;
            else
                this.balas -= 20;
        }

        if(this.balas < 0){
            balas = 0;
            disparado = false;
        }

        return disparado;
    }

}
