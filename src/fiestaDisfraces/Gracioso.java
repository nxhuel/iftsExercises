package fiestaDisfraces;

public class Gracioso implements IDisfraz {
    private int nivelDeGracia;

    @Override
    public int calcularCantPuntos(Invitado invitado) {
        if (invitado.getEdad() > 50) {
            return nivelDeGracia * 3;
        }
        return nivelDeGracia;
    }
}
