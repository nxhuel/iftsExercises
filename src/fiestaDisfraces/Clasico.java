package fiestaDisfraces;

public class Clasico implements IDisfraz{
    private int puntos;

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public int calcularCantPuntos(Invitado invitado) {
        return puntos;
    }
}
