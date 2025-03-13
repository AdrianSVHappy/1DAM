public class Plato {

//    atrib
    public Ingrediente[] menu;


//    Metodo


    public Plato() {
        this.menu = new Ingrediente[10];
    }

    public void seElaboraCon(Ingrediente ingrediente){

        int i;

        for (i = 0; i < this.menu.length; i++) {
            if (this.menu[i] == null)
                break;
        }

        this.menu[i] = ingrediente;

        ingrediente.formaParteDe(this);

    }

}
