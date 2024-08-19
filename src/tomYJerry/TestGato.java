package tomYJerry;

import junit.framework.TestCase;

public class TestGato extends TestCase {
    Gato tom = new Gato();
    Raton jerry = new Raton();

    public void setUp() {
        tom.setEnergia(20);
        tom.setPosicion(30);
        jerry.setPeso(4);
        jerry.setPosicion(34);
    }

    public void testAtrapaAJerry() {
        assertTrue(tom.atrapaAJerry(jerry));
    }

    public void testNOAtrapaAJerry() {
        tom.setEnergia(10);
        assertFalse(tom.atrapaAJerry(jerry));
    }

    public void testCorrerAJerry() {
        tom.correrAJerry(jerry);
        assertTrue(tom.getEnergia() == 6);
        assertTrue(tom.getPosicion() == jerry.getPosicion());
    }
}