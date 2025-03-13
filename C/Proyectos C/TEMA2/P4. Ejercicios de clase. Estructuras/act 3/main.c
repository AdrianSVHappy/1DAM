#include <stdio.h>
#include <stdlib.h>
#include <time.h> //Libreria necesaria para usar las funciones rand() y srand().

/* act 2 - Estructuras */


//Estructuras
struct matpro {
    char materia[20];
    float promedio;
};

struct alumno {
    int matricula;
    char nombre[20],
        apellido[20];
    struct matpro matpros[4];
};

int main() {
    //Constantes
    const int N = 5;

    //Variables
    struct alumno alu[N];
    float media =0;

    time_t t; //Declaramos la variable tiempo para la creación de la semilla.

    //Cuerpo
    srand((unsigned) time(&t));//Generamos la semilla para la función random.

    //*Damos valores y lo mostramos
    for (int i = 0; i < N; ++i) {
        alu[i].matricula = i+1;
        printf("%d: ", alu[i].matricula);

        alu[i].nombre[0]='\n';
        alu[i].apellido[0]='\n';
        for (int j = 0; j < 4; ++j) {
            alu[i].matpros[j].materia[0] = '\0';
            alu[i].matpros[j].promedio = rand() % 11;
            printf("|%.2f",alu[i].matpros[j].promedio);
        }
        printf("|\n");
    }

    //*a) La matrícula y el promedio general de cada alumno.
    printf("\na) La matricula y el promedio general de cada alumno.\n");
    for (int i = 0; i < N; ++i) {
        media = 0;
        for (int j = 0; j < 4; ++j) {
            media += alu[i].matpros[j].promedio;
        }
        printf("%d -> %.2f\n", alu[i].matricula, (media/4));
    }

    //*b) Las matrículas de los alumnos cuya calificación en la tercera materia sea mayor a 9.
    printf("\nb) Las matriculas de los alumnos cuya calificacion en la tercera materia sea mayor a 9.\n");
    for (int i = 0; i < N; ++i) {

        if((alu[i].matpros[2].promedio)>9){
            media = 0;
            for (int j = 0; j < 4; ++j) {
                media += alu[i].matpros[j].promedio;
            }
            printf("%d -> %.2f (%.2f)\n", alu[i].matricula, (media/4), alu[i].matpros[2].promedio);
        }

    }

    //*c) La media general de la materia 4.
    printf("\nc) La media general de la materia 4.\n");

    media =0;

    for (int i = 0; i < N; ++i) {
        media += alu[i].matpros[3].promedio;
    }
        //media = (float) ;

    printf("-> %.2f", (media/N));

    //Fin
    return 0;
}
