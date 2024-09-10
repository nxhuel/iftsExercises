package FacturacionDeLlamadas;

public class Cliente {
    private Long idCliente;
    private String nombre;
    private int minutosConsumidos;
    private int numsFree;
    private IPlan iPlan;

    public int incrementarNumsFree(int cantidad){
        return numsFree + cantidad;
    }

    public int calcularMonto(){
        return iPlan.monto(this);
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMinutosConsumidos() {
        return minutosConsumidos;
    }

    public void setMinutosConsumidos(int minutosConsumidos) {
        this.minutosConsumidos = minutosConsumidos;
    }

    public int getNumsFree() {
        return numsFree;
    }

    public void setNumsFree(int numsFree) {
        this.numsFree = numsFree;
    }

    public IPlan getiPlan() {
        return iPlan;
    }

    public void setiPlan(IPlan iPlan) {
        this.iPlan = iPlan;
    }
}
