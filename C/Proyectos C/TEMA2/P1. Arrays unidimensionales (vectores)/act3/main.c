#include <stdio.h>
#include <stdlib.h>
#include <time.h> //Libreria necesaria para usar las funciones rand() y srand().

/* Escribe un programa que, al dar como dato un array unidimensional de números
enteros, determine cuántos de ellos son positivos, cuántos negativos y cuántos
nulos.
Dato: VEC[N] (array unidimensional de tipo entero de N elementos, 1 ≤ N ≤ 100). */

int main() {

    //Variables
    int valor= 0, numeros[100], pos= 0, neg= 0, nul= 0;

    time_t t; //Declaramos la variable tiempo para la creación de la semilla.

    //Cuerpo
    srand((unsigned) time(&t));//Generamos la semilla para la función random.

    for (int i = 0; i < 100; ++i) {
        numeros[i]= rand() % 202 - 101;
    }

    for (int i = 0; i < 100; ++i) {
        if( 0 == numeros[i]){
            nul += 1;
        } else if (0 < numeros[i]){
            pos += 1;
        } else if (0 > numeros[i]) {
            neg += 1;
        }
    }

    printf("Numeros positivos: %d\nNumero nulo: %d\nNumero negativos: %d", pos, nul, neg);


    //Fin
    return 0;
}