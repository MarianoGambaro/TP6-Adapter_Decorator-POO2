package pt4;

public class ConPapas extends ComboConAgregado {

    private static final double PRECIO = 500;
    private static final String DESCRIPCION = ", con papas";

    protected ConPapas(Combo combo) {
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
