/**Ejercicio 16 -
 Realiza un simulador de máquina tragaperras simplificada que cumpla los
 siguientes requisitos:
 a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
 figuras posibles: corazón, diamante, herradura, campana y limón.
 b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
 perdido”.
 c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
 ha recuperado su moneda”.
 d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
 10 monedas”.*/
public class Main {
    public static void main(String[] args) {
//        Var
        int rand, fig0=0, fig1=0, fig2=0, fig3=0, fig4=0;
//        Body
        for (int i = 0; i < 3; i++) {
            rand = (int)(Math.random()*5);
            switch (rand){
                case 0:
                    fig0++;
                    System.out.print("Corazón ");
                    break;
                case 1:
                    fig1++;
                    System.out.print("Diamante ");
                    break;
                case 2:
                    fig2++;
                    System.out.print("Herradura ");
                    break;
                case 3:
                    fig3++;
                    System.out.print("Campana ");
                    break;
                case 4:
                    fig4++;
                    System.out.print("Limón ");
            }
        }
        if ((fig0==3)||(fig1==3)||(fig2==3)||(fig3==3)||(fig4==3))
            System.out.println("\nEnhorabuena, ha ganado 10 monedas");
        else if ((fig0==2)||(fig1==2)||(fig2==2)||(fig3==2)||(fig4==2)) {
            System.out.println("\nBien, ha recuperado su moneda");
        }else
            System.out.println("\nLo siento, ha perdido");
    }
}