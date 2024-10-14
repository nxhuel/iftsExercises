package fletnix;

import java.util.ArrayList;

public class Cliente {
    private ArrayList<IProducto> productosConsumidos = new ArrayList<>();

    public int cantProductosConsumidos() {
        return productosConsumidos.size();
    }

    public void agregarProducto(IProducto unProducto) {
        productosConsumidos.add(unProducto);
    }
}
