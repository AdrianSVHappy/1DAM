#include <stdio.h>
#include <stdlib.h>
#include <time.h> //Libreria necesaria para usar las funciones rand() y srand().
#include <string.h> //Libreria util para el tratamiento de strings

/* A la empresa donde trabajamos le han encargado el desarrollo de una máquina para jugar al
bingo. El número máximo de elementos de cada “cartón” será de cinco. El coste de cada
apuesta será programado por el empresario y, no será superior a dos euros.
El usuario debe elegir los cinco números (0 a 50) de cada “cartón”, mientras que el programa
generará de forma aleatoria su propio “cartón”.
El usuario, primero introducirá la cantidad de dinero en la máquina (sólo monedas de 10, 20,
50 céntimos y 1 y 2 euros) e indicará a la máquina el número de partidas que quiere jugar. Si el
número de partidas es inferior al saldo, la máquina debe devolverle el importe sobrante.
El premio sería el siguiente:
 50 euros si el número de coincidencias es igual a 5.
 40 euros si el número de coincidencias es igual a 4.
 30 euros si el número de coincidencias es igual a 3.
 20 euros si el número de coincidencias es igual a 2.
 10 euros si el número de coincidencias es igual a 1. */

//Constantes
#define COSTE 200
#define CANTIDAD 5


//Estructuras


//Prototipos
void cartonUsuario(int *carton);
void cartonPrograma(int *carton);
void meterDinero(int *dinero);
void partida(int *dinero);
void menu(int dinero, int partidas);
void devolverDinero(int *dinero);
void mostrarVectoNum(int *vector, int limite);
int main(void) {
    //Variables
    int saldo = 250;
    int numeroPartidas = 0;
    int numerosUsuario[CANTIDAD];
    int numerosPrograma[CANTIDAD];



    //Cuerpo

    //menu(saldo, numeroPartidas);

    cartonUsuario(numerosUsuario);

    //Fin
    return 0;
}

//Funciones

void mostrarVectorNum(int *vector, int limite){

    printf("\n");

    for (int i = 0; i < limite; ++i) {

        if(vector[i]<10){
            printf("|0%d", vector[i]);
        }else{
            printf("|%d", vector[i]);
        }

    }
    printf("|\n");

}

void menu (int dinero, int partidas){
    printf("\n\nMENU PRINCIPAL:"
           "\n 1.-Jugar"
           "\n 2.-Aumentar saldo"
           "\n 3.-Retirar saldo"
           "\n 4.-Salir"
           "\n SALDO: %.2fE"
           "\n PARTIDAS RESTANTES: %d", (float) dinero/100, partidas);
}

void cartonUsuario(int *carton){
    //Variables
    int i = 0;
    int aux = 0;
    int correcto =1;
    //Cuerpo

    printf("\nEscribe tus cinco n%cmeros (0-50):", 163);
    for (i = 0; i < CANTIDAD; ++i) {

        do {
            correcto = 1;

            printf("\n%d.", i+1);
            scanf("%d", &aux);

            if(aux < 0 || aux > 50){
                correcto = 0;
                printf("\nEl n%cmero introducido no es correcto, prueba otro (0-50)", 163);
            }

        } while (!correcto);

        carton[i] = aux;

    }

    mostrarVectorNum(carton, CANTIDAD);

}

void cartonPrograma(int *carton){
    //Variables
    time_t t; //Declaramos la variable tiempo para la creación de la semilla.

    //Cuerpo
    srand((unsigned) time(&t));//Generamos la semilla para la función random.

    for (int i = 0; i < CANTIDAD; ++i) {

        carton[i] = rand() % 51;

    }

    mostrarVectorNum(carton, CANTIDAD);

}