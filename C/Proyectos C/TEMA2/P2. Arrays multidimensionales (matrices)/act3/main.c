#include <stdio.h>
#include <stdlib.h>
#include <time.h> //Libreria necesaria para usar las funciones rand() y srand().

/* 3)	A la clase de “Programación” del profesor Manolo asiste un grupo numeroso de alumnos. El profesor Serrano es muy
        exigente y aplica cuatro exámenes durante el semestre. Escribe un programa en C que resuelva lo siguiente:
        a.	El promedio de calificaciones de cada alumno.
        b.	El promedio del grupo en cada examen.
        c.	El examen que tuvo el mayor promedio de calificación.
        Dato: ALU [N][4] (donde ALU es un arreglo bidimensional de tipo real de N filas y
        cuatro columnas que almacena calificaciones de alumnos, 1 ≤ N ≤ 20).
 */

int main() {
    //Constantes
    const int NUM = 20;

    //Variables
    int alu[NUM][4], media= 0, mayor=0, op= 0;


    time_t t; //Declaramos la variable tiempo para la creación de la semilla.

    //Cuerpo
    srand((unsigned) time(&t));//Generamos la semilla para la función random.
    
    //Vamos a inicializar el array con un numero aleatorio y lo mostramos
    for (int i = 0; i < NUM; ++i) {
        if(i< 10){
            printf("0");
        }
        printf("%d-> |",i);
        for (int j = 0; j < 4; ++j) {
            alu[i][j] = rand() % 1001;
            if(alu[i][j] < 1000){
                printf("0");
            }
            printf("%d|", (int) (alu[i][j]/100));
        }
        printf("\n");
    }


    /*Hacemos un menu
        a.	El promedio de calificaciones de cada alumno.
        b.	El promedio del grupo en cada examen.
        c.	El examen que tuvo el mayor promedio de calificación.
    */
    do {
        printf("ESCOGE:");
        scanf("%d", &op);
        switch (op) {
            case 1:
                //Promedio * alumno
                printf("\nEl promedio de calificaciones de cada alumno.\n");
                for (int i = 0; i < NUM; ++i) {
                    media=0;
                    if(i< 10){
                        printf("0");
                    }

                    printf("%d-> ",i);
                    for (int j = 0; j < 4; ++j) {
                        media += alu[i][j];
                        if(3 == j){
                            media = media/4;
                            printf("%.2f",((float) media/100));
                        }
                    }
                    printf("\n");
                }
                break;
            case 2:
                //Promedio * examen
                printf("\nEl promedio del grupo en cada examen.\n");
                for (int i = 0; i < 4; ++i) {
                    media=0;
                    printf("%d-> ", i);

                    for (int j = 0; j < NUM; ++j) {
                        media +=  alu[j][i];
                    }
                    media = media / NUM;
                    printf("%.2f", (float ) media/100);
                    printf("\n");
                }
                break;
            case 3:
                //Examen con mayor promedio
                mayor=0;
                printf("\nEl examen que tuvo el mayor promedio de calificacion.\n");
                for (int i = 0; i < 4; ++i) {
                    media=0;


                    for (int j = 0; j < NUM; ++j) {
                        media +=  alu[j][i];
                    }
                    media = media / NUM;

                    if(media >= mayor){
                        mayor = media;
                    }
                }
                printf("%.2f\n", (float) mayor/100);
                break;
            case 4:
                printf("Salir");
                break;
            default:
                printf("Opcion incorrecta\n");
        }
    } while (op != 4);






    //Fin
    return 0;
}