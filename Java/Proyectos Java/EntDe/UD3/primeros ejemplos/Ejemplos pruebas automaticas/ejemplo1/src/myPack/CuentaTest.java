package myPack;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.FileAssert.fail;


public class CuentaTest {

    @Test
    void testGetSaldo(){
        Cuenta cuenta1 = new Cuenta("ES2109000000000", 100);
        float saldo = cuenta1.getSaldo();
        assertEquals (100, saldo);
    }

    @Test
    void testSetSaldo() {
        Cuenta cuenta1 = new Cuenta("ES2109000000000", 100);
        cuenta1.setSaldo(400);
        assertEquals (400, cuenta1.getSaldo());
    }

    @Test
    void testIngresarDinero() {
        Cuenta cuenta1 = new Cuenta("ES2109000000000", 100);
        cuenta1.ingresarDinero(400);
        assertEquals (500, cuenta1.getSaldo());
    }

    @Test
    void testExtraerDinero() {
        Cuenta cuenta1 = new Cuenta("ES2109000000000", 100);
        cuenta1.extraerDinero(20);
        assertEquals (80, cuenta1.getSaldo());
    }
}
