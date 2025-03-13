//Librerias
#include <stdio.h>
#include <stdlib.h>
#include <string.h> //Libreria util para el tratamiento de strings


/*EXAMEN UD4*/

//Constantes
#define S 21
#define T 11

//Estructuras
typedef struct{
    int total;
}tipoNumpaciente;

typedef struct {
    char DNI[T];
    int pos;
}tipoIndice;

typedef struct {
    char DNI[T];
    char nombre[S],
        apellido1[S],
        apellido2[S];
    int edad;

}tipoPaciente;

//Prototipos

/*
 * Cantidad: El uso de esta función es extraer el número de pacientes,
 * que está almacenado en el fichero "numpacientes.dat"
*/
tipoNumpaciente cantidad(void);

/*
 *Alta: Pide por consola un DNI y comprueba si está en uso y muestra un formulario para los
 * datos del paciente, despues se almacenan en los ficheros correspondientes y aumenta la variable
 * en la que se almacena la cantidad de pacientes
*/
void alta (tipoNumpaciente total);

/*
 *Modificar: Se pide el DNI y comprueba si existe, luego pregunta el nombre para guardarlo
 * de nuevo en el fichero
*/
void modificar(void);

/*
 *Listar: Lista el fichero en el que se almacenan los pacientes
*/
void listar(void);

//Main
int main(void){
    //Variables
    tipoNumpaciente numero;

    int menu = 0;//Variable para el menu

    //Cuerpo
    do {
        numero = cantidad();
        printf("\n\tMENU"
               "\n\t1.-Dar de alta"
               "\n\t2.-Modificar"
               "\n\t3.-Listar"
               "\n\t4.-Salir"
               "\n>");
        fflush(stdin);
        scanf("%d", &menu);

        switch (menu) {
            case 1:
                printf("\n\tALTA\n");
                alta(numero);
                break;
            case 2:
                printf("\n\tMODIFICAR\n");
                modificar();
                break;
            case 3:
                printf("\n\tLISTAR\n");
                listar();
                break;
            case 4:
                printf("\n\tSALIR\n");
                break;
            default:
                printf("\n\tERROR. Opcion no valida\n");
        }
    } while (menu != 4);

    //Fin
    return 0;
}

//Funciones
tipoNumpaciente cantidad(void){
    //Variable
    FILE *fnum = NULL; //Puntero donde se almacena la cantidad de paciente

    tipoNumpaciente aux;

    //Cuerpo
    //*Abrir fichero

    aux.total = 0;

    if((fnum = fopen("numpacientes.dat", "rb"))==NULL)
        puts("\nERROR. El fichero no se ha abierto correctamente");
    else{
        puts("\n\t\tFichero abierto");

        //*Trabajamos con el fichero para extraer la cantidad de pacientes

        fread(&aux, sizeof(tipoNumpaciente), 1, fnum);

        //*Cerramos el fichero

        if(fclose(fnum))
            puts("\nERROR. El fichero no se ha cerrado correctamente");
        else
            puts("\n\t\tFichero cerrado");


    }
    //Fin
    return aux;
}

void alta (tipoNumpaciente cantidad){
    //Variable
    FILE *fPacientes = NULL, *fIndice = NULL, *fNum = NULL;
    /*
     * Punteros para los ficheros donde se almacenan los pacientes, indice y cantidad de
     * pacientes respectivamente
    */

    tipoIndice auxIndi;
    tipoPaciente auxPaciente;

    int bandera = 0; //Bandera para controlar si se repite un DNI
    char auxDNI[T];

    int i = 0;

    //Cuerpo


    //*Abrir fichero
    if((fIndice = fopen("indice.dat", "rb"))==NULL)
        puts("\nERROR. El fichero no se ha abierto correctamente");
    else{
        puts("\n\t\tFichero abierto");

    //*Trabajamos con el fichero para comprobar si el DNI ya está en uso

        do {
            bandera =0;
            puts("\nIntroduce DNI");
            fflush(stdin);
            gets(auxDNI);
            fread(&auxIndi, sizeof(tipoIndice), 1, fIndice);

            for (i = 0; i < cantidad.total; ++i) {

                if(!strcmp(auxDNI, auxIndi.DNI)){
                    bandera = 1;
                    break;
                }

                fread(&auxIndi, sizeof(tipoIndice), 1, fIndice);
            }

            if(bandera)
                puts("\nEse DNI ya esta en uso");
        } while (bandera);




        //*Cerramos el fichero

        if(fclose(fIndice))
            puts("\nERROR. El fichero no se ha cerrado correctamente");
        else
            puts("\n\t\tFichero cerrado");

    }


    //*Abrir fichero indice
    if((fIndice = fopen("indice.dat", "ab"))==NULL)
        puts("\nERROR. El fichero no se ha abierto correctamente");
    else{
        puts("\n\t\tFichero abierto");

        //*Trabajamos con el fichero para añadir datos en el fichero indice.dat

        strcpy(auxIndi.DNI, auxDNI);
        auxIndi.pos = cantidad.total;


        fwrite(&auxIndi, sizeof(tipoIndice), 1, fIndice);

        //*Cerramos el fichero indice
        if(fclose(fIndice))
            puts("\nERROR. El fichero no se ha cerrado correctamente");
        else
            puts("\n\t\tFichero cerrado");

    }

    //*Abrir fichero paciente
    if((fPacientes = fopen("pacientes.dat", "ab"))==NULL)
        puts("\nERROR. El fichero no se ha abierto correctamente");
    else{
        puts("\n\t\tFichero abierto");

        //*Trabajamos con el fichero para añadir datos en el fichero pacientes.dat
        //**Recopilamos los datos
        strcpy(auxPaciente.DNI, auxIndi.DNI);

        puts("\nNombre:");
        fflush(stdin);
        gets(auxPaciente.nombre);
        puts("\nPrimer apellido:");
        fflush(stdin);
        gets(auxPaciente.apellido1);
        puts("\nSegundo apellido:");
        fflush(stdin);
        gets(auxPaciente.apellido2);
        puts("\nEdad:");
        fflush(stdin);
        scanf("%d", &auxPaciente.edad);


        //**Introducimos los datos en el fichero
        fwrite(&auxPaciente, sizeof(tipoPaciente), 1, fPacientes);

        //*Cerramos el fichero
        if(fclose(fPacientes))
            puts("\nERROR. El fichero no se ha cerrado correctamente");
        else
            puts("\n\t\tFichero cerrado");

    }

    //*Abrir fichero
    if((fNum = fopen("numpacientes.dat", "wb"))==NULL)
        puts("\nERROR. El fichero no se ha abierto correctamente");
    else{
        puts("\n\t\tFichero abierto");

    //*Trabajamos con el fichero para establecer la cantidad de pacientes

        cantidad.total++;
        fwrite(&cantidad.total, sizeof(tipoNumpaciente), 1, fNum);

    //*Cerramos el fichero

        if(fclose(fNum))
            puts("\nERROR. El fichero no se ha cerrado correctamente");
        else
            puts("\n\t\tFichero cerrado");

    }

}

void modificar(void){
    //Variable
    FILE *fIndice = NULL, *fPaciente = NULL;

    tipoIndice auxIndi;
    tipoPaciente auxPaci;

    char dni[10];
    int bandera = 0;

    //Cuerpo
    puts("\nIntroduzca el DNI:");
    fflush(stdin);
    gets(dni);


    //*Abrir fichero
    if((fIndice = fopen("indice.dat", "rb"))==NULL)
        puts("\nERROR. El fichero no se ha abierto correctamente");
    else{
        puts("\n\t\tFichero abierto");

        //*Trabajamos con el fichero para comprobar si el DNI se repite

        fread(&auxIndi, sizeof(tipoIndice), 1, fIndice);
        while (!feof(fIndice)){
            if(!(strcmp(auxIndi.DNI, dni))){
                bandera = 1;

                break;
            }
            fread(&auxIndi, sizeof(tipoIndice), 1, fIndice);
        }

        if(bandera){
            //*Abrir fichero
            if((fPaciente = fopen("pacientes.dat", "r+b"))==NULL)
                puts("\nERROR. El fichero no se ha abierto correctamente");
            else{
                puts("\n\t\tFichero abierto");

            //*Trabajamos con el fichero para posicionarme y modificar el nombre del paciente

                fseek(fPaciente, ((auxIndi.pos)*sizeof(tipoPaciente)), SEEK_SET);//Nos posicionamos

                fread(&auxPaci, sizeof (tipoPaciente), 1, fPaciente);

                puts("\nNombre:");
                fflush(stdin);
                gets(auxPaci.nombre);

                fseek(fPaciente, ((auxIndi.pos)*sizeof(tipoPaciente)), SEEK_SET);//Nos posicionamos

                fwrite(&auxPaci, sizeof(tipoPaciente), 1, fPaciente);

            //*Cerramos el fichero

                if(fclose(fPaciente))
                    puts("\nERROR. El fichero no se ha cerrado correctamente");
                else
                    puts("\n\t\tFichero cerrado");

            }
        }else
            puts("\nNo se ha encontrado el paciente");

        //*Cerramos el fichero

        if(fclose(fIndice))
            puts("\nERROR. El fichero no se ha cerrado correctamente");
        else
            puts("\n\t\tFichero cerrado");

    }



}

void listar(void){
    //Variable
    FILE *fPacientes = NULL;

    tipoPaciente aux;

    //Cuerpo
    //*Abrir fichero
    if((fPacientes = fopen("pacientes.dat", "rb"))==NULL)
        puts("\nERROR. El fichero no se ha abierto correctamente");
    else{
        puts("\n\t\tFichero abierto");

        //*Trabajamos con el fichero para mostrar los pacientes

        fread(&aux, sizeof(tipoPaciente), 1, fPacientes);
        while (!feof(fPacientes)){

            printf("\n%s\t%s %s %s\t%d",
                   aux.DNI,
                   aux.nombre,
                   aux.apellido1,
                   aux.apellido2,
                   aux.edad);
            fread(&aux, sizeof(tipoPaciente), 1, fPacientes);
        }

        //*Cerramos el fichero
        if(fclose(fPacientes))
            puts("\nERROR. El fichero no se ha cerrado correctamente");
        else
            puts("\n\t\tFichero cerrado");

    }
}
