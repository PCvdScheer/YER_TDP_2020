package Java_Basics.Exercises;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Ex8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter a new integer  (" + (i + 1) + "/3):");
            al.add(scanner.nextInt());
        }

        Collections.sort(al);

        System.out.println("The largest number entered was: " + al.get(2));
    }
}

