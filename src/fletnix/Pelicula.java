package fletnix;

public class Pelicula implements IProducto{
    private boolean ganoUnOscar;

    public Pelicula(boolean ganoUnOscar) {
        this.ganoUnOscar = ganoUnOscar;
    }

    public void setGanoUnOscar(boolean ganoUnOscar) {
        this.ganoUnOscar = ganoUnOscar;
    }

    @Override
    public boolean esInteresante() {
        return ganoUnOscar;
    }
}
