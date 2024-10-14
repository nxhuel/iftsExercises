package fletnix;

public class Documental implements IProducto{
    private String tipo;

    public Documental(String tipo) {
        this.tipo = tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean esInteresante() {
        return tipo == "Historico";
    }
}
