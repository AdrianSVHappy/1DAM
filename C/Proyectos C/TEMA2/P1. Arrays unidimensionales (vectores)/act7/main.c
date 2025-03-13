#include <stdio.h>
#include <stdlib.h>
#include <time.h> //Libreria necesaria para usar las funciones rand() y srand().

/* 7) Construye un programa en C que, al recibir como datos dos arrays
unidimensionales de tipo entero, desordenados, de N(20) y M(20) elementos
respectivamente, genere un nuevo array unidimensional ordenado en forma
descendente (mayor a menor) de N+M elementos de tipo entero, mezclando los dos primeros
arrays. */

int main() {
    //Constantes
    const int LIMITE= 20;

    //Variables
    int n[LIMITE], m[LIMITE], z[(LIMITE*2)], nmenor= 101, mmenor= 101, menor= 0, salvon= 0, salvom= 0, salvo = 0;
    time_t t; //Declaramos la variable tiempo para la creación de la semilla.

    //Cuerpo
    srand((unsigned) time(&t));//Generamos la semilla para la función random.

    printf("N:");
    for (int i = 0; i < LIMITE; ++i) {
        n[i]= rand() % 101;
        printf(" %d", n[i]);

    }
    printf("\nM:");
    for (int i = 0; i < LIMITE; ++i) {
        m[i]= rand() % 101;
        printf(" %d", m[i]);

    }

    printf("\n");
    for (int i = 0; i < (LIMITE*2); ++i) {
        nmenor= 101, mmenor= 101, salvon= 0, salvom= 0;
        for (int j = 0; j < LIMITE; ++j) {
            if (n[j] <= nmenor){
                nmenor = n[j];
                salvon = j;
            }
        }
        for (int k = 0; k < LIMITE; ++k) {
            if (m[k] <= mmenor){
                mmenor = m[k];
                salvom = k;
            }
        }
        if (nmenor <= mmenor){
            z[i] = nmenor;
            n[salvon] = 101;

        } else {
            z[i] = mmenor;
            m[salvom] = 101;

        }
    }

    printf("\nZ:");
    for (int i = 0; i < (LIMITE*2); ++i) {

        printf(" %d", z[i]);

    }
    //Fin
    return 0;
}