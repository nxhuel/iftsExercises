package granjero;

public class Chancho implements IAnimal{
    private double peso;

    public Chancho(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public boolean estaSano() {
        return peso < 130;
    }

    @Override
    public void alimentar(double gramos) {
        peso += gramos * 0.3;
    }
}
