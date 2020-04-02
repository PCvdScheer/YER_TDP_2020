package Java_Basics.Exercises;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter article: ");
        String a = scanner.nextLine();

        System.out.print("Enter noun: ");
        String b = scanner.nextLine();

        System.out.print("Enter verb: ");
        String c = scanner.nextLine();

        System.out.println(a + " " +  b + " " + c + ".");
    }
}