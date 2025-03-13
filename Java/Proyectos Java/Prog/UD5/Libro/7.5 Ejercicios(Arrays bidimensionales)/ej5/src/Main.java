/**Ejercicio 5 -
 Realiza un programa que rellene un array de 6 filas por 10 columnas con
 números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
 continuación, el programa deberá dar la posición tanto del máximo como del
 mínimo.*/
public class Main {
    public static void main(String[] args) {
//        Const
        final int FILA = 6;
        final int COLUMNA = 10;

//        Var
        int[][] tabla = new int[FILA][COLUMNA];
        int max = 0;
        int min = 1001;
        int maxI = 0, maxJ = 0, minI = 0, minJ=0;

//        Body

        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COLUMNA; j++) {

                tabla[i][j]=(int)(Math.random()*1001);

                if (max<tabla[i][j]) {
                    max = tabla[i][j];
                    maxI = i;
                    maxJ = j;
                }

                if(min>tabla[i][j]){
                    min = tabla[i][j];
                    minI = i;
                    minJ = j;
                }
            }
        }


        for (int[] fila : tabla){
            for (int columna : fila){
                System.out.print("| "+columna+" |");
            }
            System.out.println();
        }

        System.out.println("El maximo es "+max+" ["+maxI+"]["+maxJ+"]" +
                "\nEl minimo es "+min+" ["+minI+"]["+minJ+"]");

    }
}