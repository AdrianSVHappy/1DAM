#include <stdio.h>

//1. Escribe un programa en C que, al recibir como dato el archivo de texto
//arc5.txt formado por cadenas de caracteres, determine el número de letras
//minúsculas y mayúsculas que existen en el archivo. Utiliza solamente
//funciones que lean caracteres, no cadenas de caracteres.

//Const
#define FICH "arc5.txt"

//Prototipo
void letras(void);
//Main
int main(void) {
    //Var

    //Body
    letras();

    //End
    return 0;
}
//Funcion
void letras(void){
    //Var
    FILE *texto = NULL;
    char aux = 0;

    int mayus = 0;
    int minus = 0;

    //body
    //*Abrimos el fichero para leer
    if((texto = fopen(FICH, "rt"))==NULL)
        puts("\n[A0]");
    else{
        puts("\n[A1]");

        //*Hacemos la comparación
        while ((aux = getc(texto))!=EOF){
            if((aux > 64) && (aux < 91))
                mayus++;
            else if ((aux >96) && (aux < 123))
                minus++;
        }

        //*Mostramos la cantidad
        printf("\nMAYUSCULAS: %d\nminusculars: %d", mayus, minus);

        //*Cerramos el fichero
        if(fclose(texto))
            puts("\n[C0]");
        else
            puts("\n[C1]");
    }

}