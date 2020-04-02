package Java_Basics.Exercises;

import java.util.Scanner;

public class Ex21 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a numeric integer: ");
        String a = scanner.nextLine();

        System.out.println("The sum of its individual components is: " + sum(a));




    }

    public static int sum(String number){
        int temp = 0;
        for(int i = 0; i < number.length(); i++ ){
            //System.out.println(number.charAt(i));
            temp = temp + Character.getNumericValue(number.charAt(i));
        }

        return temp;
    }

}
