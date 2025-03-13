package Persona_Pack;

public class Persona {

//    Var
    String nombre;
    int edad;
    float saldo;

//    Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
        this.saldo = 0;
    }

//    Setter
    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Persona setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public Persona setSaldo(float saldo) {
        this.saldo = saldo;
        return this;
    }

//    Getter
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getSaldo() {
        return saldo;
    }

//    Mis métodos
public void cumple(){
        this.edad++;
}

public void trabajar(float sueldo){
        this.saldo += sueldo;
}

public void comprar(float precio){
        if(this.saldo<precio)
            System.out.println("No tienes saldo suficiente");
        else
            this.saldo -= precio;
}

}
