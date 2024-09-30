package museos;

import junit.framework.TestCase;

public class TestMuseo extends TestCase {
    Museo unMuseo = new Museo();
    Jarrones unJarron = new Jarrones();
    Restos unResto = new Restos();

    public void setUp() {
        unJarron.setCantGrietas(10);
        unResto.setCantPolvo(100);
        unMuseo.agregarElemento(unJarron);
        unMuseo.agregarElemento(unResto);

    }

//    PUNTO UNO
    public void testCantidadElementos() {
        assertTrue(unMuseo.cantidadElementos() == 2);
    }

//    PUNTO DOS Y TRES
    public void testAcondicionarJarron() {
        unJarron.acondicionarlo();
        assertTrue(unJarron.getCantGrietas() == 8);
    }

    public void testAcondicionarResto() {
        unResto.acondicionarlo();
        assertTrue(unResto.getCantPolvo() == 10);
    }
}
