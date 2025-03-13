#include <stdio.h>
#include <stdlib.h>


/* Examen UD 2 ASV*/

//Constantes
#define N 5 //Posiciones de los vectores
#define M 3 //Cantidad de tiradas
#define S 20 //Cantidad de caracteres de los strings


//Estructuras
typedef struct {
    int posicion,
        identificador;
}indicePos;

typedef struct {
    int numeroTirada;
    float puntuacion;
}datosTirada;


typedef struct {
    int identificador,
        edad;
    char nombre[S],
        apellido1[S],
        apellido2[S];
    datosTirada tiradas[M];
}datosTirador;


int main(void) {
	//Variables
    indicePos indice[N]; //Vector de estructura indicePos
    datosTirador tirador[N]; //Vector de estructura datosTirador

	//*Auxiliares
    int menu= 0,
        flag= 0,
        cantidad= 0;//Establece la cantidad de usuarios registrados, se usa como limite de los bucles for

    //*Bucles for
    int i = 0,
        j = 0;

    //*Alta tirador
    int pos= 0;//Se almacena el entero que el usuario introduce por teclado

    //*Introducir tirada
    int ide= 0;//Se almacena el entero que el usuario introduce por teclado

    //*Listar puntos
    float media = 0;


	//Cuerpo
    //*Inicializar los campos de los vectores
    for (i = 0; i < N; ++i) {

        (*(indice+i)).identificador = i;
        (*(indice+i)).posicion = -1;

        //Para que no muestre basura a la hora de mostrar la información
        for (j = 0; j < M; ++j) {

            (*(tirador+i)).tiradas[j].puntuacion = 0;

        }
    }


    //*Menu
    do {

        printf("\n\nMENU:"
               "\n1.-Alta tiradores"
               "\n2.-Introducir tiradas"
               "\n3.-Listar puntos"
               "\n4.-Salir"
               "\nElige una opcion:");

        fflush(stdin);
        scanf("%d", &menu);

        printf("\n[%d]-", menu);
        switch (menu) {
            case 1://**Alta tiradores
                printf("Alta tiradores\n");

                //***Mostramos el vector indice en forma de tabla
                printf("\nID|POS");
                for (i = 0; i < N; ++i) {

                    printf("\n|%d|%d|",((*(indice+i)).identificador),
                           ((*(indice+i)).posicion));

                }

                //***Pedir posicion y comprobar si es válida
                do {
                    flag = 0;

                    printf("\n\nPosicion:");
                    fflush(stdin);
                    scanf("%d", &pos);


                    if((pos < 0) || (pos > (N-1))){

                        flag = 1;
                        printf("\n[!]ERROR-Esa posicion se sale fuera de los limites del sistema");

                    }else if(cantidad==0){

                        flag =0;

                    }else{

                        for (i = 0; i < cantidad; ++i) {

                            if(pos == (*(indice+i)).posicion){

                                flag = 1;
                                printf("\n[!]ERROR-La posicion (%d) introducida ya esta ocupada por el usuario(ID:%d)", pos, ((*(indice+i)).identificador));

                            }
                        }
                    }
                } while (flag);

                //***Guardamos los datos en los vectores
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
                printf("\nEdad:");
                fflush(stdin);
                scanf("%d", &(*(tirador+pos)).edad);

                cantidad +=1;

                break;

            case 2://**Introducir tiradas
                printf("Introducir tiradas\n\nIDs disponibles:");

                //***Mostrar los usuarios disponibles
                for (i = 0; i < cantidad; ++i) {

                    printf(" %d ", (*(indice+i)).identificador);

                }

                //***Pedir y comprobar que el ID es válido
                do {

                    flag = 0;
                    printf("\nIntroduce el identificador del tirador:");
                    fflush(stdin);
                    scanf("%d", &ide);

                    if(ide < 0 || ide > cantidad){

                        flag = 1;
                        printf("\n[!]ERROR-El id introducido no corresponde a ningun usuario\n");

                    }
                } while (flag);

                //***Guardar los datos de los tiros
                for (i = 0; i < M; ++i) {

                    (*(tirador+((*(indice+ide)).posicion))).tiradas[i].numeroTirada= i+1;

                    printf("\nIntroduce los datos de %d tirada\nPuntos:", (i+1));
                    fflush(stdin);
                    scanf("%f", &((*(tirador+((*(indice+ide)).posicion))).tiradas[i].puntuacion));

                }

                break;

            case 3://**Listar puntos
                printf("Listar puntos\n");

                for (i = 0; i < cantidad; ++i) {
                    media = 0;
                    for (j = 0; j < M; ++j) {

                        media += (*(tirador+((*(indice+i)).posicion))).tiradas[j].puntuacion;

                    }

                    media /= (float) M;

                    printf("\n%d\t%s %s %s\t%.1f",
                           (*(tirador+((*(indice+i)).posicion))).identificador,
                           (*(tirador+((*(indice+i)).posicion))).nombre,
                           (*(tirador+((*(indice+i)).posicion))).apellido1,
                           (*(tirador+((*(indice+i)).posicion))).apellido2,
                           media);

                }

                break;

            case 4://**Salir
                printf("Salir\n");
                break;

            default:
                printf("[!]ERROR-Opcion no valida");
        }
    } while (menu != 4);

	//Fin
	return 0;
}

