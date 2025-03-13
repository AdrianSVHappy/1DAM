import java.util.Scanner;

/**
 * <h1>Main.class</h1><hr>
 * <p>Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) para llevar el
 * control de los artículos de un almacén. De cada artículo se debe saber el código,
 * la descripción, el precio de compra, el precio de venta y el stock (número de
 * unidades). El menú del programa debe tener, al menos, las siguientes opciones: </p>
 *
 * <code>1. Listado
 * <br>2. Alta
 * <br>3. Baja
 * <br>4. Modificación
 * <br>5. Entrada de mercancía
 * <br>6. Salida de mercancía
 * <br>7. Salir</code>
 *
 * <p>La entrada y salida de mercancía supone respectivamente el incremento y
 * decremento de stock de un determinado artículo. Hay que controlar que no
 * se pueda sacar más mercancía de la que hay en el almacén.</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 09-abr-2024
 */
public class Main {

    private final static int ARTICULO = 5;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        Var
        int menu;


        Articulo[] art = new Articulo[ARTICULO];


//        Body
        do {
            System.out.println("\n\t\t-MENU- " +
                    "\n\t1. Listado " +
                    "\n\t2. Alta " +
                    "\n\t3. Baja " +
                    "\n\t4. Modificación " +
                    "\n\t5. Entrada de mercancía " +
                    "\n\t6. Salida de mercancía " +
                    "\n\t7. Salir");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("LISTADO");
                    listar(art);
                    break;
                case 2:
                    System.out.println("ALTA");
                    alta(art);
                    break;
                case 3:
                    System.out.println("BAJA");
                    baja(art);
                    break;
                case 4:
                    System.out.println("MODIFICACION");
                    modificar(art);
                    break;
                case 5:
                    System.out.println("ENTRADA");
                    entrada(art);
                    break;
                case 6:
                    System.out.println("SALIDA");
                    salida(art);
                    break;
                case 7:
                    System.out.println("SALIR");
                    break;
                case -1:
                    System.out.println("HAKER");
                    rand(art);
                    break;
                default:
            }
            System.out.println();
            System.out.println("Pulse intro para continuar...");
            sc.nextLine();
            sc.nextLine();
        }while (menu != 7);

    }

    /**
     * Lista los Articulos
     * @param art Vector de articulos
     */
    public static void listar(Articulo[] art){
        for (Articulo a : art) {
            if (a != null)
                System.out.println(a);
        }

    }

    /**
     * Da de alta un articulo
     * @param art Vector de articulos
     */
    public static void alta(Articulo[] art){

        String des;
        float com, ven;
        int cont = 0;

        sc.nextLine();
        System.out.println("Escribe la descripción del objeto");
        des = sc.nextLine();
        System.out.println("Escribe el precio de compra");
        com = sc.nextFloat();
        System.out.println("Escribe el precio de venta");
        ven = sc.nextFloat();

        for (Articulo a : art) {
            if (a == null)
                break;
            cont++;
        }

        art[cont] = new Articulo(des, com, ven);

    }

    /**
     * Da de baja un articulo
     * @param art Vector de articulos
     */
    public static void baja(Articulo[] art){
        int cont = 0;

        cont = buscar(art);

        if (cont != -1) {
            System.out.println("Eliminando " + art[cont]);
            art[cont] = null;
        }

        ordenar(art);

    }

    /**
     * Modifica un articulo existente
     * @param art Vector de articulos
     */
    public static void modificar(Articulo[] art){

        int id, cont = 0;
        String des;
        float com, ven;

        cont = buscar(art);

        if (cont != -1) {
            System.out.println("Modificando " + art[cont]);

            sc.nextLine();
            System.out.println("Escribe la descripción del objeto");
            des = sc.nextLine();
            System.out.println("Escribe el precio de compra");
            com = sc.nextFloat();
            System.out.println("Escribe el precio de venta");
            ven = sc.nextFloat();

            art[cont].modificar(des, com, ven);

        }


    }

    /**
     * Incrementa el stock de un articulo
     * @param art Vector de articulos
     */
    public static void entrada(Articulo[] art){
        int cont;

        cont = buscar(art);

        if (cont != -1) {
            System.out.println("Entrada de " + art[cont].getDescripcion());
            System.out.println("Cuanto va a entrar:");
            art[cont].entrada(sc.nextInt());
        }

    }

    /**
     * Decrementa el stock de un articulo
     * @param art Vector de articulos
     */
    public static void salida(Articulo[] art){
        int cont;

        cont = buscar(art);

        if (cont != -1) {
            System.out.println("Salida de " + art[cont].getDescripcion());
            System.out.println("Cuanto va a salir:");
            art[cont].salida(sc.nextInt());
        }
    }

    /**
     * Ordena un vector de Articulos
     * @param art Vector de articulos
     */
    private static void ordenar(Articulo[] art){

        Articulo[] aux = new Articulo[ARTICULO];
        int cont = 0;

        for (Articulo a : art) {
            if (a != null){
                aux[cont] = a;
                cont++;
            }
        }

        System.arraycopy(aux, 0, art, 0, ARTICULO);
    }

    /**
     * Busca un articulo en el vector
     * @param art Vector de articulos
     * @return (INT) La posición del articulo en el vector
     */
    private static int buscar(Articulo[] art){
        int id, cont = 0;

        System.out.println("Ingrese el id del articulo");
        id = sc.nextInt();


        for (Articulo a : art) {
            if(a == null){
                cont = -1;
                break;
            }

            if (id == a.getCodigo())
                break;

            cont++;
        }


        if ((cont >= ARTICULO) || cont == -1 || (art[cont] == null )) {
            System.out.println("No existe el articulo");
            cont = -1;
        }

        return cont;
    }

    private static void rand(Articulo[] art){

        int id = 0, cont;

        do {
            cont = 0;
            for (Articulo a : art) {
                if (a == null)
                    break;
                cont++;
            }

            if (cont < ARTICULO) {
                art[cont] = new Articulo(("Blanco-" + id), 50, 50);
                art[cont].entrada(50);
            }
            id++;
        } while (cont < ARTICULO);

    }

}