#include <stdio.h>
#include <stdlib.h>
#include <time.h> //Libreria necesaria para usar las funciones rand() y srand().

/* 1)	Escribe un programa en C que, al recibir dos arreglos bidimensionales MA y MB de 20x20
elementos cada uno, calcule la suma de ambos arreglos, almacene el resultado en otro
arreglo bidimensional e imprima, además, el resultado obtenido. */

int main() {
    //Constantes
    const int LIMITE = 20;

    //Variables
    int ma[LIMITE][LIMITE], mb[LIMITE][LIMITE], mt[LIMITE][LIMITE];

    time_t t; //Declaramos la variable tiempo para la creación de la semilla.

    //Cuerpo
    srand((unsigned) time(&t));//Generamos la semilla para la función random.

    for (int i = 0; i < LIMITE; ++i) {
        for (int j = 0; j < LIMITE; ++j) {
            ma[i][j] =rand() % 101;
        }
    }
    for (int i = 0; i < LIMITE; ++i) {
        for (int j = 0; j < LIMITE; ++j) {
            mb[i][j] =rand() % 101;
        }
    }

    for (int i = 0; i < LIMITE; ++i) {
        for (int j = 0; j < LIMITE; ++j) {
            mt[i][j] = ma[i][j] + mb[i][j];
            printf("%d | ", mt[i][j]);
        }
        printf("\n");
    }

    //Fin
    return 0;
}