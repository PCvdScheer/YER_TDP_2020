package Java_Basics.Drawing;

import java.awt.*;


public abstract class Figuur {
    public Color color;
    int x1,y1,x2,y2;

    public abstract void draw(Graphics g);
}
