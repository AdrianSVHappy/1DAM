#include <stdio.h>
#include <stdlib.h>
#include <string.h> //Libreria util para el tratamiento de strings

/* Plantilla */

//Constantes
#define S 30
#define N 6

//Estructuras

//Prototipos
void separado(char *x, char *y, char *z, char *a);
void junto(char *x, char *y);
int main(void) {
    //Variables
    char nombre[S],
    apellido1[S],
    apellido2[S],
    separados[S],
    info[S],
    juntos[S];


    //Cuerpo

    gets(nombre);
    gets(apellido1);
    gets(apellido2);
    separado(nombre, apellido1, apellido2,separados);

    printf("\nSeparados: %s\n", separados);

    gets(info);
    junto(info, juntos);
    printf("\nJuntos: %s\n", juntos);
    
    //Fin
    return 0;
}

//Funciones
void separado(char *x, char *y, char *z, char *a){
    //variable

    //cuerpo

    for (int i = 0; i < N; ++i) {
        switch (i) {
            case 0://Primera cadena (nombre)
                if(x[0] >96)
                    a[i] =(char)(x[0]-32);
                else
                    a[i] =x[0];
                break;
            case 2://Segunda cadena (apellido1)
                if(y[0] >96)
                    a[i] =(char)(y[0]-32);
                else
                    a[i] =y[0];
                break;
            case 4://Tercera cadena (apellido2)
                if(z[0] >96)
                    a[i] =(char)(z[0]-32);
                else
                    a[i] =z[0];
                break;

        }
        a[i+1] = 46;//Poner punto
        i++;
    }
}

void junto(char *x, char *y){
    //variable
    int blanco = 0,
        contador = 0,
        c = 0;
    // cuerpo
    for (int i = 0; i < S; ++i) {
        if ((x[i] == 32) || (i == 0)) {
            blanco = 0;
            if (x[i] == 32)
                c +=1;
        } else {
            blanco = 1;
            c = 0;
        }

        if (!blanco) {

            if(x[i+c] > 96)
                y[contador] =(char)(x[i+c]-32);
            else
                y[contador] =x[i+c];

            contador++;

            y[contador] = 46;
            contador++;

            if (contador >= N) {
                break;
            }
        }
    }
}