/**Ejercicio 19 -
 Escribe un programa que muestre 50 números enteros aleatorios comprendidos
 entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
 el máximo de los pares el mínimo de los impares y la media de todos los
 números generados.*/
public class Main {
    public static void main(String[] args) {
//        Var
        int rand, max=-101, min=201, media=0;
//        Body
        for (int i = 0; i < 50; i++) {
            rand = (int)(Math.random()*301-100);
            System.out.print(rand+" ");

            media += rand;

            if(((rand%2)==0)&&(rand>max))
                max = rand;

            if(((rand%2)!=0)&&(rand<min))
                min = rand;
        }
        media/=50;
        System.out.println("\nMax: "+max+"\nMin: "+min+"\nMed: "+media);

    }
}