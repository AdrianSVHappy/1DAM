#include <stdio.h>

//

//Const
    #define FICH "ad5.dat"
#define S 20
#define MAX 99


//Struct
typedef struct {
    int matricula;
    char nombre[S];
    int carrera;
    float promedio;
}tipoAlumno;

//Prototipo

int extraer(tipoAlumno *alu);
void ordenar(tipoAlumno *alu, int tot);
void guardar(tipoAlumno *alu, int tot);

//Main
int main(void) {
    //Var
    tipoAlumno alumnos[MAX];
    int total = 0;

    //Body

    total = extraer(alumnos);

    for (int i = 0; i < total; ++i) {
        printf("\n%d\n%s", alumnos[i].matricula, alumnos[i].nombre);
    }

    ordenar(alumnos, total);

    for (int i = 0; i < total; ++i) {
        printf("\n%d", alumnos[i].matricula);
    }

    guardar(alumnos, total);
    //End
    return 0;
}
//Funcion
int extraer(tipoAlumno *alu){
    //Var
    FILE *binario = NULL;
    int tot= 0;

    //Body

    //*Abrimos el fichero binario para leerlo
    if((binario = fopen(FICH, "rb"))==NULL)
        puts("\n[A0]");
    else{
        puts("\n[A1]");


        fread(&alu[tot], sizeof(tipoAlumno), 1, binario);
        //*Extraemos los datos y los guardamos en el vector
        while (!feof(binario)){
            tot++;
            fread(&alu[tot], sizeof(tipoAlumno), 1, binario);

        }

        printf("%d", tot);

        //*Cerramos el fichero
        if(fclose(binario))
            puts("\n[C0]");
        else
            puts("\n[C1]");

    }

    //End
    return tot;
}

void ordenar(tipoAlumno *alu, int tot){

    //Var
    int i = 0, j = 0;

    tipoAlumno aux;
    //Body
    for (i = 0; i < tot; ++i) {
        for (j = (i+1); j < tot; ++j) {

            if(alu[i].matricula < alu[j].matricula){
                aux = alu[i];
                alu[i]= alu[j];
                alu[j] = aux;
            }
        }
    }

}

void guardar(tipoAlumno *alu, int tot){

    //Var
    FILE *binario = NULL;

    int i = 0;

    //body


    //*Abrimos el fichero binario para leerlo
    if((binario = fopen("ad5MOD.dat", "wb"))==NULL)
        puts("\n[A0]");
    else{
        puts("\n[A1]");
        fseek(binario, sizeof(tipoAlumno), SEEK_SET);

        for (i = 0; i < tot; ++i) {
       //Guardamos los datos ordenados
        fwrite(&alu[i], sizeof (tipoAlumno), 1, binario);
        }

        //*Cerramos el fichero
        if(fclose(binario))
            puts("\n[C0]");
        else
            puts("\n[C1]");

    }
}