import vectores.Vect;

/**
 * <h1>Ejercicios 20-28</h1>
 * <hr>
 * <p>Crea una biblioteca de funciones para arrays (de una dimensión) de números
 * enteros que contenga las siguientes funciones:</p>
 *
 * <p>1. generaArrayInt: Genera un array de tamaño n con números aleatorios
cuyo intervalo (mínimo y máximo) se indica como parámetro.
 <p>2. minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
 <p>3. maximoArrayInt: Devuelve el máximo del array que se pasa como
parámetro.
<p>4. mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
<p>5. estaEnArrayInt: Dice si un número está o no dentro de un array.
<p>6. posicionEnArray: Busca un número en un array y devuelve la posición
(el índice) en la que se encuentra.
<p>7. volteaArrayInt: Le da la vuelta a un array.
<p>8. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un
array.
 <p>9. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de
un array.
 * */
public class Main {
    public static void main(String[] args) {
//        Const
        final int N = 10;

//        Var
        int[] numeros = new int[N];

//        Body

        Vect.generaArrayInt(numeros, N, 100, 50);

        for (int aux : numeros){
            System.out.print(aux+" ");
        }

        System.out.println();
        Vect.rotaIzquierdaArrayInt(numeros, N, 1);

        for (int aux : numeros){
            System.out.print(aux+" ");
        }
    }
}