package manuelita;

import junit.framework.TestCase;

public class TestBartolo extends TestCase {
    Bartolo bartolo = new Bartolo();

    public void setUp() {
        bartolo.setResidencia("Pehuajo");
        bartolo.setEnergia(1000);
        bartolo.setPeso(300);
    }

    public void testComerGramos() {
        bartolo.comerGramos(100);
        assertTrue(bartolo.getEnergia() == 1300);
    }
}