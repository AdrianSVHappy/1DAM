#include <stdio.h>
#include <stdlib.h>
#include <time.h> //Libreria necesaria para usar las funciones rand() y srand().
#include <string.h> //Libreria util para el tratamiento de strings

/* 1 Ejercicio.
Escribe un programa en C que, al recibir como datos dos números enteros,
determine si el segundo número es múltiplo del primero.
Datos: NU1, NU2 (variables de tipo entero que representan los números que
se ingresan). */

//Constantes

//Estructuras

//Prototipos
int multiplo(int x, int y);
int main(void) {
    //Variables
    int n1 = 0,
        n2 = 0;


    //Cuerpo

    printf("\nPrimer n%cmero:", 163);
    fflush(stdin), scanf(" %d", &n1);

    printf("\nSegundo n%cmero:", 163);
    fflush(stdin), scanf(" %d", &n2);


    if(multiplo(n1,n2)){
        printf("\nEs multiplo");
    }else{
        printf("\nNo es multiplo");
    }
    //Fin
    return 0;
}

//Funciones
int multiplo(int x, int y){
    //Variables
    int z = -1;

    //Cuerpo
    if((y%x)==0){
        z = 1;
    }else{
        z = 0;
    }

    return z;
}