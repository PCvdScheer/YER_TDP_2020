package Java_Basics.Exercises;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Ex11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("What product would you like to buy: ");
        int a = scanner.nextInt();

        System.out.print("How many would you like to purchase: ");
        int b = scanner.nextInt();

        double total = invent(a)*b;

        System.out.println("The total cost of your purchase will be:" + total);

    }

    public static double invent(int product){
        switch(product){
            case 1:
                return 2.95;
            case 2:
                return 4.99;
            case 3:
                return 5.49;
            case 4:
                return 7.80;
            case 5:
                return 8.85;
            default:
                return 0;
        }

    }

}

