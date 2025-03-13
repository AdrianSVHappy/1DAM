#include <stdio.h>
#include <stdlib.h>


/* Los organizadores de un acto electoral de un país europeo solicitaron un
programa de cómputo para manejar en forma electrónica el conteo de los votos.
En la elección hay cinco candidatos, los cuales se representan con los valores del
1 al 5. Construye un programa en C que permita obtener el número de votos de
cada candidato. El usuario ingresa los votos de manera desorganizada, tal y como
se obtienen en una elección; el final de datos se representa con un cero. Observa
la siguiente lista de ejemplo: 2 5 5 4 3 4 4 5 1 2 4 3 1 2 4 5 0
Donde: 2 representa un voto para el candidato 2, 5 un voto para el candidato 5, y
así sucesivamente. */

int main() {
    //Constantes
    const int LIMITE = 5;
    //Variables
    int contador[LIMITE], loop= 1, voto= 0;

    //Cuerpo
    for (int i = 0; i < LIMITE; ++i) {
        contador[i]= 0;
    }

    do {
        fflush(stdin);
        scanf("%d", &voto);

        if(voto == 0){
            loop = 0;
            for (int i = 0; i < LIMITE; ++i) {
                printf("%d:%d\n", i+1, contador[i]);
            }
        } else if (voto <= LIMITE){
            contador[voto-1] += 1;
        }

    } while (loop = 1);


    //Fin
    return 0;
}