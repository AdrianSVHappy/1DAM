#include <stdio.h>

//6. Hacer un programa que muestre en pantalla el contenido de un fichero
//con las misma estructura y características del ejercicio anterior.

//Const
#define S 20

//struct
typedef struct {
    int codigoEmpleado;
    char nombre[S];
    int edad;
    float sueldo;
}tipoEmpleado;

//Prototipo
void mostrar(FILE *fileB);
//Main
int main(void) {
    //Var
    FILE *binario;

    //Body

    //*Abrir fichero binario en modo lectura
    if(( binario = fopen("ejem.dat", "rb"))== NULL)
        puts("\n[A0]");
    else{
        puts("\n[A1]");

        //*Mostrar información por terminal
        mostrar(binario);

        //*Cerrar fichero
        if(fclose(binario))
            puts("\n[C0]");
        else
            puts("\n[C1]");
    }
    //End
    return 0;
}
//Funciones
void mostrar(FILE *fileB){
    //Var
    tipoEmpleado ejemplo;

    //Body
    fread(&ejemplo, sizeof(tipoEmpleado), 1, fileB);

    while (!feof(fileB)){

        printf("\nID: %d"
               "\nNOMBRE: %s"
               "\nEDAD: %d"
               "\nSUELDO: %.2fE"
               "\n-------------------------",
               ejemplo.codigoEmpleado,
               ejemplo.nombre,
               ejemplo.edad,
               ejemplo.sueldo);

        fread(&ejemplo, sizeof(tipoEmpleado), 1, fileB);
    }

}