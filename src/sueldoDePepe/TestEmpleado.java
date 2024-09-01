package sueldoDePepe;

import junit.framework.TestCase;

public class TestEmpleado extends TestCase {
    Empleado pepe = new Empleado();
    Categoria categoria = new Categoria();

    public void testGerenteBonoPorcentaje() {
        categoria.setNeto(60000.0);
        pepe.setCategoria(categoria);

        IBono bonoPorcentaje = new BonoPorcentaje();
        pepe.setBonoResultado(bonoPorcentaje);

        assertTrue(pepe.sueldo() == 66000.0);
    }

    public void testGerenteBonoFijo() {
        categoria.setNeto(60000.0);
        pepe.setCategoria(categoria);

        IBono bonoFijo = new BonoFijo();
        pepe.setBonoResultado(bonoFijo);

        assertTrue(pepe.sueldo() == 63000.0);
    }

    public void testGerenteBonoNulo() {
        categoria.setNeto(60000.0);
        pepe.setCategoria(categoria);

        IBono bonoNulo = new BonoNulo();
        pepe.setBonoResultado(bonoNulo);

        assertTrue(pepe.sueldo() == 60000.0);
    }

    public void testCadeteBonoPorcentaje() {
        categoria.setNeto(70000.0);
        pepe.setCategoria(categoria);

        IBono bonoPorcentaje = new BonoPorcentaje();
        pepe.setBonoResultado(bonoPorcentaje);

        assertTrue(pepe.sueldo() == 77000.0);
    }

    public void testCadeteBonoFijo() {
        categoria.setNeto(70000.0);
        pepe.setCategoria(categoria);

        IBono bonoFijo = new BonoFijo();
        pepe.setBonoResultado(bonoFijo);

        assertTrue(pepe.sueldo() == 73000.0);
    }

    public void testCadeteBonoNulo() {
        categoria.setNeto(70000.0);
        pepe.setCategoria(categoria);

        IBono bonoNulo = new BonoNulo();
        pepe.setBonoResultado(bonoNulo);

        assertTrue(pepe.sueldo() == 70000.0);
    }
}
