package vectores;

public class Vect {

    /**
     * 1.-Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
     * @param vec Es el vector al que se quiere introducir los números aleatorios.
     * @param n Es el tamaño del vector introducido
     * @param max Es el valor máximo de los números introducidos
     * @param min Es el valor mínimo de los números introducidos
     * */
    public static void generaArrayInt(int[] vec, int n, int max, int min){
//        Var
        int maxi, i;

//        Body

        maxi = (max + 1) - min;

        for (i=0; i<n; i++){
            vec[i] = (int)(Math.random()*maxi+min);
        }

    }

    /**
     * 2.-Devuelve el mínimo del array que se pasa como parámetro.
     * @param vec Es el vector en el que se busca.
     * @return Int. Es el número menor encontrado.
     * */
    public static int minimoArrayInt (int[] vec){
//        Var
        int ret;
//        Body
        ret = vec[0];
        for (int aux : vec){
            if(ret>aux)
                ret = aux;
        }

//        End
        return ret;
    }

    /**
     * 3.-Devuelve el máximo del array que se pasa como parámetro.
     * @param vec Es el vector en el que se busca.
     * @return Int. Es el número mayor encontrado.
     * */
    public static int maximoArrayInt (int[] vec){
//        Var
        int ret;
//        Body
        ret = vec[0];
        for (int aux : vec){
            if(ret<aux)
                ret = aux;
        }
//        End
        return ret;
    }

    /**
     * 4.-Devuelve la media del array que se pasa como parámetro.
     * @param vec Es el vector al que se le va a calcular la media.
     * @return Float. Es el resultado de la media.
     */
    public static float mediaArrayInt (int[] vec){
//        Var
        int cont=0;
        float ret=0;
//        Body
        for (int aux : vec){
            ret += aux;
            cont++;
        }
        ret/=(float) cont;
//        End
        return ret;
    }

    /**
     * 5.-Dice si un número está o no dentro de un array.
     * @param vec Es el vector en el que se busca.
     * @param num Es el número a buscar.
     * @return Boolean. true si se ha encontrado/false si no se ha encontrado.
     * */
    public static boolean estaEnArrayInt (int[] vec, int num){
//        Var
        boolean ret=false;
//        body
        for (int a : vec){
            if(num==a) {
                ret = true;
                break;
            }
        }
//        End
        return ret;
    }

    /**
     * 6.-Busca un número en un array y devuelve la posición (el índice) en la que se encuentra.
     * @param vec Es el vector en el que se busca.
     * @param num Es el número en el que se busca.
     * @return Int. La posición (índice) en el que se encuentra el número (si no se encuentre devuelve -1).
     * */
    public static int posicionEnArray (int[] vec, int num){
//        Var
        int ret=-1, indi=0;
//        Body

        for (int a : vec){
            if(a == num){
                ret = indi;
                break;
            }
            indi++;
        }

//        End
        return ret;
    }

    /**
     * 7.-Le da la vuelta a un array.
     * @param vec Es el vector que se va a voltear.
     * @param n Es el tamaño del vector.
     * */
    public static void volteaArrayInt(int[] vec, int n){
//        Var
        int[] aux = new int[n];
//        Body

        for (int i = 0; i < n; i++) {

            aux[i] = vec[n-1-i];

        }

        /*
         * Copia un vector en otro sin necesidad de un bucle (vec[]=aux[]).
         */
        System.arraycopy(aux, 0, vec, 0, n);
    }

    /**
     * 8.-Rota n posiciones a la derecha los números de un array.
     * @param vec Es el vector que se va a modificar
     * @param n Es el tamaño del vector.
     * @param movi Es el número de posiciones que se mueven los valores a la derecha.
     * */
    public static void rotaDerechaArrayInt(int[] vec, int n, int movi){
//        Var
        int[] aux = new int[n];

//        Body
        for (int i = 0; i < n-movi; i++) {
            aux[i+movi]=vec[i];
        }

        for (int i = n-movi ; i < n; i++) {
            aux[i-(n-movi)]= vec[i];
        }

        System.arraycopy(aux, 0, vec, 0, n);

    }


    /**
     * 9.-Rota n posiciones a la izquierda los números de un array.
     * @param vec Es el vector que se va a modificar
     * @param n Es el tamaño del vector.
     * @param movi Es el número de posiciones que se mueven los valores a la izquierda.
     * */
    public static void rotaIzquierdaArrayInt(int[] vec, int n, int movi){
//        Body
        rotaDerechaArrayInt(vec, n, n-movi);

    }
}
