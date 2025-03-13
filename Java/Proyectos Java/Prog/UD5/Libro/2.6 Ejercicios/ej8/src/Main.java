/**Ejercicio 8 -
 Escribe un programa que declare 5 variables de tipo char. A continuación, crea
 otra variable como cadena de caracteres y asígnale como valor la concatenación
 de las anteriores 5 variables. Por último, muestra la cadena de caracteres
 por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?*/
public class Main {
    public static void main(String[] args) {
        //Var
        char c1 = 'A',
                c2 = 'B',
                c3 = 'C',
                c4 = 'D';
        String linea;

        int num;

        //Body


        num = c1  + c2 + c3 + c4;//linea = c1  + c2 + c3 + c4; <-- MAL

        linea = c1 + "" + c2 + c3 + c4; //<-- BIEN. Añadiendo a la concatenación comillas dobles, se indica que el conjunto es una cadena de caracteres y no la suma del ASCII de los char

        System.out.println("String: "+linea);
        System.out.println("Int: "+num);
    }
}