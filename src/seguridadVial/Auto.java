package seguridadVial;

public class Auto implements Vehiculo {
    private double velocidadBase;
    private boolean tieneRuedaDeAux;
    private double plusVelocidad;

    @Override
    public boolean esSeguro() {
        return tieneRuedaDeAux && calcularVelocidadFinal() <= 140;
    }

    @Override
    public double calcularVelocidadFinal() {
        return velocidadBase + plusVelocidad;
    }

    public double getVelocidadBase() {
        return velocidadBase;
    }

    public void setVelocidadBase(double velocidadBase) {
        this.velocidadBase = velocidadBase;
    }

    public boolean isTieneRuedaDeAux() {
        return tieneRuedaDeAux;
    }

    public void setTieneRuedaDeAux(boolean tieneRuedaDeAux) {
        this.tieneRuedaDeAux = tieneRuedaDeAux;
    }

    public double getPlusVelocidad() {
        return plusVelocidad;
    }

    public void setPlusVelocidad(double plusVelocidad) {
        this.plusVelocidad = plusVelocidad;
    }
}
