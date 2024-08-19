package tomYJerry;

public class Raton {
    private double peso;
    private int posicion;

    public double getVelocidad() {
        return 10 - peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}