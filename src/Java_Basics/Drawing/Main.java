package Java_Basics.Drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Main extends JFrame implements MouseListener{

    Figuur figuur = new Rectangle();
    ArrayList<Figuur> figuren = new ArrayList<>();
    private String color;
    private String shape;
    private JMenuBar menuBar; // Window menu bar

    public Main() throws HeadlessException {
        this.addMouseListener(this);

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


        //switch statement om te kiezen afhankelijk van de shape waarde

        if(e.getButton() == MouseEvent.BUTTON1){
            figuur = new Circle();
        }else{figuur = new Line();}


        figuren.add(figuur);
        figuur.x1 = e.getX();
        figuur.y1 = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        figuur.x2 = e.getX();
        figuur.y2 = e.getY();
        repaint();

        System.out.println("Printed from released");
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


