#include <stdio.h>
#include <stdlib.h>
#include <time.h> //Libreria necesaria para usar las funciones rand() y srand().
#include <string.h> //Libreria util para el tratamiento de strings

/* Plantilla */

//Constantes
#define N 5 //Cantidad de tiradores
#define S 20 //Cantidad de caracteres de un string
#define T 3 //Cantidad de tiradas

//Estructuras

typedef struct{
    int pos,
        id;
}tipoIndice;

typedef struct {
    int numTirada;
    float puntuacion;
}tipoTirada;

typedef struct {
    int id,
        edad;
    char nom[S],
        ape1[S],
        ape2[S];
    tipoTirada tiradas[T];
}tipoTirador;

///Prototipos
int menu(void);//Menu
void alta(tipoTirador *tiradores, tipoIndice *indices, int tam);//Dar de alta a los tiradores
void intro(void);//Introducir las tiradas de un tirador
void listar(void);//Mostrar los tiradores

    //*Prototipos aux
void iniciarIndice(tipoIndice *array, int tam); //Meter valores por defecto al vector indice
void mostrarIndice(tipoIndice *array, int tam); //Mostrar el vector indice
int comprobarPos(tipoIndice *array, int tam);   //Comprobamos si la posición está ocupada
void formTirador(tipoTirador *array, int pos);  //Formulario del tirador



int main(void) {
    //Variables
    int menuVar = 0;        //Variable para controlar el menu
    tipoIndice indice[N];   //Vector indice
    tipoTirador tirador[N]; //Vector tiradores

    time_t t; //Declaramos la variable tiempo para la creación de la semilla.

    //Cuerpo
    srand((unsigned) time(&t));//Generamos la semilla para la función random.


    iniciarIndice(indice, N);

    do {
        menuVar = menu();

        switch (menuVar) {
            case 1:
                alta(tirador, indice, N);
                break;
            case 2:
                intro();
                break;
            case 3:
                listar();
                break;
            case 4:
                break;
            default:
                printf("\n[!]ERROR-Opcion no valida");
        }
        printf("\n");
    } while (menuVar != 4);


    //Fin
    return 0;
}
//Funciones Auxiliares

void iniciarIndice(tipoIndice *array, int tam){
    //Var
    int i = 0;

    //Body
    for (i = 0; i < tam; ++i) {
        array[i].id = i;
        array[i].pos = -1;
    }
}

void mostrarIndice(tipoIndice *array, int tam){
    //var
    int i = 0;
    //body

    printf("\n\tID|POS");

    for (i = 0; i < tam; ++i) {
        printf("\n\t|%d|%d|", array[i].id, array[i].pos);
    }
}

int comprobarPos(tipoIndice *array, int tam){
    //var
    int bandera = 0, //Control de errores
        pos = 0; //Variable auxilar para la posible posicion

    //body
    do {
        bandera = 0;

        printf("\n\tElige una posicion\n>");
        fflush(stdin), scanf("%d", &pos);

        for (int i = 0; i < tam; ++i) {
            if(pos == array[i].pos){
                i = tam;
                bandera = 1;
            }
        }

        if((pos<0)||(pos>4))
            bandera = 2;

        if(bandera == 2)
            printf("\n[!]ERROR-Posicion no valida");
        else if (bandera == 1)
            printf("\n[!]ERROR-Posicion ocupada");

    } while (bandera > 0);

    //fin
    return pos;
}

void formTirador(tipoTirador *array, int pos){
    printf("\nNombre:\n>");
    fflush(stdin), gets(array[pos].nom);
    printf("\nApellido 1:\n>");
    fflush(stdin), gets(array[pos].ape1);
    printf("\nApellido 2:\n>");
    fflush(stdin), gets(array[pos].ape2);
    printf("\nEdad:\n>");
    fflush(stdin), scanf("%d", &array[pos].edad);
}

//Funciones
int menu(void){

    //Variables
    int x = 0;

    //Cuerpo
    printf("\n\n\tMENU"
           "\n\t1.-Dar de alta"
           "\n\t2.-Introducir tiradas"
           "\n\t3.-Listar tiradores"
           "\n\t4.-Salir"
           "\n>");
    fflush(stdin), scanf("%d", &x);
    printf("\n\n");
   return x;
}


void alta(tipoTirador *tiradores,tipoIndice *indices, int tam){
    //var
    int cantidad = 0;

    //body
    printf("\n\t[1]-ALTA");
    mostrarIndice(indices, tam);

    indices[cantidad].pos = comprobarPos(indices, tam);

    tiradores[indices[cantidad].pos].id=cantidad;

    formTirador(tiradores, indices[cantidad].pos);

    cantidad++;

};

void intro(void){
    printf("\n\t[2]-INTRO");


}

void listar(void){
    printf("\n\t[3]-LISTAR");



}