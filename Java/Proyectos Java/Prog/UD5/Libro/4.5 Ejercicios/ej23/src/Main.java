import java.util.Scanner;

/**Ejercicio 23 -
 Escribe un programa que calcule el precio final de un producto según su
 base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
 reducido o superreducido) y el código promocional. Los tipos de IVA general,
 reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
 promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si*/
public class Main {
    public static void main(String[] args) {
//        Var
        Scanner sn = new Scanner(System.in);
        double introducido, iva, promo, total;
        short opIva, opPromo;

//        Body
        System.out.println("Introduce el precio del producto: ");
        introducido = sn.nextDouble();

        System.out.println("Introduzca el tipo de IVA (1-general, 2-reducido o 3-superreducido): ");
        opIva = sn.nextShort();

        System.out.println("Introduzca el código promocional (1-nopro, 2-mitad, 3-meno5 o 4-5porc)");
        opPromo = sn.nextShort();

        total = introducido;
        System.out.printf("\nBase imponible\t\t%.2f", total);

        switch (opIva){
            case 2:
                iva = 0.1*introducido;
                System.out.printf("\nIVA (10%%)\t\t\t%.2f", iva);
                break;
            case 3:
                iva = 0.04*introducido;
                System.out.printf("\nIVA (4%%)\t\t\t%.2f", iva);
                break;
            default:
                iva = 0.21*introducido;
                System.out.printf("\nIVA (21%%)\t\t\t%.2f", iva);
                break;
        }

        total +=iva;
        System.out.printf("\nPrecio con IVA\t\t%.2f", total);

        switch (opPromo){
            case 2:
                promo = total/2;
                System.out.printf("\nCód. promo. (mitad)\t-%.2f", promo);
                break;
            case 3:
                promo = 5;
                System.out.printf("\nCód. promo. (meno5)\t-%.2f", promo);
                break;
            case 4:
                promo = total*0.05;
                System.out.printf("\nCód. promo. (5porc)\t-%.2f", promo);
                break;
            default:
                promo = 0;
                System.out.printf("\nCód. promo. (nopro)\t%.2f", promo);

        }

        total -= promo;

        System.out.printf("\nTOTAL\t\t\t\t%.2f", total);

    }
}