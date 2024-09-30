package fiestaDisfraces;

public class Invitado {
    private String nombre;
    private int edad;
    private IDisfraz difraz;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public IDisfraz getDifraz() {
        return difraz;
    }

    public void setDifraz(IDisfraz difraz) {
        this.difraz = difraz;
    }

    public int cantPuntos() {
        return difraz.calcularCantPuntos(this);
    }
}
