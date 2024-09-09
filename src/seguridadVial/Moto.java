package seguridadVial;

public class Moto implements Vehiculo {
    private int cantidadEspejos;
    private double velocidadFinal;

    @Override
    public boolean esSeguro() {
        return cantidadEspejos >= 2 && velocidadFinal <= 160;
    }

    @Override
    public double calcularVelocidadFinal() {
        return velocidadFinal;
    }

    public int getCantidadEspejos() {
        return cantidadEspejos;
    }

    public void setCantidadEspejos(int cantidadEspejos) {
        this.cantidadEspejos = cantidadEspejos;
    }

    public double getVelocidadFinal() {
        return velocidadFinal;
    }

    public void setVelocidadFinal(double velocidadFinal) {
        this.velocidadFinal = velocidadFinal;
    }
}
