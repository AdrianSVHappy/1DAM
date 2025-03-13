import java.util.Scanner;

/**
 * <h1>Main.java</h1><hr>
 * <p>Genera un array de gatos y crea un menu para ponerlos a pelear, los gatos muertos se colocan al fondo del array automaticamente, las opciones del menú serán: Crear, pelear, mostrar y salir</p>
 *
 * @Author: Adrián Suárez Valdayo.
 * @Version: 05-04-2024
 */
public class Main {

//    Const
    private final static int GATOS = 5;
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

//        Var
        int op, total;
        Gato[] gatitos = new Gato[GATOS];

        do {
            op = scan.nextInt();

            switch (op){
                case 1:
                    System.out.println("1.- Nuevo gatito.");
                    crea(gatitos);

                    break;
                case 2:
                    System.out.println("2.- Pelea peleaa");
                    peleaContra(gatitos);
                    break;
                case 3:
                    System.out.println("3.- Lista de gatitos");
                    mostrar(gatitos);
                    break;
                case 4:
                    break;
                default:
            }


        }while (op != 4);

    }

    private static void crea(Gato[] vec){
        Gato res;
        String nom;
        int edad;
        Sexo sex;
        if(Gato.contar(vec) < vec.length){
            System.out.println("Nombre");
            scan.nextLine();
            nom = scan.nextLine();


            if (!nom.equals("-1")) {
                System.out.println("Edad");
                edad = scan.nextInt();

                System.out.println("Sexo (M-0/F-1)");
                if (scan.nextInt() == 1)
                    sex = Sexo.HEMBRA;
                else
                    sex = Sexo.MACHO;

                vec[Gato.contar(vec)] = new Gato(nom, edad, sex);
            } else {
                vec[Gato.contar(vec)] = new Gato(null, 0, null);
                vec[Gato.contar(vec) - 1].rand();
            }
        }
        else
            System.out.println("ya no caben más gatitos");
    }

    private static void peleaContra(Gato[] vec){
        int prota, contra;
        boolean noPasa;

        if (Gato.contar(vec)<2)
            System.out.println("Necesitas más gatitos");
        else {
            do {
                noPasa = false;
                System.out.println("Va a pelear el gato:");
                prota = scan.nextInt();
                System.out.println("Contra el gato");
                contra = scan.nextInt();
                if (prota > Gato.contar(vec) || contra > Gato.contar(vec) || contra == prota){
                    noPasa = true;
                    System.out.println("Debes usar distintos gatitos de la lista");
                }
            }while (noPasa);

            if (vec[prota].getSexo() != vec[contra].getSexo())
                System.out.println("Machismooo!");
            else {
                if(((int)(Math.random()*2))==1) {
                    vec[prota] = null;
                    System.out.println("El ganador ha sido: " + vec[contra].getNombre());
                }else {
                    vec[contra] = null;
                    System.out.println("El ganador ha sido: " + vec[prota].getNombre());
                }
            }
        }
        Gato.ordenar2(vec);
    }

    private static void mostrar(Gato[] vec){

        int cont = 0;

        for (Gato aux : vec){
            System.out.println(aux);
        }

    }

}