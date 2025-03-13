#include <stdio.h>

//7. Programa que almacena en un fichero binario de nombre ‘alum.dat’ los
//datos personales de los alumnos de una clase.
//En el fichero se almacenará por alumno la siguiente información:
// Código del alumno.
// Nombre del alumno.
// Primer apellido.
// Segundo apellido.
// Edad del alumno.
//Una vez finalizada la operación que almacena los datos en el fichero,
//visualizar el contenido del mismo en pantalla.

//Const
#define S 20
#define FICH "alum.dat"

//Struct
typedef struct {
    int id, edad;
    char nom[S], ape1[S], ape2[S];
}tipoAlumno;

//Prototipo
void cuestionario(tipoAlumno *alu, int num);

void guardar(void);
void mostrar(void);
//Main
int main(void) {
    //Var

    //Body
    guardar();
    mostrar();

    //End
    return 0;
}
//Formulas
void cuestionario(tipoAlumno *alu, int num){

    alu[0].id = num;
    fflush(stdin);
    puts("\nNOMBRE:");
    gets(alu[0].nom);
    fflush(stdin);
    puts("\n1er APELLIDO:");
    gets(alu[0].ape1);
    fflush(stdin);
    puts("\n2do APELLIDO:");
    gets(alu[0].ape2);
    fflush(stdin);
    puts("\nEDAD");
    scanf("%d", &alu[0].edad);

}

void guardar(void){
    //Var
    FILE *binario = NULL;
    int orden = 0;
    int res = 1;

    tipoAlumno ejemplo;

    //Body

    //*Abrimos fichero binario para guardar
    if((binario = fopen(FICH, "wb")) == NULL)
        puts("\nA0");
    else{
        puts("\nA1");

        while (res){
            orden++;
            cuestionario(&ejemplo, orden);


            fwrite(&ejemplo, sizeof(tipoAlumno), 1, binario);


            puts("\nQuiere guardar otro alumno?(S-1/N-0)");
            fflush(stdin);
            scanf("%d", &res);
        }

        if(fclose(binario))
            puts("\nC0");
        else
            puts("\nC1");
    }


}



void mostrar(void){
    //Var
    FILE *binario;

    tipoAlumno ejemplo;

    //Body
    //*Abrimos el fichero para mostrar
    if((binario = fopen(FICH, "rb"))==NULL)
        puts("\nA0");
    else{
        puts("\nA1");

        //Mostramos por terminal

        fread(&ejemplo, sizeof(tipoAlumno), 1, binario);
        while (!feof(binario)){

            printf("\n----------------------------------"
                   "\nID %d"
                   "\nNOMBRE: %s"
                   "\nAPELLIDOS: %s %s"
                   "\nEDAD: %d"
                   "\n----------------------------------",
                   ejemplo.id,
                   ejemplo.nom,
                   ejemplo.ape1, ejemplo.ape2,
                   ejemplo.edad);

            fread(&ejemplo, sizeof(tipoAlumno), 1, binario);
        }

        //Cerramos el fichero
        if(fclose(binario))
            puts("\nC0");
        else
            puts("\nC1");
    }

}
