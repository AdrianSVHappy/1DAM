#include <stdio.h>

//8. Se desea crear un programa que almacene en un fichero de nombre
//‘agenda.dat’ los datos de una agenda telefónica. El fichero estará formado
//por registros con la siguiente estructura.

//Const
#define FICH "agenda.dat"

//Struct
typedef struct {
    char nombre[15],
        apellidos[25],
        telefono[14];
}tipoAgenda;

//Prototipos
void preguntas(tipoAgenda *ejem);

void guardar(void);
//Main
int main(void) {
    //Var

    //Body
    guardar();
    //End
    return 0;
}
//Funciones
void preguntas(tipoAgenda *ejem){
    //Var


    //Body
    fflush(stdin);
    puts("\nNOMBRE:");
    gets(ejem[0].nombre);
    fflush(stdin);
    puts("\nAPELLIDOS:");
    gets(ejem[0].apellidos);
    fflush(stdin);
    puts("\nNUMERO:");
    gets(ejem[0].telefono);

}

void guardar(void){

    //Var
    FILE *binario = NULL;

    tipoAgenda agenda;

    int res = 1;

    //Body
    //*Abrir el fichero para escribir
    if((binario = fopen(FICH, "wb"))==NULL)
        puts("\nA0");
    else{
        puts("\nA1");

        while (res){

            preguntas(&agenda);

            fwrite(&agenda, sizeof(tipoAgenda), 1 ,binario);

            puts("\nQuieres introducir otro contacto?(S-1/N-0)");
            fflush(stdin);
            scanf("%d", &res);
        }

        if(fclose(binario))
            puts("\nC0");
        else
            puts("\nC1");
    }


}