package granjero;

public class Caballo implements IAnimal{
    private double energia;

    public Caballo(double energia) {
        this.energia = energia;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    @Override
    public boolean estaSano() {
        return energia > 150;
    }

    @Override
    public void alimentar(double gramos) {
        energia += gramos * 2;
    }
}
