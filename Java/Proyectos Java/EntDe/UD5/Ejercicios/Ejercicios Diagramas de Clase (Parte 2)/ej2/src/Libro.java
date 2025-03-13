/**
 * <h1>Libro.java</h1><hr>
 * <p>Esta clase represanta un libro</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 15-abr-2024
 */
public class Libro {

//    Atrib
    private int codigo;
    private String isbn;
    private String titulo;
    private String editorial;
    private boolean prestado;
    private String dniSocio;

//    Constructor
    public Libro(int codigo, String isbn, String titulo, String editorial) {
        this.codigo = codigo;
        this.isbn = isbn;
        this.titulo = titulo;
        this.editorial = editorial;
        this.prestado = false;
        this.dniSocio = "";
    }

//    Gets y Sets
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public boolean isPrestado() {
        return prestado;
    }
    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    public String getDniSocio() {
        return dniSocio;
    }
    public void setDniSocio(String dniSocio) {
        this.dniSocio = dniSocio;
    }


    //    toString
    @Override
    public String toString() {
        return "Libro{" +
                "codigo=" + codigo +
                ", isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", editorial='" + editorial + '\'' +
                ", prestado=" + prestado +
                '}';
    }

//    Otros metodos

    public boolean prestar(){
        boolean estado;

        if(this.prestado){
            estado = false;
        }else{
            this.prestado = true;
            estado = true;
        }

        return estado;
    }

    public boolean devolver(){
        boolean estado;

        if(!this.prestado){
            estado = false;
        }else{
            this.prestado = false;
            estado = true;
        }

        return estado;
    }

}
