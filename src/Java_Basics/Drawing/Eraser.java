package Java_Basics.Drawing;

import java.awt.*;

public class Eraser extends Figuur{

    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        if(x1>x2 && y1>y2){g.fillRect(x2, y2,  Math.abs(x1-x2), Math.abs(y1 - y2));}
        else if(x1 < x2 && y1 > y2){g.fillRect(x1, y2,  Math.abs(x1-x2), Math.abs(y1 - y2));}
        else if(x1 > x2 && y1 < y2){g.fillRect(x2, y1,  Math.abs(x1-x2), Math.abs(y1 - y2));}
        else{g.fillRect(x1, y1,  Math.abs(x1-x2), Math.abs(y1 - y2));}
    }
}
