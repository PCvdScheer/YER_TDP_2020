package Java_Basics.Drawing;

import java.awt.*;

public class Line extends Figuur{

    public void draw(Graphics g) {
        g.setColor(Figuur.color);
        g.drawLine(x2, y2, x1, y1);
    }
}
