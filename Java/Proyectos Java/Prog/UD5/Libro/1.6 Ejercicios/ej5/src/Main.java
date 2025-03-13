/**
 * EJ5  -   Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura
 * de un color diferente.
 */

public class Main {
    public static void main(String[] args) {


            System.out.printf(  "| %d:%d |\033[31m %-5s \033[39;49m|\033[32m %-5s \033[39;49m|\033[93m %-5s \033[39;49m|\033[31m %-5s \033[39;49m|\033[35m %-5s \033[39;49m|\n" +
                                "| %d:%d |\033[31m %-5s \033[39;49m|\033[96m %-5s \033[39;49m|\033[93m %-5s \033[39;49m|\033[31m %-5s \033[39;49m|\033[93m %-5s \033[39;49m|\n" +
                                "| %d:%d |\033[34m %-5s \033[39;49m|\033[96m %-5s \033[39;49m|\033[96m %-5s \033[39;49m|\033[93m %-5s \033[39;49m|\033[93m %-5s \033[39;49m|\n" +
                                "| %d:%d |\033[34m %-5s \033[39;49m|\033[96m %-5s \033[39;49m|\033[96m %-5s \033[39;49m|\033[93m %-5s \033[39;49m|\033[96m %-5s \033[39;49m|\n" +
                                "| %d:%d |\033[32m %-5s \033[39;49m|\033[34m %-5s \033[39;49m|\033[34m %-5s \033[39;49m|\033[35m %-5s \033[39;49m|\033[96m %-5s \033[39;49m|\n" +
                                "| %d:%d |\033[32m %-5s \033[39;49m|\033[34m %-5s \033[39;49m|\033[34m %-5s \033[39;49m|\033[35m %-5s \033[39;49m|\033[96m %-5s \033[39;49m|\n",
                                15, 15 ,"LMSI", "EntDE", "SI", "LMSI", "FOL",
                                16, 15, "LMSI", "PROG", "SI", "LMSI", "SI",
                                17, 15, "BBDD", "PROG", "PROG", "SI", "SI",
                                18, 30, "BBDD", "PROG", "PROG", "SI", "PROG",
                                19, 30,"EntDE", "BBDD", "BBDD", "FOL", "PROG",
                                20, 30,"EntDE", "BBDD", "BBDD", "FOL", "PROG");
    }
}