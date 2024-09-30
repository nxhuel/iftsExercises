package microsContratados;

public class Fiaca implements IPasajero{
    @Override
    public boolean aceptaSubir(Micro micro) {
        return micro.puedeViajarSentado();
    }
}
