package juegoDeLuchaYHechiceria;

public class CollarDivino implements IArtefacto{
    private int cantPerlas;

    public CollarDivino(int cantPerlas) {
        this.cantPerlas = cantPerlas;
    }

    public int getCantPerlas() {
        return cantPerlas;
    }

    public void setCantPerlas(int cantPerlas) {
        this.cantPerlas = cantPerlas;
    }

    @Override
    public int nivelDeLucha() {
        return cantPerlas;
    }
}
