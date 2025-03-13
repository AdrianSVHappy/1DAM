#include <stdio.h>
#include <stdlib.h>
#include <string.h>

///3. Escribir un programa que conste de dos funciones secundarias de nombre
/// ‘crear_fichero()’ y ‘listar_fichero()’ donde:

//Constante
#define N 10
#define S 20

//Estructura
typedef struct {
    char nom[S];
    char ape[S];
}tipoAlumno;

//Prototipo
void crearAlumno(tipoAlumno *alu);//Meter info en el vector

///a. La primera función almacena en un fichero de texto, cuyo nombre
///se introduce por teclado desde la función principal y es pasado
///como parámetro a esta función los nombres (nombre y apellidos)
void crear_fichero(tipoAlumno *alu, char *name);

///b. La segunda función muestra en pantalla el contenido del fichero
///de texto creado en el apartado anterior.
void listar_fichero(char *name);

//Main
int main() {
    //Var
    tipoAlumno alumnos[N];
    FILE *ficha = NULL;
    char nombre[S];

    //body
    crearAlumno(alumnos);

    //*Preguntar el nombre del fichero
    gets(nombre);



    crear_fichero(alumnos, nombre);
    listar_fichero(nombre);
        

    //End
    return 0;
}
//Funciones
void crearAlumno(tipoAlumno *alu){
    //Var
    int i = 0;

    //Body

    for (int i = 0; i < N; ++i) {
        strcpy(alu[i].nom, "Adrian");
        strcpy(alu[i].ape, "Suarez Valdayo");
    }

}

void crear_fichero(tipoAlumno *alu, char *name){
    //Var
    int i = 0;

    FILE *ficha = NULL;

    //Body

    if((ficha = fopen(name, "wt"))== NULL)
        puts("\nNo se ha abierto correctamente\n");
    else {

        for (int i = 0; i < N; ++i) {
            fputs(alu[i].nom, ficha);
            putc(32, ficha);
            fputs(alu[i].ape, ficha);
            putc('\n', ficha);
        }
        if(fclose(ficha))
            puts("\nNo se ha abierto correctamente\n");
    }
}

void listar_fichero(char *name){
    //Var
    char x=0;
    FILE *ficha = NULL;

    //Body

    if((ficha = fopen(name, "rt"))== NULL)
        puts("\nNo se ha abierto correctamente\n");
    else {

        while ((x = getc(ficha)) != EOF) {
            printf("%c", x);

        }

        if(fclose(ficha))
            puts("\nNo se ha abierto correctamente\n");

    }
}