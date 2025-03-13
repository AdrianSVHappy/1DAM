#include <stdio.h>
#include <stdlib.h>
#include "math.h"


int main() {
    /*
     * INFORMACIÓN IMPORTANTE:
     * Euclides descubrió que si [2n–1] es un número primo, entonces [2n–1·(2n–1)] es perfecto.
     * Ponemos el limite a 8 porque es el minimo que podemos calcular con el tipo de dato (long long int)
    */

    //Constantes
    const int LIMITE = 9; //Limite = 9

    //Variables
    unsigned long long int elevado[LIMITE], resultado[LIMITE], aux= 1, formula = 0;
    int  cont= 0, primo= 1, pos=0, exp=0;
    //Cuerpo

    //* inicializamos los 2 vectores
    for (int i = 0; i < LIMITE; i++){

        resultado[i]= 0;
        elevado[i]=0;

    }

    //* Comprobamos cuales son los numeros primos que cumple la condición de Euclides dicha arriba
    while (pos < LIMITE){

        primo = 1, cont = 2;
        aux +=1;
        formula = (unsigned long long int) (pow(2, aux)) -1;

        //Comprueba si es un numero primo
        while ((cont <= (formula/2))&&(primo == 1)){

            if ((formula % cont) == 0){

                primo = 0;

            }

            cont +=1;

        }
        if (primo == 1){

            elevado[pos] = aux;
            printf("%lld[%d] ", aux, pos);
            pos +=1;

        }
        if (aux == 89){
            printf("\n%lld[%d](%d)\n Formula= %llu", aux, pos, primo, formula);
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
            printf("Posicion: %d \n [%lld] --> %llu * 10^%d\n",i, elevado[i],resultado[i], exp);
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
