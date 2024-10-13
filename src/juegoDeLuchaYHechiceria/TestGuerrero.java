package juegoDeLuchaYHechiceria;

import junit.framework.TestCase;

public class TestGuerrero extends TestCase {

    Guerrero unGuerrero = new Guerrero();
    Espada unaEspada = new Espada(15);
    CollarDivino unCollar = new CollarDivino(12);
    MascaraOscura unaMascaraOscura = new MascaraOscura(8);
    Armadura unaArmadura = new Armadura(15 );

    public void testNivelDeEspada() {
        assertTrue(unaEspada.nivelDeLucha() == 15);
    }

    public void testNivelDeCollarDivino() {
        assertTrue(unCollar.nivelDeLucha() == 12);
    }

    public void testNivelDeMascaraOscura() {
        assertTrue(unaMascaraOscura.nivelDeLucha() == 16);
    }

    public void testConocerCantArtefactos() {
        unGuerrero.agregarArtefacto(unCollar);
        unGuerrero.agregarArtefacto(unaEspada);

        assertTrue(unGuerrero.cantArtefacto() == 2);
    }

    public void testNivelDeGuerrero() {
        unGuerrero.agregarArtefacto(unCollar);
        unGuerrero.agregarArtefacto(unaEspada);

        assertTrue(unGuerrero.nivelDeLucha() == 27);
    }

    public void testNivelDeArmadura() {
        assertTrue(unaArmadura.nivelDeLucha() == 17);
    }
}
