#include <stdio.h>
#include <stdlib.h>
#include "math.h"


int main() {

    int x = 1, y=0;
    unsigned long long int z= 0;

    while (x < 90){
        z = (unsigned long long int) (pow(2, x)) -1;
        for (unsigned long long int i = 1; i < z ; ++i) {
            if (((z % i)) == 0){
                y = (int) i;
                if (y > 1){
                    i = z;
                }
            }
        }
        if (y == 1){
            printf("%d ", x);
        } else if (x > 31){
            printf("\n%d -> %llu (%d) ", x, z, y);
        }




        x += 1;
    }

    printf("\n");
    /*
     * INFORMACIÓN IMPORTANTE:
     * Euclides descubrió que si [2n–1] es un número primo, entonces [2n–1·(2n–1)] es perfecto.
     * Ponemos el limite a 8 porque es el minimo que podemos calcular con el tipo de dato (long long int)
     * unsigned long long int max value= 18446744073709551615 (20 cifras)~~[usemos 19]
*                                        00000000000000000000
    */

    //Constantes
    const int LIMITE = 7; //Limite = 8

    //Variables
    unsigned long long int resultado[LIMITE], formula = 0, elevado[LIMITE], aux= 1;
    int  cont= 0, primo= 1, pos=0, exp= 0, operador= 0;
    //Cuerpo

    //* inicializamos los 2 vectores
    for (int i = 0; i < LIMITE; i++){

        resultado[i]= 0;
        elevado[i]=0;

    }

    //* Comprobamos cuales son los numeros primos que cumple la condición de Euclides dicha arriba
    while (pos < LIMITE){

        primo = 1, cont = 0;
        aux +=1;
        formula = (unsigned long long int) (pow(2, aux)) -1;

        //Comprueba si es un numero primo
        for (int i = 1; i < formula ; ++i) {
            if (((formula % i)) == 0) {
                cont = i;
            }
            if (cont > 1){
                break;
            }
        }
        if (cont == 1){
            primo = 1;
        } else {
            primo = 0;
        }

        if (primo == 1){

            elevado[pos] = aux;
            printf("%lld[%d]-(%d) ", aux, pos, primo);
            pos +=1;

        } else if (aux == 89){
            printf("(%lld)-(%d) ", aux, primo);
        }
    }


    printf("\n");


    //* Usando la formula de Euclides, calculamos los numeros perfectos
    for (int i = 0; i < LIMITE; ++i) {

        resultado[i] =(unsigned long long int) (pow(2, (elevado[i] -1)) * (pow(2, elevado[i])-1));


        //Comprobamos si hace falta usar exponenciales
        exp = 1;
       while ( resultado[i] == 0){

           exp +=1;

           resultado[i] =(unsigned long long int) ((pow(2, (elevado[i] -1)) * (pow(2, elevado[i])-1)) / pow(10, exp));

       }



        if (exp == 1){
            printf("Posicion: %d \n [%lld] --> %llu\n",i, elevado[i],resultado[i]);

        } else {
            printf("Posicion: %d \n [%lld] --> %llu e+%d\n",i, elevado[i],resultado[i], exp);
        }


    }

    /*
 ///////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////


printf("\n");
cont=0;
while (bandera < LIMITE){

    operador = resultado[cont];
    sum = 0;
    for (long long int i = 1; i < operador; ++i) {
        if (((operador % i)) == 0){
            sum += i;
            if ((i % 100)==0){
                printf(".");
            }

        }
    }
    if (sum == resultado[cont]){
        printf("[%d] --> %lld\n", (cont), operador);
        bandera +=1;
    }
    //printf("--------------[%d --> %lld](%d)\n", cont, operador, bandera);
    cont += 1;
}
*/
    //Fin
    return 0;
}
