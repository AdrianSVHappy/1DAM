#include <stdio.h>
#include <string.h>

//5. Hacer un programa que crea un fichero de texto cuyo nombre es
//introducido por teclado y cuyo objetivo es almacenar los datos personales
//de los empleados de una empresa.
//La estructura de los registros del fichero es la mostrada a continuación,
//donde cada uno de los registros guarda los datos personales de un
//empleado de la empresa.
//Código empleado | Nombre | Edad | Sueldo

//Constantes
#define S 20

//Estructura
typedef struct {
    int codigoEmpleado;
    char nombre[S];
    int edad;
    float sueldo;
}tipoEmpleado;


//Prototipo
void formulario(char *name);

void introducirTXT(tipoEmpleado emple, char *name);
void introducirDAT(tipoEmpleado emple, char *name);


int main() {
    //Var
    char nombre[S];

    //Body
    puts("Escribe el nombre del fichero\n");
    gets(nombre);

    formulario(nombre);

    //End
    return 0;
}
//Funciones

void formulario(char *name){
    //Var

    tipoEmpleado empleado;

    int num = 0;
    int res = 1;
    //Body


    while (res){
        num ++;
        empleado.codigoEmpleado = num;
        fflush(stdin), puts("\nNombre: ");
        fflush(stdin), gets(empleado.nombre);
        puts("\nEdad: ");
        fflush(stdin), scanf("%d", &empleado.edad);
        puts("\nSueldo: ");
        fflush(stdin), scanf("%f", &empleado.sueldo);


        introducirTXT(empleado, name);
        introducirDAT(empleado, name);
        //*Preguntar si quieres introducir otro empleado
        puts("\nQuieres  otro empleado?(S-1/N-0)");
        scanf("%d", &res);
    }

    //End

}

void introducirTXT(tipoEmpleado emple, char *name){
    //Var
    FILE *texto = NULL;

    char nameTXT[S];

    //Body

    //*Especificamos que es .txt
    strcpy(nameTXT, name);
    strcat(nameTXT, ".txt");

    //*Abrir el fichero
    if((texto = fopen(nameTXT, "at")) == NULL)
        puts("Error al abrir el archivo\n");
    else{
        puts("Correcto1\n");




            //*Guardar en el fichero
            fprintf(texto, "ID: %d\n"
                          "NOMBRE: %s\n"
                          "EDAD: %d\n"
                          "SUELDO: %.2f E\n"
                          "----------------------------\n", emple.codigoEmpleado, emple.nombre, emple.edad, emple.sueldo);


        //*Cerrar el fichero
        if(fclose(texto))
            puts("Error al cerrar el archivo\n");
        else{
            puts("Correcto2\n");
        }
    }
}

void introducirDAT(tipoEmpleado emple, char *name){

    //Var
    FILE *dato = NULL;

    char nameDAT[S];

    //Body

    //*Especificamos la extension del fichero
    strcpy(nameDAT, name);
    strcat(nameDAT, ".dat");


    //*Abrimos el fichero
    if((dato = fopen(nameDAT, "ab"))== NULL)
        puts("\nA0");
    else{
        puts("\nA1");

        //*Ir al final del fichero
        //fseek(dato, (sizeof(tipoEmpleado)), 2);

        //*Introducimos los datos en el fichero.DAT

        fwrite(&emple, (sizeof(tipoEmpleado)),1,dato);

        if(fclose(dato))
            puts("\nC0");
        else
            puts("\nC1");
    }

}