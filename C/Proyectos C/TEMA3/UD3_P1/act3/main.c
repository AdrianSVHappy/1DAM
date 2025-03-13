#include <stdio.h>
#include <stdlib.h>


/* 3. ¿Dónde está el error?
#include <stdio.h>
void print_msg( void );
int main(){
    print_msg( "This is a message to print" ); --> en la declaración de la funcion no te pide ninguna variable
    return 0;
}
void print_msg( ){
    puts( "This is a message to print" );
    return 0; --> Al escribir void se espera que no retorne ningun dato
} */




//Prototipos
void print_msg( void );

int main() {
    //Variables

    //Cuerpo
    print_msg();
    return 0;

    //Fin
    return 0;
}

//Funciones
void print_msg( ){
    puts( "This is a message to print" );

}