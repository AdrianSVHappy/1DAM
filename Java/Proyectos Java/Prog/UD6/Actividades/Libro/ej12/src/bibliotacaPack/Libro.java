package bibliotacaPack;

/**
 * <h1>Libro.java</h1><hr>
 * <p>Esta clase represanta un libro, hereda de Publicación</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 23-abr-2024
 */
public class Libro extends Publicacion implements Prestable{

    private boolean prestado;

    public Libro(String isbn, String titulo, int anyo) {
        super(isbn, titulo, anyo);
        this.prestado = false;
    }

    @Override
    public void presta(){
        if(!this.prestado)
            this.prestado = true;
    }
    @Override
    public boolean estaPrestado(){

        if(!this.prestado)
            System.out.println("Lo siento, ese libro ya está prestado.");

        return this.prestado;
    }
    @Override
    public void devuelve(){
        if(this.prestado)
            this.prestado = false;
    }

    @Override
    public String toString() {
        return super.toString() + "\t|\t" + this.prestado;
    }
}
