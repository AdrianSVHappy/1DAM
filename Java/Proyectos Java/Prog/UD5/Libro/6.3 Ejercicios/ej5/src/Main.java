/**Ejercicio 5 -
 Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 separados por espacios. Muestra también el máximo, el mínimo y la media
 de esos números.*/
public class Main {
    public static void main(String[] args) {
//        Var
        int rand, max, min, media;

//        Body
        max = 0;
        min = 199;
        media = 0;
        System.out.println("Lista de números:");
        for (int i = 0; i < 50; i++) {
            rand = (int)(Math.random()*100+100);
            System.out.print(rand+" ");

            if(rand > max)
                max = rand;

            if(rand < min)
                min = rand;

            media += rand;
        }
        media /= 50;

        System.out.println("\nMaximo: "+max+"\nMinimo: "+min+"\nMedia: "+media);
    }
}