/**
 * EJ4 - Escribe un programa que muestre tu horario de clase.
 */
public class Main {
    public static void main(String[] args) {
        System.out.printf("| %d:%d | %-5s | %-5s | %-5s | %-5s | %-5s |\n" +
                "| %d:%d | %-5s | %-5s | %-5s | %-5s | %-5s |\n" +
                "| %d:%d | %-5s | %-5s | %-5s | %-5s | %-5s |\n" +
                "| %d:%d | %-5s | %-5s | %-5s | %-5s | %-5s |\n" +
                "| %d:%d | %-5s | %-5s | %-5s | %-5s | %-5s |\n" +
                "| %d:%d | %-5s | %-5s | %-5s | %-5s | %-5s |\n",
        15, 15 ,"LMSI", "EntDE", "SI", "LMSI", "FOL",
        16, 15, "LMSI", "PROG", "SI", "LMSI", "SI",
        17, 15, "BBDD", "PROG", "PROG", "SI", "SI",
        18, 30, "BBDD", "PROG", "PROG", "SI", "PROG",
        19, 30,"EntDE", "BBDD", "BBDD", "FOL", "PROG",
        20, 30,"EntDE", "BBDD", "BBDD", "FOL", "PROG");
    }
}