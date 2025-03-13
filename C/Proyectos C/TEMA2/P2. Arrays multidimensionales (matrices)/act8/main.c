#include <stdio.h>
#include <stdlib.h>
#include <time.h> //Libreria necesaria para usar las funciones rand() y srand().

/* 8    Escribe un programa en C que, al recibir como dato un arreglo bidimensional de tipo entero,
 * recorra este arreglo en forma de espiral. Observa la siguiente figura.
 * Dato: MAT [M][N] (arreglo bidimensional de tipo real de M filas y N columnas, 1 ≤ M ≤ 50 y 1 ≤ N ≤ 50).
 */

int main() {
    //Constantes
    const int
    M = 4, //M=4
    N = 5; //N=5

    //Variables
    int mat[M][N], cont=1, iteracion= 1,  cambio= 0;

    int
    fila = 0, //la fila en la que está el dato que se lee
    columna = 0, //La columna en la que está el dato que se lee

    limiteFila= M, //Indica la posición en el que se va a dejar de leer la Fila
    limiteColumna= N, //Indica la posición en el que se va a dejar de leer la Columna

    inicioFila = -1, //Indica la posición en el que se va a empezar a leer la Fila
    inicioColumna=-1 //Indica la posición en el que se va a empezar a leer la Columna
    ;

    time_t t; //Declaramos la variable tiempo para la creación de la semilla.

    //Cuerpo
    srand((unsigned) time(&t));//Generamos la semilla para la función random.

    for (int i = 0; i < M; ++i) {
        for (int j = 0; j < N; ++j) {
            mat[i][j]= cont;

            if(cont < 10){
                printf("| %d",mat[i][j]);
            }else{
                printf("|%d",mat[i][j]);
            }

            cont+=1;
        }
        printf("|\n");
    }

    printf("----------------\n");

    while (iteracion <= (M*N)){
        switch (cambio) {
            case 0:


                printf("\nDERECHA\n");
            for (int i = columna; i < limiteColumna; ++i) {
                printf("[%d]-",iteracion);

                columna = i;

                printf("%d (%d.%d), ", mat[fila][columna], fila, columna);



                iteracion +=1;
                }

                fila +=1;

                inicioFila +=1;

                cambio = 1;


                break;
            case 1:



                printf("\nABAJO\n");
                for (int i = fila; i < limiteFila; ++i) {

                    printf("[%d]-",iteracion);

                    fila = i;

                    printf("%d (%d.%d), ", mat[fila][columna], fila, columna);


                    iteracion +=1;
                }

                columna -=1;

                limiteColumna -=1;

                cambio = 2;


                break;
            case 2:

                printf("\nIZQUIERDA\n");
                for (int i = columna; i > inicioColumna; i-=1) {
                    printf("[%d]-",iteracion);

                    columna = i;

                    printf("%d (%d.%d), ", mat[fila][columna], fila, columna);

                    iteracion +=1;
                }

                fila -=1;

                limiteFila -=1;

                cambio = 3;
                break;
            case 3:

                printf("\nARRIBA\n");
                for (int i = fila; i > inicioFila; i-=1) {
                    printf("[%d]-",iteracion);

                    fila = i;

                    printf("%d (%d.%d), ", mat[fila][columna], fila, columna);

                    iteracion +=1;
                }

                columna +=1;

                inicioColumna +=1;

                cambio = 0;
                break;
        }


    }

    //Fin
    return 0;
}
