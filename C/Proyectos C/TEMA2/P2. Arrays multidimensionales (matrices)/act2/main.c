#include <stdio.h>
#include <stdlib.h>


/* 2)	Escribe un programa en C que, al recibir como dato un arreglo bidimensional (matriz)
 * cuadrado, determine si el mismo es simétrico. Recuerda que se considera simétrico si
 * cumple la siguiente condición: A[I][J] = A[J][I], siendo “I”=20 y “J”=30. */

int main() {
    //Constantes
    const int FILA = 10, COL = 9;

    //Variables
    int a[FILA][COL], bandera= 0;


    //Cuerpo
    for (int i = 0; i < FILA; ++i) {
        for (int j = 0; j < COL; ++j) {
            bandera = 0;
            if (i != j) {
                bandera = 1;
            }
        }
    }

    if (bandera == 0){
        printf("Es simetrico");
    } else {
        printf("No es simetrico");
    }


    //Fin
    return 0;
}