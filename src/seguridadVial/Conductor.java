package seguridadVial;

public class Conductor {
    private String nombre;
    private Vehiculo vehiculo;
    private boolean tieneRegistro;

    public boolean esSeguro(){
        return tieneRegistro && vehiculo.esSeguro();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public boolean isTieneRegistro() {
        return tieneRegistro;
    }

    public void setTieneRegistro(boolean tieneRegistro) {
        this.tieneRegistro = tieneRegistro;
    }
}
