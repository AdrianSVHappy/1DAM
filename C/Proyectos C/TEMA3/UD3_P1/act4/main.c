#include <stdio.h>
#include <stdlib.h>


/* 4. ¿Dónde está el error en la siguiente definición de función?
int twice(int y); --> aqui no deberias de poner ;
{
    return (2 * y);
} */




//Prototipos
int twice(int y);

int main() {
    //Variables
    int x = 1;
    //Cuerpo

    printf("%d",twice(x));



    //Fin
    return 0;
}

//Funciones
int twice(int y)
{
    return (2 * y);
}