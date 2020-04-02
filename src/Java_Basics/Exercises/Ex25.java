package Java_Basics.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex25 {

    public static void main(String[] args) {

        ArrayList<Integer> highest = new ArrayList<Integer>();
        ArrayList<Integer> lowest = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);
        for(int i =0; i<12; i++) {
            System.out.print("(" + (i + 1) + "/12) "+ "Enter the highest temperatures of the last year: ");
            highest.add(scanner.nextInt());
        }

        for(int i =0; i<12; i++) {
            System.out.print("(" + (i + 1) + "/12) "+ "Enter the lowest temperatures of the last year: ");
            lowest.add(scanner.nextInt());
        }

        System.out.println("The highest temperatures of the last year were:" + highest);
        System.out.println("The lowest temperatures of the last year were:" + lowest);
    }
}


