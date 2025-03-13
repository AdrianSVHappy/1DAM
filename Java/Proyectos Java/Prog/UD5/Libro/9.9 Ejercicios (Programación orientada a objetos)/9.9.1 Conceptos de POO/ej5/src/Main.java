import caballosPack.*;

/**
 * <h1>Ejercicio 5</h1><hr>
 * <p>Haz una lista con los atributos que podría tener la clase caballo. A continuación
 * haz una lista con los posibles métodos (acciones asociadas a los caballos).</p>
 * */
public class Main {
    public static void main(String[] args) {

        Caballo Paco = new Caballo("Paco", "pura", Caballo.Sexo.M, 10, 50);

        System.out.println(Paco);

        Caballo Manu = new Caballo("Manu", "sucia", Caballo.Sexo.M, 25, 70);

        Caballo Lucia = new Caballo("Lucia", "pura", Caballo.Sexo.H, 18, 60);

        Caballo pequePiti = Manu.reproducir(Paco, "Piti");

        Caballo pequeJose = Lucia.reproducir(Paco, "Jose");

        Caballo pequeJuan = Lucia.reproducir(Manu, "Juan");

        System.out.println(pequePiti+"\n"+pequeJose+"\n"+pequeJuan);
    }
}