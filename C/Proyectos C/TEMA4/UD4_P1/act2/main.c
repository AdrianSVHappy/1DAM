#include <stdio.h>

///2. Programa que visualiza en pantalla el contenido de un fichero cuyo nombre es introducido por teclado. Este programa es válido tanto para ficheros de texto como para ficheros binarios

//Constante
#define S 20


//Prototipo
void leer(FILE* file);
int main(void) {
    //Var
    FILE *fichero = NULL;

    char nombre[S];

    //Body

    gets(nombre);

   if((fichero =fopen(nombre,"r"))==NULL)
       puts("\nNo se ha abierto bien\n");
   else{
       puts("\nSe ha abierto bien\n");

       leer(fichero);

       if(fclose(fichero))
           puts("\nNo se ha cerrado bien\n");
       else
           puts("\nSe ha cerrado bien\n");
   }

    //End
    return 0;
}
//Funcion
void leer(FILE* file){
//Var
    char x;
    int bandera =1;

    while (!feof(file)){
        fflush(stdin);
        x= getc(file);

        if(((x>=65)&&(x<=90))||((x>=97)&&(x<=122))){
            printf("%c",x);
            bandera = 0;
        } else{
            if(!bandera)
                printf(" ");
            bandera = 1;
        }




    }

}