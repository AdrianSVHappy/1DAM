public class Pilita {

    private Object datos [];

    public Pilita() {
        this.datos = null;
    }

    public void apilar(Object elemento) {
        if (this.datos == null) {
            this.datos = new Object[1];
            this.datos[0] = elemento;
        } else {
            Object datosAux[] = new Object[datos.length+1];
            for(int i=0; i < datos.length; i++ ) { //1.- Cambio i=1 --> i=0
                datosAux[i+1] = datos[i]; //2.- Cambio datosAux[i] --> datosAux[i+1]
            }
            datosAux[0] = elemento; //3.- Cambio datosAux[datos.length-1] -->  datosAux[0]
            datos = datosAux;
        }
    }

    public boolean esPilaVacia() {
        boolean resultado;

        if(this.datos == null || datos.length == 0) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

    public Object Cima() {
        return datos[datos.length-1];
    }

    public Object desApilar() {
        Object resultado = null;
        Object datosAux[];
        try {
            if (this.datos == null) {
                throw new Exception("La pila está vacía");
            } else {
                resultado = datos[0];//4.- Cambio datos[datos.length-2] --> datos[0]
                datosAux = new Object[datos.length-1];
                for(int i=0; i < datos.length-1; i++ ) {
                    datosAux[i] = datos[i+1];//5.- Cambio datos[i] --> datos[i+1]
                }
                datos = datosAux;
            }
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }

        return resultado;
    }
}
