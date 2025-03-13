/**
 * <h1>Biblioteca.java</h1><hr>
 * <p>Esta clase represanta una biblioteca</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 16-abr-2024
 */
public class Biblioteca {

    private static final int N = 5;

    private String nombre;
    private Libro[] libros;
    private Socio[] socios;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new Libro[N];
        this.socios = new Socio[N];
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Libro[] getLibros() {
        return libros;
    }
    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }
    public Socio[] getSocios() {
        return socios;
    }
    public void setSocios(Socio[] socios) {
        this.socios = socios;
    }



    /**
     * Cuenta los objetos inicializados dentro de un vector
     * @param aux el vector
     * @return el siguiente hueco nulo
     */
    private static int conTam(Object[] aux){
        int ret = 0;
        for (Object o : aux){
            if(o == null)
                break;
            ret++;
        }
        return ret;
    }

    /**
     * Obtiene la posición en el vector de socio
     * @param id DNI del Socio
     * @return la posición en el vector
     */
    public int obtenerSocio(String id){
        int pos = 0;

        for (Socio aux : this.socios){
            if (aux != null) {
                if (aux.getDni().equals(id))
                    break;
            }
            pos ++;
        }

        if(pos >= N)
            pos = -1;
        return pos;
    }

    /**
     * Obtiene la posición en el vector de libro
     * @param id id del libro
     * @return la posición en el vector
     */
    public int obtenerLibro(int id){
        int pos = 0;

        for (Libro aux : this.libros){
            if (aux != null) {
                if (aux.getCodigo() == id)
                    break;
            }
            pos ++;
        }

        if(pos >= N)
            pos = -1;
        return pos;
    }

    /**
     * Ordena el vector de libros
     */
    private void ordenLibro(){
        Libro[] aux = new Libro[this.libros.length];

        for (Libro o : this.libros){
            if(o != null){
                aux[conTam(aux)] = o;
            }
        }

        System.arraycopy(aux, 0, this.libros, 0, conTam(aux));

    }

    /**
     * Muestra todos los libros de la biblioteca
     */
    public void mostrarLibros(){
        System.out.println("EN LA BIBLIOTECA: ");
        for (Libro aux : this.libros){
            if(aux == null)
                break;
            if (aux.getDniSocio().equals(""))
                System.out.println(aux);
        }

        System.out.println("PRESTADOS");
        for (Libro aux : this.libros){
            if(aux == null)
                break;
            if (!aux.getDniSocio().equals(""))
                System.out.println(aux + " | " + aux.getDniSocio() + " | " + this.socios[obtenerSocio(aux.getDniSocio())].getNombre());
        }
    }

    /**
     * Muestra todos los socios de la biblioteca
     */
    public void mostrarSocios(){
        System.out.println("DADOS DE ALTA: ");
        for (Socio aux : this.socios){
            if (aux != null && (aux.getFechaBaja().equals("")))
                System.out.println(aux);
        }
        System.out.println("DADOS DE BAJA");
        for (Socio aux : this.socios){
            if (aux != null && (!aux.getFechaBaja().equals("")))
                System.out.println(aux);
        }
    }

    /**
     * Da de alta un libro dentro del vector
     * @param libro el libro que se da de alta
     */
    public void altaLibro(Libro libro){
        if (conTam(this.libros)==N)
            System.out.println("Ya no caben más libros");
        else
            this.libros[conTam(this.libros)] = libro;
    }

    /**
     * Elimina un libro del vector
     * @param pos posición del libro a eliminar
     */
    public void bajaLibro(int pos){
        this.libros[pos] = null;
        this.ordenLibro();
    }

    /**
     * Dar de alta a un socio con datos nuevos
     * @param socio el socio que se da de alta
     */
    public void altaSocio(Socio socio){
        if (conTam(this.socios) == N)
            System.out.println("Ya no caben más socios");
        else
            this.socios[conTam(socios)] = socio;
    }

    /**
     * Da de alta a un socio antiguo / dado de baja
     * @param pos la posición del socio en el vector
     */
    public void altaSocio(int pos){
        this.socios[pos].altaSocio();
    }

    /**
     * Da de baja un socio
     * @param pos la posición del socio en el vector
     */
    public void bajaSocio(int pos){

        for (Libro lib : this.libros){

            if ((lib != null)  && (lib.getDniSocio() == this.socios[pos].getDni())){
                this.bajaLibro(this.obtenerLibro(lib.getCodigo()));
            }

        }

        this.socios[pos].bajaSocio();


    }

    /**
     * Registra el prestamo de un libro
     * @param socio posición del socio que resivirá el libro, en el vector
     * @param libro posición del libro que se dará, en el vector
     */
    public void prestarLibro(int socio, int libro){
        if(!this.libros[libro].prestar()) {
            System.out.println("libro ya prestado");
        } else if (!this.socios[socio].getFechaBaja().equals("")) {
            System.out.println("El socio ya tiene libro");
        }else{
            this.libros[libro].setDniSocio(this.socios[socio].getDni());
        }
    }

    /**
     * Registra la devolución de un libro
     * @param libro
     */
    public void devolverLibro(int libro){
        if(!this.libros[libro].devolver()){
            System.out.println("libro ya devolvuelto");
        }else{
            this.libros[libro].setDniSocio("");
        }
    }


}
