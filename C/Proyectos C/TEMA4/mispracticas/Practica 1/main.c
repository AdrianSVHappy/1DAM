//Librerias
#include <stdio.h>
#include <stdlib.h>

/*Enunciado*/

//Constantes
#define S 20
#define N 2
#define BIN alumnos.dat
#define TXT alumnos.txt

//Estructuras
typedef struct {
    int id, pos;
}tipoIndice;

typedef struct {
    int id;
    char nom[S];
    float media;
}tipoAlumno;

//Prototipos

void crearindice(tipoIndice *indi);//Inicializar los vectores a 0
void mostra(tipoIndice);//Mostramos todos los alumnos
void introducir(tipoIndice *indi);//Introducir un nuevo alumno
void modificar(tipoIndice *indi);//Modificar el alumno
void informe(tipoIndice);//Generar informe del alumno
void guardarindice(tipoIndice *indi);//Guardamos el indice para cuando volvamos a usar el programa

//Main
int main(void){
    //Variables
    tipoIndice indice[N];

    //Cuerpo
    crearindice(indice);

    //Fin
    return 0;
}

//Funciones

void crearindice(tipoIndice *indi){
    //Var
    FILE *binario = NULL;

    int i = 0;


    //Cuerpo
    if((binario = fopen("indice.dat", "rb"))==NULL){
        puts("\nIndice no detectado. Generando indice en blanco...");
        for (i = 0; i < N; i++) {
         indi[i].id = i;
         indi[i].pos = -1;
        }
    } else{
        puts("\nIndice detectado. Extrayendo informacion del fichero");


        for (i = 0; i < N; i++) {

            fread(&indi[i], sizeof(tipoIndice), 1, binario);

        }

        if(fclose(binario))
            puts("\nERROR. El fichero no se ha cerrado correctamente");
        else
            puts("\nFichero cerrado");

    }

}
void guardarindice(tipoIndice *indi){
    //Var
    FILE *binari = NULL;

    int i = 0;

    //Cuerpo



}