package granjero;

import junit.framework.TestCase;

public class TestGranjero extends TestCase {

    Granjero unGranjero = new Granjero();

    Caballo unCaballo = new Caballo(200);

    Chancho unChancho = new Chancho(50);

    public void setUp() {
        unGranjero.agregarAnimal(unCaballo);
        unGranjero.agregarAnimal(unChancho);
    }

    public void testCantAnimales() {
        assertTrue(unGranjero.cantAnimales() == 2);
    }

    public void testAgregarAnimal() {
        unGranjero.agregarAnimal(unChancho);
        assertTrue(unGranjero.cantAnimales() == 3);
    }

    public void testCaballoEstaSano() {
        assertTrue(unCaballo.estaSano());
    }

    public void testCaballoNoEstaSano() {
        unCaballo.setEnergia(100);
        assertFalse(unCaballo.estaSano());
    }

    public void testChanchoEstaSano() {
        assertTrue(unChancho.estaSano());
    }

    public void testChanchoNoEstaSano() {
        unChancho.setPeso(150);
        assertFalse(unChancho.estaSano());
    }

    public void testAlimentarCaballo() {
        unCaballo.alimentar(500);
        assertTrue(unCaballo.getEnergia() == 1200);
    }

    public void testAlimentarChancho() {
        unChancho.alimentar(500);
        assertTrue(unChancho.getPeso() == 200);
    }
}
