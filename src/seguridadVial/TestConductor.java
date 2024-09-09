package seguridadVial;

import junit.framework.TestCase;

public class TestConductor extends TestCase {
    Auto auto = new Auto();
    Moto moto = new Moto();
    Conductor conductorUno = new Conductor();

    public void setUp() {
        conductorUno.setNombre("conductor uno");
        conductorUno.setVehiculo(auto);
        conductorUno.setTieneRegistro(true);
        auto.setVelocidadBase(100);
        auto.setTieneRuedaDeAux(true);
        auto.setPlusVelocidad(30);
    }

    public void testConductorEsSeguro() {
        assertTrue(conductorUno.esSeguro());
    }

    public void testAutoEsSeguro() {
        assertTrue(auto.esSeguro());
    }

    public void testAutoVelocidadFinal() {
        assertTrue(auto.calcularVelocidadFinal() == 130);
    }
}
