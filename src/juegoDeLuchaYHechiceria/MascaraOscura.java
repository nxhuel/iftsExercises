package juegoDeLuchaYHechiceria;

public class MascaraOscura implements IArtefacto{
    private int nivelDeOscuridad;

    public MascaraOscura(int nivelDeOscuridad) {
        this.nivelDeOscuridad = nivelDeOscuridad;
    }

    public int getNivelDeOscuridad() {
        return nivelDeOscuridad;
    }

    public void setNivelDeOscuridad(int nivelDeOscuridad) {
        this.nivelDeOscuridad = nivelDeOscuridad;
    }

    @Override
    public int nivelDeLucha() {
        return nivelDeOscuridad * 2;
    }
}
