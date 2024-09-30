package microsContratados;

import java.util.ArrayList;

public class Micro {
    private int cantSentados;
    private int cantParados;
    private int volumen;
    private ArrayList<IPasajero> pasajeros = new ArrayList<>();

    //    GETTERS AND SETTERS
    public int getCantSentados() {
        return cantSentados;
    }

    public void setCantSentados(int cantSentados) {
        this.cantSentados = cantSentados;
    }

    public int getCantParados() {
        return cantParados;
    }

    public void setCantParados(int cantParados) {
        this.cantParados = cantParados;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public ArrayList<IPasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<IPasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    //    PUNTO UNO
    public boolean puedeSubir(IPasajero pasajero) {
        return hayLugar() && pasajero.aceptaSubir(this);
    }

    public int capacidad() {
        return cantParados + cantSentados;
    }

    public int cantPasajeros() {
        return pasajeros.size();
    }

    public boolean hayLugar() {
        return this.capacidad() > this.cantPasajeros();
    }

    public boolean puedeViajarSentado() {
        return cantSentados > this.cantPasajeros();
    }

    public int cantLugaresDisponibles() {
        return this.capacidad() - this.cantPasajeros();
    }

    public void subirPasajero(IPasajero pasajero) {
        pasajeros.add(pasajero);
    }

    public void bajarPasajero() {
        pasajeros.removeFirst();
    }
}
