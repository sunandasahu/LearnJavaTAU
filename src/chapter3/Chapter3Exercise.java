package chapter3;

import java.util.Scanner;

public class Chapter3Exercise {

    public static void main(String [] args){

        //Get Number of quarters
        System.out.println("How many quarters: ");
        Scanner scanner = new Scanner(System.in);
        int numOfQuarters = scanner.nextInt();
        int valueOfQuartersInCents = numOfQuarters * 25;

        //Get number of dimes
        System.out.println("How many dimes: ");
        int numOfDimes = scanner.nextInt();
        int valueOfDimesInCents = numOfDimes * 10;


        //Get number of nickles
        System.out.println("How many nickels: ");
        int numOfNickles = scanner.nextInt();
        int valueOfNickelsInCents = numOfNickles * 5;


        //Get number of pennies
        System.out.println("How many pennies: ");
        int numOfPennies = scanner.nextInt();

        //Calculate the total
        int totalValue = valueOfQuartersInCents + valueOfDimesInCents + valueOfNickelsInCents + numOfPennies;
        if(totalValue == 100){
            System.out.println("Hurray !! You won !!");
        }else if(totalValue > 100){
            int excessAmount = totalValue - 100;
            System.out.println("You are over " + excessAmount + " cents");
        }else{
            int shotAmount = 100 - totalValue;
            System.out.println("You are shot " + shotAmount + " cents");
        }


    }
}
