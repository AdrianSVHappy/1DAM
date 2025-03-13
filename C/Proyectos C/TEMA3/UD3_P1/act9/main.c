#include <stdio.h>
#include <stdlib.h>


/* 9. Encuentre el error en el siguiente programa, corríjalo, realice cualquier
modificación adicional.
Muestra 100100100100100100100100100100
#include <stdio.h>
void pinta(void);
int ctr;
char uno = '1';
char cero = '0';
main(){
for( ctr = 0; ctr < 10; ctr++ ){
printf( "%c", uno );
pinta();
}
return 0;
}
void pinta(void){
for( ctr = 0; ctr < 2; ctr++ )
printf( "%c", cero );
} */

//Constantes


//Prototipos
void pinta(void);

int main(void) {
    //Variables
    int ctr;
    char uno = '1';


    //Cuerpo
    for( ctr = 0; ctr < 10; ctr++ ){
        printf( "%c", uno );
        pinta();
    }


    //Fin
    return 0;
}

//Funciones
void pinta(void){
    int ctr;
    char cero = '0';
    for( ctr = 0; ctr < 2; ctr++ )
        printf( "%c", cero );
}