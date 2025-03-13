#include <stdio.h>
#include <stdlib.h>
#include <time.h> //Libreria necesaria para usar las funciones rand() y srand().

/* Plantilla */

int main() {
	//Constantes
    int const LIMITE =5;

	//Variables
    int mat[LIMITE][LIMITE], aux1= 0;

	time_t t; //Declaramos la variable tiempo para la creación de la semilla.

	//Cuerpo
	srand((unsigned) time(&t));//Generamos la semilla para la función random.

    for (int i = 0; i < LIMITE; ++i) {
        for (int j = 0; j <LIMITE; ++j) {
            mat[i][j] = rand() % 51;
            printf("%d ",mat[i][j]);
        }
        printf("\n");
    }

    for (int i = 0; i < LIMITE; ++i) {
        for (int j = 0; j <(LIMITE/2); ++j) {
            aux1 =mat[i][j];
            mat[i][j] = mat[i][(LIMITE-1)-j];
            mat[i][(LIMITE-1)-j] = aux1;
        }

    }
    printf("\nvvvvvvvvvvvvvvvvvvvvvv\n\n");

    for (int i = 0; i < LIMITE; ++i) {
        for (int j = 0; j <LIMITE; ++j) {

            printf("%d ",mat[i][j]);
        }
        printf("\n");
    }

	//Fin
	return 0;
}
