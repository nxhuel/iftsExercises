package sueldoDePepe;

public class Empleado {
    private Categoria categoria;
    private IBono bonoResultado;

    public Double sueldo() {
        return categoria.getNeto() + bonoResultado.monto(categoria.getNeto());
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public IBono getBonoResultado() {
        return bonoResultado;
    }

    public void setBonoResultado(IBono bonoResultado) {
        this.bonoResultado = bonoResultado;
    }
}
