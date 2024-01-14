package chapter4;

import java.util.Scanner;

public class DoWhile_Loop {
    /*
     * DO WHILE LOOP:
     * Write a program that allows a user to enter two numbers,
     * and then sums up the two numbers. The user should be able to
     * repeat this action until they indicate they are done.
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean again;
        do{
            System.out.println("Enter your first number");
            Double num1=scanner.nextDouble();
            System.out.println("Enter your second number");
            Double num2=scanner.nextDouble();
            Double sum = num1 + num2;
            System.out.println("The sum is :" + sum);
            System.out.println("Do you want to start over?");
            again=scanner.nextBoolean();
        }while(again);
        scanner.close();
    }
}
