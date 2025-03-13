#include <stdio.h>
#include <stdlib.h>


/* Plantilla */

int main() {
    //Constantes
    const int LIMITE = 4;

    //Variables
    int x[LIMITE][LIMITE];


    //Cuerpo
    for (int i = 0; i < LIMITE; ++i) {
        for (int j = 0; j < LIMITE; ++j) {
            x[i][j] = 0;
            printf("%d ", x[i][j]);
        }
        printf("\n");
    }

    for (int i = 0; i < LIMITE; ++i) {
        for (int j = 0; j < LIMITE; ++j) {
            if((i == j) || (i == ((LIMITE-1)-j))) {
                x[i][j] = 1;
            }

        }
    }

    printf("------------------------\n");
    for (int i = 0; i < LIMITE; ++i) {
        for (int j = 0; j < LIMITE; ++j) {

            printf("%d ", x[i][j]);
        }
        printf("\n");
    }


    //Fin
    return 0;
}
