#include <stdio.h>
#include <stdlib.h>
#include <time.h> //Libreria necesaria para usar las funciones rand() y srand().

/*4) Escribe un programa que reciba como entrada un array unidimensional de N
enteros y obtenga como salida ese mismo array, pero sin los elementos repetidos.
Dato: VEC[N] (array unidimensional de tipo entero de N elementos, 1 ≤ N ≤ 20). */

int main() {
    //Constantes
    const int LIMITE = 20;

    //Variables
    int numeros[LIMITE];

    time_t t; //Declaramos la variable tiempo para la creación de la semilla.

    //Cuerpo
    srand((unsigned) time(&t));//Generamos la semilla para la función random.

    for (int i = 0; i < LIMITE; ++i) {
        numeros[i]= (rand() % LIMITE) +1;
        printf("%d ", numeros[i]);
    }

    printf("\n");
    for (int i = 0; i < LIMITE; ++i) {
        for (int j = (i+1); j < LIMITE; ++j) {
            if (numeros[i] == numeros[j]) {
                if (numeros[i] > 9){
                    numeros[i] = -2;
                } else {
                numeros[i] = -1;
                }
            }
        }

        if (numeros [i] == -2) {
            printf("-- ");
        } else if (numeros [i] == -1){
            printf("- ");
        } else{
            printf("%d ", numeros[i]);
        }
    }

    //Fin
    return 0;
}
