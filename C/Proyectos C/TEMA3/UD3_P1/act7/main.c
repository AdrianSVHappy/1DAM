#include <stdio.h>
#include <stdlib.h>


/* 7. Escriba un programa que utilice una función recursiva para proporcionar a^b,
dados a y b por el usuario. */




//Prototipos
int elevado(int x, int y);
int main(void) {
    //Variables
    int a, b;

    //Cuerpo
    printf("Vamos a hacer:");
    fflush(stdin), scanf("%d", &a);


    printf("\nElevado a:");
    fflush(stdin), scanf("%d", &b);

    printf("\nResultado: %d", elevado(a, b));


    //Fin
    return 0;
}

//Funciones
int elevado(int x, int y){
    //Variable
    int z = 0;
    //Cuerpo
    if(y == 1) z = x;

    else z = x * elevado(x, y-1); //Recursividad

    return z;


}