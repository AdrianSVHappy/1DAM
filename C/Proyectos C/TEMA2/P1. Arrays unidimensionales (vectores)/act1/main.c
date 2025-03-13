#include <stdio.h>
#include <stdlib.h>
#include <time.h> //Libreria necesaria para usar las funciones rand() y srand().

/* 1)   Construye un programa que, al recibir como datos un array unidimensional de
100 elementos de tipo entero y un número entero, determine cuántas veces se
encuentra este número dentro del array. */

int main() {
	//Variables
	int numeros[100], i= 0, igual= 0, cont= 0;
	time_t t; //Declaramos la variable tiempo para la creación de la semilla.

	//Cuerpo
	srand((unsigned) time(&t));//Generamos la semilla para la función random.

    for (int i = 0; i < 100; ++i) {
        numeros[i]= rand() %101;
    }

    printf("Introduce un numero");
    fflush(stdin);
    scanf("%d", &igual);
    for (int i = 0; i < 100; ++i) {
        if(igual == numeros[i]){
            cont += 1;
        }
    }

    printf("El numero introducido se repite %d veces", cont);

	//Fin
	return 0;
}