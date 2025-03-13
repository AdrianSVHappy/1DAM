/**Ejercicio 7 -
 Escribe un programa que declare variables de tipo char y de tipo String. Intenta
 mostrarlas por pantalla todas juntas en la misma línea y con una sola sentencia
 de Java (con un solo println) ¿es posible?*/
public class Main {
    public static void main(String[] args) {
        //Var
        char c1 = 'A',
                c2 = 'B',
                c3 = 'C';
        String linea = "El abecedario empieza por: ";

        //Body
        System.out.println(linea + c1 + c2 + c3);
    }
}