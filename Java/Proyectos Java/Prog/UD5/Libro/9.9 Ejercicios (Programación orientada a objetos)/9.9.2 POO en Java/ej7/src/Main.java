import zonas.Zona;

import java.util.Scanner;

/**
 * <h1>Ejercicio 7</h1>
 * <p>Queremos gestionar la venta de entradas (no numeradas) de Expocoches
 * Campanillas que tiene 3 zonas, la sala principal con 1000 entradas disponibles,
 * la zona de compra-venta con 200 entradas disponibles y la zona vip
 * con 25 entradas disponibles. Hay que controlar que existen entradas antes de
 * venderlas.</p>
 * <p>El menú del programa debe ser el que se muestra a continuación. Cuando
 * elegimos la opción 2, se nos debe preguntar para qué zona queremos las
 * entradas y cuántas queremos. Lógicamente, el programa debe controlar que
 * no se puedan vender más entradas de la cuenta.</p>
 * */
public class Main {
    public static void main(String[] args) {
//        Var

        Zona principal = new Zona(1000), compraVenta = new Zona(200), vip = new Zona(25);
        int op, cantidad;
        Scanner sn = new Scanner(System.in);

//        Body


        do {
            System.out.println("\n1. Mostrar número de entradas libres\n2. Vender entradas \n3. Salir");
            op = sn.nextInt();


            switch (op){
                case 1:

                    System.out.println("\nEntradas libres:\nSala principal: "+principal.getEntradasPorVender()+
                            "\nZona de compra-venta: "+compraVenta.getEntradasPorVender()+"\nZona VIP: "+vip.getEntradasPorVender());

                    break;
                case 2:

                    System.out.println("\nZona:\n1.-Sala principal\n2.-Compra-Venta\n3.-VIP");
                    op = sn.nextInt();
                    System.out.println("\nNúmero de entras:");
                    cantidad = sn.nextInt();
                    switch (op){
                        case 1:
                            principal.vender(cantidad);
                            break;
                        case 2:
                            compraVenta.vender(cantidad);
                            break;
                        case 3:
                            vip.vender(cantidad);
                            break;
                        default:
                            System.out.println("\nZona no valida.");
                    }

                    break;
                case 3:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }

        }while (op!=3);


    }
}