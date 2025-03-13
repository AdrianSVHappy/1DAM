public class Ingrediente {

//    Atrib
    private Plato[] platos;


//    metodos

    public void formaParteDe(Plato aux){

        int i;

        for (i = 0; i < this.platos.length; i++) {
            if (this.platos[i] == null)
                break;
        }

        this.platos[i] = aux;

    }

}
