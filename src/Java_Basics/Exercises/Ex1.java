package Java_Basics.Exercises;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("read: ");
        String s = scanner.nextLine();

        System.out.println("write: " + s);
    }
}