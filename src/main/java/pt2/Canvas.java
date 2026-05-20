package pt2;

import javax.swing.*;
import java.awt.*;

class Canvas extends JPanel {
    private java.util.List<Figura> figuras;

    public Canvas() {
        figuras = new java.util.ArrayList<>();
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        //creo el adapter con el g2d real
        Panel adapter = new Graphics2DAdapter(g2d);

        for (Figura figura : figuras) {
            figura.dibujar(adapter); //le paso el panel que me pide el metodo dibujar
        }
    }
}
