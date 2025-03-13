/*6) Escribe un programa en C que coloque un 1 en las diagonales principales de una matriz cuadrada.
 * El resto se debe completar con 0. Observa la figura 6.7, que muestra cómo debe quedar la matriz.
 * Dato: MAT[N][N] (array bidimensional cuadrado de NxN elementos, 1 ≤ N ≤ 100).*/

#include <stdio.h>
#include <stdlib.h>
#include <time.h> //Libreria para el srand y rand

int main() {
    //Constantes
    const int M = 2;
    const int N = 1;
    const int P = 2;

    //Variables
    time_t t; //Variable para crear numeros aleatorios

    int a = 0; //Variable del 1º for
    int b = 0; //Variable del 2º for
    int c = 0; //Variable del 3º for

    int suma = 0; //Suma de los productos

    int A[M][N]; //Array bidimensional principal
    int B[N][P]; //Array bidimensional principal
    int C[M][P]; //Array bidimensional final

    //Programa
    //Funcion para crear numero aleatorio
    srand((unsigned) time(&t));

    //Dar valores a A
    for( a = 0; a < M; a++ ){
        for( b = 0; b < N; b++ ){
            A[a][b] = rand() % 10;
            printf("%d ", A[a][b]);
        }
        printf("\n");
    }

    printf("\n");

    //Dar valores a B
    for( a = 0; a < N; a++ ){
        for( b = 0; b < P; b++ ){
            A[a][b] = rand() % 10;
            printf("%d ", A[a][b]);
        }
        printf("\n");
    }

    printf("\n");

    //Multilicar matrices
    for( a = 0; a < M; a++ ){
        for( b = 0; b < P; b++ ){
            suma = 0;

            for( c = 0; c < N; c++ ){
                suma += A[a][c] * B[c][b];
            }
            C[a][b] = suma;
            printf("%d(%d, %d) ", C[a][b], a, b);
        }
        printf("\n");
    }
    return 0;
}


/*fflush(stdin);
printf("PEDIR_DATOS: \n");
scanf(" %d", &VARIABLE);*/
