#include <stdio.h>
#include <stdlib.h>

//Constantes
#define S 20

//Estructura
typedef struct{
    int matricula;
    char nombre[S];
    int carrera;
    float promedio;
}alumno;
//Prototipo
void escribe(FILE *file);
int main(void) {
    //Var
    FILE *binario;

    //Body
    //*Abrir fichero

    if((binario = fopen("../Alumno.dat", "wb")) == NULL){
        puts("\nError. No se ha podido abrir.\n");
    }else {

        escribe(binario);


        //*Cerrar fichero
        if (fclose(binario))
            puts("\nError. No se ha podido cerrar.\n");

    }
    //End
    return 0;
}
//Funciones
void escribe(FILE *file){
    //Var
    int r = 0, indice = 0;
    alumno alu;

    //Body
    puts("\nQuieres introducir un nuevo alumno?(S-1/N-0)");
    fflush(stdin), scanf("%d", &r);

    while(r){
        indice++;
        alu.matricula = indice;

        puts("\nNombre:");
        fflush(stdin), gets(alu.nombre);

        puts("\nCarrera:");
        fflush(stdin), scanf("%d", &alu.carrera);

        puts("\nPromedio:");
        fflush(stdin), scanf("%f", &alu.promedio);


        //*Introducir los datos en el fichero
        fwrite(&alu, (sizeof(alumno)), 1, file);


        puts("\nQuieres introducir otro alumno?(S-1/N-0)");
        fflush(stdin), scanf("%d", &r);
    }

}