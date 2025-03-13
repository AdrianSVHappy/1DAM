#include <stdio.h>
#include <stdlib.h>
#include <time.h> //Libreria necesaria para usar las funciones rand() y srand().
#include <string.h> //Libreria util para el tratamiento de strings

/* Plantilla */

//Constantes
#define N 10


//Estructuras


//Prototipos

int main(void) {
	//Variables
	
	time_t t; //Declaramos la variable tiempo para la creación de la semilla.
	
	//Cuerpo
	srand((unsigned) time(&t));//Generamos la semilla para la función random.
	
	
	//Fin
	return 0;
}

//Funciones