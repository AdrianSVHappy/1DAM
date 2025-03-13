#include <stdio.h>
#include <stdlib.h>
#include <time.h> //Libreria necesaria para usar las funciones rand() y srand().
#include <string.h> //Libreria util para el tratamiento de strings

/* 4 Problema.
En un hospital almacenan la siguiente información de sus pacientes:
 Nombre y apellido (cadena de caracteres).
 Edad (entero).
 Sexo (carácter).
 Condición (entero).
 Domicilio (estructura).
	o Calle (cadena de caracteres).
	o Número (entero).
	o Colonia (cadena de caracteres).
	o Código Postal (cadena de caracteres).
	o Ciudad (cadena de caracteres).
 Teléfono (cadena de caracteres).
Dato: HOSPITAL[N] (donde HOSPITAL es un array unidimensional de tipo
estructura PACIENTE, 1 ≤ N ≤ 100).
Nota: Condición se refiere al estado de salud en que ingresa el paciente. Los
valores que toma condición van de 1 a 5, y 5 representa el máximo grado de gravedad.
Escribe un programa en C que genere lo siguiente:
a) El porcentaje tanto de hombres como de mujeres registrados en el
hospital.
b) El número de pacientes de cada una de las categorías de condición.
c) El nombre y teléfono de todos los pacientes que tuvieron una condición
de ingreso de máxima gravedad (5).
En la siguiente figura se muestra la representación gráfica de la estructura
de datos necesaria para resolver este problema. */

//Constantes

#define LETRAS 20
#define N 10

//Estructuras
struct domicilios{
    char calle[LETRAS];
    int numero;
    char  colonia[LETRAS];
    char codigoPostal[6];
    char ciudad[LETRAS];
};

struct paciente{
    char nombre[LETRAS];
    char apellido[LETRAS];
    int edad;
    char sexo;
    int condicion;
    struct domicilios domicilio;
    char telefono[10];
};

int main() {

    //Variables
    struct paciente hospital[N];

    int op1 = 0; //Variables banderas o para menu
    int i = 0, j = 0, k = 0; //variables para los bucles for
    int cont = 0,
        cond1= 0, cond2=0, cond3 = 0, cond4=0, cond5=0;//Contadores

    time_t t; //Declaramos la variable tiempo para la creación de la semilla.

    //Cuerpo
    srand((unsigned) time(&t));//Generamos la semilla para la función random.


    //*inicializar y mostrar todas las variables
    for (i = 0; i < N; ++i) {
        //**Nombre y apellido de los pacientes
        strcpy(hospital[i].nombre, "Paciente");
        strcpy(hospital[i].apellido, "paciente");

        //**Edad
        hospital[i].edad = rand() % 101;//0-100

        //**Sexo
        op1 = rand() % 2;
        switch (op1) {
            case 0:
                hospital[i].sexo = 'M';
                break;
            case 1:
                hospital[i].sexo = 'F';
                break;
            default:
                hospital[i].sexo = 'X';
        }

        //**Condición
        hospital[i].condicion = (rand() % 5) +1;

        //**Domicilio
        //***Calle
        strcpy(hospital[i].domicilio.calle,"Calle");

        //***Numero
        hospital[i].domicilio.numero = (rand() % 100)+1;//1-100;

        //***Colonia
        strcpy(hospital[i].domicilio.colonia, "Colonia");

        //***Código postal
        strcpy(hospital[i].domicilio.codigoPostal, "21710");

        //***Ciudad
        strcpy(hospital[i].domicilio.ciudad, "Ciudad");

        //**Teléfono
        strcpy(hospital[i].telefono, "959439921");

        //mostramos
        printf("\n%d: %s %s\nEdad: %d Sexo: %c\nCondicion: %d\nDomicilio:\nCalle: %s No: %d\nColonia: %s CP: %s\nCiudad: %s\nTelefono: %s\n",
               (i+1), hospital[i].nombre, hospital[i].apellido,
               hospital[i].edad, hospital[i].sexo,
               hospital[i].condicion,
               hospital[i].domicilio.calle, hospital[i].domicilio.numero,
               hospital[i].domicilio.colonia, hospital[i].domicilio.codigoPostal,
               hospital[i].domicilio.ciudad,
               hospital[i].telefono);
    }

    //a) El porcentaje tanto de hombres como de mujeres registrados en el hospital.

    for (i = 0; i < N; ++i) {
        if(hospital[i].sexo == 'M'){
            cont +=1;
        }
    }
    printf("\nPorcentaje de hombres: %d%\nPorcentaje de mujeres: %d%\n", ((cont*100)/N), (((N-cont)*100)/N));

    //b) El número de pacientes de cada una de las categorías de condición.
    for (i = 0;  i<N ; i++) {
        switch (hospital[i].condicion) {
            case 1:
                cond1 +=1;
                break;
            case 2:
                cond2 +=1;
                break;
            case 3:
                cond3 +=1;
                break;
            case 4:
                cond4 +=1;
                break;
            case 5:
                cond5 +=1;
                break;
        }
    }
    printf("\nC1:%d - C2:%d - C3:%d - C4:%d - C5:%d\n", cond1, cond2, cond3, cond4, cond5);

    //c) El nombre y teléfono de todos los pacientes que tuvieron una condición de ingreso de máxima gravedad (5).
    for (i = 0; i < N; ++i) {
        if(hospital[i].condicion == 5){
            printf("%d %s (%s)\n", (i+1), hospital[i].nombre, hospital[i].telefono);
        }
    }




    //Fin
    return 0;
}
