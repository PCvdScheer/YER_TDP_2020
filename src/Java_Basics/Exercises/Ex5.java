package Java_Basics.Exercises;

public class Ex5 {

    //zit een logische error in; wanneer x=5 en y=1 zijn allebei de eerste twee if loops correct en wordt de eerste uitgevoerd.

    public static void main(String[] args) {
        method(5,1);
    }

    public static void method(int x, int y){
        if(x/y==5){
            System.out.println("y: " + y + " ,x: 100");
        }else if(x*y == 5){
            System.out.println("y: " + y + " ,x: 1");
        }else if(x < y){
            System.out.println("y: " + y + " ,x: " + (x*2));
        }else if(x > y){
            System.out.println("y: " + y + " ,x: " + (x++));
        }else{
            System.out.println("y: " + y + " ,x: " + x);}
    }

}


