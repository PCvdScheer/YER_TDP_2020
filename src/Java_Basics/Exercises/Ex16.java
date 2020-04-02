package Java_Basics.Exercises;

import java.util.ArrayList;

public class Ex16 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();

        for(int i=0; i<10; i++){
            al.add(1+(i*4));
        }

        System.out.println("The first ten members from this series are: " + al);
    }

}


