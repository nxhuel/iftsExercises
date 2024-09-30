package microsContratados;

public class Moderado implements IPasajero{
    private int espacio;
    @Override
    public boolean aceptaSubir(Micro micro) {
        return espacio <= micro.cantLugaresDisponibles();
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }
}
