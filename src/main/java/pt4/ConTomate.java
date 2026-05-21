package pt4;

public class ConTomate extends ComboConAgregado {

    private static final double PRECIO = 150;
    private static final String DESCRIPCION = ", con tomate";

    protected ConTomate(Combo combo) {
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
