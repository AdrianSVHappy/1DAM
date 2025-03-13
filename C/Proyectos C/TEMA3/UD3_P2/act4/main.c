#include <stdio.h>
#include <stdlib.h>
#include <time.h> //Libreria necesaria para usar las funciones rand() y srand().
#include <string.h> //Libreria util para el tratamiento de strings

/* 4 Ejercicio.
Escribe un programa que, al recibir como datos 24 números reales que
representan las temperaturas registradas en el exterior en un periodo de 24 horas,
encuentre, con la ayuda de funciones, la temperatura promedio del día, así como la
temperatura máxima y la mínima con el horario en el cual se registraron.
Datos: TEM1, TEM2,..., TEM24 (variables de tipo real que representan las
temperaturas). */

//Constantes
#define N 24


//Estructuras


//Prototipos
void darValor(float *x);
float promedio(float *x);
void maxima(float *x);
void minima(float *x);
int main(void) {
    //Variables
    float tem[N];

    time_t t; //Declaramos la variable tiempo para la creación de la semilla.

    //Cuerpo
    srand((unsigned) time(&t));//Generamos la semilla para la función random.

    darValor(tem);
    printf("\nTemperatura media: %.2fC%c", promedio(tem) , 248);
    maxima(tem);
    minima(tem);

    //Fin
    return 0;
}

//Funciones
void darValor(float *x){

    //Variables

    //Cuerpo

    for (int i = 0; i < N; ++i) {
        *(x+i) = (float) (rand() % 10000) / 100;

        if(i < 9) {
            printf("|0");
        } else{
            printf("|");
        }
        printf("%d|%.2f|\n", i+1, *(x+i));
    }



}

float promedio(float *x){
    //Variables
    float z = 0;
    //Cuerpo

    for (int i = 0; i < N; ++i) {
        z += *(x+i);
    }

    z /= (float) N;

    return z;
}

void maxima(float *x){
    //Variables
    int hora = 0;
    float tem =0;

    //Cuerpo
    for (int i = 0; i < N; ++i) {
        if(((int) (*(x+i))*100) > (int)tem*100){
            tem = *(x+i);
            hora = i+1;
        }
    }

    printf("\nLa mayor temperatura es:[%d] %.2f", hora, tem);
}

void minima(float *x){
    //Variables
    int hora = 0;
    float tem =100;

    //Cuerpo
    for (int i = 0; i < N; ++i) {
        if(((int) (*(x+i))*100) < (int)tem*100){
            tem = *(x+i);
            hora = i+1;
        }
    }

    printf("\nLa menor temperatura es:[%d] %.2f", hora, tem);
}