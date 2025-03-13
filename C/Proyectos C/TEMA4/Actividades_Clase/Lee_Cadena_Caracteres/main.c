#include <stdio.h>
#include <stdlib.h>

int main(void) {
    //Var
    FILE *texto;
    char str[20];
    char caracter = 0;


    //Body
    //*Abrimos el fichero
    if((texto = fopen("../Prueba.txt", "r"))== NULL){
        puts("\nERROR. No se ha podido abrir el fichero\n");
    } else{
        puts("\nSe ha podido abrir el fichero\n");

        //*Mostrar fichero
        while(!(feof(texto))){
            fgets(str, 20, texto);
            puts(str);

        }

        fseek(texto,0,0);//Volver al inicio del fichero

        //*Mostrar fichero tipo texto
        while ((caracter = getc(texto))!=EOF){
            printf("%c", caracter);
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
