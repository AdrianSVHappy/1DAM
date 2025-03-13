#include <stdio.h>
#include <stdlib.h>


/* 10. Escribe un programa que pida dos valores al usuario: ancho y alto de un
rectángulo. A continuación, debe llamar a una función pasándole esos valores y
recibiendo de vuelta el área y el perímetro de dicho rectángulo. Hazlo primero
con punteros y luego con estructuras. */

//Constantes



//Estructuras
typedef struct {
    int ancho,
        alto
}rectangulos;


//Prototipos
void pregunta(int *x, int *y);
void areaper(int *x, int *y);

void preguntaSTRUC(int *x, int *y);
void areaperSTRUC(int *x, int *y);
int main(void) {
    //Variables
    int ancho = 0,
        alto = 0;
    rectangulos rectangulo;


    //Cuerpo
    pregunta(&ancho, &alto);
    preguntaSTRUC(&rectangulo.ancho, &rectangulo.alto);


    //Fin
    return 0;
}

//Funciones
void areaper(int *x, int *y){
    printf("\nArea: %d\nPerimetro: %d", ((*x) * (*y)),(2*(*x) + 2*(*y)));
}

void pregunta(int *x, int *y){

    printf("\nAncho:");
    fflush(stdin), scanf(" %d", x);

    printf("\nAlto:");
    fflush(stdin), scanf(" %d", y);

    areaper(x, y);
}


void areaperSTRUC(int *x, int *y){
    printf("\nArea: %d\nPerimetro: %d", ((*x) * (*y)),(2*(*x) + 2*(*y)));
}


void preguntaSTRUC(int *x, int *y){

    printf("\nAncho:");
    fflush(stdin), scanf(" %d", x);

    printf("\nAlto:");
    fflush(stdin), scanf(" %d", y);


    areaperSTRUC(x, y);
}