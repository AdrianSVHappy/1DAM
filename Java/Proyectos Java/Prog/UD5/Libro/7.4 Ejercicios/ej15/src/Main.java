import java.util.Scanner;

/**Ejercicio 15 -
 Un restaurante nos ha encargado una aplicación para colocar a los clientes en
 sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
 (mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
 el programa no está preparado para colocar a grupos mayores a 4, por tanto, si
 un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje
 “Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
 como máximo e intente de nuevo”. Para el grupo que llega, se busca
 siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres, se
 busca donde haya un hueco para toodo el grupo, por ejemplo si el grupo es de
 dos personas, se podrá colocar donde haya una o dos personas. Inicialmente,
 las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan
 nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
 pueden romper aunque haya huecos sueltos suficientes. El funcionamiento del
 programa se ilustra a continuación:*/
public class Main {
    public static void main(String[] args) {
//        Const
        final int N = 10;
        final int MAX = 4;

//        Var
        int[] mesas = new int[N];
        int cont=0;
        int res;
        boolean conSitio=false;

        Scanner sn = new Scanner(System.in);
//        Body
        for (int i = 0; i < N; i++) {
            mesas[i] = (int)(Math.random()*4);
        }

        do {

            System.out.println("Mesas:");
            for (int aux : mesas){
                System.out.print("| "+cont+" | ");
                cont++;
                System.out.println(aux+" |");
            }

            System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa):");
            res = sn.nextInt();

            if(res>0){
                if(res>MAX)
                    System.out.println("Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e intente de nuevo");
            }

            for (int i = 0; i < N; i++) {
                if((mesas[i]+res)<=MAX){
                    System.out.println("Por favor, siéntense en la mesa número "+i);
                    mesas[i]+=res;
                    conSitio = true;
                    break;
                }
            }

            if(!conSitio)
                System.out.println("Lo siento, en estos momentos no queda sitio.");
            conSitio = false;

        }while (res!=-1);







    }
}