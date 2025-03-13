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

//Prot
void leer(FILE *file);
int main(void) {
    //Var
    FILE *binario;

    //Body
    //*Abrir fichero

    if((binario = fopen("../Alumno.dat", "rb")) == NULL){
        puts("\nError. No se ha podido abrir.\n");
    }else {

        leer(binario);


        //*Cerrar fichero
        if (fclose(binario))
            puts("\nError. No se ha podido cerrar.\n");

    }

    //End
    return 0;
}
//Func
void leer(FILE *file){
    //Var
    alumno alu;

    fread(&alu, sizeof(alumno), 1, file);

    while (!feof(file)){
        printf("Matricula: %d\nNombre: ", alu.matricula);
        puts(alu.nombre);
        printf("Carrera: %d\n", alu.carrera);
        printf("Promedio: %.2f\n", alu.promedio);
        puts("-----------------");

        fread(&alu, sizeof(alumno), 1, file);
    }

}