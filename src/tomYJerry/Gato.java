// Ejercicio 2
package tomYJerry;

public class Gato {
    private double energia;
    private int posicion;

    public boolean atrapaAJerry(Raton jerry) {
        return this.getVelocidad() > jerry.getVelocidad();
    }

    public void correrAJerry(Raton jerry) {
        energia = energia - (this.alcanzarAJerry(jerry));
        posicion = jerry.getPosicion();
    }

    public double alcanzarAJerry(Raton jerry) {
        return 0.5 * this.getVelocidad() * this.distancia(jerry);
    }

    public int distancia(Raton jerry) {
        return Math.abs(this.posicion - jerry.getPosicion());
    }

    public double getVelocidad() {
        return 5 + (energia / 10);
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}