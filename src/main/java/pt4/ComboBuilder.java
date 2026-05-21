package pt4;

public class ComboBuilder {

    private Combo combo;

    public ComboBuilder(Combo combo) {
        this.combo = combo;
    }

    public ComboBuilder conQueso() {
        this.combo = new ConQueso(combo);
        return this;
    }

    public ComboBuilder conCarne() {
        this.combo = new ConCarne(combo);
        return this;
    }

    public ComboBuilder conTomate() {
        this.combo = new ConTomate(combo);
        return this;
    }

    public ComboBuilder conPapas() {
        this.combo = new ConPapas(combo);
        return this;
    }

    public Combo build() {
        return this.combo;
    }
}
