#include <stdio.h>
#include <stdlib.h>
#include <time.h> //Libreria necesaria para usar las funciones rand() y srand().

/* Crea un programa que copie un array a otro usando punteros */

int main() {
	//Constantes
	const int LIMITE = 10;

	//Variables
    int
    original[LIMITE], copia[LIMITE],
    *puntero = NULL;


	//Cuerpo
    for (int i = 0; i < LIMITE; ++i) {
        original[i]=i;

    }

    puntero = original;

    for (int i = 0; i < LIMITE; ++i) {
        copia[i]= *(puntero+i);
    }


    for (int i = 0; i < LIMITE; ++i) {
        printf("%d = %d\n", original[i], copia[i]);

    }

	//Fin
	return 0;
}
