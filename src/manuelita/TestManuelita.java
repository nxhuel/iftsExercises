package manuelita;

import junit.framework.TestCase;

public class TestManuelita extends TestCase {
    Manuelita manuelita = new Manuelita();

    public void setUp() {
        manuelita.setResidencia("Pehuajo");
        manuelita.setEnergia(1000);
        manuelita.setPeso(300);
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
}