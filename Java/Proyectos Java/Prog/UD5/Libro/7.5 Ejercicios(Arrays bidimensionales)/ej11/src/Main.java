/**Ejercicio 11 -
 Realiza un programa que muestre por pantalla un array de 10 filas por 10
 columnas relleno con números aleatorios entre 200 y 300. A continuación, el
 programa debe mostrar los números de la diagonal que va desde la esquina
 superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
 y la media de los números que hay en esa diagonal.*/
public class Main {
    public static void main(String[] args) {
//        Const
        final int N = 10;

//        Var
        int[][] nums = new int[N][N];
        int max=0, min=301;
        float media = 0;
        
//        Body
        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {
                nums[i][j] = (int)(Math.random()*101+200);
            }
        }

        for (int[] fila : nums){

            for (int aux : fila){
                System.out.print(" | "+aux);
            }
            System.out.println(" |");
        }

        System.out.println("Diagonal: ");

        for (int i = 0; i < N; i++) {

            System.out.print(" | "+nums[i][i]);

            if(max<nums[i][i])
                max = nums[i][i];

            if(min>nums[i][i])
                min = nums[i][i];

            media += (float)nums[i][i];

        }
        media /= (float)N;
        System.out.println(" |");
        System.out.print("Max: "+max+"\nMin: "+min+"\nMedia: "+media);
        
    }
}