package Java_Basics.Drawing;

import java.awt.*;

public class Circle extends Figuur{

    public void draw(Graphics g) {

        if(x1>x2 && y1>y2){g.drawOval(x2, y2,  Math.abs(x1-x2), Math.abs(y1 - y2));}
        else if(x1 < x2 && y1 > y2){g.drawOval(x1, y2,  Math.abs(x1-x2), Math.abs(y1 - y2));}
        else if(x1 > x2 && y1 < y2){g.drawOval(x2, y1,  Math.abs(x1-x2), Math.abs(y1 - y2));}
        else{g.drawOval(x1, y1,  Math.abs(x1-x2), Math.abs(y1 - y2));}
    }
}
