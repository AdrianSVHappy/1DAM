#include <stdio.h>
#include <stdlib.h>

int main(void) {

    //Var
    FILE *texto = NULL;
    char x[20];

    int op = 0;

    //Body
    //*Abrimos el fichero
    if((texto = fopen("../Prueba.txt", "w"))== NULL){
        puts("\nERROR. No se ha podido abrir el fichero\n");
    } else{
        puts("\nSe ha podido abrir el fichero\n");

        //*Escribimos en el fichero
        while (!op){
            fflush(stdin);
            gets(x);
            fputs(x, texto);
            fputc('\n', texto);

            puts("\nQuieres salir?(S-1/N-0)\n");
            scanf("%d", &op);

        }

        //*Cerramos el fichero
        if(fclose(texto)){
            puts("\nERROR. No se ha podido cerrar el fichero\n");
        }else{
            puts("\nSe ha podido cerrado el fichero\n");
        }
    }


    //End
    return 0;
}
