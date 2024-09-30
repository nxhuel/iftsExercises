package fiestaDisfraces;

public class Careta implements IDisfraz{
    private Personaje personaje;

    @Override
    public int calcularCantPuntos(Invitado invitado) {
        return personaje.getPuntos();
    }
}
