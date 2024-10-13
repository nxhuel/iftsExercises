package juegoDeLuchaYHechiceria;

import java.util.ArrayList;

public class Guerrero {
    private ArrayList<IArtefacto> artefactos = new ArrayList<>();

    public int cantArtefacto() {
        return artefactos.size();
    }

    public void agregarArtefacto(IArtefacto unArtefacto) {
        artefactos.add(unArtefacto);
    }

    public int nivelDeLucha() {
        int resultado = 0;
        for (IArtefacto artefacto : artefactos) {
            resultado += artefacto.nivelDeLucha();
        }

        return resultado;
    }
}
