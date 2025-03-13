/**Ejercicio 22 -
 Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
 aleatorio. La cabeza se representará con el carácter @ y se debe colocar
 exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
 el cuerpo irá serpenteando de la siguiente manera: se generará de forma
 aleatoria un valor entre tres posibles que hará que el siguiente carácter se
 coloque una posición a la izquierda del anterior, alineado con el anterior o una
 posición a la derecha del anterior. La longitud de la serpiente se pedirá por
 teclado y se supone que el usuario introducirá un dato correcto.*/
public class Main {
    public static void main(String[] args) {
//        Var
        int rand, pos=12;
//        Body
        System.out.printf("%"+pos+"c", 64);
        for (int i = 0; i < 50; i++) {
            rand = (int)(Math.random()*3);

            switch (rand){
                case 0:
                    break;
                case 1:
                    pos++;
                    break;
                case 2:
                    if(pos>1)
                        pos--;
                    break;
            }

            System.out.printf("\n%"+pos+"c", 42);
        }
    }
}