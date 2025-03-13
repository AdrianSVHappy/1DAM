import java.util.Scanner;

/**Ejercicio 45 -
 Escribe un programa que cambie un dígito dentro de un número dando la
 posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
 empezando por el 1. Se recomienda usar long en lugar de int ya que el
 primero admite números más largos. Suponemos que el usuario introduce
 correctamente los datos.
 Ejemplo:
 Por favor, introduzca un número entero positivo: 406783
 Introduzca la posición dentro del número: 3
 Introduzca el nuevo dígito: 1
 El número resultante es 401783*/

public class Main {
    public static void main(String[] args) {
//        Var
        Scanner sn = new Scanner(System.in);
        int num, aux, aux2, pos, digito, tamanio;

//        Body
        System.out.println("Por favor, introduzca un número entero positivo:");
        num = sn.nextInt();
        System.out.println("Introduzca la posición dentro del número:");
        pos = sn.nextInt();
        System.out.println("Introduzca el nuevo dígito:");
        digito = sn.nextInt();

//        *Calculo el tamaño del número introducido
        tamanio = 1;
        aux = 9;
        while(aux < num){
            tamanio+=1;
            aux*=10;
            aux+=9;
        }

//        *Determino la posición de derecha a izquierda
        pos = tamanio-pos;

//        *Creo un múltiplo de 10 para hacer los cálculos en la posición indicada (también valdría con hacer la potencia de 10^pos)
        aux=1;
        for (int i = 0; i < pos; i++) {
           aux*=10;
        }

//        *Recorto el digito que quiero cambiar
        aux2 = ((num/aux)*aux)-((num/(aux*10))*(aux*10));

//        *Pongo el digito a 0
        num-=aux2;

//        *Lo cambio por el número introducido por pantalla
        num+= digito*aux;

        System.out.println("El número resultante es "+num);
    }
}