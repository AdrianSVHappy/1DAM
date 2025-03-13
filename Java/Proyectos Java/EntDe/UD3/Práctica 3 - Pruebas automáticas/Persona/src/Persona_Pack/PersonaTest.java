package Persona_Pack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PersonaTest {

//    Get
    @Test
    void testGetNombre(){
        Persona personaTest = new Persona("Paco");
        String nombre = personaTest.getNombre();
        assertEquals("Paco", nombre);
    }

//    Set
    @Test
    void testSetEdad(){
        Persona personaTest = new Persona("Juan");
        personaTest.setEdad(30);
        assertEquals(30, personaTest.getEdad());
    }

//    Mis metodos
    @Test
    void testCumple(){
        Persona personaTest = new Persona("Lucia");
        personaTest.setEdad(17);
        personaTest.cumple();
        assertEquals(18, personaTest.getEdad());
    }

    @Test
    void testTrabajar(){
        Persona personaTest = new Persona("Manuel");
        personaTest.setSaldo(10);
        personaTest.trabajar(5.99f);
        assertEquals(15.99f, personaTest.getSaldo());
    }

    @Test
    void testBuenaCompra(){
        Persona personaTest = new Persona("Santi");
        personaTest.setSaldo(15);
        personaTest.comprar(12.99f);
        assertEquals((15-12.99f), personaTest.getSaldo());
    }

    @Test
    void testMalaCompra(){
        Persona personaTest = new Persona("Pedro");
        personaTest.setSaldo(10);
        personaTest.comprar(50);
        assertEquals(10, personaTest.getSaldo());
    }
}
