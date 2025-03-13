/**Ejercicio 10 -
 Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
 y que los almacene en un array. El programa debe ser capaz de pasar todos
 los números pares a las primeras posiciones del array (del 0 en adelante) y
 todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
 necesario.*/
public class Main {
    public static void main(String[] args) {
//        Const
        final int N = 20;

//        Var
        int[] num = new int[N];
        int par = 0;
        int impar = 0;
        int nAux;
        boolean flag = false;

//        Body
        for (int i = 0; i < N; i++) {
            num[i]= (int)(Math.random()*101);

            if((num[i]%2)==0)
                par++;
            else
                impar++;
        }

        for (int aux : num){
            System.out.print(aux+" ");
        }

        do {
            flag=true;
            for (int i = 0; i < N-1; i++) {
                if((num[i+1]%2)==0){
                    nAux = num[i];
                    num[i]=num[i+1];
                    num[i+1] = nAux;
                }
                if(((num[i]%2)==0)&&(i>(par-1)))
                    flag=false;
            }
        }while (!flag);

        System.out.println("\n"+par+" "+impar);

        for (int aux : num){
            System.out.print(aux+" ");
        }
    }
}