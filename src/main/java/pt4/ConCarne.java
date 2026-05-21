package pt4;

public class ConCarne extends ComboConAgregado {

    private static final double PRECIO = 700;
    private static final String DESCRIPCION = ", con carne";

    protected ConCarne(Combo combo) {
        super(combo);
    }

    @Override
    protected String descripcionAgregado() {
        return DESCRIPCION;
    }

    @Override
    protected double precioDeAgregado() {
        return PRECIO;
    }
}
