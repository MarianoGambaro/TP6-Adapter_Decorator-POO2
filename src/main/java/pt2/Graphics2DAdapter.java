package pt2;

import java.awt.*;

public class Graphics2DAdapter implements Panel {

    private Graphics2D g2d;

    public Graphics2DAdapter(Graphics2D g2d) {
        this.g2d = g2d;
    }

    @Override
    public void pintarCiruculo(int x, int y, int radio) {
        g2d.drawOval(x - radio,
                y - radio,
                radio * 2,
                radio * 2);
    }

    @Override
    public void pintarTexto(String texto, int x, int y) {
        g2d.drawString(texto, x, y);
    }

    @Override
    public void pintarLinea(int x, int y, int x2, int y2) {
        g2d.drawLine(x, y, x + x2, y);
    }
}
