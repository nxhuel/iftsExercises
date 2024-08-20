package manuelita;

public class Bartolo {
//    Atributos
    private String residencia;
    private double energia;
    private double peso;

//    Metodos
    public void comerGramos(double gramos) {
        energia = energia + (gramos * 3);
    }

//    Getters and Setters
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