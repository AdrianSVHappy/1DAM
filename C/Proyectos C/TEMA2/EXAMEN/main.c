#include <stdio.h>
#include <stdlib.h>
#include <time.h> //Libreria necesaria para usar las funciones rand() y srand().
#include <string.h> //Libreria util para el tratamiento de strings

/* EXAMEN UD2 */

//Constantes
#define N 5
#define S 20


//Estructuras
typedef struct{
    int posicion,
        identifcador;
}indices;

typedef struct {
    int numeroTiradas;
    float puntuacion;
}tiradas;

typedef struct {
    int identificador;
    char nombre[S],
            apellido1[S],
            apellido2[S];
    int edad;
    tiradas tiradas;
}tiradores;


int main(void) {
    //Variables
    //*Estructuras
    indices indice[N];
    tiradores tirador[N];

    //*Menu
    int op1 = 0;

    //*Bucles for
    int i = 0,
        j = 0,
        k = 0,
        l = 0;

    //*Dar de alta
    tiradores nuevo;

    int pos = 0,
        op2 = 0;

    //*Tiros
    int ide=0;
    float puntos= 0,
            media = 0;


    time_t t; //Declaramos la variable tiempo para la creación de la semilla.

    //Cuerpo
    srand((unsigned) time(&t));//Generamos la semilla para la función random.

    //*Le damos valor a los campos identificador del indice
    for (int i = 0; i < N; ++i) {
        (*(indice+i)).posicion=-1;
    }

    do {
        printf("\n1.-Alta tiradores\n2.-Introducir tiradas\n3.-Listar puntos\n4.-Salir\nElige una opcion: ");
        fflush(stdin), scanf("%d", &op1);

        switch (op1) {
            case 1: //*Alta tiradóres
                for (i = 0; i < N; ++i) {


                    //**Escoger posición

                    do {
                        op2 = 1;

                        printf("\nPosicion:");
                        fflush(stdin), scanf("%d", &pos);

                            if((pos < 1)||(pos > 5)){
                                op2 = 0;
                                printf("\nERROR. Posicion no valida");
                            }
                            for (int m = 0; m < N; ++m) {
                                if (((pos-1) == (*(indice+m)).posicion)&&(op2 == 1)){
                                    op2 = 0;
                                    printf("\nERROR. Posicion no valida");
                                    m = N;
                                }
                            }




                    } while (!op2);


                    //**Guardar los datos
                    (*(indice+i)).posicion= (pos-1);
                    (*(indice+i)).identifcador = i+1;


                    printf("\nTirador No[%d] en la pos[%d]",(*(indice+i)).identifcador, (*(indice+i)).posicion);

                    printf("\nNombre:");
                    fflush(stdin), scanf("%s", (*(tirador+(pos-1))).nombre);
                    printf("\nApellido 1:");
                    fflush(stdin), scanf("%s", (*(tirador+(pos-1))).apellido1);
                    printf("\nApellido 2:");
                    fflush(stdin), scanf("%s", (*(tirador+(pos-1))).apellido2);
                    printf("\nEdad:");
                    fflush(stdin), scanf("%d", &(*(tirador+(pos-1))).edad);



                }



                break;
            case 2:


                for (j = 0; j < N; ++j) {
                    printf("\nIntroduce el identificador del tirador:");
                    fflush(stdin), scanf("%d", &ide);



                    for (k = 0; k <3 ; ++k) {
                        printf("Introduce los datos de la %d tirada\nPuntos: ", (k));

                        (*(tirador+(*(indice+pos)).identifcador)).tiradas.numeroTiradas +=1;
                        fflush(stdin), scanf("%f",&puntos);
                        media += puntos;
                    }
                    media /= (float) k;
                    (*(tirador+(*(indice+pos)).identifcador)).tiradas.puntuacion = media;
                }


                break;
            case 3:

                for (l = 0; l < N; ++l) {
                    printf("\n%d    %s    %s    %s    %.1f", (*(indice+l)).identifcador,
                                        (*(tirador+((*(indice+l)).posicion))).nombre,
                                        (*(tirador+((*(indice+l)).posicion))).apellido1,
                                        (*(tirador+((*(indice+l)).posicion))).apellido2,
                                        (*(tirador+((*(indice+l)).posicion))).tiradas.puntuacion);

                }

                break;
            case 4:
                printf("EXIT!\n");
                break;
            default:
                printf("OPCION INCORRECTA!\n");
        }


    } while (op1 != 4);



    //Fin
    return 0;
}

