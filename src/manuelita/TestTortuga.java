package manuelita;

import junit.framework.TestCase;

public class TestTortuga extends TestCase {
    Tortuga manuelita = new Tortuga();
    Tortuga bartolo = new Tortuga();

    public void setUp() {
        manuelita.setResidencia("Pehuajo");
        manuelita.setEnergia(1000);
        manuelita.setPeso(300);
        bartolo.setResidencia("Pehuajo");
        bartolo.setEnergia(1000);
        bartolo.setPeso(300);
    }

    public void testDondeEsta() {
        assertTrue(manuelita.getResidencia() == "Pehuajo");
    }

    public void testCambiarResidencia() {
        manuelita.cambiarResidencia("Paris");
        assertTrue(manuelita.getResidencia() == "Paris");
    }

    public void testCaminarKm() {
        manuelita.caminarKm(50);
        assertTrue(manuelita.getEnergia() == 975);
    }

    public void testComerGramos() {
        bartolo.comerGramos(100);
        assertTrue(bartolo.getEnergia() == 1300);
    }
}