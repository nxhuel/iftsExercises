package fletnix;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public int cantClientes() {
        return clientes.size();
    }

    public void agregarCliente(Cliente unCliente) {
        clientes.add(unCliente);
    }

}
