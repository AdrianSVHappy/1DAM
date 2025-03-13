/**
 * <h1>Rectangulo.java</h1><hr>
 * <p>Esta clase representa a un rectangulo</p>
 *
 * @Author: Adrián Suárez Valdayo.
 * @Version: 04-04-2024
 */
public class Rectangulo {
//    Atrib
    private int altura, base;

    private static int rectangulosCreados;

//    Constructor
    public Rectangulo(int base, int altura) {
        this.altura = altura;
        this.base = base;
        Rectangulo.rectangulosCreados++;
    }

//    Gets y Sets
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public static int getRectangulosCreados() {
        return rectangulosCreados;
    }
    public static void setRectangulosCreados(int rectangulosCreados) {
        Rectangulo.rectangulosCreados = rectangulosCreados;
    }

//    toSting


    @Override
    public String toString() {

        String figura = "";

        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        return figura;
    }
}


