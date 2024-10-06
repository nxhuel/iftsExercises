package fiestaDisfraces;

import junit.framework.TestCase;

public class TestFiesta extends TestCase {
    Fiesta fiesta = new Fiesta();
    Invitado invitadoUno = new Invitado();
    Gracioso gracioso = new Gracioso();
    Clasico clasico = new Clasico();
    Careta careta = new Careta();
    Personaje mickeyMouse = new Personaje();

    public void setUp() {
        invitadoUno.setNombre("Santiago");
        invitadoUno.setEdad(20);
        invitadoUno.setDifraz(gracioso);

        gracioso.setNivelDeGracia(10);
        clasico.setPuntos(10);
        mickeyMouse.setPuntos(8);
        careta.setPersonaje(mickeyMouse);

        fiesta.agregarInvitado(invitadoUno);
    }

    public void testCantInvitados() {
        assertTrue(fiesta.cantInvitados() == 1);
    }

    public void testCantPuntosGracioso() {
        assertTrue(invitadoUno.cantPuntos() == 10);
    }

    public void testCantPuntosGraciosoMayor() {
        Invitado invitadoMayor = new Invitado();
        invitadoMayor.setNombre("Lucas");
        invitadoMayor.setEdad(55);
        invitadoMayor.setDifraz(gracioso);
        fiesta.agregarInvitado(invitadoMayor);

        assertTrue(invitadoMayor.cantPuntos() == 30);
    }

    public void testCantPuntosClasico() {
        invitadoUno.setDifraz(clasico);
        assertTrue(invitadoUno.cantPuntos() == 10);
    }

    public void testCantPuntosCareta() {
        invitadoUno.setDifraz(careta);
        assertTrue(invitadoUno.cantPuntos() == 8);
    }
}
