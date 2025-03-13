/**Ejercicio 6 -
 Escribe un programa que calcule el total de una factura a partir de la base
 imponible (precio sin IVA). La base imponible estará almacenada en una
 variable.*/
public class Main {
    public static void main(String[] args) {
        //var
        double iva = 0.21;
        short total = 10;

        //body

        System.out.println("Base importe: "+ total +
                "\nTotal: "+ ((double)total+((double)total*iva)));
    }
}