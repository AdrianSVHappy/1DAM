#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
	
	int operacion= 0; //Para elegir que operacion se va a hacer
	int n1= 0; //El primer numero de la operacion
	int n2= 0; //El segundo numero de la operaciom
	int sol= 0;//Variable donde se va a guardar la solucion 
	
	printf("Calculadora:");
	printf("Escoge la operacion:\n (1)Suma\n (2)Resta\n (3)Multiplicación\n (4)Divicion\n");
	scanf("%d", &operacion); //Escoger la opcion
	printf("Escoge el primer numero: ");
	scanf("%d", &n1); //Declarar primer numero
	printf("Escoge el segundo numero: ");
	scanf("%d", &n2);// Declarar segundo numero
	
	switch (operacion){ //Decidir que operacion deseada
		case 1: //Si operacion es = 1 se ejecuta esta parte del codigo
			sol= n1+n2;//Suma
			break;// Se termina la parte de codigo opcional
		case 2:
			sol= n1-n2;//Resta
			break;
		case 3:
			sol= n1*n2;//Multiplicacion
			break;
		case 4:
			sol= n1/n2;//Divicion
			break;
		default :// Si la variable operacion no entra en ninguno de los casos declarados (control de errores)
			printf("ERROR");
			return 0;//Terminar programa
	}
	
	printf("Igual a: %d \n", sol); //Mostrar solucion por pantalla
	
	printf("Escribe cualquier numero para cerrar el programa: ");
	scanf("%d", &n2);
	
	return 0;//Terminar programa
}
