#include <stdio.h>
#include <stdlib.h>
#include <time.h> //Libreria necesaria para usar las funciones rand() y srand().
#include <string.h> //Libreria util para el tratamiento de strings

/* Plantilla */

//Constantes
#define N 3

//Prototipos

int main(void) {
    //Variable
    char pos[N][N];

    char p1 = 0,
            p2 = 0;

    int aleatorio = 0,
        op1 = 0,
        win = 0,
        jugada = 0,
        fila = 0, columna = 0,
        coord = 0;


    time_t t; //Declaramos la variable tiempo para la creación de la semilla.

    //Cuerpo
    srand((unsigned) time(&t));//Generamos la semilla para la función random.

    //* tablero a cero

    for (int i = 0; i < N; ++i) {
        for (int j = 0; j < N; ++j) {
            pos[i][j] = 45;
        }
    }



    //* escoger ficha
    do {
        printf("Jugador-1, escoge:\n1.-X\n2.-O\n");
        fflush(stdin);
        scanf("%d", &op1);

        switch (op1) {
            case 1:
                p1 = 'X';
                p2 = 'O';
                break;
            case 2:
                p1 = 'O';
                p2 = 'X';
                break;
            default:
                printf("Error\n");
        }
    } while ((op1 != 1)&&(op1 != 2));


    do {

        //*Mostramos el tablero
        printf("Jugada No[%d]\n[1|2|3]\n", jugada);
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                printf("|%c",pos[i][j]);
            }
            printf("|[%d]\n", (i+1));
        }



        //*Seleccionamos las coordenadas
        do {
            coord = 0;
            printf("Turno del jugador 1:\nEscribe la fila:\n");
            fflush(stdin), scanf("%d", &fila);

            printf("Escoge la columna\n");
            fflush(stdin), scanf("%d", &columna);

            if(((fila < 1) || (fila > 3)) || ((columna < 1) || (columna > 3))){
                printf("Las coordenadas (%d,%d), se salen del tablero\n", fila, columna);
                coord = 1;
            }else if(pos[(fila-1)][(columna-1)] != '-'){
                printf("Casilla ocupada\n");
                coord = 1;
            }

        } while (coord);

        //*Colocamos la ficha
        pos[(fila-1)][(columna-1)]=p1;



        //*Juega el p2
        do {

            fila = rand() % 4;
            columna = rand() % 4;

        } while (pos[(fila-1)][(columna-1)] != '-');
        pos[(fila-1)][(columna-1)]=p2;



        //*Comprobar si hay un ganador
        for (int i = 0; i < N; ++i) {
            //**Comprobamos las filas
           if (
                   (pos[i][0]==p1)&&
                   (pos[i][1]==p1)&&
                   (pos[i][2]==p1)
                   ){
               win = 1;
               break;
           }else if(
                   (pos[i][0]==p2)&&
                   (pos[i][1]==p2)&&
                   (pos[i][2]==p2)
                   ){
               win = 2;
               break;
           }
            //**Comprobamos las colunas


        }




        jugada +=1;
        //win = 1;
    } while (win == 0);


    //*Mostramos el tablero
    printf("Jugada No[%d]\n[1|2|3]\n", jugada);
    for (int i = 0; i < N; ++i) {
        for (int j = 0; j < N; ++j) {
            printf("|%c",pos[i][j]);
        }
        printf("|[%d]\n", (i+1));
    }


    switch (win) {
        case 1:
            printf("Has ganado Jugador 1");
            break;
        case 2:
            printf("Has ganado Jugador 2");
            break;
    }



    //Fin
    return 0;
}

//Funciones