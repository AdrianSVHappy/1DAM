/**
 * <h1>Name.java</h1><hr>
 * <p>Esta clase represanta </p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 15-may-2024
 */
public class Gato {

    private String sexo;

    public Gato(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void apareaCon(Gato pareja) throws ExcepcionApareamientoImposible {

        if (this.sexo.equals(pareja.getSexo()))
            throw new ExcepcionApareamientoImposible();

        System.out.println("Se aparean");

    }
}
