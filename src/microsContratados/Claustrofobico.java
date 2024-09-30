package microsContratados;

public class Claustrofobico implements IPasajero{
    @Override
    public boolean aceptaSubir(Micro micro) {
        return micro.getVolumen() > 120;
    }
}
