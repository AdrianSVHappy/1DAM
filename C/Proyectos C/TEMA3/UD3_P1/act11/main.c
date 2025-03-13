#include <stdio.h>
#include <stdlib.h>


/* 11. Escribe un programa que pida un número entero por pantalla y diga si lo que se
ha introducido es en verdad un número entero válido. Nos conformamos con
detectar enteros menores que 10^9. */

//Constantes
#define S 9

//Prototipos
void compruebaDeci(char *x);
int main(void) {
    //Variables

    char num[S];

    //Cuerpo
    printf("\nEscribe un n%cmero:", 163);
    scanf("%s", num);
    printf("\n%s", num);

    compruebaDeci(num);

    return 0;
}

//Funciones
void compruebaDeci(char *x){
    //Variables
    int y = 0;

    //Cuerpo
    while (x[y] != '\0'){
        y++;
    }
    if (y > S){
        printf("\nInvalid (10^%d)", (y-1));
    }

}