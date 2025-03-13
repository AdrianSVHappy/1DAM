/**Ejercicio 2 -
 Escribe un programa que pida 20 números enteros. Estos números se deben
 introducir en un array de 4 filas por 5 columnas. El programa mostrará las
 sumas parciales de filas y columnas igual que si de una hoja de cálculo se
 tratara. La suma total debe aparecer en la esquina inferior derecha.*/
public class Main {
    public static void main(String[] args) {
//        Const
        final int FILA = 4;
        final int COLUMNA = 5;

//        Var
        int[][] tabla = new int[FILA][COLUMNA];
        int sumFila = 0;
        int sumCol = 0;
        int total = 0;

//        Body

        /*//Ver el formato
        for (int[] fila : tabla){
            for (int columna : fila){
                System.out.print(" XX ");
            }
            System.out.println();
        }*/

        //Introducir los números
        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COLUMNA; j++) {
                tabla[i][j] = (int)(Math.random()*101);
                total += tabla[i][j];
            }
        }
        System.out.println();

        //Mostrar los número correctamente
        for (int[] fila : tabla){
            for (int columna : fila){
                if(columna<9)
                    System.out.print("   "+columna+" ");
                else
                    System.out.print("  "+columna+" ");

                sumFila += columna;
            }
            System.out.println(" "+sumFila);
            sumFila = 0;
        }

        for (int i = 0; i <COLUMNA ; i++) {
            for (int j = 0; j < FILA; j++) {
                sumCol += tabla[j][i];
            }
            System.out.print(" "+sumCol+" ");
            sumCol = 0;
        }
        System.out.println(" "+total);

    }
}