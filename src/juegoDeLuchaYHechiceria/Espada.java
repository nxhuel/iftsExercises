package juegoDeLuchaYHechiceria;

public class Espada implements IArtefacto{
    private int unidadDeLucha;

    public Espada(int unidadDeLucha) {
        this.unidadDeLucha = unidadDeLucha;
    }

    public int getUnidadDeLucha() {
        return unidadDeLucha;
    }

    public void setUnidadDeLucha(int unidadDeLucha) {
        this.unidadDeLucha = unidadDeLucha;
    }

    @Override
    public int nivelDeLucha() {
        return unidadDeLucha;
    }
}
