/**Ejercicio 5 -
 Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
 convertir deberá estar almacenada en una variable.*/
public class Main {
    public static void main(String[] args) {
        //Variables
        double cambio = 166.386;
        short pes = 1500;

        //Cuerpo

        System.out.println(pes +" Pesetas  son "+ ((double)pes/cambio) +"€");
    }
}