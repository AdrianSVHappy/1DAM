/**Ejercicio 12 -
 Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
 con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
 convertir un entero en un carácter.*/
public class Main {
    public static void main(String[] args) {
//        Var
        char rand;
//        Body
        for (int i = 0; i < 1000000; i++) {
            rand = (char)(Math.random()*95+32);
            System.out.print(rand);
            if((i%100)==0)
                System.out.print("\n");
        }
    }
}