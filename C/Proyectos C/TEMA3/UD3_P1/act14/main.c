#include <stdio.h>
#include <stdlib.h>

#include <string.h> //Libreria util para el tratamiento de strings

/* 14. Escribe un programa que determine cuántas veces aparece una cadena dentro de otra. */

//Constantes
#define S 50


//Estructuras


//Prototipos
int repe(char *x, char *y);
int main(void) {
    //Variables
    char frase[S];
    char cadena[S];

    //Cuerpo

    printf("\nCadena principal:");
    fflush(STDIN_FILENO);
    gets(frase);
    printf("\nCadena secundaria:");
    fflush(STDIN_FILENO);
    gets(cadena);

    printf("\n\nSe ha repetido %d veces", repe(frase, cadena));

    //Fin
    return 0;
}

//Funciones
int repe(char *x, char *y){
    //Variables
    int veces = 0,
    contador = 0;
    //Cuerpo

    for (int i = 0; i < S; ++i) {

       if(y[contador] == '\0'){
           contador = 0;
           veces +=1;
       }
        printf("\n%c - %c", x[i], y[contador]);
        if(x[i]!=y[contador]){
            contador = 0;
        }else{
            contador+=1;
            printf("*");
        }
        if(x[i]== '\0'){
            break;
        }



    }

    //Fin
    return veces;
}