#include <stdio.h>
#include <stdlib.h>
#include <string.h> //Libreria util para el tratamiento de strings

/* 13. Escribe un programa con una función compacta_espacios que reciba una
cadena y la devuelva con sus espacios compactados; es decir, si encuentra dos o
más espacios seguidos, los convierte en uno sólo. */

//Constantes
#define S 50


//Estructuras


//Prototipos
void compacta_espacios(char *x);
int main(void) {
    //Variables
    char frase[S];

    //Cuerpo
    fflush(STDIN_FILENO);
    gets(frase);

    printf("%s\n", frase);
    compacta_espacios(frase);
    printf("%s\n", frase);

    //Fin
    return 0;
}

//Funciones
void compacta_espacios(char *x){
    //variables
    int blanco = 0, contado = 0;
    char nuevo[S];

    //cuerpo
    for (int i = 0; i < S; ++i) {

        if(x[i] == ' '){
            if(!blanco){
                blanco = 1;
                nuevo[contado]=x[i];
                contado++;
            }
        }else{
            nuevo[contado]=x[i];
            blanco = 0;
            contado++;
        }
    }

    strcpy(x, nuevo);
}