import Bicicletas.*;

/**
 * Esta clase...
 *
 * @Author: Manuel Sánchez Alcántara.
 * @Version: 2024.05
 */
public class Prueba_Fabrica_Bici {
    public static void main(String[] args) {
        Rigida bR;
        Rigida_E bRE;
        Simple bS;
        Simple_E bSE;
        Doble bD;
        Doble_E bDE;

        bR = new Rigida("Shimano SLX", "Acero");
        bRE = new Rigida_E("Shimano SLX", "Aluminio", "Bosch");
        bS = new Simple("Shimano XT", "Fox 32");
        bSE = new Simple_E("Shimano XT", "Fox 34", "Bosch X");
        bD = new Doble("Shimano XTR", "Fox 36", "Fox R");
        bDE = new Doble_E("Shimano XTR", "Fox 36", "Fox T", "Bosch X");

        System.out.println("------------- BICICLETAS RÍGIDAS --------------");
        bR.montarBici();
        System.out.println("Número de serie Bicicletas.Rigida: " + bR.getNumSerie());
        System.out.println();
        bRE.montarBici();
        bRE.montarMotor();
        bRE.probarMotor();
        System.out.println("Número de serie Bicicletas.Rigida_E: " + bRE.getNumSerie());
        System.out.println();


        System.out.println("------------- BICICLETAS SIMPLES --------------");
        bS.montarBarras();
        bS.probarBarras();
        bS.montarBici();
        System.out.println("Número de serie Bicicletas.Simple: " + bS.getNumSerie());

        System.out.println();
        bSE.montarBarras();
        bSE.probarBarras();
        bSE.montarBici();
        bSE.montarMotor();
        bSE.probarMotor();
        System.out.println("Número de serie Bicicletas.Simple_E: " + bSE.getNumSerie());
        System.out.println();

        System.out.println("------------- BICICLETAS DOBLES --------------");
        bD.montarBarras();
        bD.probarBarras();
        bD.montarAmortiguador();
        bD.probarAmortiguador();
        bD.montarBici();
        System.out.println("Número de serie Bicicletas.Doble: " + bD.getNumSerie());

        System.out.println();
        bDE.montarBarras();
        bDE.probarBarras();
        bDE.montarAmortiguador();
        bDE.probarAmortiguador();
        bDE.montarBici();
        bDE.montarMotor();
        bDE.probarMotor();
        System.out.println("Número de serie Bicicletas.Doble_E: " + bDE.getNumSerie());
        System.out.println();
    }
}
