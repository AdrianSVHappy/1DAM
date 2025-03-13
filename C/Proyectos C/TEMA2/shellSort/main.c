#include <stdio.h>
#include <stdlib.h>
#include <time.h> //Libreria necesaria para usar las funciones rand() y srand().
#include <string.h> //Libreria util para el tratamiento de strings

/* Plantilla */

//Constantes
#define N 8

//Estructuras

int main() {
    //Variables
    int numeros[N];
    int m =2, x=0, temp= 0;


    time_t t; //Declaramos la variable tiempo para la creación de la semilla.

    //Cuerpo
    srand((unsigned) time(&t));//Generamos la semilla para la función random.

    //*Lista de numeros aleatorios
    for (int i = 0; i < N; ++i) {
        numeros[i] = rand() % 101;

        printf("| %d ",numeros[i]);
    }
    printf("|\n");

    do {
        
        x = N/m;

        for (int j = 0; j < m; j++) {

            for (int k = 0; k < x; ++k) {



            }
            
        }
        
        

        m *= 2;
        
    }while (x>0);


    printf("|");

    for (int i = 0; i < N; ++i) {


        printf(" %d |",numeros[i]);
    }

    //Fin
    return 0;
}
