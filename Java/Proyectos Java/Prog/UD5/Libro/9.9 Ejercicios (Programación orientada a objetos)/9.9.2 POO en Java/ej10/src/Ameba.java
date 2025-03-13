/**
 * <h1>ClassName.java</h1><hr>
 * Esta clase representa a una ameba que puede fagoscitar o ser fagocitada.
 *
 * @Author: Adrián Suárez Valdayo.
 * @Version: 04-04-2024
 */
public class Ameba {

//    Atrib
    private int peso;

//    Constructor
    public Ameba() {
        this.peso = 3;
    }

//    Gets y Sets
    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

//    toString
    /**
     * @return Soy una ameba y peso " + peso +" microgramos.
     */
    @Override
    public String toString() {
        return "Soy una ameba y peso " + this.peso +" microgramos.";
    }


//    Mis metodos

    /**
     * Aumenta el peso de la ameba fagocitando materia
     * @param peso Peso en microgramos de la materia
     */
    public void come(int peso){
        this.peso--;
        this.peso+=peso;
    }

    /**
     * Aumenta el peso de la ameba fagocitando a otra.
     * @param victima La ameba que va a fagocitar.
     */
    public void  come(Ameba victima){
        this.come(victima.peso);
        victima.peso=0;
    }

}
