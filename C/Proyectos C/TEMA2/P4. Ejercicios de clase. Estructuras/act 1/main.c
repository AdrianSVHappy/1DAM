#include <stdio.h>
#include <stdlib.h>


/* Ejercicio 1 - Estructuras */

//Constantes
#define LETRAS 20

//Estructuras
struct socio{
    char nombre[LETRAS],
            ape1[LETRAS],
            ape2[LETRAS];
    int id;
    float cuota;
};


int main() {
	//Constantes
    const int LIMITE = 6;



	//Variables

    struct socio socios[LIMITE],
                 nuevo,
                 antiguo;
    int op1 = 0,
        op2 = 0,
        temp = 0,
        cantidad = 0,
        desorden = 0;
    float total = 0;



	//Cuerpo


    //*menu
    while (op1 !=3) {
        printf("\n1-Mostrar usuarios\n2-Dar de alta usuario\n3-Salir\n");
        fflush(stdin);
        scanf("%d", &op1);

        switch (op1) {

            //*mostrar datos
            case 1:


                for (int i = 0; i < cantidad; ++i) {
                    printf("%d %s %s %s %.2fE\n", socios[i].id, socios[i].nombre, socios[i].ape1, socios[i].ape2, socios[i].cuota);

                    total += socios[i].cuota;
                }
                printf("Cuota media por socio: %.2fE\nCuota total: %.2fE\n", (total/6), total);


                break;
            //*Introducir datos
            case 2:
                printf("Nombre y apellidos:");
                fflush(stdin);
                scanf("%s %s %s", nuevo.nombre, nuevo.ape1, nuevo.ape2);



                do {
                    op2 = 0;

                    printf("ID:");
                    fflush(stdin);
                    scanf("%d", &nuevo.id);

                    for (int i = 0; i < cantidad; ++i) {
                        if(nuevo.id == socios[i].id){
                            printf("Id repetido!\n");
                            op2 = 1;
                            i = cantidad;
                        }
                    }

                } while (op2);


                printf("Cuota:");
                fflush(stdin);
                scanf("%f", &nuevo.cuota);

                socios[cantidad] = nuevo;

                cantidad +=1;

                break;
            //*Salir
            case 3:
                break;
            //*Control de errores
            default:
                printf("Opcion no valida\n");
        }


        //*Ordenar lista

        if (cantidad > 1){

            do {
                desorden = 0;

                for (int i = 0; i < (cantidad-1); ++i) {
                    for (int j = (i+1); j < cantidad; ++j) {

                        if(socios[i].id > socios[j].id){

                            antiguo = socios[i];
                            socios[i] = socios[j];
                            socios[j] = antiguo;

                            printf("Ordenando\n");
                        }

                    }
                }

            } while (desorden);

        }




    }

	//Fin
	return 0;
}
