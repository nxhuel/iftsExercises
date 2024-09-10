package FacturacionDeLlamadas;

public class PlanPlus implements IPlan{
    @Override
    public int monto(Cliente cliente) {
        return 150 + (cliente.getNumsFree() * 50);
    }
}
