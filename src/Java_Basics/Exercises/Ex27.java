package Java_Basics.Exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex27 {

    public static void main(String[] args) {

        ArrayList<Double> al1 = new ArrayList<Double>();

        for(int i =0; i<20; i++){
            double temp =0;

            for(int j =0; j<20; j++){
                temp = temp + (Math.random()*8.2);
            }

            al1.add(temp);

            }

        System.out.println(al1);
        }

    }

