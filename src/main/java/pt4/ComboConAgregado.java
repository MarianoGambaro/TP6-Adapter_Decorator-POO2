package pt4;

public abstract class ComboConAgregado implements Combo {

    private Combo combo;
    private String descripcion;

    protected ComboConAgregado(Combo combo) {
        this.combo = combo;
    }

    @Override
    public double calcularTotal() {
        return precioDeAgregado() + combo.calcularTotal();
    }

    @Override
    public String descripcion() {
        return combo.descripcion() + descripcionAgregado();
    }

    protected abstract String descripcionAgregado();

    protected abstract double precioDeAgregado();
}
