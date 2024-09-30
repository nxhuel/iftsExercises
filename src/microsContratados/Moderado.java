package microsContratados;

public class Moderado implements IPasajero{
    private int espacio;
    @Override
    public boolean aceptaSubir(Micro micro) {
        return espacio >= micro.cantLugaresDisponibles();
    }
}
