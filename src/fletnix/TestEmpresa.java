package fletnix;

import junit.framework.TestCase;

public class TestEmpresa extends TestCase {

    Empresa unaEmpresa = new Empresa();
    Cliente unCliente = new Cliente();
    Serie unaSerie = new Serie(8);
    Pelicula unaPelicula = new Pelicula(true);
    Documental unDocumental = new Documental("Historico");

    public void setUp() {
        unaEmpresa.agregarCliente(unCliente);
        unCliente.agregarProducto(unaSerie);
        unCliente.agregarProducto(unaPelicula);
        unCliente.agregarProducto(unDocumental);
    }

    public void testCantClientes() {
        assertTrue(unaEmpresa.cantClientes() == 1);
    }

    public void testAgregarCliente() {
        Cliente clienteDos = new Cliente();
        unaEmpresa.agregarCliente(clienteDos);
        assertTrue(unaEmpresa.cantClientes() == 2);
    }

    public void testCantProductosConsumidos() {
        assertTrue(unCliente.cantProductosConsumidos() == 3);
    }

    public void testAgregarProducto() {
        unCliente.agregarProducto(unaPelicula);
        assertTrue(unCliente.cantProductosConsumidos() == 4);
    }

    public void testSerieEsInteresante() {
        assertTrue(unaSerie.esInteresante());
    }

    public void testSerieNoEsInteresante() {
        unaSerie.setTemporadas(2);
        assertFalse(unaSerie.esInteresante());
    }

    public void testPeliculaEsInteresante() {
        assertTrue(unaPelicula.esInteresante());
    }

    public void testPeliculaNoEsInteresante() {
        unaPelicula.setGanoUnOscar(false);
        assertFalse(unaPelicula.esInteresante());
    }

    public void testDocumentalEsInteresante() {
        assertTrue(unDocumental.esInteresante());
    }

    public void testDocumentalNoEsInteresante() {
        unDocumental.setTipo("Observacion");
        assertFalse(unDocumental.esInteresante());
    }
}
