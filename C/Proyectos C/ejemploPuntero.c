#include <stdio.h>
int main(){
	int b[] = { 10, 20, 30, 40 }; /* inicializa el array b */
	int *ptrB = b; /* establece ptrB para que apunte al array b */
	int i; /* contador */
	int desplazamiento; /* contador */
	
	/* muestra el array b con la notaci?n de sub?ndices */
	printf("Array b impreso con:\nNotacion de subindices de ARRAYs\n");

	/* ciclo a trav?s del array b*/
	for ( i = 0; i < 4; i++ ) {
		printf( "b[%d] = %d\n", i, b[i] );
	} /* fin de for */

	/* muestra el array b mediante el uso del nombre del array y
	notaci?n puntero/desplazamiento */

	printf("\nNotacion puntero/desplazamiento donde el puntero es el nombre del array\n");

	/* ciclo a trav?s del array b */
	for ( i = 0; i < 4; i++ ) {
		printf("*(b + %d) = %d\n", i, *( b + i ) );
	}	/* fin de for */

	/* muestra el array b mediante el uso de ptrB y notaci?n de sub?ndices
	de arrays */
	printf("\nNotacion de subindices de arrays\n");

	/* ciclo a trav?s del array b */
	for ( i = 0; i < 4; i++ ) {
		printf("ptrB[%d] = %d\n", i, ptrB[i] );
	} /* fin de for */

	/* muestra el array b mediante el uso de ptrB y notaci?n de
	puntero/desplazamiento */
	printf("\nNotaci?n apuntador desplazamiento\n");

	/* ciclo a trav?s del array b */
	for ( desplazamiento = 0; desplazamiento < 4; desplazamiento++ ) {
		printf("*(ptrB + %d) = %d\n", desplazamiento, *( ptrB + desplazamiento ) );
	} /* fin de for */

	return 0; /* indica terminaci?n exitosa */
} /* fin de main */

/*
para recorrer matices b[i][j] --con-punteros--> *(*(b+i)+j);


for (i=0; i<4; i++){
	for(j=0; j<4, j++){
	
		b[x][y] = b[y][x]
		*(*(b+x)+y) = *(*(b+y)+x)
	
	}
}


*/
