package Java_Basics.Calculator;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    JLabel display = new JLabel("");
    String operator;
    double firstNumber;
    double secondNumber;


    public Calculator(){

        String[] lijst = {
                        "7", "8", "9", "/",
                        "4", "5", "6", "*",
                        "1", "2", "3", "+",
                        ".", "0", "=", "-"};

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,4));
        getContentPane().add(panel, BorderLayout.CENTER);
        display.setPreferredSize(new Dimension(400,30));
        display.setFont(new Font("Arial", Font.PLAIN, 25));

        for(int i=0; i<16; i++) {
            JButton button = new JButton(lijst[i]);
            panel.add(button);
            button.addActionListener(this);
        }

        getContentPane().add(display, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setSize(400, 400);
        calculator.setVisible(true);
        calculator.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String currentButton = e.getActionCommand();

        switch(currentButton){
            case "0": case "1": case "2": case "3": case "4":
            case "5": case "6": case "7": case "8": case "9": case ".":
                display.setText(display.getText() + currentButton);
                break;
            case "/": case "*": case "+": case "-":
                operator = currentButton;
                firstNumber = Double.parseDouble(display.getText());
                display.setText("");
                break;
            case "=":
                secondNumber = Double.parseDouble(display.getText());
                double result = 0;
                switch (operator) {
                    case "+":
                        result = firstNumber + secondNumber;
                        break;
                    case "-":
                        result = firstNumber - secondNumber;
                        break;
                    case "*":
                        result = firstNumber * secondNumber;
                        break;
                    case "/":
                        result = firstNumber / secondNumber;
                        break;
                }
                display.setText(result + "");
                break;

//            case "C":
//                firstNumber = secondNumber = 0;
//                display.setText("");
//                break;
            // you should never come here
            default:
                System.out.println("System Error");

        }
    }
}
