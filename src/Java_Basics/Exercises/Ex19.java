package Java_Basics.Exercises;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Ex19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String a = scanner.nextLine();

        System.out.print("What letter would you like to check for: ");
        char b = scanner.next().charAt(0);


        long count = a.chars().filter(ch -> ch == b).count();

        System.out.println("The number of " + b + " in " + a + " equals: " + count);

        }
}

// leuke test woord: otorhinolaryngological 



