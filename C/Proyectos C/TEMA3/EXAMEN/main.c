#include <stdio.h>
#include <stdlib.h>
#include <string.h> //Libreria util para el tratamiento de strings

/* EXAMEN T3. FUNCIONES */

//Constantes
#define N 5 //Numero de tiradores
#define S 20 //Caracteres de una string
#define T 3 //Numero de tiradas

//Estructuras
typedef struct{
    int pos; //posición en el vector de datos
    int ide; //identificador del soldado tirador.
}indice;

typedef struct{
    int orden; //orden del disparo en la tirada.
    float puntos; //puntos obtenído en el disparo.
}tirada;

typedef struct{
    int iden; //identificador del tirador.
    char nom[S];//Nombre tirador.
    char ape1[S];//Apellido 1º
    char ape2[S];//Apellido 2º
    int edad; //edad tirador
    tirada tiradas[T];//Vector que almacena las tiradas.
}tirador;


//Prototipos
/*
Para incializar el vector índice.
Parámetro de entrada: vector índice.
*/
void Ini_Vector(indice *indi);
/*
Dado el vector de índice y la estructura de tiradores,
podemos dar de alta a los distintos tiradores.
Devuelve en número de tiradores dado de alta.
*/
int Alta_Tirador(indice *indi, tirador *tires);
/*
Dado el vector de índice y el identificador del tirador, nos devuelve
la posición que ocupa en la estructura de tiradores.
Caso de error, nos devuelve -1.
*/
int Buscar_Tirador(indice *indi, int ide);
/*
Dado el vector de índice y el identificador del tirador y
la estructura de tiradores, nos permite modificar los
datos de un tirador en función de su identificador.
*/
void Modi_Tirador(indice *indi, tirador *tires);
/*
Dado el vector de índice y el identificador del tirador y
la estructura de tiradores, nos permite dar de alta las
distintas tiradas.
*/
void Alta_Tirada(indice *indi, tirador *tires);
/*
Dado el vector de índice y el identificador del tirador,
la estructura de tiradores y el número de tiradores, nos
muestras los datos de los tiradores, así como la media de
los puntos de las tiradas.
*/
void Listar_Tirada(indice *indi, tirador *tires, int nun_tir);
int main(void) {
    //Variables
    tirador tiradores[N];//Vector de tiradores.
    indice indices[N];//Vector de Índices.

    int op; //variable para almacenar la opción en el menú.
    int cantidad = 0; //Variable para almacenar el número de tiradores existentes


    //Cuerpo
    Ini_Vector(indices);

    do{//Mostramos el menu
        printf("\n\t1.- Alta tiradores"
               "\n\t2.- Modificar tirador");
        printf("\n\t3.- Introducir tiradas");
        printf("\n\t4.- Listar puntos");
        printf("\n\t5.- Salir\n");

        printf("\nElige una opcion  ");
        fflush(stdin);
        scanf(" %d",&op);

        switch (op) {
            case 1:
                cantidad = Alta_Tirador(indices, tiradores);
                break;
            case 2:
                Modi_Tirador(indices,tiradores);
                break;
            case 3:
                Alta_Tirada(indices, tiradores);
                break;
            case 4:
                Listar_Tirada(indices, tiradores, cantidad);
                break;
            case 5:
                printf("\n\tSALIR");
                break;
            default:
                printf("\n\tERROR. Opcion incorrecta.");
        }


    }while (op != 5);



        //Fin
    return 0;
}

//Funciones
void Ini_Vector(indice *indi){

    //var
    int i = 0; //variables para índices.

    //body
    for(i=0; i<N; i++){
        indi[i].ide = -1;
        indi[i].pos = -1;
    }
}

int Buscar_Tirador(indice *indi, int ide){
    //var

    //body
    return indi[ide].pos;
}

int Alta_Tirador(indice *indi, tirador *tires){
    //var
    int flag = 1;
    int posic = 0;//Variable para almacenar la posición que el usuario introduzca por teclado
    char resp = 0;

    int i = 0, j = 0, k= 0;//variábles para índices.
    //body
    for(i=0; i<N; i++){//Bucle para encontrar el primer id sin ocupar
        if(indi[i].ide == -1)
            break;
    }

    if (i >= N){
        printf("\nERROR. No hay espacio para mas tiradores ");
    }else{
        do{
            do{
                flag = 1;
                printf("\nPosicion: ");
                fflush(stdin);
                scanf(" %d", &posic);

                if((posic < 0) || (posic > (N-1))){
                    printf("\nERROR. Posicion no valida");
                    flag = 0;
                }else{
                    for(j=0; j<i; j++){
                        if(indi[j].pos == posic){
                            flag = 0;
                            printf("\nERROR. Posicion ya establecida.\n");
                        }
                    }
                }

            }while(!flag);

            indi[i].ide = i;
            indi[i].pos = posic;

            //Cargamos los datos del tirador.
            tires[indi[i].pos].iden = indi[i].ide;
            printf("\nNombre: ");
            fflush(stdin);
            gets(tires[indi[i].pos].nom);
            printf("\nApellido 1: ");
            gets(tires[indi[i].pos].ape1);
            printf("\nApellido 2: ");
            gets(tires[indi[i].pos].ape2);
            printf("\nEdad: ");
            fflush(stdin);
            scanf("%d", &(tires[indi[i].pos].edad));

            for (k = 0; k < T; ++k) {
                tires[indi[i].pos].tiradas[k].puntos = 0;
            }


            i++; //Aumentamos en 1 el Indice.

            do{
                printf("\nQuieres dar de alta a otro tirador? S/N ");
                fflush(stdin);
                scanf(" %c", &resp);
            }while((resp != 'n') && (resp != 'N') && (resp != 's') && (resp != 'S'));

        }while (((resp == 's') || (resp == 'S')) && (i < N));

    }
    return i;
}

void Modi_Tirador(indice *indi, tirador *tires){
    //var
    int ide =0; //variable para almacenar el identificador del tirador.

    //body
    printf("\nIntroduce el identificador del tirador:");
    fflush(stdin);
    scanf("%d", &ide);

    if(Buscar_Tirador(indi, ide) == -1){
        printf("\nERROR. No existe el identificador.\n");
    }else{

        printf("\nNombre: ");
        fflush(stdin);
        gets(tires[indi[ide].pos].nom);
        printf("\nApellido 1: ");
        gets(tires[indi[ide].pos].ape1);
        printf("\nApellido 2: ");
        gets(tires[indi[ide].pos].ape2);
        printf("\nEdad: ");
        fflush(stdin);
        scanf("%d", &(tires[indi[ide].pos].edad));
    }
}

void Alta_Tirada(indice *indi, tirador *tires){
    //var
    int ide =0; //variable para almacenar el identificador del tirador.
    float punto = 0; //variable para almacenar puntos de tiradas.

    int j = 0;//variables para índices.
    //body
    printf("\nIntroduce el identificador del tirador:");
    fflush(stdin);
    scanf("%d", &ide);

    if(((ide < 0) || (ide > (N-1)))||(Buscar_Tirador(indi, ide) == -1)){
        printf("\nERROR. No existe el identificador.\n");
    }else{
        for(j=0; j<T; j++){
            printf("\nIntroduce los datos de la %d tirada ", j+1);
            tires[indi[ide].pos].tiradas[j].orden = j;
            printf("\nPuntos: ");
            fflush(stdin);
            scanf("%f", &punto);
            tires[indi[ide].pos].tiradas[j].puntos = punto;
        }
    }

}

void Listar_Tirada(indice *indi, tirador *tires, int nun_tir){
    //var
    int i = 0, j= 0; //variables para índices.
    float media = 0; //variable para almacenar la media de las tiradas.
    //body
    for(i=0; i<nun_tir; i++){
        printf("\n%d \t", tires[indi[i].pos].iden);
        printf("%s \t", tires[indi[i].pos].nom);
        printf("%s \t", tires[indi[i].pos].ape1);
        printf("%s \t", tires[indi[i].pos].ape2);
        media = 0;
        for(j=0; j<T; j++){
            media = media + tires[indi[i].pos].tiradas[j].puntos;
        }
        media = media / (float)T;
        printf("%.1f ", media);
    }
    printf("\n");
}