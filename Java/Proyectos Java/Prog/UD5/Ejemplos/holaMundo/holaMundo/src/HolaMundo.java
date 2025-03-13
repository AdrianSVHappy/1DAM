import java.util.*;

/**
 * Importamos nuestros paquetes propios (linea-261)
 * */
import matematicas.Varias;
import matematicas.Geometria;
import Excepciones.ExcepcionAlturaFueraDeRango;

/**
 *  Ejemplo primeros programas en Java
*/
public class HolaMundo {
    public static void main(String[] args) {

        /**
         *  Mostramos el mensaje por consola
         */
        //System.out.println("¡Hola mundo!");

        /**
         * Pedimos datos por consola
         *//*
        String nombre;
        System.out.print("Por favor, dime cómo te llamas: ");
        nombre = System.console().readLine();
        System.out.println("\nHola "+ nombre +", ¡encantado de conocerte!");
        */
        /**
         *Pedimos datos por teclado con SCANNER (javaUtils)
         *//*

        Scanner sn = new Scanner(System.in);

        int num;
        double numDouble;
        String cadena;
        boolean booleano;

        /**Integer*//*
        System.out.println("Escribe un número entero: ");
        num = sn.nextInt();
        System.out.println("El número entero escrito ha sido "+num);

        /**Double*//*
        System.out.println("Escribe un número decimal: ");
        numDouble = sn.nextDouble();
        System.out.println("El número decimal escrito ha sido "+numDouble);

        /**String*//*
        System.out.println("Escribe una cadena: ");
        cadena = sn.next();
        System.out.println("La cadena escrita  ha sido "+cadena);

        /**Boolean*//*
        System.out.println("Escribe un booleano: ");
        booleano = sn.nextBoolean();
        System.out.println("El booleano escrito ha sido "+booleano);
        */


        /**
         *  Usamos la salida estándar
         *//*
        Scanner myObj = new Scanner(System.in);

        System.out.println("Introduce nombre, edad y salario:");

        //String input
        String name = myObj.nextLine();

        //Numerical input
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        //Out input by user
        System.out.println("Nombre: "+name+"\nEdad: "+age+"\nSalario: "+salary);
        */

        /**
         * Lectura de números, pasar un string a integer ("12" -> 12)
         *//*

        Scanner sn = new Scanner(System.in);
        String linea;
        int primerNumero, segundoNumero, total;

        System.out.print("Por favor, introduce un número: ");
        linea = sn.nextLine();

        primerNumero = Integer.parseInt(linea);

        System.out.print("introduce otro, por favor: ");
        linea = sn.nextLine();

        segundoNumero = Integer.parseInt(linea);

        total = (2 * primerNumero) + segundoNumero;

        System.out.println("El primer número introducido es "+primerNumero+" y el segundo es "+segundoNumero);
        System.out.print("El doble del primer número más el segundo es "+total);
        */

        /**Salida formateada y colores*//*

        System.out.printf("El número %d no tiene decimales.\n", 21);
        System.out.printf("El número %f sale con decimales.\n", 21.0);
        System.out.printf("El %.3f sale exactamente con 3 decimales.\n", 21.003);

        System.out.println("┌────────┬───────────┬────────┬────────────────┐");
        System.out.println("│ Código │ Color │ Código │ Color │");
        System.out.println("├────────┼───────────┼────────┼────────────────┤");
        System.out.print("│ 30 │\033[30m negro \033[39;49m │");
        System.out.println(" 90 │\033[90m negro claro \033[39;49m │");
        System.out.print("│ 31 │\033[31m rojo \033[39;49m │");
        System.out.println(" 91 │\033[91m rojo claro \033[39;49m │");
        System.out.print("│ 32 │\033[32m verde \033[39;49m │");
        System.out.println(" 92 │\033[92m verde claro \033[39;49m │");
        System.out.print("│ 33 │\033[33m amarillo \033[39;49m │");
        System.out.println(" 93 │\033[93m amarillo claro \033[39;49m│");
        System.out.print("│ 34 │\033[34m azul \033[39;49m │");
        System.out.println(" 94 │\033[94m azul claro \033[39;49m │");
        System.out.print("│ 35 │\033[35m morado \033[39;49m │");
        System.out.println(" 95 │\033[95m morado claro \033[39;49m │");
        System.out.print("│ 36 │\033[36m cian \033[39;49m │");
        System.out.println(" 96 │\033[96m cian claro \033[39;49m │");
        System.out.print("│ 37 │\033[37m blanco \033[39;49m │");
        System.out.println(" 97 │\033[97m blanco claro \033[39;49m │");
        System.out.println("└────────┴───────────┴────────┴────────────────┘");

        /*
        int ala = -10;

        System.out.println(" Artículo Precio/caja Nº cajas");
        System.out.println("-----------------------------------------");
        System.out.printf("%"+ala+"s %8.2f %6d\n", "1234567890", 4.5, 10); //se pueden usar variables
        System.out.printf("%10s %8.2f %6d\n", "peras", 2.75, 120);
        System.out.printf("%-10s %8.2f %6d\n", "aguacates", 10.0, 6);
/

        /**Variables
         * (char)*//*

        char letra1 = 'c';
        char letra2 = 'a';
        char letra3 = 's';
        char letra4 = 'a';
        System.out.println("letra1: " + letra1);
        System.out.println("letra3: " + letra3);
        System.out.println("todas las letras juntas: " + letra1 + letra2 + letra3 + letra4);
*/


        /**Ejemplo libro (P28) - Lectura por teclado*//*

        Scanner s = new Scanner(System.in);
        System.out.print("Introduce tu nombre y tu edad separados por un espacio: ");
        String nombre = s.next();
        int edad = s.nextInt();
        System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);
*/

        /** 4.1 Sentencia if
         * Vamos a ver otro ejemplo, esta vez con números. El usuario introducirá un número por
         * teclado y el programa dirá si se trata de un número positivo o negativo.*/
/*
        //Var
        Scanner sn = new Scanner(System.in);
        int x;

        //Body
        System.out.print("Por favor, introduce un número entero: ");
        String linea = sn.next();
        x = Integer.parseInt( linea );
        if (x < 0) {
            System.out.println("El número introducido es negativo.");
        } else {
            System.out.println("El número introducido es positivo.");
        }
*/
        /**4.4 Sentencia switch (selección múltiple)
         * La sentencia switch se utiliza con frecuencia para crear menús.*/
/*

        //Var
        Scanner sn = new Scanner(System.in);
        int opcion;
        double lado;
        double base;
        double altura;

        //Body

        System.out.println(" CÁLCULO DE ÁREAS");
        System.out.println(" ----------------");
        System.out.println(" 1. Cuadrado");
        System.out.println(" 2. Rectángulo");
        System.out.println(" 3. Triángulo");
        System.out.print("\n Elija una opción (1-3): ");
        opcion = Integer.parseInt(sn.next());

        switch (opcion) {
            case 1:
                System.out.print("\nIntroduzca el lado del cuadrado en cm: ");
                lado = Double.parseDouble(sn.next());
                System.out.println("\nEl área del cuadrado es " + (lado * lado) + " cm2");
                break;
            case 2:
                System.out.print("\nIntroduzca la base del rectángulo en cm: ");
                base = Double.parseDouble(sn.next());
                System.out.print("Introduzca la altura del rectángulo en cm: ");
                altura = Double.parseDouble(sn.next());
                System.out.println("El área del rectángulo es " + (base * altura) + " cm2");
                break;
            case 3:
                System.out.print("\nIntroduzca la base del triángulo en cm: ");
                base = Double.parseDouble(sn.next());
                System.out.print("Introduzca la altura del triángulo en cm: ");
                altura = Double.parseDouble(sn.next());
                System.out.println("El área del triángulo es " + ((base * altura) / 2) + " cm2");
                break;
            default:
                System.out.print("\nLo siento, la opción elegida no es correcta.");
        }
*/
        /**6.1.- Números aleatorios (P-111)*//*
        System.out.println("20 números aleatorios entre 0 y 9 (sin decimales):");
        for (int i = 1; i <= 20; i++) {
            System.out.print((int)(Math.random()*10) + " ");
        }
        System.out.println();
*/
        /**6.1.- Números aleatorios (P-112)*//*
        System.out.println("20 números aleatorios entre 50 y 60 (sin decimales):");
        for (int i = 1; i <= 20; i++) {
            System.out.print(((int)(Math.random()*11) + 50 ) + " ");
        }
*/

        /**6.2 Generación de palabras de forma aleatoria de
         un conjunto dado (P-113)*//*
        System.out.println("Genera al azar piedra, papel o tijera:");
        int mano = (int)(Math.random()*3); // genera un número al azar
        // entre 0 y 2 ambos incluidos
        switch(mano) {
            case 0:
                System.out.println("piedra");
                break;
            case 1:
                System.out.println("papel");
                break;
            case 2:
                System.out.println("tijera");
                break;
            default:
        }
*/
        /**7.Array(P-128)*/

        /**
         * 8.3 Creación de bibliotecas de rutinas mediante paquetes (P-138)
         */

       /* int n;

        Scanner sn = new Scanner(System.in);
// Prueba esPrimo()
        System.out.print("Introduzca un número entero positivo: ");
        n = Integer.parseInt(sn.next());
        if (Varias.esPrimo(n)) {
            System.out.println("El " + n + " es primo.");
        } else {
            System.out.println("El " + n + " no es primo.");
        }
// Prueba digitos()
        System.out.print("Introduzca un número entero positivo: ");
        n = Integer.parseInt(sn.next());
        System.out.println(n + " tiene " + matematicas.Varias.digitos(n) + " dígitos.");
// Prueba volumenCilindro()
        double r, h;
        System.out.println("Cálculo del volumen de un cilindro");
        System.out.print("Introduzca el radio en metros: ");
        r = Double.parseDouble(sn.next());
        System.out.print("Introduzca la altura en metros: ");
        h = Double.parseDouble(sn.next());
        System.out.println("El volumen del cilindro es " + Geometria.volumenCilindro(r, h) + " m3");*/

        /*
        * 9.Programación orientada a objetos.
        * */


        /*Arraylist*/
        /*
        ArrayList<String> a = new ArrayList<String>(4);


        System.out.println("Nº de elementos: " + a.size());
        a.add("rojo");
        a.add("verde");
        a.add("azul");
        System.out.println("Nº de elementos: " + a.size());
        a.add("blanco");
        System.out.println("Nº de elementos: " + a.size());
        System.out.println("El elemento que hay en la posición 0 es " + a.get(0));
        System.out.println("El elemento que hay en la posición 3 es " + a.get(3));
        */


        /*10.2 Diccionarios: la clase HashMap*/

        /*HashMap<Integer, String> m = new HashMap<Integer, String>();

        Set<String> h = new HashSet<String>();

        m.put(924, "Amalia Núñez");
        m.put(921, "Cindy Nero");
        m.put(700, "César Vázquez");
        m.put(219, "Víctor Tilla");
        m.put(537, "Alan Brito");
        m.put(605, "Esteban Quito ");
        System.out.println("Los elementos de m son: \n" + m);

        System.out.println(m.keySet());

        for (HashMap.Entry pareja: m.entrySet()) {
            System.out.println(pareja.getKey());
        }*/


        /*14.CONTROL DE EXCEPCIONES*/

        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la altura de la pirámide (un número entre 1 y 10): ");
        int h = Integer.parseInt(s.nextLine());
        try {
            pintaPiramide(h);
        } catch (ExcepcionAlturaFueraDeRango eafr) {
            System.out.println("No se ha podido pintar la pirámide.");
        }


    }


    /**
     * 14.CONTROL DE EXCEPCIONES
     * @param h altura
     * @throws ExcepcionAlturaFueraDeRango
     */
    public static void pintaPiramide(int h) throws ExcepcionAlturaFueraDeRango {

        if ((h < 1) || (h > 10)) {
            throw new ExcepcionAlturaFueraDeRango();
        }

        int planta = 1;
        int longitudDeLinea = 1;
        int espacios = h - 1;
        while (planta <= h) {
        // inserta espacios
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }
        // pinta la línea
            for (int i = 1; i <= longitudDeLinea; i++) {
                System.out.print("*");
            }
            System.out.println();
            planta++;
            espacios--;
            longitudDeLinea += 2;
        }
    }
}