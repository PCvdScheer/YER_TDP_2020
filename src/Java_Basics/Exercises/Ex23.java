package Java_Basics.Exercises;
import java.util.HashMap;

import java.util.ArrayList;
import java.util.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Ex23 {

    public static void main(String[] args) {

        HashMap<String, Data> hm1 = new HashMap<String, Data>();

        Data person1 = new Data("Henky",new Date(), 06456464);
        Data person2 = new Data("Jantje",new Date(), 4345445);
        Data person3 = new Data("Sjaak",new Date(), 32785727);
        Data person4 = new Data("Geert",new Date(), 4343782);
        Data person5 = new Data("Frederik",new Date(), 40727722);

        hm1.put(person1.getName(), person1);
        hm1.put(person2.getName(), person2);
        hm1.put(person3.getName(), person3);
        hm1.put(person4.getName(), person4);
        hm1.put(person5.getName(), person5);

        Scanner scanner = new Scanner(System.in);
        System.out.print("What name are you looking for: ");
        String a = scanner.nextLine();

        hm1.get(a).print();

    }
}

class Data{
    private String name;
    private Date birthday;
    private int phonenumber;


    public Data(String name, Date birthday, int phonenumber) {
        this.name = name;
        this.birthday = birthday;
        this.phonenumber = phonenumber;
    }

    public Date getBirthday() {
        return birthday;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public void setKey(String key) {
        this.name = name;
    }

    public void print(){
        System.out.println("The person you are looking for was born on: " + this.birthday + " and his/her phone number is: " + this.phonenumber);
    }
}
