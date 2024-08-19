// Ejercicio 1
package loboYamilo;

public class Lobo {
    // Atributos
    private double calorias;

    // Metodos
    public void comerChanchito(Chancho chanchito) {
        calorias = calorias + (chanchito.getPeso() / 10);
    }

    public boolean loboGordo() {
        return calorias > 200;
    }

    public boolean loboSaludable() {
        return calorias >= 20 && calorias <= 150;
    }

    public void correr(double minutos) {
        calorias = calorias - (minutos * 2);
    }

    // Getters and Setters
    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double cant) {
        this.calorias = cant;
    }
}