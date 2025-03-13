#include <stdio.h>
#include <stdlib.h>
#include <time.h> //Libreria necesaria para usar las funciones rand() y srand().

/* 5) Escribe un programa que inserte y elimine elementos en un array
unidimensional de tipo entero que se encuentre desordenado. Considera que no
se pueden insertar elementos repetidos.
Donde: VEC es un array unidimensional de tipo entero de N elementos, 1 ≤ N ≤
20, y ELE una variable de tipo entero que expresa el número que se va a insertar
o eliminar. */

int main() {
    //Constantes
    const int LIMITE = 20;

    //Variables
    int op = 0, pos = 0, numeros[LIMITE], nuevo= 0, loop= 1;
    time_t t; //Declaramos la variable tiempo para la creación de la semilla.

    //Cuerpo
    srand((unsigned) time(&t));//Generamos la semilla para la función random.


    for (int i = 0; i < LIMITE ; ++i) {
        numeros[i]= (rand() % LIMITE)+1;
        printf("%d ", numeros[i]);

    }

    do {
        printf("\n1. Insertar\n2. Eliminar\n3. Salir\n");
        fflush(stdin);
        scanf("%d", &op);

        switch (op) {

        case 1:

            do {
                printf("\nSeleccione una posicion de [0-%d] ", LIMITE-1);
                fflush(stdin);
                scanf("%d", &pos);


                printf("\nCambiamos el valor %d --> ", numeros[pos]);
                fflush(stdin);
                scanf("%d", &nuevo);


                for (int i = 0; i < LIMITE; ++i) {
                    if(nuevo == numeros[i]){
                        printf("El numero %d ya se encuentra en la posicion %d", nuevo, i);
                        i = LIMITE;
                    } else if (i == (LIMITE - 1)){
                        loop = 0;
                    }

                }
            } while (loop == 1);



            numeros[pos] = nuevo;

            break;
        case 2:
            printf("\nSeleccione una posicion de [0-%d] ", LIMITE-1);
            fflush(stdin);
            scanf("%d", &pos);

            printf("\nEliminamos el valor %d --> 0\n", numeros[pos]);
            numeros[pos] = 0;

            break;
        case 3:
            printf("Exit");
            break;
        default:
            printf("Error\n");

        }

        printf("Lista final:\n ");
        for (int i = 0; i < LIMITE ; ++i) {
            printf("%d ", numeros[i]);
        }

    } while (op <= 2);

    //Fin
    return 0;
}