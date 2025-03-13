#include <stdio.h>
#include <stdlib.h>
#include <time.h> //Libreria necesaria para usar las funciones rand() y srand().

/* 6. Escriba un programa que utilice una función para encontrar el promedio de n
valores float ingresados por el usuario; n puede ser una cantidad diferente en
cada ejecución. Luego modifíquelo para incluir el cálculo de la media en una
función que reciba (al menos) una matriz de float y devuelva un valor float. */

//Constantes
#define N 5

//Prototipos
float promedio(void);
float promedio2(float *x);
int main(void) {
    //Variables
    float numeros[N][N];

    time_t t; //Declaramos la variable tiempo para la creación de la semilla.

    //Cuerpo
    srand((unsigned) time(&t));//Generamos la semilla para la función random.
    //*Damos valor al vector
    for (int i = 0; i < N; ++i) {
        for (int j = 0; j < N; ++j) {
            numeros[i][j]= rand() % 10;
            printf("|%.0f", numeros[i][j]);
        }
        printf("|\n");
    }

    printf("Primera funcion: %f\n", promedio());
    printf("Segunda funcion: %f", promedio2(numeros));


    //Fin
    return 0;
}

//Funciones
float promedio(void){

    //Variables
    int n = 0,
        m = 0;
    float num = 0,
            acumulador = 0,
            media = 0;

    //Cuerpo
    printf("Dime el numero de valores que vas a introducir: ");
    fflush(stdin);
    scanf("%d", &n);
    m = n;

    printf("Escribe los %d floats:\n", n);
    while (m > 0){
        fflush(stdin);
        scanf("%f", &num);

        acumulador += num;
        num = 0;

        m--;
    }

    media = acumulador / n;

    //Return
    return media;
}

float promedio2(float *x){
    //Variables
    float media = 0;


    //Cuerpo
    for (int j = 0; j < N; ++j) {
        for (int k = 0; k < N; ++k) {

            media += *((x+j)+k);
        }

    }

    media /= (float) (N*N);

    //Return
    return media;
}