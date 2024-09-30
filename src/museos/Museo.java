package museos;

import java.util.ArrayList;

public class Museo {
    private ArrayList<IElemento> elementos = new ArrayList<>();

    public ArrayList<IElemento> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<IElemento> elementos) {
        this.elementos = elementos;
    }

    public int cantidadElementos() {
        return elementos.size();
    }

    public void agregarElemento(IElemento elemento) {
        elementos.add(elemento);
    }
}
