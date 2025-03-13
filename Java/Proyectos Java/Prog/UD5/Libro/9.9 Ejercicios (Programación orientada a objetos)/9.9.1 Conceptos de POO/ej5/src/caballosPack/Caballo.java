package caballosPack;

/**
 * <h1>Caballo.java</h1>
 * Clase que representa al animal caballo.<br>
 * @author Adrián Suárez Valdayo
 * @version 20240313
 *
 * */
public class Caballo {
//    Atributos
    private String nombre, color, raza, sangre;
    private Sexo sexo;
    private int edad, velocidad;
    private float altura, peso;

//    Enum
    /**
     * Definición del tipo enumerado Sexo.<br>
     * - M -> Macho<br>
     * - H -> Hembra<br>
     * - C -> Castrado
     *
     * */
    public enum Sexo{
        M, H,C;
}

//    Constructor
    /**
     * Constructor de la clase Caballo.
     * */
    public Caballo(String nombre,String sangre, Sexo sexo, int edad, int velocidad) {
        this.nombre = nombre;
        this.sangre = sangre;
        this.sexo = sexo;
        this.edad = edad;
        this.velocidad = velocidad;
    }


//    Getter
    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public String getRaza() {
        return raza;
    }

    public String getSangre() {
        return sangre;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

//    Setter
    public Caballo setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Caballo setColor(String color) {
        this.color = color;
        return this;
    }

    public Caballo setRaza(String raza) {
        this.raza = raza;
        return this;
    }

    public Caballo setSangre(String sangre) {
        this.sangre = sangre;
        return this;
    }

    public Caballo setSexo(Sexo sexo) {
        this.sexo = sexo;
        return this;
    }

    public Caballo setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public Caballo setVelocidad(int velocidad) {
        this.velocidad = velocidad;
        return this;
    }

    public Caballo setAltura(float altura) {
        this.altura = altura;
        return this;
    }

    public Caballo setPeso(float peso) {
        this.peso = peso;
        return this;
    }


//    toString
    /**
     * toString de la clase Caballo
     * */
    @Override
    public String toString() {
        return "Caballo{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", raza='" + raza + '\'' +
                ", sangre='" + sangre + '\'' +
                ", sexo=" + sexo +
                ", edad=" + edad +
                ", velocidad=" + velocidad +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }



    //    mis métodos
/**
 * Método para aumentar en un año la edad del caballo, según su edad su velocidad puede variar.
 * */
    public void cumple(){
//        Var

//        Body
        this.edad++;

        if (this.edad<16)
            this.velocidad++;
        else if (this.edad>24)
            this.velocidad--;
    }

    /**
     * Método para montar a caballo, también muestra por pantalla la velocidad de este
     * */
    public void montar(){
//        Var

//        Body
        System.out.println("tocoto tocoto tocoto tocoto\nUff este caballo va a "+this.velocidad);
    }


    /**
     * Método para crear un nuevo caballo a partir de otros dos<br>
     * En el caso de que estén castrados o ambos sean del mismo sexo generará un caballo inutil junto con un mensaje por pantalla.
     * */
    public Caballo reproducir(Caballo pareja, String nombre){
//        Var
        Caballo potro;
        String sangre;
        Sexo sexo;
        int velocidad;
//        Body

        if ((this.sexo == Sexo.C)||(pareja.sexo == Sexo.C)){
            System.out.println("Lo siento pero parece que no va a poder ser");
            potro = new Caballo(" ", "rota", Sexo.C, 99, 0);
        } else if (this.sexo==pareja.sexo) {
            System.out.println("Algo no encaja");
            potro = new Caballo(" ", "rota", Sexo.C, 99, 0);
        }else {
            if(((int)(Math.random()*10))<5)
                sexo = Sexo.M;
            else
                sexo = Sexo.H;

            velocidad = (this.velocidad+ pareja.velocidad)/2;

            if((this.sangre.equals("pura"))&&(pareja.sangre.equals("pura")))
                sangre = "pura";
            else
                sangre = "sucia";

            potro = new Caballo(nombre, sangre, sexo, 0, velocidad);
        }

//        Return
        return potro;
    }
}
