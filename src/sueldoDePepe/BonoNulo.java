package sueldoDePepe;

public class BonoNulo implements IBono{
    @Override
    public Double monto(Double valor) {
        return 0.0;
    }
}
