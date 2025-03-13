/**
 * <h1>Main.java</h1><hr>
 * <p>Utiliza la clase anterior para generar una secuencia de 8 fichas creadas de
 * forma aleatoria, que encajen bien y que estén bien colocadas según el juego
 * del dominó. No hay que controlar si se repiten o no las fichas.</p>
 *
 * @Author: Adrián Suárez Valdayo.
 * @Version: 04-04-2024
 */
public class Main {
//       Const
    private final static int N = 8;

    public static void main(String[] args) {
//      Var
        FichaDomino[] fichas = new FichaDomino[N];

//        Body
        for (int i = 0; i < fichas.length; i++) {
            if(i == 0)
                fichas[i] = new FichaDomino(((int)(Math.random()*10)), ((int)(Math.random()*10)));
            else
                fichas[i]= new FichaDomino(fichas[i-1].getNumDer(), ((int)(Math.random()*10)));

            System.out.print(fichas[i]);
        }
    }
}