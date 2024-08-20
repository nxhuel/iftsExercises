// Ejercicio extra
package manuelita;

public class Manuelita {
//    Atributos
    private String residencia;
    private double energia;
    private double peso;

//    Metodos
    public void cambiarResidencia(String nuevaResidencia) {
        this.residencia = nuevaResidencia;
    }

    public void caminarKm(double km) {
        this.energia = energia - (km / 2);
    }

//    Getters and Setters
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