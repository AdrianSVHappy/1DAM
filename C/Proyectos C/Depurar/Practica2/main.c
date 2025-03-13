#include <stdio.h>
#include <stdlib.h>

void act1(){ // Funcion ejercicio 1
    int suma=0; //Suma numeros positivos
    int np=0; // Numeros positivos introducidos por teclado
    int c=0; // Contador vueltas

    printf("Introduzca un numero positivo: \n ");
    scanf("%i",&np); /* Primer numero positivo introducido, ya que al empezar la variable np=0
						y eso equivaldria a salir del bucle automaticamente*/
    suma=suma+np;/*Asignamos el primer numero a suma para que tambien cuente el numero introducido
									ya que si empezamos sin asignar valor a suma perdemos el primer datos*/
    if (np==0 || np<0){// Condicional para que el usuario no introduzca un numero negativo o igual a 0
        printf("Tiene que ser un numero positivo \n");
        exit(0);/*En caso de que el usuario introduza 0 o un numero negativo
					al principio, lo manda al carajo*/

    } else { //En caso de que el numero sea positivo hace el calculo

        while (1){ // Bucle infinito hasta que se rompa con un valor entero de "0"

            printf("Introduzca un numero positivo: \n ");
            scanf("%i",&np);// Dentro del bucle pregunta por los numeros positivos repetidas veces

            if (np<0){//condicional si el usuario utiliza un numero negativo
                printf("Tienen que ser numeros positivos \n");
                continue;/* Comando que solo se puede utilizar en un bucle y que desecha el dato
						introducido por teclado que entre dentro de la condicional*/

            }
            c++;//contador de vueltas del bucle
            suma+=np;//Sumador de suma+numero introducido por teclado

            //!ERROR1: Falta dividir en la media suma /= c;

            if (np==0){
                break;// Si el valor de entrada del usuario es 0, rompe el bucle y dice la media

            }//Finaliza el bucle

        }//final forzado bucle "0"
    }//Final bucle
    printf("La media de los numeros positivos de la secuencia es: %i \n",suma);//Muestra la media de los numeros positivos introducidos por teclado
    system("pause");
}

void act2(){ // Funcion ejercicio 2
    int suma=2;
    int numero=4;

    for (suma=2;numero<=100;numero+=2){//
        suma+=numero;
        printf("Resultado: %d\n", suma);
        printf("Vuelta:%d\n", numero);
    }

    printf("El resultado de la suma es: %i \n",suma);
}

void act3() { // Funcion ejercicio 5
    int te=0,numero=0,contador=0;
    printf("Para salir del ejercicio hay que itroducir un valor negativo");

    while (1){

        printf("Numero (%d):",contador);
        scanf("%d",&numero);

        if (numero==0){
            te+=1;
        }

        if (numero<0){
            break;
        }
        contador++;
    }
    numero=1;
    printf("Han habido un total de: %i \n\n",te);
    system("pause");
}

void act4() { // Funcion ejercicio 4

    int num1=0,num2=0,num3=0; // Declaracion de variables

    printf("Introduzca tres numeros separados por espacios: \n\n");
    scanf("%d %d %d",&num1,&num2,&num3);//Agrega el valor a cada variable que se sumarÃ¡ mas tarde


    //!ERROR2: La condición es a la inversa
    if (num1+num2==num3||num1+num3==num2||num3+num2==num1){ //Condicional que suma las posibilidades que pueden haber y que imprime "Distintos" o "Iguales"
        printf("Distintos\n\n");
    } else {
        printf("Iguales\n\n");
    }

}

int main(int arg, char *argv[]) {

    int ud1p1=0;

    while (ud1p1!=994){

        printf("Â¿que ejercicio quiere revisar?\n \n");
        printf("1) Calcula la media de una serie de numeros positivos, suponiendo que los datos se leen desde un terminal. Un valor de cero -como entrada- indicara que se ha alcanzado el final de la serie de numeros positivos. \n \n");
        printf("2) Suma los numeros pares comprendidos entre 2 y 100. \n \n");
        printf("3) Dada una secuencia de numeros (se entiende que ya esta disponible en el sistema), se desea contar e imprimir el nÃºmero de ceros de la secuencia.  \n \n");
        printf("4) Dado tres numeros, determinar si la suma de cualquier pareja de ellos es igual al tercer numero. Si se cumple la condicion, escribir -Iguales- y, en caso contrario, escribir -Distintas-. \n \n");
        printf("5) Salir del programa. \n \n");
        printf("Elija un ejercicio introduciendo el numero que quiere revisar: \n \n");
        printf(">");
        scanf("%d",&ud1p1);

        switch (ud1p1){
            case 1:
                printf("Mostrando ejercicio 1 \n \n");
                printf("Calcula la media de una serie de numeros positivos, suponiendo que los datos se leen desde un terminal. Un valor de cero -como entrada- indicara que se ha alcanzado el final de la serie de numeros positivos. \n \n");
                act1();
                break;

            case 2:
                printf("Mostrando ejercicio 2 \n \n");
                printf("Suma los numeros pares comprendidos entre 2 y 100. \n \n");
                act2();
                system("pause");
                break;

            case 3:
                printf("Mostrando ejercicio 4 \n \n");
                printf("Dada una secuencia de numeros (se entiende que ya esta disponible en el sistema), se desea contar e imprimir el nÃºmero de ceros de la secuencia.  \n \n");
                act3();
                break;

            case 4:
                printf("Mostrando ejercicio 5 \n \n");
                printf("Dado tres numeros, determinar si la suma de cualquier pareja de ellos es igual al tercer numero. Si se cumple la condicion, escribir â€œIgualesâ€ y, en caso contrario, escribir â€œDistintasâ€. \n \n");
                act4();
                break;
            default: printf("comando no admitido \n");

            case 6:
                printf("Saliendo del programa...");
                ud1p1=994;
                break;
        }
    }
    return 0;
}