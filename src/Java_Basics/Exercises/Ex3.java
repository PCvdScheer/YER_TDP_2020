package Java_Basics.Exercises;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of a side: ");
        Double a = scanner.nextDouble();

        System.out.print("Enter the width of a side: ");
        Double b = scanner.nextDouble();

        System.out.println("The hypothenuse of " + a + " and " + b + " equals: " + hypothenuse(a,b));
    }

    public static double hypothenuse(double a, double b){
        return Math.sqrt((a*a)+(b*b));
    }
}