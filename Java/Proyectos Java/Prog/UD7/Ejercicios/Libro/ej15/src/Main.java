import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <h1>Name.java</h1><hr>
 * <p>Esta clase represanta </p>
 *
 * <p>Ejercicio 15 <br>
 * Realiza una nueva versión del ejercicio anterior con las siguientes mejoras: Si
 * algún producto se repite en diferentes líneas, se deben agrupar en una sola.
 * Por ejemplo, si se pide primero 1 bote de tomate y luego 3 botes de tomate, en
 * el extracto se debe mostrar que se han pedido 4 botes de tomate. Después de
 * teclear “fin”, el programa pide un código de descuento. Si el usuario introduce
 * el código “ECODTO”, se aplica un 10% de descuento en la compra.</p>
 *
 *  <p>Ejemplo</p>
 *
 *  <pre>
 * Producto: tomate
 * Cantidad: 1
 * Producto: quinoa
 * Cantidad: 2
 * Producto: avena
 * Cantidad: 1
 * Producto: quinoa
 * Cantidad: 2
 * Producto: tomate
 * Cantidad: 2
 * Producto: fin
 * Introduzca código de descuento (INTRO si no tiene ninguno): ECODTO
 * Producto Precio Cantidad Subtotal
 * ---------------------------------
 * tomate 1,59 3 4,77
 * quinoa 4,50 4 18,00
 * avena 2,21 1 2,21
 * ---------------------------------
 * Descuento: 2,50
 * ---------------------------------
 * TOTAL: 22,48
 *  </pre>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 13-may-2024
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        String factura;
        boolean desc;

        HashMap<String, Float> productos;
        HashMap<String, Integer> compra;


        productos = meterDatos();

        compra = comprar(productos);

        desc = comprobarDescuento();

        factura = hacerFactura(productos, compra, desc);

        System.out.println(factura);

    }

    public static HashMap<String, Float> meterDatos(){

        HashMap<String, Float> productos = new HashMap<String, Float>();

        productos.put("avena", 2.21f);
        productos.put("garbanzos", 2.39f);
        productos.put("tomate", 1.59f);
        productos.put("jengibre", 3.13f);
        productos.put("quinoa", 4.5f);
        productos.put("guisantes", 1.60f);


        return productos;
    }

    public static HashMap<String, Integer> comprar(HashMap<String, Float> productos){
        String orden;
        int cantidad;
        HashMap<String, Integer> compra = new HashMap<String, Integer>();

        do {
            System.out.println("Introduce el nombre del producto que quieras comprar");
            orden = sc.nextLine();


            if (orden.equals("fin")){
                System.out.println("Fin de la compra");

                compra.put("fin", 0);

            } else if (comprobar(productos, orden)) {

                System.out.println("Cantidad: ");
                cantidad = sc.nextInt();

                compra.put(orden, cantidad);
                sc.nextLine(); //FFLUSH
            }


        }while (!orden.equals("fin"));


        return compra;
    }

    private static boolean comprobar(HashMap<String, Float> productos, String orden){

        boolean ret = false;

        for (Map.Entry<String, Float> aux : productos.entrySet()) {

            if (orden.equals(aux.getKey())) {
                ret = true;
                break;
            }
        }

        return ret;

    }

    public static String hacerFactura(HashMap<String, Float> productos, HashMap<String, Integer> compra, boolean desc){
        String ret = "";
        float total = 0, porProducto, descuento = 0;

        for (Map.Entry<String, Integer> aux : compra.entrySet()) {

            ret += "Producto: " + aux.getKey() + "\n";

            if(!aux.getKey().equals("fin"))
                ret += "Cantidad: " + aux.getValue() + "\n";


        }

        ret += "Producto Precio Cantidad Subtotal\n" +
                "---------------------------------\n";

        for (Map.Entry<String, Integer> aux : compra.entrySet()) {


            if(!aux.getKey().equals("fin")){

                porProducto = aux.getValue() * productos.get(aux.getKey());

                ret += aux.getKey() + " " + productos.get(aux.getKey()) +  " " + aux.getValue() + " " + porProducto + "\n";
                total += porProducto;

            }

        }


        if(desc){

            descuento = total / 10;

            ret += "---------------------------------\n" +
                    "Descuento: " + descuento + "\n";

        }


        ret += "---------------------------------\n" +
                "TOTAL: " + (total - descuento) + "\n";


        return ret;
    }

    public static boolean comprobarDescuento(){
        boolean desc = false;


        System.out.println("Introduzca código de descuento (INTRO si no tiene ninguno):");

        if (sc.nextLine().equals("ECODTO"))
            desc = true;


        return desc;
    }


}