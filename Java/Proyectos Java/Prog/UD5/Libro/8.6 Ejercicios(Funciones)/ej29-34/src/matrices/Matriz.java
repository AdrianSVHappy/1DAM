package matrices;

public class Matriz {

    /**
     * 1.- Genera un array de tamaño n x m con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
     * @param matri La matriz en la que se va a introducir los números.
     * @param fila El número de filas de la matriz
     * @param colum El número de columnas de la matriz
     * @param max El valor más alto que se va a introducir
     * @param min El valor más bajo que se va a introducir
     * */
    public static void generaArrayBiInt(int[][] matri, int fila, int colum, int max, int min){
//        Var

//        Body
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < colum; j++) {
                matri[i][j]=(int)(Math.random()*((max+1)-min)+min);
            }
        }
    }

    /**
     * 2.- Devuelve la fila i-ésima del array que se pasa como parámetro.
     * @param matri La matiz en la que se busca la fila
     * @param colum El número de columnas que tiene la matriz
     * @param i El número de la fila que se quiere mostrar
     * */
    public static void filaDeArrayBiInt(int[][] matri, int colum, int i){
//        Var

//        Body
        for (int j = 0; j < colum; j++) {
            System.out.print(matri[i][j]+" ");
        }
    }

    /**
     * 3.- Devuelve la columna j-ésima del array que se pasa como parámetro.
     * @param matri La matiz en la que se busca la fila.
     * @param fila El número de filas que tiene la matriz.
     * @param j El número de la columna que se quiere mostrar.
     * */
    public static void columnaDeArrayBiInt(int[][] matri, int fila, int j){
//        Var

//        Body
        for (int i = 0; i < fila; i++) {
            System.out.println(matri[i][j]);
        }
    }

    /**
     * 4.- Devuelve la fila y la columna (en un array con dos elementos) de la primera ocurrencia de un número dentro de un array bidimensional. Si el número no se encuentra en el array, la función devuelve el array {-1, -1}.
     * @param matri La matriz en la que se busca el número.
     * @param num El número que se busca.
     * @return Int[2]. Son los índices de la posición del número introducido.
     * */
    public static int[] coordenadasEnArrayBiInt(int[][] matri, int num){
//        Var
        int[] ret = new int[] {-1, -1};
        int indiF =-1, indiC=-1, contF=0, contC=0;
//        Body

        for (int[] fila : matri){
            for (int col : fila){
                if (col == num){
                    ret[0] = contF;
                    ret[1] = contC;
                    break;
                }
                contC++;
            }
            contF++;
            contC=0;
        }

//        End
        return ret;
    }

    /**
     * 5.- Dice si un número es o no punto de silla, es decir, mínimo en su fila y máximo en su columna.
     * @param matri La matriz en la que se comprueba el número.
     * @param fila La fila en la que se comprueba el número.
     * @param col La fila en la que se comprueba el número.
     * @return Boolean. true si el número es el punto de silla/false si el número no es el punto de silla.
     * */
    public static boolean esPuntoDeSilla(int[][] matri, int fila, int col){
//        Var
        boolean ret = true;
        int maxF=0, maxC=0, num=matri[fila][col];
//        Body

        for (int[] f:matri){
            maxC=0;
            for (int c : f){
                maxC++;
            }
            maxF++;
        }

        for (int i = 0; i < maxC; i++) {
            if(num>matri[fila][i]){
                ret=false;
                break;
            }
        }

        if(ret){
            for (int i = 0; i < maxF; i++) {
                if(num<matri[i][col]){
                    ret=false;
                    break;
                }
            }
        }

//        End
        return ret;
    }

    /**
     * 6.-Devuelve un array que contiene una de las diagonales del array bidimensional que se pasa como parámetro. Se pasan como parámetros fila, columna y dirección. La fila y la columna determinan el número que marcará las dos posibles diagonales dentro del array. La dirección es una cadena de caracteres que puede ser “nose” o “neso”. La cadena “nose” indica que se elige la diagonal que va del noroeste hacia el sureste, mientras que la cadena “neso” indica que se elige la diagonal que va del noreste hacia el suroeste.
     * @param matri La matriz en la que se busca
     * @param fila El número de filas que tiene la matriz
     * @param col El número de columnas que tiene la matriz
     * @param dire La dirección de la diagonal
     * @return Int[]. Vector con los valores de la diagonal.
     * */
    public static int[] diagonal(int[][] matri, int fila, int col, String dire){
//        Var
        int[] ret = new int[col];

//        Body

        if (dire.equals("nose")){
            for (int i = 0; i < fila; i++) {
                ret[i]=matri[i][i];
            }

        } else if (dire.equals("neso")) {
            for (int i = 0; i < fila; i++) {
                ret[i]= matri[i][fila-1-i];
            }
        }


//        End
        return ret;
    }

}
