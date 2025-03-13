import matrices.Matriz;

/**
 * <h1>Ejercicio 29-34</h1>
 * <hr>
 * <p>Crea una biblioteca de funciones para arrays bidimensionales (de dos dimensiones)
 * de números enteros que contenga las siguientes funciones:</p>
 * <p>1. generaArrayBiInt: Genera un array de tamaño n x m con números
 * aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.</p>
 * <p>2. filaDeArrayBiInt: Devuelve la fila i-ésima del array que se pasa como
 * parámetro.
 * <p>3. columnaDeArrayBiInt: Devuelve la columna j-ésima del array que se
 * pasa como parámetro.
 * <p>4. coordenadasEnArrayBiInt: Devuelve la fila y la columna (en un array
 * con dos elementos) de la primera ocurrencia de un número dentro de un
 * array bidimensional. Si el número no se encuentra en el array, la función
 * devuelve el array {-1, -1}.
 * <p>5. esPuntoDeSilla: Dice si un número es o no punto de silla, es decir,
 * mínimo en su fila y máximo en su columna.
 * <p>6. diagonal: Devuelve un array que contiene una de las diagonales del array
 * bidimensional que se pasa como parámetro. Se pasan como parámetros
 * fila, columna y dirección. La fila y la columna determinan el número que
 * marcará las dos posibles diagonales dentro del array. La dirección es
 * una cadena de caracteres que puede ser “nose” o “neso”. La cadena
 * “nose” indica que se elige la diagonal que va del noroeste hacia el sureste,
 * mientras que la cadena “neso” indica que se elige la diagonal que va del
 * noreste hacia el suroeste.
 * */
public class Main {
    public static void main(String[] args) {
//        Const
        final int FILA = 3;
        final int COLUM = 3;
//        Var
        int[][] numeros = new int[FILA][COLUM];

//        Body

        Matriz.generaArrayBiInt(numeros, FILA, COLUM, 10, 1);

        for (int[] fila:numeros){
            for (int colum: fila){
                System.out.print(colum+" ");
            }
            System.out.println();
        }

        System.out.println("-----------------");

        for (int a: Matriz.diagonal(numeros, FILA, COLUM, "neso")){
            System.out.print(a+" ");
        }
    }
}