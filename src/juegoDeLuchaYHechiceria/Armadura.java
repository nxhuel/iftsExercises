package juegoDeLuchaYHechiceria;

public class Armadura implements IArtefacto{
    private int cantPiezas;

    public Armadura(int cantPiezas) {
        this.cantPiezas = cantPiezas;
    }

    public int getCantPiezas() {
        return cantPiezas;
    }

    public void setCantPiezas(int cantPiezas) {
        this.cantPiezas = cantPiezas;
    }

    @Override
    public int nivelDeLucha() {
        return 10 + (cantPiezas / 2);
    }
}
