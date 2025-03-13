#include <stdio.h>
#include <stdlib.h>
#define N 10 //extensi�n m�xima para cadena de caracteres.
#define M 2 //n�mero m�ximo de tiradores.
#define T 3 //n�mero m�ximo de disparos por tirador.

typedef struct{
    int pos; //posici�n en el  vector de datos
    int ide; //identificador del soldado tirador.
}indice;

typedef struct{
    int orden; //orden del disparo en la tirada.
    float puntos; //puntos obtenido en el disparo.
}tirada;

typedef struct{
    int iden; //identificador del tirador.
    char nom[N];//Nombre tirador.
    char ape1[N];//Apellido 1�
    char ape2[N];//Apellido 2�
    int edad; //edad tirador
    tirada tiradas[T];//Vector que almacena las tiradas.
}tirador;

int main(void) {
    tirador tiradores[M];//Vector de tiradores.
    indice indices[M];//Vector de �ndices.
    int i, j; //variables para �ndices.
    char resp;
    int op; //variable para almacenar la opci�n en el men�.
    int identifi; //variable para almacenar el identificador del tirador.
    float punto; //variable para almacenar puntos de tiradas.
    float media; //variable para almacenar la media de las tiradas.
    int flag = 1;
    int posic = -1;
    //inicializamos el vector de �ndices.
    for(i=0; i<M; i++){
        indices[i].ide = -1;
        indices[i].pos = -1;
    }

    do{//Mostramos el menu
        printf("\n\t1.- Alta tiradores");
        printf("\n\t2.- Introducir tiradas");
        printf("\n\t3.- Listar puntos");
        printf("\n\t4.- Salir\n");

        printf("\nElige una opcion  ");
        scanf(" %d",&op);

        switch (op){
            case 1:
                //Para posicionarnos en la primera posici�n libre.
                for(i=0; i<M; i++){
                    if(indices[i].ide == -1)
                        break;
                }

                if (i >= M){
                    printf("/nERROR. No hay espacio para mas tiradores ");
                    exit;
                }

                do{
                    do{
                        flag = 1;
                        printf("\nPosicion: ");
                        fflush(stdin);
                        scanf(" %d", &posic);

                        if((posic < 0) || (posic > (M-1))){
                            printf("\nERROR. Posici�n no valida");
                            flag = 0;
                            continue;
                        }else {
                            for(j=0; j<i; j++){
                                if(indices[j].pos == posic){
                                    flag = 0;
                                    printf("\nERROR. Posici�n ya establecida.\n");
                                    continue;
                                }
                            }
                        }

                    }while(!flag);

                    indices[i].ide = i;
                    indices[i].pos = posic;

                    //Cargamos los datos del tirador.
                    tiradores[indices[i].pos].iden = indices[i].ide;
                    printf("\nNombre: ");
                    fflush(stdin);
                    gets(tiradores[indices[i].pos].nom);
                    printf("\nApellido 1: ");
                    gets(tiradores[indices[i].pos].ape1);
                    printf("\nApellido 2: ");
                    gets(tiradores[indices[i].pos].ape2);
                    printf("\nEdad: ");
                    fflush(stdin);
                    scanf("%d", &(tiradores[indices[i].pos].edad));
                    i++; //Aumentamos en 1 el �ndice.

                    do{
                        printf("\nQuieres dar de alta a otro tirador? S/N ");
                        fflush(stdin);
                        scanf(" %c", &resp);
                    }while((resp != 'n') && (resp != 'N') && (resp != 's') && (resp != 'S'));

                }while (((resp == 's') || (resp == 'S')) && (i < M));
                break;
            case 2:
                printf("\nIntroduce el identificador del tirador: ");
                fflush(stdin);
                scanf("%d", &identifi);
                flag = 1;
                for(i=0; i<M; i++){
                    if(identifi == indices[i].ide){
                        for(j=0; j<T; j++){
                            printf("\nIntroduce los datos de la %d tirada ", j+1);
                            (*(tiradores + indices[i].pos)).tiradas[j].orden = j;
                            printf("\nPuntos: ");
                            fflush(stdin);
                            scanf(" %f", &punto);
                            (*(tiradores + indices[i].pos)).tiradas[j].puntos = punto;
                            flag = 1;
                        }
                        break;
                    }
                    else{
                        flag = 0;
                    }
                }
                if(flag == 0){
                    printf("\nERROR. No existe el identificador.\n");
                    system("pause");
                    break;
                }
                system("pause");
                break;
            case 3:
                for(i=0; i<M; i++){
                    printf("\n%d \t", (*(tiradores + indices[i].pos)).iden);
                    printf("%s \t", (*(tiradores + indices[i].pos)).nom);
                    printf("%s \t", (*(tiradores + indices[i].pos)).ape1);
                    printf("%s \t", (*(tiradores + indices[i].pos)).ape2);
                    media = 0;
                    for(j=0; j<T; j++){
                        media = media + (*(tiradores + indices[i].pos)).tiradas[j].puntos;
                    }
                    media = media / (float)T;
                    printf("%f ", media);
                }
                printf("\n");
                system("pause");
                break;
            case 4:
                break;
            default:
                printf("\n\tOpcion incorrecta.\n");
                system("pause");
        }

        system("cls");

    }while (op != 4);


    return 0;
}