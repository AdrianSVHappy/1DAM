#include <stdio.h>
#include <stdlib.h>
#include <time.h> //Libreria necesaria para usar las funciones rand() y srand().
#include <string.h> //Libreria util para el tratamiento de strings

/* 3 Ejercicio.
Escribe un programa en C que, al recibir como datos dos números enteros,
determine el máximo común divisor de dichos números.
Datos: NU1, NU2 (variables de tipo entero que representan los números que
se ingresan). */

//Constantes


//Estructuras


//Prototipos
int macodi(int x, int y);
int main(void) {
    //Variables
    int num1 = 0,
        num2 = 0;


    //Cuerpo
    printf("\nN1:");
    fflush(stdin), scanf("%d", &num1);
    printf("\nN2:");
    fflush(stdin), scanf("%d", &num2);

    printf("\nM%cximo Com%cn Divisor: %d", 160, 163,macodi(num1, num2));



    //Fin
    return 0;
}

//Funciones
int macodi(int x, int y){
    //Variables
    int aux = 1, auy = 1;
    int z = -1;

    //Cuerpo

    for (int i = x; i > 0; --i) {

        if((x%i)== 0){

            aux = i;

            for (int j = y; j > 0; --j) {
                if((y%j)== 0){
                    auy = j;

                    if(aux == auy){
                        z = aux;
                        j = 0;
                        i = 0;
                    }

                }

            }

        }
    }

    return z;


}