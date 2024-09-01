package sueldoDePepe;

public class BonoPorcentaje implements  IBono{
    @Override
    public Double monto(Double valor) {
        return (valor * 10) / 100;
    }
}
