package pt4;

public class Especial implements Combo {

    private String descripcion;
    private double precio;

    public Especial(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public double calcularTotal() {
        return precio;
    }

    @Override
    public String descripcion() {
        return descripcion;
    }
}
