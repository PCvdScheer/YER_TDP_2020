package Java_Basics.Exercises;

        import java.util.ArrayList;
        import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a new number between 1-10 (" + (i+1) + "/5):");
            Integer a = scanner.nextInt();
            if (a > 7) {
                al.add(a);
            }
        }

        System.out.println(al.size() + " of the numbers you entered are above 7");

    }
}
