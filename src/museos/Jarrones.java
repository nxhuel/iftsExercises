package museos;

public class Jarrones implements IElemento {
    private double cantGrietas;

    public double getCantGrietas() {
        return cantGrietas;
    }

    public void setCantGrietas(int cantGrietas) {
        this.cantGrietas = cantGrietas;
    }

    @Override
    public void acondicionarlo() {
        cantGrietas -= cantGrietas * 0.2;
    }

    @Override
    public double cuantoQuedaPorAcondicionar() {
        return cantGrietas;
    }

}
