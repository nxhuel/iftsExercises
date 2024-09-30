package fiestaDisfraces;

public class Clasico implements IDisfraz{
    private int puntos;

    @Override
    public int calcularCantPuntos(Invitado invitado) {
        return puntos;
    }
}
