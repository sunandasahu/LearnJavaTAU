package chapter5;
//Greet people by name

import java.util.Scanner;

public class Methods {
    public static void main(String [] args){
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name= scanner.next();
        greet(name);

    }


    public static void greet(String name) {

        System.out.println("Good morning "+ name + "!!" + "Mama loves you so much.");

    }
}
