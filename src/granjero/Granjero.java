package granjero;

import java.util.ArrayList;

public class Granjero {
    private ArrayList<IAnimal> animales = new ArrayList<>();

    public ArrayList<IAnimal> getAnimales() {
        return animales;
    }

    public int cantAnimales() {
        return animales.size();
    }

    public void agregarAnimal(IAnimal unAnimal) {
        animales.add(unAnimal);
    }
}
