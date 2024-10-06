package fiestaDisfraces;

public class Careta implements IDisfraz{
    private Personaje personaje;

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public int calcularCantPuntos(Invitado invitado) {
        return personaje.getPuntos();
    }
}
