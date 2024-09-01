package manuelita;

public class Tortuga {
    private String residencia;
    private double energia;
    private double peso;

    public void cambiarResidencia(String nuevaResidencia) {
        this.residencia = nuevaResidencia;
    }

    public void caminarKm(double km) {
        this.energia = energia - (km / 2);
    }

    public void comerGramos(double gramos) {
        energia = energia + (gramos * 3);
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
