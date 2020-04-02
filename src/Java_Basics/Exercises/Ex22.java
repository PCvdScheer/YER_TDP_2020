package Java_Basics.Exercises;

import java.lang.reflect.Array;
import java.util.*;

public class Ex22 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        int count = list.size();
        int number = 3;

        while ( count != 10 )
        {
            boolean isPrime = true;
            for ( int i = 0; i < list.size(); i++ )
            {
                if ( number % list.get(i) == 0 )
                    isPrime = false;

            }

            if ( isPrime )
            {
                list.add(number);
            }

            number++;
            count = list.size();

        }

        System.out.println(list);

    }

}




