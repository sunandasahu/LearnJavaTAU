package chapter2;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Chapter2Exercise {

    public static void main(String[]arg){
        // get season of the year
        System.out.println("Enter the name of your favorite season.");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();

        //get a whole number
        System.out.println("Enter a whole number.");
        int number = scanner.nextInt();

        //get an adjective
        System.out.println("Enter an adjective.");
       String adj = scanner.next();

       scanner.close();

        //Display the message
        System.out.println("On a " + adj +" "+ season +" day, I drink minimum of " + number + " coffee a day." );






    }
}
