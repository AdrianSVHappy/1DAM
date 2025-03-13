import cuadroPack.Cristal;
import cuadroPack.Cuadro;
import cuadroPack.Lamina;
import cuadroPack.Marco;

import java.util.Scanner;

/**
 * <h1>GestionaExposición.java</h1><hr>
 * <p>Esta clase represanta el main del programa</p>
 * <p>Ejercicio 3: A partir de la case del siguiente diagrama de clases, construir un programa en Java, creando las clases e implementando los métodos necesarios, para que una sala de exposiciones registre los cuadros. Debe permitir dar de alta cuadros con todos sus datos, así como gestionar si un libro está a la venta o no, y cambiar el propietario en caso de que se haya vendido. (Se recomienda que el método main se incluya en la clase “GestionaExposición”)</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 17-abr-2024
 */

/*
* TODO:
*  - Menú
* */

public class GestionaExposición {

    static Scanner sc = new Scanner(System.in);
    static final String EXPO = "Loubre";
    static final int N = 5;

    public static void main(String[] args) {
        Cuadro[] cuadros = new Cuadro[N];

        cuadros[siguienteNull(cuadros)] = new Cuadro(EXPO, 17.4f , new Marco("Barroco", 37), new Cristal("Marron", 2), new Lamina("Oda", "Barroco"));
        cuadros[siguienteNull(cuadros)] = new Cuadro(EXPO, 17.4f , new Marco("Barroco", 37), new Cristal("Marron", 2), new Lamina("Oda", "Barroco"));
        cuadros[siguienteNull(cuadros)] = new Cuadro(EXPO, 17.4f , new Marco("Barroco", 37), new Cristal("Marron", 2), new Lamina("Oda", "Barroco"));

        mostrarCuadro(cuadros);

        cambiarEstado(cuadros);

        mostrarCuadro(cuadros);

        venderCuadro(cuadros);

        mostrarCuadro(cuadros);

    }

    static private int siguienteNull(Object[] aux){
        int cont = 0;

        for (Object a : aux){
            if (a == null)
                break;
            cont ++;
        }

        return cont;
    }

    static private int buscarCuadro(Cuadro[] cuadros, String id){
        int pos = 0;

        for (Cuadro c : cuadros){

            if (c == null) {
                pos = -1;
                break;
            }

            if (c.getLamina().getId().equals(id))
                break;

            pos ++;
        }

        if (pos >= cuadros.length)
            pos = -1;

        return pos;

    }

    static private void fflush() {
        sc.nextLine();
    }

    static void altaCuadro(Cuadro[] cuadros) {

        float precio;
        String tipoM, color, autor, tipoP;
        int grosorM, grosorC;

        System.out.println("Establece el precio del cuadro");
        precio = sc.nextFloat();

        fflush();
        System.out.println("Datos del marco:\nTipo:");
        tipoM = sc.nextLine();
        System.out.println("Grosor:");
        grosorM = sc.nextInt();

        fflush();
        System.out.println("Datos del cristal:\nColor:");
        color = sc.nextLine();
        System.out.println("Grosor:");
        grosorC = sc.nextInt();

        fflush();
        System.out.println("Datos de la lamina:\nAutor:");
        autor = sc.nextLine();
        System.out.println("Tipo:");
        tipoP = sc.nextLine();

        cuadros[siguienteNull(cuadros)] = new Cuadro(EXPO, precio, new Marco(tipoM, grosorM), new Cristal(color, grosorC), new Lamina(autor, tipoP));

    }

    static void mostrarCuadro(Cuadro[] cuadros) {

        System.out.println("A la venta");
        for (Cuadro c : cuadros) {

            if (c == null)
                break;

            if (c.isAlaVenta())
                System.out.println(c);

        }

        System.out.println("No disponibles");
        for (Cuadro c : cuadros) {

            if (c == null)
                break;

            if (!c.isAlaVenta())
                System.out.println(c);

        }

    }

    static void cambiarEstado(Cuadro[] cuadros) {
        String id;

        System.out.println("Introduzca el id del cuadro");
        id = sc.nextLine();

        if(buscarCuadro(cuadros, id) != -1)
            cuadros[buscarCuadro(cuadros, id)].cambiarEstado();
        else
            System.out.println("No existe el cuadro");

    }

    static void venderCuadro(Cuadro[] cuadros) {

        String nuevo, id;

        System.out.println("Introduzca el id del cuadro");
        id = sc.nextLine();

        if(buscarCuadro(cuadros, id) == -1){
            System.out.println("El cuadro no existe");
        }else {
            System.out.println("Introduzca el nombre del comprador");
            nuevo = sc.nextLine();

            if(cuadros[buscarCuadro(cuadros, id)].vender(nuevo)){
                System.out.println("Compra realizada con exito" +
                        "\nPrecio: "+ cuadros[buscarCuadro(cuadros, id)].getPrecio() +"€");

            }else
                System.out.println("Ese cuadro no está a la venta");
        }





    }

}