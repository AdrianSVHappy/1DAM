#include <stdio.h>
#include <stdlib.h>


/* 8. Encuentre el error en el siguiente código y revíselo para ver si hay mejoras. Se
supone que debe proporcionar una salida como esta:
*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#

 #include <stdio.h>
void print_function( char );
int ctr;
main(){
char star;
print_function( star );
return 0;
}
void print_function( char star ){
char dash;
for ( ctr = 0; ctr < 25; ctr++ ){
printf( "%c%c", star, dash );
}
}*/


//Prototipos
void print_function( void );

int main(void) {
    //Variables


    //Cuerpo

    print_function();

    //Fin
    return 0;
}

//Funciones
void print_function( void ){
    int ctr = 0;
    char dash = 35;
    char star = 42;
    for ( ctr = 0; ctr < 25; ctr++ ){
        printf( "%c%c", star, dash );
    }
}