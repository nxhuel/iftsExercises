package loboYamilo;

import junit.framework.TestCase;

public class TestLobo extends TestCase {
    Lobo yamilo = new Lobo();
    Chancho chanchito = new Chancho();

    public void setUp() {
        yamilo.setCalorias(1000);
        chanchito.setPeso(100);
    }

    public void testGetCalorias() {
        assertTrue(yamilo.getCalorias() == 1000);
    }

    public void testComerChanchito() {
        yamilo.comerChanchito(chanchito);
        assertTrue(yamilo.getCalorias() == 1010);
    }

    public void testLoboGordo() {
        assertTrue(yamilo.loboGordo());
    }

    public void testLoboNoSaludable() {
        assertFalse(yamilo.loboSaludable());
    }

    public void testLoboSaludable() {
        yamilo.setCalorias(120);
        assertTrue(yamilo.loboSaludable());
    }

    public void testCorrer(){
        yamilo.correr(50);
        assertTrue(yamilo.getCalorias() == 900);
    }
}