//Librerias
#include <stdio.h>
#include <stdlib.h>
#include <string.h> //Libreria util para el tratamiento de strings

/*Enunciado*/

//Constantes
#define S 20
#define M 99

//Estructuras
typedef struct {
    char pregunta[M],
        respuesta[M];
}tipoPregunta;

//Prototipos

/*
 * Se leera el documento original (txt) y se generará un nuevo fichero (dat) con las preguntas, especificando las
 * preguntas (lineas impares) y las respuestas (lineas pares).
*/
void moverInfo(char *nombre);

//Main
int main(void){
    //Variables
    char documento[S];

    //Cuerpo

    //*Especificar el nomnbre del documento
    puts("\nEscribe el nombre del documento (sin la extencion)");
    fflush(stdin), gets(documento);

    //*Generar el fichero .dat
    moverInfo(documento);


    //Fin
    return 0;
}

//Funciones
void moverInfo(char *nombre){
    //Variables
    FILE *texto = NULL;
    FILE *binario = NULL;

    tipoPregunta auxiliar;

    int contador = 0;
    int gear = 0;
    char copia = 0;

    char nombreTXT[S],
        nombreDAT[S];



    //Cuerpo

    //*Establecemos los nombres de los fichero
    strcpy(nombreTXT, nombre);
    strcpy(nombreDAT, nombre);

    strcat(nombreTXT, ".txt");
    strcat(nombreDAT, ".dat");


    //*Abrir fichero
    if(((texto = fopen(nombreTXT, "rt"))==NULL)||((binario = fopen(nombreDAT, "wb"))==NULL))
        puts("\nERROR. El fichero no se ha abierto correctamente");
    else{
        puts("\nFichero abierto");

        //*Trabajamos con el fichero

        while ((copia = getc(texto))!=EOF){
            if(copia == '\n'){
                gear++;
                contador = 0;
                //printf("\n");
            }
            else{
                switch (gear) {
                    case 0://Pregunta
                        auxiliar.pregunta[contador] = copia;
                        break;
                    case 1://Respuesta
                        auxiliar.respuesta[contador] = copia;
                        break;
                    case 2://Introducir información en el fichero binario;

                        //puts(auxiliar.pregunta);
                        //puts(auxiliar.respuesta);


                        fwrite(&auxiliar, sizeof(tipoPregunta),1, binario);

                        gear = 0;
                        break;
                }
                contador ++;
            }
        }




        //*Cerramos el fichero
        if((fclose(texto))||(fclose(binario)))
            puts("\nERROR. El fichero no se ha cerrado correctamente");
        else
            puts("\nFichero cerrado");

    }






}