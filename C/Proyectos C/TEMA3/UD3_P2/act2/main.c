#include <stdio.h>
#include <stdlib.h>
#include <time.h> //Libreria necesaria para usar las funciones rand() y srand().
#include <string.h> //Libreria util para el tratamiento de strings

/* 2 Ejercicio.
Escribe un programa en C que, al recibir como dato un número entero
positivo, determine el mayor divisor de dicho número.
Dato: NUM (variable de tipo entero que representa el número que se ingresa). */

//Constantes



//Estructuras


//Prototipos
void divisor (int x);
int main(void) {
    //Variables
    int num = 0;


    //Cuerpo
    printf("\nN%cmero:", 163);
    fflush(stdin), scanf(" %d", &num);

    divisor(num);


    //Fin
    return 0;
}

//Funciones
void divisor (int x){
    //Variables
    int y = 1; //Segundo divisor

    //Cuerpo

    if(x>0){
        for (int i = x-1; i > 0; --i) {
            if((x%i)== 0){
                y = i;
                break;
            }
        }

        printf("\nLos mayores divisores de [%d] son: %d y %d", x, x, y);
    }else{
        printf("\nEste programa solo permite n%cmeros positivos", 163);
    }


}