package Java_Basics.Exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex27 {

    public static void main(String[] args) {

        ArrayList<Integer> al1 = new ArrayList<Integer>();

        for(int i =0; i<20; i++){
            int temp =40;

            for(int j =0; j<100; j++){
                if(Math.random() < 0.5)
                temp++;
            }
            al1.add(temp);
            }

        System.out.println(al1);

        for (double num : al1) {
            if(85 <= num && 90 >= num){
                System.out.println(num);
        }

        }

        }
    }

