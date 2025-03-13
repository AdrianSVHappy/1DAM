#include <stdio.h>
#include <stdlib.h>
#include <string.h>

///1. Escribir un programa que crea un fichero de texto de nombre ‘datos.txt’
///en el que se almacena una secuencia de caracteres hasta que el valor final
///de fichero (EOF) es introducido por teclado. Dicho valor se introduce
///pulsando la tecla F6 o CTRL+Z.

//Constante
#define S 20

//Prototipo
void introduce(FILE *file);

//Main
int main(void) {
    //Var
    FILE *text= NULL;


    //Body
    //*Abrir fichero
    if ((text = fopen("../datos.txt", "wt"))==NULL)
        puts("\nERROR. No se pudo abrir\n");
    else{
        puts("\nSe abre correctamente\n");


        //*Introducir datos
        introduce(text);

        //*Cerrar fichero
        if(fclose(text))
            puts("\nERROR. No se pudo cerrar\n");
        else
            puts("\nSe cierra correctamente\n");
    }


    //End
    return 0;
}
//Funcion
void introduce(FILE *file){
    //Var
    char caracter[S];
    int i = 0;

    //Body
    do {

        for (i = 0; i < S; ++i) {
            fflush(stdin);
            caracter[i] = getc(stdin);
            if(caracter[i] == EOF) {
                break;
            }
            putc(caracter[i], file);
        }
        putc('\n', file);

    }while(caracter[i] != EOF);

}