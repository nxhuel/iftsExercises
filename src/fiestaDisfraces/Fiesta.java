package fiestaDisfraces;

import java.util.ArrayList;

public class Fiesta {
    private ArrayList<Invitado> invitados = new ArrayList<>();

    public void agregarInvitado(Invitado invitado) {
        invitados.add(invitado);
    }

    public int cantInvitados() {
        return invitados.size();
    }
}
