package FacturacionDeLlamadas;

public class PlanBasico implements IPlan{
    private int valorMinuto;

    @Override
    public int monto(Cliente cliente) {
        return 300 + (cliente.getMinutosConsumidos() * valorMinuto);
    }

    public int getValorMinuto() {
        return valorMinuto;
    }

    public void setValorMinuto(int valorMinuto) {
        this.valorMinuto = valorMinuto;
    }
}
