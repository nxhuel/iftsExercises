package microsContratados;

import junit.framework.TestCase;

public class TestMicro extends TestCase {

    Micro unMicro = new Micro();
    Apurado unApurado = new Apurado();

    public void setUp() {
        unMicro.setCantParados(4);
        unMicro.setCantSentados(10);
        unMicro.setVolumen(150);
    }

    //    PUNTO UNO
    public void testPuedeSubirApurado() {
        assertTrue(unMicro.puedeSubir(unApurado));
    }

    public void testNoPuedeSubirApurado() {
        unMicro.setCantParados(0);
        unMicro.setCantSentados(0);
        assertFalse(unMicro.puedeSubir(unApurado));
    }

    public void testPuedeSubirClaustrofobico() {
        Claustrofobico unClaustrofobico = new Claustrofobico();
        assertTrue(unMicro.puedeSubir(unClaustrofobico));
    }

    public void testNoPuedeSubirClaustrofobico() {
        Claustrofobico unClaustrofobico = new Claustrofobico();
        unMicro.setVolumen(110);
        assertFalse(unMicro.puedeSubir(unClaustrofobico));
    }

    public void testPuedeSubirFiaca() {
        Fiaca unFiaca = new Fiaca();
        assertTrue(unMicro.puedeSubir(unFiaca));
    }

    public void testPuedeSubirModerado() {
        Moderado unModerado = new Moderado();
        unModerado.setEspacio(3);
        assertTrue(unMicro.puedeSubir(unModerado));
    }

    //    PUNTO DOS
    public void testSubirAApurado() {
        unMicro.subirPasajero(unApurado);
        assertTrue(unMicro.cantPasajeros() == 1);
    }

    public void testNoSubirAClaustrofobico() {
        Claustrofobico unClaustrofobico = new Claustrofobico();
        unMicro.setVolumen(110);
        unMicro.subirPasajero(unClaustrofobico);
        assertTrue(unMicro.cantPasajeros() == 0);
    }

    public void testSubirAFiaca() {
        Fiaca unFiaca = new Fiaca();
        unMicro.subirPasajero(unFiaca);
        assertTrue(unMicro.getPasajeros().contains(unFiaca));
    }

    public void testSubirAModerado() {
        Moderado unModerado = new Moderado();
        unModerado.setEspacio(3);
        unMicro.subirPasajero(unModerado);
        assertTrue(unMicro.cantPasajeros() == 1);
    }

//    PUNTO TRES
    public void testBajarAApurado() {
        unMicro.subirPasajero(unApurado);
        unMicro.bajarPasajero(unApurado);
        assertTrue(unMicro.cantPasajeros() == 0 || unMicro.getPasajeros().contains(unApurado));
    }

    public void testBajarAClaustrofobico() {
        Claustrofobico unClaustrofobico = new Claustrofobico();
        unMicro.setVolumen(110);
        unMicro.subirPasajero(unClaustrofobico);
        unMicro.bajarPasajero(unClaustrofobico);
        assertTrue(unMicro.cantPasajeros() == 0);
    }
}
