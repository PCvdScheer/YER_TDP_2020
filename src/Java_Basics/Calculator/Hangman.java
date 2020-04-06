package Java_Basics.Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class Hangman extends JFrame implements ActionListener {

    JLabel display = new JLabel("WORD PLACEHOLDER");
    JLabel message = new JLabel("MESSAGE PLACEHOLDER");
    String word = "";
    StringBuilder temp;
    int guesses;
    int variable = (int) (Math.random() * 1000);
    JTextField tf1;

    public String getWord() {
        return word;
    }

    Hangman() throws FileNotFoundException {
        JPanel panel = new JPanel();

        this.guesses = 6;

        display.setPreferredSize(new Dimension(400, 30));
        display.setHorizontalAlignment(JLabel.CENTER);
        display.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 40));
        display.setForeground(new Color(142, 64, 145));

        message.setPreferredSize(new Dimension(400, 40));
        message.setHorizontalAlignment(JLabel.CENTER);
        message.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        message.setForeground(new Color(0, 145, 6));

        getContentPane().add(message, BorderLayout.NORTH);
        getContentPane().add(display, BorderLayout.CENTER);

        tf1 = new JTextField("Enter a guess");
        tf1.setPreferredSize(new Dimension(100, 30));
        panel.add(tf1);
        tf1.addActionListener(this);

        getContentPane().add(panel, BorderLayout.SOUTH);

        //Woorden inladen vanuit tekst file
        ArrayList<String> dictionary = new ArrayList<String>();
        File file = new File("D:\\Java\\YER_TDP_2020\\src\\Java_Basics\\Calculator\\Hangman_Wordlist.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            dictionary.add(sc.nextLine());

        Random r = new Random();
        int index = r.nextInt(dictionary.size());
        this.word = dictionary.get(index);

        int length = word.length();

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < length; i++) {
            str.append("*");
            this.temp = str;
        }
        display.setText(temp.toString());
        message.setText(this.guesses + " guesses left: ");
    }

    public static void main(String[] args) throws FileNotFoundException {
        Hangman hangman = new Hangman();

        hangman.setSize(700, 400);
        hangman.setVisible(true);
        hangman.setDefaultCloseOperation(EXIT_ON_CLOSE);
        System.out.println(hangman.getWord());
        System.out.println(hangman.temp);
    }

    public void game(String letter) {
        if(this.word.contains(letter)){
            for(int i=0; i < word.length(); i++){
                if(word.charAt(i) == letter.charAt(0)){temp.setCharAt(i, letter.charAt(0));
                }
            }
        }else{this.setGuesses(this.getGuesses()-1);}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = (String) tf1.getText();
        if(s1.length() > 1) {
            System.out.println("You can only guess one letter at a time");
        }else{
            game(s1.toLowerCase());
            display.setText(this.temp.toString());
            message.setText(this.getGuesses() + " guesses left: ");
        }

        if(!this.getTemp().toString().contains("*")){
            
            }
        }


    public JLabel getDisplay() {
        return display;
    }

    public JLabel getMessage() {
        return message;
    }

    public StringBuilder getTemp() {
        return temp;
    }

    public int getGuesses() {
        return guesses;
    }

    public int getVariable() {
        return variable;
    }

    public JTextField getTf1() {
        return tf1;
    }

    public void setDisplay(JLabel display) {
        this.display = display;
    }

    public void setMessage(JLabel message) {
        this.message = message;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setTemp(StringBuilder temp) {
        this.temp = temp;
    }

    public void setGuesses(int guesses) {
        this.guesses = guesses;
    }

    public void setVariable(int variable) {
        this.variable = variable;
    }

    public void setTf1(JTextField tf1) {
        this.tf1 = tf1;
    }
}



