/**Ejercicio 9 -
 Realiza un programa que vaya generando números aleatorios pares entre 0
 y 100 y que no termine de generar números hasta que no saque el 24. El
 programa deberá decir al final cuántos números se han generado.*/
public class Main {
    public static void main(String[] args) {
//        Var
        int rand, cant=0;
//        Body
        do {
            rand = (int)(Math.random()*101);
            cant++;
            System.out.println(rand+" ");

        }while (rand != 24);
        System.out.println("\nNúmeros generados: "+cant);
    }
}