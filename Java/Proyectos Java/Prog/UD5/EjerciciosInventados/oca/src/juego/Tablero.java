package juego;

/**
 * <h1>Tablero.java</h1><hr>
 * <p>Esta clase represanta el tablero del juego de mesa La oca</p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 10-abr-2024
 */
public class Tablero {

//    Atrib
    private char[][] tablero;

    public Tablero(int num) {
        this.tablero = new char[num][63];
    }
}
