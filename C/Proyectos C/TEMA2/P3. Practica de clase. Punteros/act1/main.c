#include <stdio.h>
#include <stdlib.h>

/* 1) Crea un programa para crear, inicializar y usar variables tipo puntero.  */

int main() {
    //Variables
    int
    x= 0,
    y= 0,
    *puntero = NULL;

    //Cuerpo
    printf("Escribe un numero para X:");
    fflush(stdin);
    scanf( "%d", &x); //Se mete un numero en x

    puntero = &x; //Se guarda la posición en la que se almacena x en la variable puntero

    y= *puntero; //Se guarda en y el dato que se referencia en la posición almacenada en la variable puntero

    printf("\nEn x se ha guardado %d, y en Y se ha guardado %d", x, y);

    //Fin
    return 0;
}
