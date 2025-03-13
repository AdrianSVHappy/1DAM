#include <stdio.h>
#include <stdlib.h>
#include <time.h> //Libreria necesaria para usar las funciones rand() y srand().

/* 7) Escribe un programa que, al recibir como datos dos arreglos bidimensionales A[M][N] y
 * B[N][P], calcule el producto de dichos arreglos y almacene el resultado en el arreglo bidimensional C[M][P].
 * Datos: A[M][N], B[N][P] (arreglos bidimensionales reales de MxN y NxP elementos,
 * respectivamente, 1 ≤ M ≤ 50, 1 ≤ N ≤ 50, 1 ≤ P ≤ 50).
 */

int main() {
    //Constantes
    const int M = 2, N= 1, P= 2;

    //Variables
    int a[M][N], b[N][P], c[M][P], prod= 0;

    time_t t; //Declaramos la variable tiempo para la creación de la semilla.

    //Cuerpo
    srand((unsigned) time(&t));//Generamos la semilla para la función random.

    for (int i = 0; i < M; ++i) {
        for (int j = 0; j < N; ++j) {
            a[i][j]= rand() % 10;
            if ((a[i][j]) < 10){
                printf("| %d", a[i][j]);
            }else{
                printf("|%d", a[i][j]);
            }

        }
        printf("|\n");
    }




    printf("----------------x----------------\n");





    for (int i = 0; i < N; ++i) {
        for (int j = 0; j < P; ++j) {
            b[i][j]= rand() % 10;
            if ((b[i][j]) < 10){
                printf("| %d", b[i][j]);
            }else{
                printf("|%d", b[i][j]);
            }
        }
        printf("|\n");
    }

    printf("----------------=----------------\n");

    for (int i = 0; i < M; ++i) {
        for (int j = 0; j < P; ++j) {
            prod = 0;
            for (int k = 0; k < N; ++k) {
                prod += (a[i][k] * b[k][j]);
            }
            c[i][j] = prod;
            if ((c[i][j]) < 10){
                printf("| %d", c[i][j]);
            }else{
                printf("|%d", c[i][j]);
            }

        }
        printf("|\n");
    }

    
    //Fin
    return 0;
}
