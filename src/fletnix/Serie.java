package fletnix;

public class Serie implements IProducto{
    private int temporadas;

    public Serie(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public boolean esInteresante() {
        return temporadas > 4;
    }
}
