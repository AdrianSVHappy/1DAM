#include <stdio.h>
#include <stdlib.h>


/* Plantilla */

//Constantes
#define N 5
#define T 3
#define S 20


//Estructuras
//*Índice
typedef struct {
    int posicion,
        identificador;
}indices;

//*Tiradas
typedef struct {
    int numeroTiradas;
    float puntuacion;
}tiradas;

//*Tirador
typedef struct {
    int identificador;
    char nombre[S],
            apellido1[S],
            apellido2[S];
    int edad;
    tiradas tiradas[T];
}tiradores;


int main(void) {
    //Variables

    //*Estructuras
    indices indice[N];
    tiradores tirador[N];

    //*Menu
    int op1 = 0;

    //*Alta
    int op2= 0;

    //*Tiradas
    int ide= 0;

    //*Mostrar
    float media = 0;

    //*Auxiliares
    int cantidad = 0,
        pos= 0;


    //Cuerpo

    //*Metemos valores en los campos de la tabla índice
    for (int i = 0; i < N; ++i) {
        (*(indice+i)).identificador = i;
        (*(indice+i)).posicion = -1;
    }

    //*Menu
    do {
        printf("\n\nMENU:\n"
               "1.- Alta tiradores\n"
               "2.- Introducir tiradas\n"
               "3.- Listar puntos\n"
               "4.-Salir\n"
               "Elige una opcion:");
        fflush(stdin);
        scanf("%d", &op1);


        switch (op1) {
            case 1://**Dar de alta a los tiradores
                printf("\n[1]-ALTA TIRADORES"
                       "\nID|POS");

                //***Mostrar el indice
                for (int i = 0; i < N; ++i) {
                    printf("\n|%d|%d|", (*(indice+i)).identificador, (*(indice+i)).posicion);
                }



            //***Comprobar la posicion
            do{
                op2 = 0;

                printf("\nElige una posición:");
                fflush(stdin);
                scanf("%d", &pos);

                for (int i = 0; i < N; ++i) {
                    if(pos == (*(indice+i)).posicion){
                        i = N; //salir del bucle
                        op2 = 1;
                    }
                }
                if((pos < 0)||(pos>4)){
                    op2 = 2;
                }
                if (op2 == 2){
                    printf("\nPosicion no valida");
                }else if (op2 == 1){
                    printf("\nPosicion ocupada");
                }

            } while (op2 > 0);

            //***Añadir los datos

            (*(indice+cantidad)).posicion = pos;

            (*(tirador+pos)).identificador = cantidad;


            printf("\nNombre:");
            fflush(stdin);
            scanf("%s", (*(tirador+pos)).nombre);
            printf("\nApellido 1:");
            fflush(stdin);
            scanf("%s", (*(tirador+pos)).apellido1);
            printf("\nApellido 2:");
            fflush(stdin);
            scanf("%s", (*(tirador+pos)).apellido2);
            printf("\nEdad :");
            fflush(stdin);
            scanf("%d", &(*(tirador+pos)).edad);

            cantidad +=1;


                break;
            case 2://**Introducir las tiradas
                printf("\n[2]-INTRODUCIR TIRADAS");

                //***Mostrar el indice
                for (int i = 0; i < N; ++i) {
                    printf("\n|%d|%d|", (*(indice+i)).identificador, (*(indice+i)).posicion);
                }

                //***Comprobar el identificador
                do {

                    op2 =0;

                    printf("\n\nIntroduce el identificador del tirador:");
                    fflush(stdin);
                    scanf("%d", &ide);

                    if((ide < 0)||(ide > 4)){
                        op2 = 1;
                        printf("\n[!]Error. el identificador establecido sobrepasa los limites del sistema");
                    }else{
                        op2 = 1;
                        for (int i = 0; i < cantidad; ++i) {
                            if(indice[i].identificador==ide){
                               op2 = 0;
                               i = cantidad;//Salir del bucle
                            }
                        }
                        op2 == 1 ? printf("\n[!]Error. el identificador no ha sido registrado en el sistema") : 0;
                    }

                } while (op2);

                for (int i = 0; i < T; ++i) {
                    (*(tirador+(indice[ide].posicion))).tiradas[i].numeroTiradas = (i+1);
                    printf("\n\nIntroduce los datos de la tirada %d"
                           "\nPuntos:", (i+1));
                    fflush(stdin);
                    scanf("%f", &(*(tirador+(indice[ide].posicion))).tiradas[i].puntuacion);
                }

                break;
            case 3:
                printf("\n[3]-LISTAR PUNTOS");

                //***Mostrar el indice
                for (int i = 0; i < N; ++i) {
                    printf("\n|%d|%d|", (*(indice+i)).identificador, (*(indice+i)).posicion);
                }


                for (int i = 0; i < cantidad; ++i) {

                    for (int j = 0; j < T; ++j) {
                        media += (*(tirador+(indice[i].posicion))).tiradas[j].puntuacion;
                    }
                    media /=  (float)T;


                    printf("\n%d\t%s %s %s\t%.1f", (*(tirador+(indice[i].posicion))).identificador,
                                                    (*(tirador+(indice[i].posicion))).nombre,
                                                    (*(tirador+(indice[i].posicion))).apellido1,
                                                    (*(tirador+(indice[i].posicion))).apellido2,
                                                    media);
                }

                break;
            case 4:
                printf("\n[4]-SALIR");
                break;
            default:
                printf("\n[!]-ERROR. Opcion no valida");
        }


    } while (op1 !=4);


    //Fin
    return 0;
}

