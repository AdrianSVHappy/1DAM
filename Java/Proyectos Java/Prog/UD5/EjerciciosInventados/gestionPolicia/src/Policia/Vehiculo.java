package Policia;

/**
 * <h1>Vehiculo.java</h1><hr>
 * <p>Esta clase represanta un vehiculo</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 19-abr-2024
 */
public class Vehiculo {

//    Atrib
    private String matricula;//Identificador unico
    private TipoVehiculo tipo;//TODOTERRENO, COCHE, MOTO
    private float autonomia;//Cuantos km se muede mover antes de repostar

//    Constructo
    public Vehiculo(String matricula, TipoVehiculo tipo) {
        this.matricula = matricula;
        this.tipo = tipo;
        this.rellenarTanque();
    }

//    Gets y Sets
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    public float getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(float autonomia) {
        this.autonomia = autonomia;
    }

//    toString
    @Override
    public String toString() {
        return (this.matricula + " | " + this.tipo + " | " + this.autonomia);
    }

//    Otros metodos

    public boolean conducir(){
        boolean conGasolina = true;
        int distancia = 0;

        if (autonomia >= 30)
            distancia = (int)(Math.random()*20)+10;
        else
            conGasolina = false;

        this.autonomia -= distancia;

        return conGasolina;
    }

    public void rellenarTanque(){
        switch (this.tipo) {
            case TODOTERRENO:
                this.autonomia = 100;
                break;
            case COCHE:
                this.autonomia = 200;
                break;
            case MOTO:
                this.autonomia = 150;
                break;
        }
    }

}
