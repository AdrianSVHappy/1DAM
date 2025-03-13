#include <stdio.h>
#include <stdlib.h>
#include <time.h> //Libreria necesaria para usar las funciones rand() y srand().

/* 6) En un array unidimensional de tipo real se almacenan las calificaciones de un
grupo de 20 alumnos que presentaron un examen de admisión a una universidad.
Escribe un programa que calcule e imprima lo siguiente:
a. El promedio general del grupo.
b. El porcentaje de alumnos aprobados (todos aquellos alumnos cuyo puntaje
supere los 5 puntos).
c. El número de alumnos cuya calificación sea mayor o igual a 7. */

int main() {
    //Constantes
    const int LIMITE = 20;

    //Variables
    int decimas= 0, apro= 0, masde=0;
    float nota, notas[LIMITE], media= 0;


    time_t t; //Declaramos la variable tiempo para la creación de la semilla.

    //Cuerpo
    srand((unsigned)  time(&t));//Generamos la semilla para la función random. (float) para hacer numeros decimales



    for (int i = 0; i < LIMITE; ++i) {
        decimas = (rand() % 1001);
        nota = (float) decimas / 100;

        notas[i]= nota;
    }
    for (int i = 0; i < LIMITE; ++i) {
        printf("%.2f ", notas[i]);

        //promedio
        media += notas[i];

        //aprobados
        if(notas[i] >= 5){
            apro += 1;
        }

        //mas de 7
        if(notas[i] >= 7){
            masde +=1;
        }
    }

    media /= LIMITE;

    apro= (apro*100)/LIMITE ;

    printf("\nLa media: %f\nNumero de aprobados: %d% \nCantidad de mayores de 7: %d", media, apro, masde);


    //Fin
    return 0;
}