import java.util.Random;

/**
 * <h1>ClassName.java</h1><hr>
 * <p>Esta clase representa a un gato listo para pelear</p>
 *
 * @Author: Adrián Suárez Valdayo.
 * @Version: 05-04-2024
 */
public class Gato {

//    Atrib
    private String nombre;
    private int edad;
    private Sexo sexo;

//    Constructor
    public Gato(String nombre, int edad, Sexo sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

//    Gets y Sets
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Sexo getSexo() {
        return sexo;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

//    toString

    /**
     * @return "Gato{nombre='" + nombre + '\'' +", edad=" + edad +", sexo=" + sexo +'}'
     */
    @Override
    public String toString() {
        return "Gato{nombre='" + nombre + '\'' +", edad=" + edad +", sexo=" + sexo +'}';
    }

    //    Mis metodos

    /**
     * Da valores aleatorios para un gato
     */
    public void rand(){
        this.nombre = "Rand-" + ((int)(Math.random()*10));
        this.edad = ((int)(Math.random() * 20) + 1);
        this.sexo =(((int)(Math.random() * 2))!= 0) ? Sexo.HEMBRA : Sexo.MACHO;
    }

//    Metodos de clase

    /**
     * Ordena un vector de gatos (complicado)
     * @param gatetes vector de gatos
     */
    public static void ordenar(Gato[] gatetes){

//        Var
        int total = 0, indice;
        Gato muerto = null;

//        Body
        for (int i = 0; i < gatetes.length; i++) {
            if (gatetes[i] != null) {
                total += 1;
            }
        }

        do {

            for (indice = 0; indice < total ; indice++) {
                if (gatetes[indice] == null){
                    muerto = gatetes[indice];
                    break;
                }
            }

            if (total == indice)
                break;

            for (int i = (gatetes.length-1) ; i > -1 ; i--) {
                if(gatetes[i] != null){
                    gatetes[indice] = gatetes[i];
                    gatetes[i] = muerto;
                    break;
                }
            }

        }while (total != indice);
    }

    /**
     * Cuenta los gatos inicializados
     * @param gatetes Vector de gatos
     * @return (Int) los gatos inicializados
     */
    public static int contar(Gato[] gatetes){
        int i;

        for (i = 0; i < gatetes.length; i++) {
            if (gatetes[i] == null)
                break;
        }

        return i;
    }

    /**
     * Ordena un vector de gatos (facil)
     * @param original vector de gatos
     */
    public static void ordenar2(Gato[] original){
        Gato[] aux = new Gato[(original.length)];
        int cont = 0;

        for (Gato gato : original) {
            if (gato != null) {
                aux[cont] = gato;
                cont++;
            }
        }

        /*for (int i = 0; i < original.length; i++) {
            original[i] = aux[i];
        } hace lo de abajo*/
        System.arraycopy(aux, 0, original, 0, original.length);

    }

}

