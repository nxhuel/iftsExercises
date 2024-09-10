package FacturacionDeLlamadas;

import junit.framework.TestCase;

public class TestCliente extends TestCase {
    Cliente cliente = new Cliente();

    PlanBasico planBasico = new PlanBasico();
    PlanSuper planSuper = new PlanSuper();
    PlanPlus planPlus = new PlanPlus();

    public void setUp() {
        cliente.setIdCliente(1l);
        cliente.setNumsFree(20);
        cliente.setMinutosConsumidos(60);
        cliente.setiPlan(planPlus);
        planBasico.setValorMinuto(10);
    }

//    Caso 1: Corrobar Id Cliente
    public void testIdCliente() {
        assertTrue(cliente.getIdCliente() ==  1);
    }

//    Caso 2: Incrementar n cantidad los numeros free
    public void testIncrementoDeNumsFree() {
        cliente.incrementarNumsFree(5);
        assertTrue(cliente.getNumsFree() == 25);
    }

//    Caso 3: Corroborar que cliente tenga planPlus
    public void testAsignacionDePlan() {
        assertTrue(cliente.getiPlan() == planPlus);
    }

//    Caso 4: Conocer monto a facturar al cliente con planPlus
    public void testMontoconPlanPlus() {
        assertEquals(1150, cliente.calcularMonto());
    }

    //    Caso 5: Conocer monto a facturar al cliente con planSuper
    public void testMontoConPlanSuper() {
        cliente.setiPlan(planSuper);
        assertEquals(1500, cliente.calcularMonto());
    }

    //    Caso 6: Conocer monto a facturar al cliente con planBasico
    public void testMontoConPlanBasico() {
        cliente.setiPlan(planBasico);
        assertEquals(900, cliente.calcularMonto());
    }
}
