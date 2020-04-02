package Java_Basics.Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in degrees Celsius: ");
        Double a = scanner.nextDouble();

        System.out.println(a + "C is " + ((a*1.8)+32) + " in degrees Fahrenheit");
    }
}
