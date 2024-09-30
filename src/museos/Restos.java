package museos;

public class Restos implements IElemento {
    private double cantPolvo;

    public double getCantPolvo() {
        return cantPolvo;
    }

    public void setCantPolvo(int cantPolvo) {
        this.cantPolvo = cantPolvo;
    }

    @Override
    public void acondicionarlo() {
        cantPolvo -= cantPolvo * 0.9;
    }

    @Override
    public double cuantoQuedaPorAcondicionar() {
        return cantPolvo;
    }
}
