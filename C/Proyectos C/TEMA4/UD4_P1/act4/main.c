#include <stdio.h>

//4. Escribir el código corresponde a una función que recibe el nombre de un
//fichero como parámetros a partir del cual crea un segundo fichero de
//nombre ‘copia.txt’, cuyo contenido es la información almacenada en el
//fichero origen, pero sin espacios en blanco, tabuladores y cambios de línea.

//Constantes
#define S 20

//Prototipos
void copiar(FILE *file1, char *name);
//Main
int main(void) {
    //Var
    FILE *destino = NULL;

    char nombre[S];


    //Body
    puts("Escribe el nombre del archivo");
    gets(nombre);

    //*Abrir  fichero
    if((destino = fopen("copia.txt", "wt"))==NULL)
        puts("\nError al abrir destino");
    else{
        puts("\nCorrecto al abrir destino");

        copiar(destino, nombre);

        //*Cerrear fichero
        if(fclose(destino))
            puts("\nError al cerrar destino");
        else
            puts("\nCorrecto al cerrar destino");
    }

    //End
    return 0;
}
//Funciones
void copiar(FILE *file1, char *name){

    //var
    char x = 0;

    FILE *origen = NULL;

    //Body

    //*Abrir  fichero
    if((origen = fopen(name, "rt"))==NULL)
        puts("\nError al abrir origen");
    else{
        puts("\nCorrecto al abrir origen");

        //*Copiar de un fichero a otro caracter a caracter
        while ((x=getc(origen))!= EOF){

            if((x != 32)  && (x != '\n'))
                putc(x, file1);
        }
    }

    //*Cerrear fichero
    if(fclose(origen))
        puts("\nError al cerrar origen");
    else
        puts("\nCorrecto al cerrar origen");
}