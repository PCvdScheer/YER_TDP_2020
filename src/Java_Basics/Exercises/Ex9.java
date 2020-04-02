package Java_Basics.Exercises;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Ex9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();

        System.out.print("How many number would you like to enter: ");
        int runlength = scanner.nextInt();

        for (int i = 0; i < runlength; i++) {
            System.out.print("Enter a new integer  (" + (i + 1) + "/" + runlength + "):");
            int a = scanner.nextInt();
            if(1 <= a && a <= 10){al.add(a);}
        }

        System.out.println("The number you entered which were between 1-10 are: " + al);

    }

}

