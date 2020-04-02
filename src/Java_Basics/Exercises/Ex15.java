package Java_Basics.Exercises;

public class Ex15 {

    public static void main(String[] args) {

        int temp = 0;
        for(int i =1; i<21; i++){
            if(i%2!=0)
            {temp = temp+i;}
        }

        System.out.println("The total sum of all integers from 1-20 is: " + temp);
    }

}


