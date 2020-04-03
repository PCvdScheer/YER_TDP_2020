package Java_Basics.Calculator;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Guess extends JFrame implements ActionListener {
    JLabel display = new JLabel("Guess a number below a 1000");

    int variable = (int) (Math.random()*1000);
    JTextField tf1;

    Guess(){
        JPanel panel = new JPanel();

        display.setPreferredSize(new Dimension(400,30));
        display.setFont(new Font("Arial", Font.PLAIN, 25));
        getContentPane().add(display, BorderLayout.CENTER);

        tf1 =  new JTextField("Enter a value");
        tf1.setPreferredSize(new Dimension(100, 30));
        panel.add(tf1);
        tf1.addActionListener(this);

        JButton button = new JButton("Enter");
        panel.add(button);
        button.addActionListener(this);

        getContentPane().add(panel, BorderLayout.SOUTH);
            }

    public static void main(String[] args) {
        Guess guess = new Guess();
        guess.setSize(400, 400);
        guess.setVisible(true);
        guess.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1= tf1.getText();
        int a=Integer.parseInt(s1);
        display.setText(method(a));
        
    }

    public String method(int input) {
        if (input > 1000 || input < 0) {
            return "Enter a number within the range of 1-1000";
        }else if(input== variable){
            return "You have guess correctly!";
        } else if(input <= variable){
            return "You have guessed too low!";
        } else if(input >= variable){
            return "You have guessed to high!";
        }
        else{return "Enter a valid input";
        }
    }
}