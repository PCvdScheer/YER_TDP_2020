package Java_Basics.Drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.awt.Color;

import static javax.print.attribute.standard.Chromaticity.COLOR;

public class Main extends JFrame implements MouseListener, ActionListener, Serializable {


    Figuur figuur = new Rectangle();
    ArrayList<Figuur> figuren = new ArrayList<>();
    public static Color color;
    private String shape;
    private JMenuBar menuBar; // Window menu bar

    public Main() throws HeadlessException {
        this.addMouseListener(this);
        //input output stream gebruiken om op te slaan

        //menubar code
        menuBar = new JMenuBar();
        JMenuItem i1, i2, i3, i4, i5;
        setJMenuBar(menuBar); // Add the menu bar to the window

        JMenu fileMenu = new JMenu("File"); // Create File menu
        menuBar.add(fileMenu); // Add the file menu

        i1=new JMenuItem("New");
        i2=new JMenuItem("Open");
        i3=new JMenuItem("Save");
        i4=new JMenuItem("Save as");
        i5=new JMenuItem("Exit");

        fileMenu.add(i1); fileMenu.add(i2); fileMenu.add(i3); fileMenu.add(i4); fileMenu.add(i5);


        JMenu optionsMenu = new JMenu("Options"); // Create Elements menu
        menuBar.add(optionsMenu); // Add the element menu

        //toolbar code
        JToolBar toolbar = new JToolBar();
        toolbar.setRollover(true);

        JButton button = new JButton("Rectangle");
        toolbar.add(button);
        JButton button2 = new JButton("Oval");
        toolbar.add(button2);
        JButton button3 = new JButton("Line");
        toolbar.add(button3);
        JButton button4 = new JButton("Eraser");
        toolbar.add(button4);
        JButton button5 = new JButton("Color");
        toolbar.add(button5);
        JButton button6 = new JButton("Line thickness");
        toolbar.add(button6);

        button.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        this.add(toolbar, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        Main teken = new Main();
        teken.setSize(400, 400);
        teken.setVisible(true);
        teken.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for(Figuur f: figuren){
            f.draw(g);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("printed from pressed");
        figuur = draw(this.shape);
        figuren.add(figuur);
        figuur.x1 = e.getX();
        figuur.y1 = e.getY();
        figuur.color = Main.color;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        figuur.x2 = e.getX();
        figuur.y2 = e.getY();
        repaint();
        System.out.println("Printed from released");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String currentButton = e.getActionCommand();

        switch(currentButton){
            case "Rectangle":
                {System.out.println("Rectangle pressed");}
                this.shape = "Rectangle";
                break;
            case "Oval":
                {System.out.println("Oval pressed");}
                this.shape = "Oval";
                break;
            case "Line":
                {System.out.println("Line pressed");}
                this.shape = "Line";
                break;
            case "Eraser":
                {System.out.println("Eraser pressed");}
                this.shape = "Rectangle";
                break;
            case "Color":
                {System.out.println("Color pressed");
                Color initialBackground = new Color(0, 0, 0);
                Color newColor = JColorChooser.showDialog(null, "Set Colour", initialBackground);
                this.color = newColor;
                }
            break;
            case "Line thickness":
                {System.out.println("Line Thickness pressed");}
                break;
            default:
                System.out.println("No button pressed");
        }
    }

    Figuur draw(String shape){
        switch(shape){
            case "Rectangle":
                return new Rectangle();
            case "Oval":
                return new Circle();
            case "Line":
                return new Line();
            default:
                return new Line();
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

}


