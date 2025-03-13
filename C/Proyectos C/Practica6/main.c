#include <stdio.h>
#include <stdlib.h>
#include <time.h> //Libreria necesaria para usar las funciones rand() y srand().

/*Practica 6*/

int main() {

    //Constante
    const int PRECIO= 100; // PRECIO: Se usa para establecer el precio de cada partida

    /*
    Variables:
    saldo: Se usa para guardar el dinero con el que se va a jugar en centimos
     a, b, c, d, e: Se usan para guardar cada número que el jugador quiera meter
     na: Se usa para guardar el número que generará la máquina de forma aleatoria
     i: Se usa para el control del bucle for
     op: Se usa para el control del switch
     partidas: Se usa para que el jugador establezca el número de partidas que quiere jugar
     cent10, cent20, cent50, e1, e2: Se usa para introducir o mostrar el dinero en cada tipo de moneda
     loop: Se usa para controlar el bucle do while
     mostrar: Se usa para guardar el saldo en euros
     */

    int saldo= 0, a= 0, b= 0, c= 0, d= 0, e= 0, na= 0, i= 0, op= 0, partidas= 0, cent10= 0, cent20= 0, cent50= 0, e1= 0, e2= 0, loop= 1;
    float mostrar= 0;
    time_t t; //Declaramos la variable tiempo para la creación de la semilla.

    //Cuerpo
    srand((unsigned) time(&t));//Generamos la semilla para la función random.


    //Meter dinero
    printf("\nCuanto euros quieres meter (el precio es de 1 euro):");

    printf("\nCuantas monedas de 2 euros:");
    fflush(stdin);//Limpia el buffer
    scanf("%d", &e2);

    printf("Cuantas monedas de 1 euro:");
    fflush(stdin);//Limpia el buffer
    scanf("%d", &e1);

    printf("Cuantas monedas de 50 centimos:");
    fflush(stdin);//Limpia el buffer
    scanf("%d", &cent50);

    printf("Cuantas monedas de 20 centimos:");
    fflush(stdin);//Limpia el buffer
    scanf("%d", &cent20);

    printf("Cuantas monedas de 10 centimos:");
    fflush(stdin);//Limpia el buffer
    scanf("%d", &cent10);

    saldo= (e2 * 200) + (e1 * 100) + (cent50 * 50) + (cent20 * 20) + (cent10 * 10);
   // printf("Saldo: %d", saldo);
    mostrar = (float ) saldo/100;
    printf("Saldo: %.2f e", mostrar);
    //Meter dinero

    //Numero de partidas
    printf("\nCuantas partidas quieres jugar:");
    fflush(stdin);//Limpia el buffer
    scanf("%d", &partidas);
    //Numero de partidas

    //Juego
    while ((partidas > 0) && (PRECIO <= saldo)) { //Se crea un bucle para jugar hasta que te quedas sin dinero o cuando hayas jugado las partidas declaradas

        printf("1.-Jugar\n2.-Salir\n");
        fflush(stdin);//Limpia el buffer
        scanf("%d", &op);

        switch (op) { //Se crea un menú para poder elegir entre jugar o salir en cada iteración del bucle
            case 1://Jugar

                do { //Se crea un bucle para que solo te permitan jugar con numeros validos

                    printf("Escribe 5 numeros (Solo seran validos 0-50): \n");
                    fflush(stdin);//Limpia el buffer
                    scanf("%d", &a);

                    fflush(stdin);//Limpia el buffer
                    scanf("%d", &b);

                    fflush(stdin);//Limpia el buffer
                    scanf("%d", &c);

                    fflush(stdin);//Limpia el buffer
                    scanf("%d", &d);

                    fflush(stdin);//Limpia el buffer
                    scanf("%d", &e);

                    if (((0 <= a) && (a <= 50)) &&
                        ((0 <= b) && (b <= 50)) &&
                        ((0 <= c) && (c <= 50)) &&
                        ((0 <= d) && (d <= 50)) &&
                        ((0 <= e) && (e <= 50))){

                        loop = 0;

                    } else {

                        loop = 1;
                        printf("Alguno de los valores introducidos no son validos\n");

                    }

                } while (loop == 1);

                for (i = 1; i <= 5; i++) { //Se crea un bucle for en el que compara los numeros que ha metido el jugador con uno random el bucle se repite 5 veces, si hay coincidencia el saldo aumenta 10 euros

                na = rand() % 51;

                    if ((a == na) ||
                        (b == na) ||
                        (c == na) ||
                        (d == na) ||
                        (e == na)) {

                        printf("Has acertado el numero [%d] !!\n", na);
                        saldo += 1000;

                    }

                }

                saldo -= PRECIO; //Se resta el precio de la partida al saldo total

                if (saldo > 0){ //Si aun queda saldo se muestra

                    printf("Saldo actual: %d;\n", saldo);

                }

                break;
            case 2://Salir

                partidas = 0; //Fuerza a que se salga del bucle

                break;
            default://Control de errores

                printf("Opcion incorrecta\n");

        }

        partidas -= 1; //Se indica que ha gastado una partida
        partidas > 0 ? printf("partidas: %d\n", partidas) : printf("partidas: 0\n"); //Usamos el operador ternario para mostrar un mensaje según el número de partidas restantes

    }


    //Devolucion
    mostrar = (float) saldo/100;
    printf("Saldo a retirar: %.2f e\n", mostrar);
    cent10= 0, cent20= 0, cent50= 0, e1= 0, e2= 0; //se limpian las variables

   while (saldo > 0){ //Se crea un bucle para hacer el cambio

        if (saldo >= 200){// Si el saldo es mayor o igual a 2 €

            saldo -= 200;
            e2 += 1;

        }else if (saldo >= 100){// Si el saldo es mayor o igual a 1 €

            saldo -= 100;
            e1 += 1;

        } else if (saldo >= 50){// Si el saldo es mayor o igual a 50 c

            saldo -= 50;
            cent50 += 1;

        } else if (saldo >= 20){// Si el saldo es mayor o igual a 20 c

            saldo -= 20;
            cent20 += 1;

        }else if (saldo >= 10){// Si el saldo es mayor o igual a 10 c

            saldo -= 10;
            cent10 += 1;

        }
    }

    printf("%d 2e\n", e2);
    printf("%d 1e\n", e1);
    printf("%d 50c\n", cent50);
    printf("%d 20c\n", cent20);
    printf("%d 10c\n", cent10);
    //Devolucion


    //Fin
    return 0;
}
