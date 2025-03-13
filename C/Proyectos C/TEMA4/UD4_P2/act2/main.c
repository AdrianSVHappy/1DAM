#include <stdio.h>

//2. Escribe un programa en C que resuelva el problema anterior, pero ahora
//utilizando funciones que lean cadenas de caracteres.

//Const
#define FICH "arc5.txt"
#define S 20

//Prototipo
void letras2(void);

//Main
int main(void) {
    //Var

    //Body
    letras2();

    //End
    return 0;
}
//Funciones
void letras2(void){
    //Var
    FILE *texto;
    char aux[S];
    int contador = 0;

    int mayus = 0, minus = 0;

    //Body
    //*Abrimos para leer
    if((texto = fopen(FICH, "rt"))==NULL)
        puts("\n[A0]");
    else{
        puts("\n[A1]");

        //*Comparamos

        while (!feof(texto)){

            fgets(aux, S, texto);
            //puts(aux);

            contador = 0;
            while (aux[contador]!= '\0'){

                if((aux[contador] > 64) && (aux[contador] < 91))
                    mayus++;
                else if ((aux[contador] >96) && (aux[contador] < 123))
                    minus++;

                contador++;
            }

        }

        //*Mostramos los resultados
        printf("\nMAYUSCULAS: %d\nminusculars: %d", mayus, minus);


        //*Cerramos el fichero
        if(fclose(texto))
            puts("\n[C0]");
        else
            puts("\n[C1]");
    }

}
