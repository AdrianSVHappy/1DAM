import java.util.Scanner;

/**
 * <h1>GestionaBiblioteca.java</h1><hr>
 * <p>Ejercicio 2: A partir de la case del siguiente diagrama de clases, construir un programa en Java, creando las clases e implementando los métodos necesarios, para una biblioteca. Debe permitir dar de alta libros con todos sus datos, así como registrar los préstamos y las devoluciones. (Se recomienda que el método main se incluya en la clase “GestionaBiblioteca”)</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 15-abr-2024
 */
public class GestionaBiblioteca {

    static Scanner sc = new Scanner(System.in);
    static final String ISBN = "0123456789";
    static final String EDITO = "Akira Comics";

    public static void main(String[] args) {

//        Var
        Biblioteca bibli;
        int menu;

//        Body

        System.out.println("Establece el nombre de la biblioteca");
        bibli = new Biblioteca(sc.nextLine());

        do {
            System.out.println("\t1.-Gestionar socios" +
                    "\n\t2.-Gestionar libros" +
                    "\n\t3.-Salir");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("GESTIONAR SOCIOS");
                    gestionarSocios(bibli);
                    break;
                case 2:
                    System.out.println("GESTIONAR LIBROS");
                    gestionarLibros(bibli);
                    break;
                case 3:
                    sc.nextLine();
                    break;
                default:
            }
            pausar();

        }while (menu != 3);
    }

    static void pausar(){
        System.out.println("Pulse para continuar...");
        sc.nextLine();
    }

//    Funciones para la gestion de socios
    static void gestionarSocios(Biblioteca bibli) {
        int menu;

        do {
            bibli.mostrarSocios();

            System.out.println("\t1.-Alta socios" +
                    "\t2.-Baja socios" +
                    "\t3.-Atras");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {

                case 1:
                    System.out.println("ALTA SOCIOS");
                    altaSocios(bibli);
                    break;
                case 2:
                    System.out.println("BAJA SOCIOS");
                    bajaSocios(bibli);
                    break;
                case 3:
                    break;
                default:
            }

            if (menu != 3)
                pausar();

        }while (menu != 3);

    }

    private static void altaSocios(Biblioteca bibli) {
        int menu;

        System.out.println("\t1.- Nuevo socio\t2.- Antiguo socio");
        menu = sc.nextInt();
        sc.nextLine();
        if (menu != 2)
            altaNuevoSocios(bibli);
        else
            altaViejoSocio(bibli);


    }

    private static void altaNuevoSocios(Biblioteca bibli) {
        String dni, nombre;
        boolean existe;

        do {
            existe = false;
            System.out.println("Introduce el dni");
            dni = sc.nextLine();
            if (bibli.obtenerSocio(dni) != -1) {
                existe = true;
                System.out.println("El dni (" + dni + ") ya existe.");
            }

        }while (existe);

        System.out.println("Introduce el nombre");
        nombre = sc.nextLine();

        bibli.altaSocio(new Socio(dni, nombre));
    }

    private static void altaViejoSocio(Biblioteca bibli) {
        String dni;
        boolean nExiste;

        do {
            nExiste = false;
            System.out.println("Introduce el dni");
            dni = sc.nextLine();
            if (bibli.obtenerSocio(dni) == -1) {
                nExiste = true;
                System.out.println("El dni (" + dni + ") no está registrado.");
            }else if(bibli.getSocios()[bibli.obtenerSocio(dni)].getFechaBaja().equals("")){
                nExiste = true;
                System.out.println("El dni (" + dni + ") ya está dado de alta");
            }
        }while (nExiste);

        bibli.altaSocio(bibli.obtenerSocio(dni));
    }

    private static void bajaSocios(Biblioteca bibli) {
        String dni;
        boolean nExiste;

        do {
            nExiste = false;
            System.out.println("Introduce el dni");
            dni = sc.nextLine();
            if (bibli.obtenerSocio(dni) == -1) {
                nExiste = true;
                System.out.println("El dni (" + dni + ") no existe.");
            }
        }while (nExiste);

        bibli.bajaSocio(bibli.obtenerSocio(dni));
    }

//    Funciones para la gestion de libros
    static void gestionarLibros(Biblioteca bibli) {
        int menu;

        do {
            bibli.mostrarLibros();

            System.out.println("\t1.- Alta libros" +
                    "\t2.- Baja libros" +
                    "\t3.- Prestar" +
                    "\t4.- Devolver" +
                    "\t5.- Atras");

            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {

                case 1:
                    System.out.println("ALTA LIBROS");
                    altaLibros(bibli);
                    break;
                case 2:
                    System.out.println("BAJA LIBROS");
                    bajaLibros(bibli);
                    break;
                case 3:
                    System.out.println("PRESTAR LIBRO");
                    prestarLibros(bibli);
                    break;
                case 4:
                    System.out.println("DEVOLVER LIBRO");
                    devolverLibros(bibli);
                default:
            }

            if (menu != 5)
                pausar();

        }while (menu != 5);

    }

    private static void altaLibros(Biblioteca bibli) {
        int cod;
        String titulo;
        boolean existe;

        do {
            existe = false;

            System.out.println("Introduce el codigo del libro");
            cod = sc.nextInt();
            sc.nextLine(); //FFLUSH

            if (bibli.obtenerLibro(cod) != -1) {
                existe = true;
                System.out.println("El libro (" + cod + ") ya existe.");
            }

        }while (existe);

        System.out.println("Escribe el titulo");
        titulo = sc.nextLine();

        bibli.altaLibro(new Libro(cod, ISBN, titulo, EDITO));
    }

    private static void bajaLibros(Biblioteca bibli) {
        int cod;
        boolean nExiste;

        do {
            nExiste = false;

            System.out.println("Introduce el codigo del libro");
            cod = sc.nextInt();
            sc.nextLine(); //FFLUSH

            if (bibli.obtenerLibro(cod) == -1) {
                nExiste = true;
                System.out.println("El libro (" + cod + ") no existe.");
            }

        }while (nExiste);

        bibli.bajaLibro(bibli.obtenerLibro(cod));
    }

    private static void prestarLibros(Biblioteca bibli) {
        int cod;
        String dni;
        boolean existen = false;

        for (Libro aux : bibli.getLibros()) {
            if (aux == null)
                break;
            if (aux.getDniSocio().equals("")){
                existen = true;
                break;
            }
        }

        if (!existen)
            System.out.println("No hay libros disponibles");
        else {

            do {
                existen = false;
                System.out.println("Introduce el id del libro");
                cod = sc.nextInt();

                if(bibli.obtenerLibro(cod) == -1){
                    existen = true;
                    System.out.println("El libro (" + cod + ") no existe.");
                }else if (bibli.getLibros()[bibli.obtenerLibro(cod)].isPrestado()){
                    existen = true;
                    System.out.println("El libro (" + cod + ") ya lo han prestado.");
                }
            }while(existen);

            System.out.println(bibli.getLibros()[bibli.obtenerLibro(cod)]);
            System.out.println("\nSOCIOS:");
            bibli.mostrarSocios();

            do {
                existen = false;
                sc.nextLine();//FFLUSH
                System.out.println("Introduce el dni del socio");
                dni = sc.nextLine();

                if(bibli.obtenerSocio(dni) == -1){
                    existen = true;
                    System.out.println("El socio (" + dni + ") no existe.");
                }else if (!bibli.getSocios()[bibli.obtenerSocio(dni)].getFechaBaja().equals("")){
                    existen = true;
                    System.out.println("El socio (" + dni + ") está dado de baja.");
                }

            }while(existen);

            System.out.println(bibli.getSocios()[bibli.obtenerSocio(dni)]);

            bibli.prestarLibro(bibli.obtenerSocio(dni), bibli.obtenerLibro(cod));
        }


    }

    private static void devolverLibros(Biblioteca bibli) {
        int cod;
        boolean repetir;

        do {
            repetir = false;
            sc.nextLine();//FFLUSH
            System.out.println("Introduce el codigo del libro");
            cod = sc.nextInt();

            if(bibli.obtenerLibro(cod) == -1){
                repetir = true;
                System.out.println("El libro (" + cod + ") no existe.");
            }else if(!bibli.getLibros()[bibli.obtenerLibro(cod)].isPrestado()){
                repetir = true;
                System.out.println("El libro (" + cod + ") ya está en la biblioteca.");
            }

        }while (repetir);

        bibli.devolverLibro(bibli.obtenerLibro(cod));

    }
}