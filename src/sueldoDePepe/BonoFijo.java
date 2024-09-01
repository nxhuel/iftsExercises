package sueldoDePepe;

public class BonoFijo implements IBono{
    @Override
    public Double monto(Double valor) {
        return 3000.0;
    }
}
