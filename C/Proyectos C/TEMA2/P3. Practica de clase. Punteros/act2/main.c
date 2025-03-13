#include <stdio.h>
#include <stdlib.h>


/* 2) Escriba un programa C para leer dos números (float) del usuario y añadirlos
usando punteros. Posteriormente, deberá realizar las operaciones matemáticas
básicas (suma, resta, multiplicación y división) mediante el uso de punteros.*/

int main() {
    //Variables
    float
    n1= 0, n2= 0, resultado= 0,
    *puntero1 = NULL, *puntero2 = NULL, *puntero3 = NULL;


    //Cuerpo
    printf("\nPrimer numero: ");
    fflush(stdin);
    scanf("%f", &n1);

    printf("\nSegundo numero: ");
    fflush(stdin);
    scanf("%f", &n2);

    puntero1 = &n1;
    puntero2 = &n2;
    puntero3 = &resultado;

    //suma
    *puntero3 = *puntero1 + *puntero2;
    printf("\nSUMA: %f + %f = %f", *puntero1, *puntero2, *puntero3);

    //resta
    *puntero3 = *puntero1 - *puntero2;
    printf("\nRESTA: %f - %f = %f", *puntero1, *puntero2, *puntero3);

    //multiplicación
    *puntero3 = *puntero1 * *puntero2;
    printf("\nPRODUCTO: %f * %f = %f", *puntero1, *puntero2, *puntero3);

    //division
    *puntero3 = *puntero1 / *puntero2;
    printf("\nDIVISION: %f / %f = %f", *puntero1, *puntero2, *puntero3);

    //Fin
    return 0;
}
