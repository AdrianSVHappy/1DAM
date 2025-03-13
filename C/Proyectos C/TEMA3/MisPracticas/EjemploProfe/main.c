#include <stdio.h>
#include <string.h>
#define M 2 //tama�o del vector tipo "matpro".
#define S 20 //Tamaño medio de los strings
#define A 0 //Numero de materias

/* Escuela.
El programa genera informaci�n importante de los alumnos de una escuela. */
typedef struct /* Declaraci�n de la estructura matpro. */
{
    char mat[S]; /* Materia. */
    int pro; /* calificaci�n */
} matpro;

typedef struct /* Declaraci�n de la estructura alumno. */
{
    int matri; /* Matr�cula. */
    char nom[S]; /* Nombre del alumno. */
    char ape[S]; //Apellido del alumno
    matpro cal[A]; /* Observa que cal es un arreglo unidimensional de tipo
				.estructura matpro �la estructura definida en primer t�rmino. */
} alumno;

//Prototipos
    void listar(alumno *alu, int bandera); //Lista los nombres y los apellido de los alumnos
    void modi(alumno *alu, int bandera); //Modifica el apellido de un alumno identificado por el campo "matri"
    void alta(alumno *alu, int *bandera); //Da de alta a los alumnos dentro del vector
    int menu(void); //Menu

int main(void){
    alumno ALU[M]; /* ALU es un arreglo unidimensional de tipo alumno. */
    int i, j; //�ndice para recorrer el vector.
    float sum = 0.0;//Acumulador.
    int op = 0;
    int dadoAlta = 0;//Es una bandera para poder listar los datos solo si se han cargado

    do {
        op = menu();

        switch (op) {
            case 1: //Alta
                alta(ALU, &dadoAlta);
                break;
            case 2: //Listar
                listar(ALU, dadoAlta);
                break;
            case 3: //Modificar
                modi(ALU, dadoAlta);
                break;
            case 4: //Salir
                break;
            default:
                printf("[!]ERROR. La opcion seleccionada no esta contemplada");
        }

    } while (op !=4);


    /*

    //Cargamos los datos en el vector.



    // Para obtener la matrícula y la media general de cada alumno.
    for (i=0; i<M; i++){
        printf("\nMatr%ccula del alumno : %d", 161, ALU[i].matri);
        sum = 0.0;
        for (j=0; j<5; j++){
            sum = sum + ALU[i].cal[j].pro;
            sum = sum / 5;
            printf("\tPromedio: %.2f", sum);
        }
    }

    /*para obtener las matr�culas de los alumnos cuya calificaci�n
    en la tercera materia es mayor a 9. *//*

    printf("\nAlumnos con calificaci%cn mayor a 9 en la tercera materia",162);
    for (i=0; i<M; i++)
        if (ALU[i].cal[2].pro > 9)
            printf("\nMatr%ccula del alumno : %d", 161, ALU[i].matri);


    //para obtener la general de la cuarta materia.
    for (i=0; i<M; i++)
        sum = sum + ALU[i].cal[3].pro;

    sum = sum / M;
    printf("\n\nPromedio de la cuarta materia: %.2f", sum);
*/
    return 0;
}

//Funciones
int menu(void){
    //Variables
    int x;

    //Cuerpo
    printf("\n\n\n\n\tMenu:"
           "\n\t1.-Dar de alta a los alumnos"
           "\n\t2.-Listar los alumnos"
           "\n\t3-.Modificar un alumno"
           "\n\t4.-SALIR"
           "\n>");

    fflush(stdin);
    scanf("%d", &x);

    printf("\n\n");
    return  x;
}

void listar(alumno *alu, int bandera){
    //Variables
    int i = 0, j = 0;


    //Cuerpo

    if(!bandera){
        printf("\n[!]ERROR. No puedes mostrar los datos antes de cargarlos");
    }
    else{
        printf("\nMATRICULA - NOMBRE - APELLIDO");
        for (i = 0; i < M; ++i) {
            printf("\n%d\t%s\t%s", alu[i].matri, alu[i].nom, alu[i].ape);
        }
        printf("\n\n");
    }



}

void modi(alumno *alu, int bandera) {
    //variables
    int elegir =0;
    int i = 0, j = 0, k = 0;
    //cuerpo
    if(!bandera){
        printf("\n[!]ERROR. No puedes modificar los datos antes de cargarlos");
    }
    else{
        printf("\nSelecciona una matricula para modificar:\n");
        for (i = 0; i < M; ++i) {
            printf("|%d", alu[i].matri);
        }
        printf("|\n>");
        fflush(stdin);
        scanf("%d", &elegir);

        for (j = 0; j < M; ++j) {
            if(elegir == alu[j].matri){
                break;
            }
        }
        if(j >= M){
            printf("[!]ERROR. La matricula introducida no existe en el registro");
        }
        else{
            fflush(stdin);
            printf("Introduce el nombre del alumno: ");
            gets(alu[j].nom);
            printf("Introduce el apellido del alumno: ");
            gets(alu[j].ape);
            for (k=0; k<A; k++){
                printf("\tMateria %d: ", k+1);
                fflush(stdin);
                gets(alu[j].cal[k].mat);
                printf("\tCalificaci%cn %d: ",162, k+1);
                scanf("%d", &alu[j].cal[k].pro);
            }
        }
    }
}
void alta(alumno *alu, int *bandera) {
    //Variable
    int i = 0, j = 0;

    //Cuerpo

    *bandera = 1;

    for(i=0; i<M; i++){
        printf("\nIntroduce los datos del alumno %d", i+1);
        printf("\nIntroduce la matr%ccula del alumno: ", 161);
        scanf("%d", &alu[i].matri);
        fflush(stdin);
        printf("Introduce el nombre del alumno: ");
        gets(alu[i].nom);
        printf("Introduce el apellido del alumno: ");
        gets(alu[i].ape);
        for (j=0; j<A; j++){
            printf("\tMateria %d: ", j+1);
            fflush(stdin);
            gets(alu[i].cal[j].mat);
            printf("\tCalificaci%cn %d: ",162, j+1);
            scanf("%d", &alu[i].cal[j].pro);
        }
    }
}