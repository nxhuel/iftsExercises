package FacturacionDeLlamadas;

public class PlanSuper implements IPlan{
    @Override
    public int monto(Cliente cliente) {
        return 1500;
    }
}
