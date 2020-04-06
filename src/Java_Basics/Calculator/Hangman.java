package Java_Basics.Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.io.*;
import java.util.Scanner;
import java.util.Random;
public class Hangman extends JFrame implements ActionListener {

    JLabel display = new JLabel("WORD PLACEHOLDER");
    JLabel message = new JLabel("MESSAGE PLACEHOLDER");
    String word = "";
    StringBuilder temp;
    int guesses = 6;
    int variable = (int) (Math.random() * 1000);
    JTextField tf1;

    public String getWord() {
        return word;
    }

    Hangman() throws FileNotFoundException {
        JPanel panel = new JPanel();
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
        generator();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Hangman hangman = new Hangman();
        hangman.setSize(700, 400);
        hangman.setVisible(true);
        hangman.setDefaultCloseOperation(EXIT_ON_CLOSE);
        System.out.println(hangman.getWord());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = (String) tf1.getText();
        if(s1.length() > 1) {
            message.setText("You can only guess one letter at a time");

        }else{
            game(s1.toLowerCase());
            display.setText(this.temp.toString());
            message.setText(this.guesses + " guesses left: ");
        }

        if(!this.temp.toString().contains("*")){
            message.setText("You have won the game");
            try {
                TimeUnit.SECONDS.wait(1);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            try {
                generator();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
            System.out.println(this.getWord());
        }

        if(this.guesses == 0){
            message.setText("Your lack of vocabulary has killed you!");
            try {
                TimeUnit.SECONDS.wait(1);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            try {
                generator();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
            System.out.println(this.getWord());
        }
    }

    public void generator() throws FileNotFoundException {
        ArrayList<String> dictionary = new ArrayList<String>();
        File file = new File("D:\\Java\\YER_TDP_2020\\src\\Java_Basics\\Calculator\\Hangman_Wordlist.txt");
        Scanner sc = new Scanner(file);
        this.guesses =6;

        while (sc.hasNextLine())
            dictionary.add(sc.nextLine());

        Random r = new Random();
        int index = r.nextInt(dictionary.size());
        this.word = dictionary.get(index);
        int length = word.length();

        temp = new StringBuilder();

        for (int i = 0; i < length; i++) {
            this.temp.append("*");
        }
        display.setText(temp.toString());
        message.setText(this.guesses + " guesses left: ");
    }

    public void game(String letter) {
        if(this.word.contains(letter)){
            for(int i=0; i < word.length(); i++){
                if(word.charAt(i) == letter.charAt(0)){
                    temp.setCharAt(i, letter.charAt(0));
                    tf1.setText("");
                }
            }
        }else{this.guesses = this.guesses-1;}
    }


}




