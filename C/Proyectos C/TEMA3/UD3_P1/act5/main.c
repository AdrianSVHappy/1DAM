#include <stdio.h>
#include <stdlib.h>


/* 5. Escribe una función que reciba dos números como argumentos y devuelva el valor
de su producto. */



//Prototipos
int producto(int x, int y);

int main() {
    //Variables
    int n1 = 5,
        n2 = 4;


    //Cuerpo
    printf("%d",producto(n1, n2));


    //Fin
    return 0;
}

//Funciones
int producto(int x, int y){
    int z = 0;
    z = x * y;

    return z;
}