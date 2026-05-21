package pt4;

public class ConQueso extends ComboConAgregado {
    private static final double PRECIO = 200;
    private static final String DESCRIPCION = ", con queso";

    protected ConQueso(Combo combo) {
        super(combo);
    }

    @Override
    public String descripcionAgregado() {
        return DESCRIPCION;
    }

    @Override
    protected double precioDeAgregado() {
        return PRECIO;
    }
}
